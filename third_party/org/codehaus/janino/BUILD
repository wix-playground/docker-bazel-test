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
    name = "janino",
    jars = [
        "@org_codehaus_janino_janino//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/codehaus/janino:commons_compiler",
    ],
)

scala_import(
    name = "commons_compiler",
    jars = [
        "@org_codehaus_janino_commons_compiler//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)
