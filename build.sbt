name := """play-java-starter-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)


scalaVersion := "2.12.2"

libraryDependencies += guice

//herokuAppName in Compile := "boiling-badlands-40109"


//herokuConfigVars in Compile := Map(
//    "JDBC_DATABASE_URL" -> "jpostgres://
//icfmjpstbylgeo:73e4ed3fea749ef90c0723017b77d63ad916c2770fced30257f9f16b19e1e9c3@ec2-54-163-232-171.compute-1.amazonaws.com:54"
//)

// Test Database
libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += "com.h2database" % "h2" % "1.4.194"
//libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1100-jdbc4" //Este era el indicado
libraryDependencies += "org.postgresql" % "postgresql" % "9.4.1212"
libraryDependencies += "com.cloudinary" % "cloudinary-http44" % "1.13.0"


