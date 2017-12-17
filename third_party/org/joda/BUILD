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
    name = "joda_convert",
    jars = [
        "@org_joda_joda_convert//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "joda_money",
    jars = [
        "@org_joda_joda_money//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)
