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
    name = "metrics_core",
    jars = [
        "@io_dropwizard_metrics_metrics_core//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/slf4j:slf4j_api",
    ],
)

scala_import(
    name = "metrics_graphite",
    jars = [
        "@io_dropwizard_metrics_metrics_graphite//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/io/dropwizard/metrics:metrics_core",
        "//third_party/org/slf4j:slf4j_api",
    ],
)
