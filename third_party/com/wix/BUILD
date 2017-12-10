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
    name = "accord_api_2_11",
    jars = [
        "@com_wix_accord_api_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/scalatest:scalatest_2_11",
    ],
)

scala_import(
    name = "http_testkit_core_2_11",
    jars = [
        "@com_wix_http_testkit_core_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/google/code/findbugs:jsr305",
        "//third_party/com/typesafe/akka:akka_http_2_11",
        "//third_party/joda-time:joda_time",
        "//third_party/org/joda:joda_convert",
        "//third_party/org/reflections",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/scala-lang/modules:scala_xml_2_11",
        "//third_party/org/slf4j:slf4j_api",
    ],
)

scala_import(
    name = "specs2_jmock_2_11",
    jars = [
        "@com_wix_specs2_jmock_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/hamcrest:hamcrest_core",
        "//third_party/org/hamcrest:hamcrest_library",
        "//third_party/org/jmock:jmock_junit4",
        "//third_party/org/jmock:jmock_legacy",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/specs2:specs2_core_2_11",
        "//third_party/org/specs2:specs2_mock_2_11",
    ],
)

scala_import(
    name = "wix_embedded_mysql",
    jars = [
        "@com_wix_wix_embedded_mysql//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/de/flapdoodle/embed:de_flapdoodle_embed_process",
        "//third_party/org/apache/commons:commons_compress",
    ],
)

scala_import(
    name = "future_perfect_2_11",
    jars = [
        "@com_wix_future_perfect_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/twitter:util_core_2_11",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/slf4j:slf4j_api",
    ],
)

scala_import(
    name = "accord_scalatest_2_11",
    jars = [
        "@com_wix_accord_scalatest_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/wix:accord_api_2_11",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/scalatest:scalatest_2_11",
    ],
)

scala_import(
    name = "http_testkit_specs2_2_11",
    jars = [
        "@com_wix_http_testkit_specs2_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/wix:http_testkit_core_2_11",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/specs2:specs2_core_2_11",
        "//third_party/org/specs2:specs2_junit_2_11",
        "//third_party/org/specs2:specs2_mock_2_11",
    ],
)

scala_import(
    name = "accord_specs2_2_11",
    jars = [
        "@com_wix_accord_specs2_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/wix:accord_api_2_11",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/specs2:specs2_core_2_11",
    ],
)

scala_import(
    name = "http_testkit_client_2_11",
    jars = [
        "@com_wix_http_testkit_client_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/wix:http_testkit_core_2_11",
        "//third_party/com/wix:http_testkit_specs2_2_11",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/specs2:specs2_core_2_11",
        "//third_party/org/specs2:specs2_junit_2_11",
        "//third_party/org/specs2:specs2_mock_2_11",
    ],
)

scala_import(
    name = "http_testkit_server_2_11",
    jars = [
        "@com_wix_http_testkit_server_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/wix:http_testkit_core_2_11",
        "//third_party/org/scala-lang:scala_library",
    ],
)

scala_import(
    name = "http_testkit_2_11",
    jars = [
        "@com_wix_http_testkit_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/wix:http_testkit_client_2_11",
        "//third_party/com/wix:http_testkit_server_2_11",
        "//third_party/com/wix:http_testkit_specs2_2_11",
        "//third_party/org/scala-lang:scala_library",
    ],
)

scala_import(
    name = "accord_core_2_11",
    jars = [
        "@com_wix_accord_core_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/wix:accord_api_2_11",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/scalamacros:resetallattrs_2_11",
    ],
)

scala_import(
    name = "accord_spring3_2_11",
    jars = [
        "@com_wix_accord_spring3_2_11//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/wix:accord_api_2_11",
        "//third_party/javax/validation:validation_api",
        "//third_party/org/scala-lang:scala_library",
        "//third_party/org/springframework:spring_context",
    ],
)
