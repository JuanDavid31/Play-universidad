name := """play-java-starter-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"


libraryDependencies += javaJdbc
libraryDependencies += guice
libraryDependencies += javaJpa
libraryDependencies += "com.h2database" % "h2" % "1.4.194"



libraryDependencies += javaWs % "test"

libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % "test"
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % "test"
libraryDependencies += "org.mockito" % "mockito-core" % "2.1.0" % "test"
libraryDependencies += "postgresql" % "postgresql" % "9.1-901.jdbc4"
libraryDependencies ++= Seq(evolutions, jdbc)
libraryDependencies ++= Seq(
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final" // replace by your jpa implementation
)
testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
PlayKeys.externalizeResources := false
