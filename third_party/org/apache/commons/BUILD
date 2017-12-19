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
    name = "commons_dbcp2",
    jars = [
        "@org_apache_commons_commons_dbcp2//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/commons-logging:commons_logging",
        "//third_party/org/apache/commons:commons_pool2",
    ],
)

scala_import(
    name = "commons_pool2",
    jars = [
        "@org_apache_commons_commons_pool2//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "commons_compress",
    jars = [
        "@org_apache_commons_commons_compress//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "commons_text",
    jars = [
        "@org_apache_commons_commons_text//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/commons:commons_lang3",
    ],
)

scala_import(
    name = "commons_lang3",
    jars = [
        "@org_apache_commons_commons_lang3//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)
