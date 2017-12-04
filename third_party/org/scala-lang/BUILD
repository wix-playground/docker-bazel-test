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
    name = "scala_library",
    jars = [
        "@org_scala_lang_scala_library//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "scala_compiler",
    jars = [
        "@org_scala_lang_scala_compiler//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/scala-lang:scala_reflect",
        "//third_party/org/scala-lang/modules:scala_parser_combinators_2_11",
        "//third_party/org/scala-lang/modules:scala_xml_2_11",
    ],
)

scala_import(
    name = "scala_reflect",
    jars = [
        "@org_scala_lang_scala_reflect//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/scala-lang:scala_library",
    ],
)
