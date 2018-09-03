name := "twitter-test-task"

version := "0.1"

scalaVersion := "2.12.6"

resolvers += Resolver.sonatypeRepo("releases")

// Java Twitter4j
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.7"
libraryDependencies += "org.twitter4j" % "twitter4j-httpclient-support" % "2.2.6"
libraryDependencies += "org.twitter4j" % "twitter4j-async" % "4.0.7"
libraryDependencies += "org.twitter4j" % "twitter4j" % "4.0.7" pomOnly()
libraryDependencies += "org.twitter4j" % "twitter4j-http2-support" % "4.0.7"

// scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % Test