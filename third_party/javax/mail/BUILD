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
    name = "mail",
    jars = [
        "@javax_mail_mail//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/javax/activation",
    ],
)

scala_import(
    name = "javax_mail_api",
    jars = [
        "@javax_mail_javax_mail_api//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)
