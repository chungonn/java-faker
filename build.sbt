name := "javafaker"

organization := "com.github.javafaker"


scalaVersion := "2.13.1"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.5",
  "org.yaml" % "snakeyaml" % "1.23" classifier "android",
  "com.github.mifmif" % "generex" % "1.0.2",
  "org.slf4j" % "slf4j-api" % "1.7.25" % Test,
  "junit" % "junit" % "4.12" % Test,
  "org.hamcrest" % "hamcrest-library" % "1.3" % Test,
  "org.reflections" % "reflections" % "0.9.11" % Test,
  "org.mockito" % "mockito-core" % "2.23.4"  % Test,
  "commons-validator" % "commons-validator" % "1.6" % Test
)

lazy val javaFaker = project in file(".")

ThisBuild / publishMavenStyle := true

ThisBuild / publishArtifact in (Compile, packageSrc) := false

