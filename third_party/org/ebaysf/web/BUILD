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
    name = "cors_filter",
    jars = [
        "@org_ebaysf_web_cors_filter//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/javax/servlet:servlet_api",
    ],
)
