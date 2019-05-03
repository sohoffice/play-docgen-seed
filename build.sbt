resolvers += Resolver.bintrayIvyRepo("sohoffice", "sbt-plugins")

name := """play-docgen-seed"""
organization := "com.sohoffice"

version := "1.0-SNAPSHOT"

lazy val playDocGen = (project in file("."))
  .enablePlugins(PlayScala, SwaggerPlugin)

scalaVersion := "2.12.3"

libraryDependencies ++= Dependencies.ALL

// Packages listed here will be included in swagger definition section.
swaggerDomainNameSpaces := Seq("io")
