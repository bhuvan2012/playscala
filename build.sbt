name := """BankingServicesApp"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  cache,
  ws,
  specs2 % Test,
  "com.google.code.gson" % "gson" % "1.7.1",
  "net.liftweb" %% "lift-json" % "2.6+",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.0.0-RC1"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

