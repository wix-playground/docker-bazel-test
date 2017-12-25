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
    name = "parboiled_scala_2_11",
    jars = [
        "@org_parboiled_parboiled_scala_2_11//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/parboiled:parboiled_core",
        "//third_party/org/scala-lang:scala_library",
    ],
)

scala_import(
    name = "parboiled_2_11",
    jars = [
        "@org_parboiled_parboiled_2_11//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/chuusai:shapeless_2_11",
        "//third_party/org/scala-lang:scala_library",
    ],
)

scala_import(
    name = "parboiled_core",
    jars = [
        "@org_parboiled_parboiled_core//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)
