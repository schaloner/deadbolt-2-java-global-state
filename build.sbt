name := "deadbolt-java-gs"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

crossScalaVersions := Seq("2.11.11", "2.12.2")

organization := "be.objectify"

libraryDependencies ++= Seq(
  "be.objectify" %% "deadbolt-java" % "2.6.0-RC2-SNAPSHOT",
  "org.mockito" % "mockito-all" % "1.10.19" % "test"
)

releasePublishArtifactsAction := PgpKeys.publishSigned.value
