name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.0"

resolvers := Seq(
  "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"
)

libraryDependencies := Seq(
  "org.scalatest" %% "scalatest" % "1.8" % "test",
  "org.scalaz" %% "scalaz-core" % "6.0.4"
)

initialCommands := "import $organization$.$name;format="Camel"$._"
