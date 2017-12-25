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
    name = "reactivemongo_shaded",
    jars = [
        "@org_reactivemongo_reactivemongo_shaded//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "reactivemongo_2_11",
    jars = [
        "@org_reactivemongo_reactivemongo_2_11//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/typesafe/akka:akka_actor_2_11",
        "//third_party/com/typesafe/play:play_iteratees_2_11",
        "//third_party/commons-codec:commons_codec",
        "//third_party/org/apache/logging/log4j:log4j_api",
        "//third_party/org/reactivemongo:reactivemongo_bson_macros_2_11",
        "//third_party/org/reactivemongo:reactivemongo_shaded",
        "//third_party/org/scala-lang:scala_library",
    ],
)

scala_import(
    name = "reactivemongo_bson_2_11",
    jars = [
        "@org_reactivemongo_reactivemongo_bson_2_11//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/scala-lang:scala_library",
    ],
)

scala_import(
    name = "reactivemongo_bson_macros_2_11",
    jars = [
        "@org_reactivemongo_reactivemongo_bson_macros_2_11//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/reactivemongo:reactivemongo_bson_2_11",
        "//third_party/org/scala-lang:scala_library",
    ],
)
