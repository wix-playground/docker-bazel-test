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
    name = "enumeratum_macros_2_11",
    jars = [
        "@com_beachape_enumeratum_macros_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/scala-lang:scala_reflect",
    ],
)

scala_import(
    name = "enumeratum_2_11",
    jars = [
        "@com_beachape_enumeratum_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/beachape:enumeratum_macros_2_11",
        "//third_party/org/scala-lang:scala_library",
    ],
)
