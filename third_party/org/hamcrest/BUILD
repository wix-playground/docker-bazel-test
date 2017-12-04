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
    name = "hamcrest_all",
    jars = [
        "@org_hamcrest_hamcrest_all//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "hamcrest_core",
    jars = [
        "@org_hamcrest_hamcrest_core//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "hamcrest_library",
    jars = [
        "@org_hamcrest_hamcrest_library//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/hamcrest:hamcrest_core",
    ],
)
