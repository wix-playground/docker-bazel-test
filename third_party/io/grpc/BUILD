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
    name = "grpc_protobuf",
    jars = [
        "@io_grpc_grpc_protobuf//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/google/guava",
        "//third_party/com/google/protobuf:protobuf_java",
        "//third_party/com/google/protobuf:protobuf_java_util",
        "//third_party/io/grpc:grpc_core",
        "//third_party/io/grpc:grpc_protobuf_lite",
    ],
)

scala_import(
    name = "grpc_context",
    jars = [
        "@io_grpc_grpc_context//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "grpc_auth",
    jars = [
        "@io_grpc_grpc_auth//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/google/auth:google_auth_library_credentials",
        "//third_party/io/grpc:grpc_core",
    ],
)

scala_import(
    name = "grpc_netty",
    jars = [
        "@io_grpc_grpc_netty//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/grpc:grpc_core",
        "//third_party/io/netty:netty_codec_http2",
    ],
)

scala_import(
    name = "grpc_stub",
    jars = [
        "@io_grpc_grpc_stub//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/grpc:grpc_core",
    ],
)

scala_import(
    name = "grpc_protobuf_lite",
    jars = [
        "@io_grpc_grpc_protobuf_lite//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/google/guava",
        "//third_party/io/grpc:grpc_core",
    ],
    # EXCLUDES com.google.protobuf:protobuf-lite
)

scala_import(
    name = "grpc_core",
    jars = [
        "@io_grpc_grpc_core//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/google/code/findbugs:jsr305",
        "//third_party/com/google/guava",
        "//third_party/io/grpc:grpc_context",
    ],
)
