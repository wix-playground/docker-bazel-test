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
    name = "jackson_scala_module",
    jars = [
        "@com_wixpress_jackson_jackson_scala_module//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/fasterxml/jackson/core:jackson_annotations",
        "//third_party/com/fasterxml/jackson/core:jackson_core",
        "//third_party/com/fasterxml/jackson/core:jackson_databind",
        "//third_party/com/fasterxml/jackson/dataformat:jackson_dataformat_xml",
        "//third_party/com/fasterxml/jackson/datatype:jackson_datatype_guava",
        "//third_party/com/fasterxml/jackson/datatype:jackson_datatype_jdk8",
        "//third_party/com/fasterxml/jackson/datatype:jackson_datatype_joda",
        "//third_party/com/fasterxml/jackson/datatype:jackson_datatype_jsr310",
        "//third_party/com/fasterxml/jackson/module:jackson_module_scala_2_11",
        "//third_party/org/scala-lang:scala_library",
    ],
)
