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
    name = "jackson_jaxrs_base",
    jars = [
        "@com_fasterxml_jackson_jaxrs_jackson_jaxrs_base//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/fasterxml/jackson/core:jackson_core",
        "//third_party/com/fasterxml/jackson/core:jackson_databind",
    ],
)

scala_import(
    name = "jackson_jaxrs_json_provider",
    jars = [
        "@com_fasterxml_jackson_jaxrs_jackson_jaxrs_json_provider//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/fasterxml/jackson/core:jackson_core",
        "//third_party/com/fasterxml/jackson/core:jackson_databind",
        "//third_party/com/fasterxml/jackson/jaxrs:jackson_jaxrs_base",
        "//third_party/com/fasterxml/jackson/module:jackson_module_jaxb_annotations",
    ],
)
