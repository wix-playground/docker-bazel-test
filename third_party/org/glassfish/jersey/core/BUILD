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
    name = "jersey_client",
    jars = [
        "@org_glassfish_jersey_core_jersey_client//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/javax/ws/rs:javax_ws_rs_api",
        "//third_party/org/glassfish/hk2:hk2_api",
        "//third_party/org/glassfish/hk2:hk2_locator",
        "//third_party/org/glassfish/hk2/external:javax_inject",
        "//third_party/org/glassfish/jersey/core:jersey_common",
    ],
)

scala_import(
    name = "jersey_common",
    jars = [
        "@org_glassfish_jersey_core_jersey_common//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/javax/annotation:javax_annotation_api",
        "//third_party/javax/ws/rs:javax_ws_rs_api",
        "//third_party/org/glassfish/hk2:hk2_api",
        "//third_party/org/glassfish/hk2:hk2_locator",
        "//third_party/org/glassfish/hk2:osgi_resource_locator",
        "//third_party/org/glassfish/hk2/external:javax_inject",
        "//third_party/org/glassfish/jersey/bundles/repackaged:jersey_guava",
    ],
)
