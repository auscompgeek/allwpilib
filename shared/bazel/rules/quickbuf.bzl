"""Rule for generating QuickBuffers Java sources from a `proto_library`."""

load("@protobuf//bazel/common:proto_common.bzl", "proto_common")
load("@protobuf//bazel/common:proto_info.bzl", "ProtoInfo")
load("@protobuf//bazel/common:proto_lang_toolchain_info.bzl", "ProtoLangToolchainInfo")

def _quickbuf_srcs_impl(ctx):
    output_dir = ctx.actions.declare_directory(ctx.label.name)

    proto_common.compile(
        actions = ctx.actions,
        proto_info = ctx.attr.proto[ProtoInfo],
        proto_lang_toolchain_info = ctx.attr._toolchain[ProtoLangToolchainInfo],
        generated_files = [output_dir],
        plugin_output = output_dir.path,
    )

    return [DefaultInfo(files = depset([output_dir]))]

quickbuf_srcs = rule(
    implementation = _quickbuf_srcs_impl,
    doc = "Runs protoc with the QuickBuffers plugin, producing a directory of Java sources.",
    attrs = {
        "proto": attr.label(
            mandatory = True,
            providers = [ProtoInfo],
            doc = "The `proto_library` to generate sources for.",
        ),
        "_toolchain": attr.label(
            default = Label("//:quickbuf_toolchain"),
            providers = [ProtoLangToolchainInfo],
        ),
    },
)
