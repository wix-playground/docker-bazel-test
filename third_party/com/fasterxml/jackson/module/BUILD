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
    name = "jackson_module_jsonSchema",
    jars = [
        "@com_fasterxml_jackson_module_jackson_module_jsonSchema//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/fasterxml/jackson/core:jackson_annotations",
        "//third_party/com/fasterxml/jackson/core:jackson_core",
        "//third_party/com/fasterxml/jackson/core:jackson_databind",
        "//third_party/javax/validation:validation_api",
    ],
)

scala_import(
    name = "jackson_module_jaxb_annotations",
    jars = [
        "@com_fasterxml_jackson_module_jackson_module_jaxb_annotations//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/fasterxml/jackson/core:jackson_annotations",
        "//third_party/com/fasterxml/jackson/core:jackson_core",
        "//third_party/com/fasterxml/jackson/core:jackson_databind",
    ],
)

scala_import(
    name = "jackson_module_scala_2_11",
    jars = [
        "@com_fasterxml_jackson_module_jackson_module_scala_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/fasterxml/jackson/core:jackson_annotations",
        "//third_party/com/fasterxml/jackson/core:jackson_core",
        "//third_party/com/fasterxml/jackson/core:jackson_databind",
        "//third_party/com/fasterxml/jackson/module:jackson_module_paranamer",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/scala-lang:scala_reflect",
    ],
)

scala_import(
    name = "jackson_module_paranamer",
    jars = [
        "@com_fasterxml_jackson_module_jackson_module_paranamer//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/fasterxml/jackson/core:jackson_databind",
        "//third_party/com/thoughtworks/paranamer",
    ],
)
