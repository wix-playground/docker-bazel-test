package(default_visibility = ["//visibility:public"])

load(
    "@io_bazel_rules_scala//scala:scala.bzl",
    "scala_binary",
    "scala_library",
    "scala_test",
    "scala_macro_library",
    "scala_specs2_junit_test",
)

scala_library(
    name = "root",
    srcs = glob(["*.java"]) + glob(["*.scala"]),
    javacopts = [
        "-g",
        "-deprecation",
        "-XepDisableAllChecks",
    ],
    scalacopts = [
        "-unchecked",
        "-deprecation",
        "-feature",
        "-Xmax-classfile-name",
        "240",
        "-Xlint:missing-interpolator",
        "-Ywarn-unused-import",
        "-Ywarn-unused",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/httpcomponents:httpclient",
        "//third_party/org/scala-lang:scala_library",
    ],
)
