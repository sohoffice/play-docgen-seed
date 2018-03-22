import play.sbt.PlayImport._
import sbt.Keys.libraryDependencies
import sbt._

object Dependencies {

  val defaults = guice :: Nil
  val scalatest = "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
  val swaggerUi = "org.webjars" % "swagger-ui" % "3.10.0"
  val playSwagger = "com.sohoffice" %% "descriptive-play-swagger" % "0.7.4"
  val docExtract = "com.sohoffice" %% "doc-extract" % "0.0.3"

  val ALL = defaults :+ scalatest :+ swaggerUi :+ playSwagger :+ docExtract

}
