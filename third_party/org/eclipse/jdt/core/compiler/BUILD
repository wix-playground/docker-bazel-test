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
    name = "ecj",
    jars = [
        "@org_eclipse_jdt_core_compiler_ecj//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)
