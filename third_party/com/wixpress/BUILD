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
    name = "specs2_jmock_2_11",
    jars = [
        "@com_wixpress_specs2_jmock_2_11//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/hamcrest:hamcrest_core",
        "//third_party/org/hamcrest:hamcrest_library",
        "//third_party/org/jmock:jmock_junit4",
        "//third_party/org/jmock:jmock_legacy",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/specs2:specs2_core_2_11",
        "//third_party/org/specs2:specs2_mock_2_11",
    ],
)
