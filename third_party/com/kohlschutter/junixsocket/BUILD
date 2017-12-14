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
    name = "junixsocket_native_common",
    jars = [
        "@com_kohlschutter_junixsocket_junixsocket_native_common//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/kohlschutter/junixsocket:junixsocket_common",
        "//third_party/log4j",
        "//third_party/org/scijava:native_lib_loader",
    ],
)

scala_import(
    name = "junixsocket_common",
    jars = [
        "@com_kohlschutter_junixsocket_junixsocket_common//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/log4j",
    ],
)
