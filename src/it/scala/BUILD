package(default_visibility = ["//visibility:public"])

load(
    "@io_bazel_rules_scala//scala:scala.bzl",
    "scala_binary",
    "scala_library",
    "scala_test",
    "scala_macro_library",
    "scala_specs2_junit_test",
)

scala_specs2_junit_test(
    name = "root",
    size = "small",
    srcs = glob(["*.java"]) + glob(["*.scala"]),
    data = ["//:coordinates"],
    javacopts = [
        "-g",
        "-deprecation",
        "-XepDisableAllChecks",
    ],
    jvm_flags = ["-Dexisting.manifest=$(location //:coordinates)"],
    prefixes = ["Test"],
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
    suffixes = ["Test"],
    tags = ["UT"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/httpcomponents:httpclient",
        "//third_party/org/apache/httpcomponents:httpcore",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/specs2:specs2_2_11",
        "@jetty_server//jar",
        "@servlet_api//jar",
        "@jetty_continuation//jar",
        "@jetty_http//jar",
        "@jetty_io//jar",
        "@jetty_util//jar",
    ],
)
