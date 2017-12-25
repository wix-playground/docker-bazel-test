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
    name = "jackson_core",
    jars = [
        "@com_fasterxml_jackson_core_jackson_core//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "jackson_annotations",
    jars = [
        "@com_fasterxml_jackson_core_jackson_annotations//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "jackson_databind",
    jars = [
        "@com_fasterxml_jackson_core_jackson_databind//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/fasterxml/jackson/core:jackson_annotations",
        "//third_party/com/fasterxml/jackson/core:jackson_core",
    ],
)
