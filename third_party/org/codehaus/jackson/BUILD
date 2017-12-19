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
    name = "jackson_mapper_asl",
    jars = [
        "@org_codehaus_jackson_jackson_mapper_asl//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/codehaus/jackson:jackson_core_asl",
    ],
)

scala_import(
    name = "jackson_core_asl",
    jars = [
        "@org_codehaus_jackson_jackson_core_asl//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)
