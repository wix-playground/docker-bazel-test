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
    name = "hk2_locator",
    jars = [
        "@org_glassfish_hk2_hk2_locator//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/glassfish/hk2:hk2_api",
        "//third_party/org/glassfish/hk2:hk2_utils",
        "//third_party/org/glassfish/hk2/external:aopalliance_repackaged",
        "//third_party/org/glassfish/hk2/external:javax_inject",
        "//third_party/org/javassist",
    ],
)

scala_import(
    name = "hk2_utils",
    jars = [
        "@org_glassfish_hk2_hk2_utils//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "hk2_api",
    jars = [
        "@org_glassfish_hk2_hk2_api//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/glassfish/hk2:hk2_utils",
        "//third_party/org/glassfish/hk2/external:aopalliance_repackaged",
    ],
    # EXCLUDES javax.inject:javax.inject
)

scala_import(
    name = "osgi_resource_locator",
    jars = [
        "@org_glassfish_hk2_osgi_resource_locator//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)
