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
    name = "leveldb",
    jars = [
        "@org_iq80_leveldb_leveldb//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/google/guava",
        "//third_party/org/iq80/leveldb:leveldb_api",
    ],
)

scala_import(
    name = "leveldb_api",
    jars = [
        "@org_iq80_leveldb_leveldb_api//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)
