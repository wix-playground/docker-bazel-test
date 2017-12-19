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
    name = "config",
    jars = [
        "@com_typesafe_config//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "ssl_config_core_2_11",
    jars = [
        "@com_typesafe_ssl_config_core_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/typesafe:config",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/scala-lang/modules:scala_parser_combinators_2_11",
    ],
)
