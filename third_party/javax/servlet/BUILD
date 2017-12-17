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
    name = "jstl",
    jars = [
        "@javax_servlet_jstl//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "servlet_api",
    jars = [
        "@javax_servlet_servlet_api//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "javax_servlet_api",
    jars = [
        "@javax_servlet_javax_servlet_api//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)
