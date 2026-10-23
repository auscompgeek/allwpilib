def __generate_commandsv3_impl(ctx):
    """
    Custom rule used to create the commandsv3 pre-generated files. See `./README-Bazel.md` for the reasoning.
    """
    output_dir = ctx.actions.declare_directory("_gendir")

    args = ctx.actions.args()
    args.add("--output_directory", output_dir.path)
    args.add("--template_root", "commandsv3/src/generate")
    args.add("--proto_directory", "commandsv3/src/main/proto")
    args.add("--quickbuf_directory", ctx.file.quickbuf_srcs.path)

    ctx.actions.run(
        inputs = depset([ctx.file.quickbuf_srcs], transitive = [ctx.attr._templates.files]),
        outputs = [output_dir],
        executable = ctx.executable._tool,
        arguments = [args],
    )

    return [DefaultInfo(files = depset([output_dir]))]

generate_commandsv3 = rule(
    implementation = __generate_commandsv3_impl,
    attrs = {
        "quickbuf_srcs": attr.label(
            allow_single_file = True,
            default = Label("//commandsv3:commandsv3_quickbuf_srcs"),
        ),
        "_templates": attr.label(
            default = Label("//commandsv3:templates"),
        ),
        "_tool": attr.label(
            default = Label("//commandsv3:generate_files"),
            cfg = "exec",
            executable = True,
        ),
    },
)
