
workspace(name = "other")
rules_scala_version="c8fec77ede46a3cf76a5d48e720778800a790bbe" # update this as needed

http_archive(
             name = "io_bazel_rules_scala",
             url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
             type = "zip",
             strip_prefix= "rules_scala-%s" % rules_scala_version
)

load("@bazel_tools//tools/build_defs/repo:git.bzl","git_repository")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
load("@io_bazel_rules_scala//junit:junit.bzl", "junit_repositories")
load("@io_bazel_rules_scala//specs2:specs2.bzl", "specs2_repositories")
load("@io_bazel_rules_scala//specs2:specs2_junit.bzl", "specs2_junit_repositories")

scala_repositories()
specs2_junit_repositories()

maven_jar(
    name = "org_parboiled_parboiled_scala_2_11",
    artifact = "org.parboiled:parboiled-scala_2.11:1.1.7",
)

maven_jar(
    name = "org_apache_httpcomponents_httpmime",
    artifact = "org.apache.httpcomponents:httpmime:4.5.2",
)

maven_jar(
    name = "org_ow2_asm_asm_tree",
    artifact = "org.ow2.asm:asm-tree:5.0.1",
)

maven_jar(
    name = "org_ow2_asm_asm_util",
    artifact = "org.ow2.asm:asm-util:4.1",
)

maven_jar(
    name = "org_ow2_asm_asm",
    artifact = "org.ow2.asm:asm:5.2",
)

maven_jar(
    name = "org_ow2_asm_asm_commons",
    artifact = "org.ow2.asm:asm-commons:5.0.1",
)

maven_jar(
    name = "org_parboiled_parboiled_core",
    artifact = "org.parboiled:parboiled-core:1.1.7",
)

maven_jar(
    name = "org_parboiled_parboiled_java",
    artifact = "org.parboiled:parboiled-java:1.1.4",
)

maven_jar(
    name = "org_ow2_asm_asm_analysis",
    artifact = "org.ow2.asm:asm-analysis:4.1",
 )

maven_jar(
    name = "commons_logging_commons_logging",
    artifact = "commons-logging:commons-logging:1.2",
)

maven_jar(
    name = "asm_asm",
    artifact = "asm:asm:1.4.3",
)

maven_jar(
    name = "org_hamcrest_hamcrest_all",
    artifact = "org.hamcrest:hamcrest-all:1.3",
)

maven_jar(
    name = "org_hamcrest_hamcrest_core",
    artifact = "org.hamcrest:hamcrest-core:1.3",
)

maven_jar(
    name = "org_hamcrest_hamcrest_library",
    artifact = "org.hamcrest:hamcrest-library:1.3",
)

maven_jar(
    name = "commons_codec_commons_codec",
    artifact = "commons-codec:commons-codec:1.11",
)

maven_jar(
    name = "org_scala_lang_modules_scala_xml_2_11",
    artifact = "org.scala-lang.modules:scala-xml_2.11:1.0.6",
)

maven_jar(
    name = "org_objenesis_objenesis",
    artifact = "org.objenesis:objenesis:2.6",
)

maven_jar(
    name = "com_chuusai_shapeless_2_11",
    artifact = "com.chuusai:shapeless_2.11:1.2.4",
)

maven_jar(
    name = "org_mockito_mockito_core",
    artifact = "org.mockito:mockito-core:1.10.19",
)

maven_jar(
    name = "org_ccil_cowan_tagsoup_tagsoup",
    artifact = "org.ccil.cowan.tagsoup:tagsoup:1.2",
)

maven_jar(
    name = "org_scalaz_scalaz_effect_2_11",
    artifact = "org.scalaz:scalaz-effect_2.11:7.2.7",
)

maven_jar(
    name = "org_specs2_specs2_gwt_2_11",
    artifact = "org.specs2:specs2-gwt_2.11:3.7",
)

maven_jar(
    name = "org_pegdown_pegdown",
    artifact = "org.pegdown:pegdown:1.2.1",
)

maven_jar(
    name = "org_scalaz_scalaz_core_2_11",
    artifact = "org.scalaz:scalaz-core_2.11:7.2.16",
)

maven_jar(
    name = "org_scala_sbt_test_interface",
    artifact = "org.scala-sbt:test-interface:1.0",
)

maven_jar(
    name = "org_scalaz_scalaz_concurrent_2_11",
    artifact = "org.scalaz:scalaz-concurrent_2.11:7.2.16",
)

maven_jar(
    name = "org_specs2_specs2_mock_2_11",
    artifact = "org.specs2:specs2-mock_2.11:3.8.6",
)

maven_jar(
    name = "org_scalacheck_scalacheck_2_11",
    artifact = "org.scalacheck:scalacheck_2.11:1.13.5",
)

maven_jar(
    name = "org_specs2_specs2_scalacheck_2_11",
    artifact = "org.specs2:specs2-scalacheck_2.11:3.8.6",
)

maven_jar(
    name = "org_scala_lang_scala_reflect",
    artifact = "org.scala-lang:scala-reflect:2.11.11",
)

maven_jar(
    name = "org_specs2_specs2_html_2_11",
    artifact = "org.specs2:specs2-html_2.11:3.7",
)

maven_jar(
    name = "org_specs2_specs2_markdown_2_11",
    artifact = "org.specs2:specs2-markdown_2.11:3.7",
)

maven_jar(
    name = "org_specs2_specs2_analysis_2_11",
    artifact = "org.specs2:specs2-analysis_2.11:3.8.6",
)

maven_jar(
    name = "org_specs2_specs2_form_2_11",
    artifact = "org.specs2:specs2-form_2.11:3.7",
)

maven_jar(
    name = "org_specs2_specs2_codata_2_11",
    artifact = "org.specs2:specs2-codata_2.11:3.8.6",
)

maven_jar(
    name = "org_specs2_classycle",
    artifact = "org.specs2:classycle:1.4.3",
)

maven_jar(
    name = "org_scala_stm_scala_stm_2_11",
    artifact = "org.scala-stm:scala-stm_2.11:0.8",
)

maven_jar(
    name = "org_scala_lang_modules_scala_parser_combinators_2_11",
    artifact = "org.scala-lang.modules:scala-parser-combinators_2.11:1.0.4",
)

maven_jar(
    name = "org_apache_httpcomponents_httpclient",
    artifact = "org.apache.httpcomponents:httpclient:4.5.4",
)

maven_jar(
    name = "org_scala_lang_modules_scala_java8_compat_2_11",
    artifact = "org.scala-lang.modules:scala-java8-compat_2.11:0.7.0",
)

maven_jar(
    name = "org_specs2_specs2_matcher_extra_2_11",
    artifact = "org.specs2:specs2-matcher-extra_2.11:3.8.6",
)

maven_jar(
    name = "org_specs2_specs2_2_11",
    artifact = "org.specs2:specs2_2.11:pom:3.7",
)

maven_jar(
    name = "org_scala_lang_scala_compiler",
    artifact = "org.scala-lang:scala-compiler:2.11.11",
)

maven_jar(
    name = "org_specs2_specs2_matcher_2_11",
    artifact = "org.specs2:specs2-matcher_2.11:3.8.6",
)

maven_jar(
    name = "org_apache_httpcomponents_httpcore",
    artifact = "org.apache.httpcomponents:httpcore:4.4.4",
)

maven_jar(
    name = "org_specs2_specs2_common_2_11",
    artifact = "org.specs2:specs2-common_2.11:3.8.6",
)

maven_jar(
    name = "org_specs2_specs2_junit_2_11",
    artifact = "org.specs2:specs2-junit_2.11:3.8.6",
)

maven_jar(
    name = "org_specs2_specs2_core_2_11",
    artifact = "org.specs2:specs2-core_2.11:3.8.6",
)

maven_jar(
    name = "junit_junit",
    artifact = "junit:junit:4.12",
)

maven_jar(
    name = "org_scala_lang_scala_library",
    artifact = "org.scala-lang:scala-library:2.11.8",
)