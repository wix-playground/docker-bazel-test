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
    name = "maven_error_diagnostics",
    jars = [
        "@org_apache_maven_maven_error_diagnostics//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/codehaus/plexus:plexus_container_default",
    ],
)

scala_import(
    name = "maven_plugin_api",
    jars = [
        "@org_apache_maven_maven_plugin_api//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "maven_repository_metadata",
    jars = [
        "@org_apache_maven_maven_repository_metadata//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_artifact_manager",
    jars = [
        "@org_apache_maven_maven_artifact_manager//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/maven:maven_artifact",
        "//third_party/org/apache/maven:maven_repository_metadata",
        "//third_party/org/apache/maven/wagon:wagon_provider_api",
        "//third_party/org/codehaus/plexus:plexus_container_default",
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_core",
    jars = [
        "@org_apache_maven_maven_core//jar:file",
    ],
    runtime_deps = [
        "//third_party/org/apache/maven/wagon:wagon_file",
        "//third_party/org/apache/maven/wagon:wagon_http_lightweight",
        "//third_party/org/apache/maven/wagon:wagon_ssh",
        "//third_party/org/apache/maven/wagon:wagon_ssh_external",
        "//third_party/org/apache/maven/wagon:wagon_webdav",
    ],
    deps = [
        "//third_party/classworlds",
        "//third_party/commons-cli:commons_cli",
        "//third_party/org/apache/maven:maven_artifact",
        "//third_party/org/apache/maven:maven_artifact_manager",
        "//third_party/org/apache/maven:maven_error_diagnostics",
        "//third_party/org/apache/maven:maven_model",
        "//third_party/org/apache/maven:maven_monitor",
        "//third_party/org/apache/maven:maven_plugin_api",
        "//third_party/org/apache/maven:maven_plugin_descriptor",
        "//third_party/org/apache/maven:maven_plugin_parameter_documenter",
        "//third_party/org/apache/maven:maven_profile",
        "//third_party/org/apache/maven:maven_project",
        "//third_party/org/apache/maven:maven_repository_metadata",
        "//third_party/org/apache/maven:maven_settings",
        "//third_party/org/apache/maven/reporting:maven_reporting_api",
        "//third_party/org/apache/maven/wagon:wagon_provider_api",
        "//third_party/org/codehaus/plexus:plexus_container_default",
        "//third_party/org/codehaus/plexus:plexus_interactivity_api",
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_model",
    jars = [
        "@org_apache_maven_maven_model//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/commons:commons_lang3",
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_plugin_parameter_documenter",
    jars = [
        "@org_apache_maven_maven_plugin_parameter_documenter//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/codehaus/plexus:plexus_container_default",
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_builder_support",
    jars = [
        "@org_apache_maven_maven_builder_support//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/commons:commons_lang3",
    ],
)

scala_import(
    name = "maven_plugin_registry",
    jars = [
        "@org_apache_maven_maven_plugin_registry//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/codehaus/plexus:plexus_container_default",
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_profile",
    jars = [
        "@org_apache_maven_maven_profile//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/maven:maven_model",
        "//third_party/org/codehaus/plexus:plexus_container_default",
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_model_builder",
    jars = [
        "@org_apache_maven_maven_model_builder//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/com/google/guava",
        "//third_party/org/apache/commons:commons_lang3",
        "//third_party/org/apache/maven:maven_artifact",
        "//third_party/org/apache/maven:maven_builder_support",
        "//third_party/org/apache/maven:maven_model",
        "//third_party/org/codehaus/plexus:plexus_component_annotations",
        "//third_party/org/codehaus/plexus:plexus_interpolation",
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_project",
    jars = [
        "@org_apache_maven_maven_project//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/maven:maven_artifact",
        "//third_party/org/apache/maven:maven_artifact_manager",
        "//third_party/org/apache/maven:maven_model",
        "//third_party/org/apache/maven:maven_plugin_registry",
        "//third_party/org/apache/maven:maven_profile",
        "//third_party/org/apache/maven:maven_settings",
        "//third_party/org/codehaus/plexus:plexus_container_default",
        "//third_party/org/codehaus/plexus:plexus_interpolation",
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_settings",
    jars = [
        "@org_apache_maven_maven_settings//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/maven:maven_model",
        "//third_party/org/codehaus/plexus:plexus_container_default",
        "//third_party/org/codehaus/plexus:plexus_interpolation",
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_monitor",
    jars = [
        "@org_apache_maven_maven_monitor//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
    ],
)

scala_import(
    name = "maven_artifact",
    jars = [
        "@org_apache_maven_maven_artifact//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/codehaus/plexus:plexus_utils",
    ],
)

scala_import(
    name = "maven_plugin_descriptor",
    jars = [
        "@org_apache_maven_maven_plugin_descriptor//jar:file",
    ],
    runtime_deps = [
    ],
    deps = [
        "//third_party/org/apache/maven:maven_artifact",
        "//third_party/org/apache/maven:maven_plugin_api",
        "//third_party/org/codehaus/plexus:plexus_container_default",
    ],
)
