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
    name = "javax_inject",
    jars = [
        "@org_glassfish_hk2_external_javax_inject//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
    # EXCLUDES javax.inject:javax.inject
)

scala_import(
    name = "aopalliance_repackaged",
    jars = [
        "@org_glassfish_hk2_external_aopalliance_repackaged//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)
