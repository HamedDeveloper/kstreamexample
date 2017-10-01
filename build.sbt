version := "0.1"

scalaVersion := "2.12.3"

lazy val root = (project in file(".")).
  settings(
    name := "activator-stateful-kstream-kafka",

    libraryDependencies += "org.twitter4j" % "twitter4j-core" % "2.2.1",
    libraryDependencies += "org.apache.kafka" % "kafka-streams" % "0.10.2.1",
    libraryDependencies += "com.typesafe" % "config" % "1.2.1",
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.2.0-SNAP7",
    libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "4.0.6",

      resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)
  )
