licenses(["reciprocal"])

package(default_visibility = ["//visibility:public"])

load(
    "@io_bazel_rules_scala//scala:scala.bzl",
    "scala_binary",
    "scala_library",
    "scala_test",
    "scala_macro_library",
    "scala_specs2_junit_test",
)
load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")

scala_import(
    name = "netty_transport_native_unix_common",
    jars = [
        "@io_netty_netty_transport_native_unix_common//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_common",
        "//third_party/io/netty:netty_transport",
    ],
)

scala_import(
    name = "netty_handler_proxy",
    jars = [
        "@io_netty_netty_handler_proxy//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_codec_http",
        "//third_party/io/netty:netty_codec_socks",
        "//third_party/io/netty:netty_transport",
    ],
)

scala_import(
    name = "netty_handler",
    jars = [
        "@io_netty_netty_handler//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_buffer",
        "//third_party/io/netty:netty_codec",
        "//third_party/io/netty:netty_transport",
    ],
)

scala_import(
    name = "netty_tcnative_boringssl_static",
    jars = [
        "@io_netty_netty_tcnative_boringssl_static//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "netty_transport_native_kqueue_osx_x86_64",
    jars = [
        "@io_netty_netty_transport_native_kqueue_osx_x86_64//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_buffer",
        "//third_party/io/netty:netty_common",
        "//third_party/io/netty:netty_transport",
        "//third_party/io/netty:netty_transport_native_unix_common",
    ],
)

scala_import(
    name = "netty_transport_native_epoll_linux_x86_64",
    jars = [
        "@io_netty_netty_transport_native_epoll_linux_x86_64//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_buffer",
        "//third_party/io/netty:netty_common",
        "//third_party/io/netty:netty_transport",
    ],
)

scala_import(
    name = "netty_codec",
    jars = [
        "@io_netty_netty_codec//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_transport",
    ],
)

scala_import(
    name = "netty_codec_socks",
    jars = [
        "@io_netty_netty_codec_socks//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_codec",
    ],
)

scala_import(
    name = "netty_codec_http2",
    jars = [
        "@io_netty_netty_codec_http2//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_codec_http",
        "//third_party/io/netty:netty_handler",
    ],
)

scala_import(
    name = "netty",
    jars = [
        "@io_netty_netty//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "netty_resolver",
    jars = [
        "@io_netty_netty_resolver//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_common",
    ],
)

scala_import(
    name = "netty_buffer",
    jars = [
        "@io_netty_netty_buffer//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_common",
    ],
)

scala_import(
    name = "netty_common",
    jars = [
        "@io_netty_netty_common//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "netty_codec_http",
    jars = [
        "@io_netty_netty_codec_http//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_codec",
        "//third_party/io/netty:netty_handler",
    ],
)

scala_import(
    name = "netty_transport",
    jars = [
        "@io_netty_netty_transport//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/netty:netty_buffer",
        "//third_party/io/netty:netty_resolver",
    ],
)
