import scalariform.formatter.preferences._

name := "mogobiz-cake"

organization := "com.mogobiz"

version := "0.2-SNAPSHOT"

logLevel := Level.Info

crossScalaVersions := Seq("2.11.6")


scalaVersion := "2.11.6"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "spray repo" at "http://repo.spray.io/",
  "ebiz repo release" at "http://art.ebiznext.com/artifactory/libs-release-local",
  "ebiz repo snapshot" at "http://art.ebiznext.com/artifactory/libs-snapshot-local",
  "scribe-java-mvn-repo" at "https://raw.github.com/fernandezpablo85/scribe-java/mvn-repo",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
  "BoneCP Repository" at "http://jolbox.com/bonecp/downloads/maven"
)


val akkaV = "2.3.9"

val sprayV = "1.3.3"

val scalikeV = "2.2.5"

val jacksonV = "2.5.2"

val json4sV = "3.2.11"

val elastic4sV = "1.7.4"

val elasticSearchV = "1.7.3"

val configV = "1.2.1"

val elasticsearchAnalysisICUV = "2.7.0"

val elasticsearchMapperAttachmentsV = "2.7.1"

val itextV = "5.5.4"

val swaggerV = "0.5.0"

val metricsVersion = "3.1.0"

val mogobizVersion = "0.2-SNAPSHOT"

libraryDependencies ++= Seq(
  "postgresql" % "postgresql" % "9.1-901.jdbc4",
  "mysql" % "mysql-connector-java" % "5.1.12",
  "com.h2database" % "h2" % "1.4.177" % "test",
  "org.apache.derby" % "derbyclient" % "10.11.1.1",
  "com.gettyimages" %% "spray-swagger" % swaggerV,
  "org.scalikejdbc" %% "scalikejdbc" % scalikeV,
  "org.scalikejdbc" %% "scalikejdbc-config" % scalikeV,
  "org.scalikejdbc" %% "scalikejdbc-interpolation" % scalikeV,
  "org.scalikejdbc" %% "scalikejdbc-test" % scalikeV % "test",
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "com.itextpdf" % "itextpdf" % itextV,
  "com.itextpdf.tool" % "xmlworker" % itextV,
  "joda-time" % "joda-time" % "2.7",
  "org.joda" % "joda-convert" % "1.7",
  "com.github.fernandospr" % "javapns-jdk16" % "2.2.1",
  "org.scribe" % "scribe" % "1.3.6",
  "com.typesafe" % "config" % configV,
  //"mysql" % "mysql-connector-java" % "5.1.12",
  "com.h2database" % "h2" % "1.4.177" % "test",
  "com.jolbox" % "bonecp" % "0.8.0.RELEASE",
  "io.spray" %% "spray-can" % sprayV,
  "io.spray" %% "spray-routing" % sprayV,
  "io.spray" %% "spray-testkit" % sprayV % "test",
  "io.spray" %% "spray-client" % sprayV,
  "io.spray" %% "spray-http" % sprayV,
  "io.spray" %% "spray-httpx" % sprayV,
  "io.spray" %% "spray-util" % sprayV,
  "org.json4s" %% "json4s-native" % json4sV,
  "org.json4s" %% "json4s-jackson" % json4sV,
  "org.json4s" %% "json4s-ext" % json4sV,
  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "com.typesafe.akka" %% "akka-remote" % akkaV,
  "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-M3",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonV,
  "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonV,
  "com.fasterxml.jackson.core" % "jackson-core" % jacksonV,
  "com.fasterxml.jackson.core" % "jackson-databind" % jacksonV,
  "org.specs2" %% "specs2" % "2.3.13" % "test",
  "org.apache.commons" % "commons-email" % "1.3.3",
  "org.apache.shiro" % "shiro-all" % "1.2.0",
  "com.sksamuel.elastic4s" %% "elastic4s-core" % elastic4sV exclude("org.elasticsearch", "elasticsearch"),
  "org.elasticsearch" % "elasticsearch" % elasticSearchV,
  "org.elasticsearch" % "elasticsearch-analysis-icu" % elasticsearchAnalysisICUV,
  "org.elasticsearch" % "elasticsearch-mapper-attachments" % elasticsearchMapperAttachmentsV,
  "com.google.zxing" % "core" % "1.7",
  "org.scala-lang.modules" %% "scala-async" % "0.9.2" % "test",
  "com.sun.xml.messaging.saaj" % "saaj-impl" % "1.3.18",
  "net.authorize" % "anet-java-sdk" % "1.8.3",
  "com.mortennobel" % "java-image-scaling" % "0.8.6",
  "org.apache.httpcomponents" % "httpcore" % "4.4.1",
  "org.apache.httpcomponents" % "httpclient" % "4.4",
  "org.apache.tika" % "tika-core" % "1.7",
  "com.easypost" % "easypost-java" % "2.1.0",
  "com.google.code.gson" % "gson" % "2.2.4",
  "com.google.maps" % "google-maps-services" % "0.1.7",
  "com.mogobiz" %% "mogobiz-utils" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-template" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-json" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-es" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-session" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-notify" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-system" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-auth" % mogobizVersion,
  "com.mogobiz" %% "mogopay-common" % mogobizVersion,
  "com.mogobiz" %% "mogopay-core" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-launch" % mogobizVersion,
  "com.mogobiz" %% "mogopay-launch" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-selenium" % mogobizVersion,
  "com.mogobiz" %% "mogobiz-run" % mogobizVersion,
  "org.apache.derby" % "derby" % "10.11.1.1" % "test"

)

lazy val root = project.in(file(".")).enablePlugins(BuildInfoPlugin).settings(
  buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
  buildInfoPackage := "com.mogobiz"
)

publishTo := {
  val artifactory = "http://art.ebiznext.com/artifactory/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at artifactory + "libs-snapshot-local")
  else
    Some("releases" at artifactory + "libs-release-local")
}

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishArtifact in(Compile, packageSrc) := false

publishArtifact in(Test, packageSrc) := false

parallelExecution in (Test) := false


packSettings

publishPackArchiveTgz


packMain := Map(
  "mogopay" -> "com.mogobiz.launch.pay.Rest",
  "mogobiz" -> "com.mogobiz.launch.run.Rest",
  "mogolearn" -> "com.mogolearn.launch.run.Rest",
  "mogobiz-all" -> "com.mogobiz.launch.run.RestAll",
  "mogobiz-selenium" -> "com.mogobiz.selenium.run.RestSelenium"
)

packExtraClasspath := Map("mogobiz-all" -> Seq("${PROG_HOME}/conf"), "mogopay" -> Seq("${PROG_HOME}/conf"), "mogobiz" -> Seq("${PROG_HOME}/conf"), "mogobiz-selenium" -> Seq("${PROG_HOME}/conf"))

packGenerateWindowsBatFile := true

packExpandedClasspath := false

fork := true

scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(RewriteArrowSymbols, true)
  .setPreference(AlignParameters, true)
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, true)
  .setPreference(MultilineScaladocCommentsStartOnFirstLine, true)

unmanagedClasspath in Runtime <+= (baseDirectory) map { bd => Attributed.blank(bd / "conf") }


Revolver.settings

mainClass in Revolver.reStart := Some("com.mogobiz.cake.run.RestAll")

// javaOptions := Seq("-Xdebug", "-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005")

scalariformSettings
