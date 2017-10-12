name := """Play-Universidad"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies += guice

libraryDependencies ++= Seq(
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final" // replace by your jpa implementation
)

// Test Database
libraryDependencies += jdbc
libraryDependencies += "com.h2database" % "h2" % "1.4.194"
libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1100-jdbc4" //Este era el indicado
libraryDependencies += "com.cloudinary" % "cloudinary-http44" % "1.13.0"

PlayKeys.externalizeResources := false