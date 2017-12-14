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
    name = "okhttp",
    jars = [
        "@com_squareup_okhttp3_okhttp//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/squareup/okio",
    ],
)
