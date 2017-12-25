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
    name = "docker_java",
    jars = [
        "@com_github_docker_java_docker_java//jar:file",
    ],
    tags = ["manual"],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/fasterxml/jackson/jaxrs:jackson_jaxrs_json_provider",
        "//third_party/com/google/guava",
        "//third_party/com/kohlschutter/junixsocket:junixsocket_common",
        "//third_party/com/kohlschutter/junixsocket:junixsocket_native_common",
        "//third_party/commons-codec:commons_codec",
        "//third_party/commons-io:commons_io",
        "//third_party/commons-lang:commons_lang",
        "//third_party/io/netty:netty_codec_http",
        "//third_party/io/netty:netty_handler",
        "//third_party/io/netty:netty_handler_proxy",
        "//third_party/io/netty:netty_transport_native_epoll_linux_x86_64",
        "//third_party/io/netty:netty_transport_native_kqueue_osx_x86_64",
        "//third_party/org/apache/commons:commons_compress",
        "//third_party/org/apache/httpcomponents:httpclient",
        "//third_party/org/apache/httpcomponents:httpcore",
        "//third_party/org/bouncycastle:bcpkix_jdk15on",
        "//third_party/org/glassfish/jersey/connectors:jersey_apache_connector",
        "//third_party/org/glassfish/jersey/core:jersey_client",
        "//third_party/org/slf4j:jcl_over_slf4j",
        "//third_party/org/slf4j:slf4j_api",
    ],
)
