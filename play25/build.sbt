
name := """play25"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SwaggerPlugin)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws
)

libraryDependencies ++= Dependencies.ALL

swaggerDomainNameSpaces := Seq("io")
swaggerDescriptionFile := Some((baseDirectory / "conf/docExtract.properties").value)

