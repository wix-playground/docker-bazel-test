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
    name = "lucene_core",
    jars = [
        "@org_apache_lucene_lucene_core//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "lucene_spatial",
    jars = [
        "@org_apache_lucene_lucene_spatial//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/spatial4j",
        "//third_party/org/apache/lucene:lucene_core",
        "//third_party/org/apache/lucene:lucene_queries",
    ],
)

scala_import(
    name = "lucene_queries",
    jars = [
        "@org_apache_lucene_lucene_queries//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
    ],
)

scala_import(
    name = "lucene_grouping",
    jars = [
        "@org_apache_lucene_lucene_grouping//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
        "//third_party/org/apache/lucene:lucene_queries",
    ],
)

scala_import(
    name = "lucene_misc",
    jars = [
        "@org_apache_lucene_lucene_misc//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
    ],
)

scala_import(
    name = "lucene_queryparser",
    jars = [
        "@org_apache_lucene_lucene_queryparser//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
        "//third_party/org/apache/lucene:lucene_queries",
        "//third_party/org/apache/lucene:lucene_sandbox",
    ],
)

scala_import(
    name = "lucene_highlighter",
    jars = [
        "@org_apache_lucene_lucene_highlighter//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
        "//third_party/org/apache/lucene:lucene_memory",
        "//third_party/org/apache/lucene:lucene_queries",
    ],
)

scala_import(
    name = "lucene_suggest",
    jars = [
        "@org_apache_lucene_lucene_suggest//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_analyzers_common",
        "//third_party/org/apache/lucene:lucene_core",
        "//third_party/org/apache/lucene:lucene_misc",
        "//third_party/org/apache/lucene:lucene_queries",
    ],
)

scala_import(
    name = "lucene_codecs",
    jars = [
        "@org_apache_lucene_lucene_codecs//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
    ],
)

scala_import(
    name = "lucene_memory",
    jars = [
        "@org_apache_lucene_lucene_memory//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
    ],
)

scala_import(
    name = "lucene_analyzers_common",
    jars = [
        "@org_apache_lucene_lucene_analyzers_common//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
    ],
)

scala_import(
    name = "lucene_sandbox",
    jars = [
        "@org_apache_lucene_lucene_sandbox//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
    ],
    # EXCLUDES jakarta-regexp:jakarta-regexp
)

scala_import(
    name = "lucene_join",
    jars = [
        "@org_apache_lucene_lucene_join//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/lucene:lucene_core",
        "//third_party/org/apache/lucene:lucene_grouping",
    ],
)
