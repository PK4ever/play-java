name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.8"
libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs



//playEbeanModels in Compile := Seq("mods.*")
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"