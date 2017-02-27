organization := "com.msilb"
name := "scalanda-v20"

scalaVersion := "2.12.1"

scalacOptions := Seq(
  "-target:jvm-1.8",
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-Xfuture",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions"
)

libraryDependencies ++= {
  val circeV = "0.7.0"
  val scalaTestV = "3.0.1"
  val akkaHttpV = "10.0.4"
  val akkaHttpCirceV = "1.12.0"
  Seq(
    "com.typesafe.akka" %% "akka-http" % akkaHttpV,
    "de.heikoseeberger" %% "akka-http-circe" % akkaHttpCirceV,
    "io.circe" %% "circe-core" % circeV,
    "io.circe" %% "circe-generic" % circeV,
    "io.circe" %% "circe-parser" % circeV,
    "io.circe" %% "circe-java8" % circeV,
    "io.circe" %% "circe-generic-extras" % circeV,
    "org.scalatest" %% "scalatest" % scalaTestV % "test"
  )
}

resolvers += Resolver.sonatypeRepo("releases")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
