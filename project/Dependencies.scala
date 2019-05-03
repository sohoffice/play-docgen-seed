import play.sbt.PlayImport._
import sbt.Keys.libraryDependencies
import sbt._

object Dependencies {

  val defaults = guice :: Nil
  val scalatest = "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test
  val swaggerUi = "org.webjars" % "swagger-ui" % "3.10.0"

  val ALL = defaults :+ scalatest :+ swaggerUi

}
