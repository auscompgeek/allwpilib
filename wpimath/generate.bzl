def __generate_wpimath_impl(ctx):
    """
    Custom rule used to create the wpimath pre-generated files. See `./README-Bazel.md` for the reasoning.
    """
    output_dir = ctx.actions.declare_directory("_gendir")

    args = ctx.actions.args()
    args.add("--output_directory", output_dir.path)
    args.add("--template_root", "wpimath/src/generate")
    args.add("--proto_directory", "wpimath/src/main/proto")
    args.add("--quickbuf_directory", ctx.file.quickbuf_srcs.path)
    args.add("--nanopb", ctx.executable._nanopb)

    ctx.actions.run(
        inputs = ctx.attr._templates.files.to_list() + ctx.attr.proto_files.files.to_list() + [ctx.file.quickbuf_srcs],
        outputs = [output_dir],
        executable = ctx.executable._tool,
        arguments = [args],
        tools = [ctx.executable._nanopb],
    )

    return [DefaultInfo(files = depset([output_dir]))]

generate_wpimath = rule(
    implementation = __generate_wpimath_impl,
    attrs = {
        "proto_files": attr.label(
            allow_files = True,
            default = Label("//wpimath:proto_files"),
        ),
        "quickbuf_srcs": attr.label(
            allow_single_file = True,
            default = Label("//wpimath:wpimath_quickbuf_srcs"),
        ),
        "_nanopb": attr.label(
            default = Label("//wpiutil:nanopb_generator"),
            cfg = "exec",
            executable = True,
        ),
        "_templates": attr.label(
            default = Label("//wpimath:templates"),
        ),
        "_tool": attr.label(
            default = Label("//wpimath:generate_wpimath_py"),
            cfg = "exec",
            executable = True,
        ),
    },
)
