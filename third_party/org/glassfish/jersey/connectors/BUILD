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
    name = "jersey_apache_connector",
    jars = [
        "@org_glassfish_jersey_connectors_jersey_apache_connector//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/javax/ws/rs:javax_ws_rs_api",
        "//third_party/org/apache/httpcomponents:httpclient",
        "//third_party/org/glassfish/jersey/core:jersey_client",
        "//third_party/org/glassfish/jersey/core:jersey_common",
    ],
)
