name := """Play-universidad"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)


scalaVersion := "2.12.2"

libraryDependencies += guice

// Test Database
libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += "com.h2database" % "h2" % "1.4.194"
libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1100-jdbc4" //Este era el indicado
libraryDependencies += "com.cloudinary" % "cloudinary-http44" % "1.13.0"


