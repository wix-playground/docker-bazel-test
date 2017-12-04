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
    name = "asm_analysis",
    jars = [
        "@org_ow2_asm_asm_analysis//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/ow2/asm:asm_tree",
    ],
)

scala_import(
    name = "asm_util",
    jars = [
        "@org_ow2_asm_asm_util//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/ow2/asm:asm_tree",
    ],
)

scala_import(
    name = "asm",
    jars = [
        "@org_ow2_asm_asm//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "asm_commons",
    jars = [
        "@org_ow2_asm_asm_commons//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/ow2/asm:asm_tree",
    ],
)

scala_import(
    name = "asm_tree",
    jars = [
        "@org_ow2_asm_asm_tree//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/ow2/asm",
    ],
)
