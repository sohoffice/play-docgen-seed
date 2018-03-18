import sbt._

object Dependencies {

  val scalatest = "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test

  val swaggerUi = "org.webjars" % "swagger-ui" % "3.10.0"
  val playSwagger = "com.iheart" %% "play-swagger" % "0.6.5-SNAPSHOT"

  val ALL = scalatest :: swaggerUi :: playSwagger :: Nil

}
