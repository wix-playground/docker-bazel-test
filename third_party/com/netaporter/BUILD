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
    name = "scala_uri_2_11",
    jars = [
        "@com_netaporter_scala_uri_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/spray:spray_json_2_11",
        "//third_party/org/parboiled:parboiled_2_11",
        "//third_party/org/scala-lang:scala_library",
    ],
)
