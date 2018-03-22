addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.12")

resolvers += Resolver.bintrayIvyRepo("sohoffice", "sbt-plugins")

addSbtPlugin("com.sohoffice" %% "sbt-descriptive-play-swagger" % "0.7.4")
addSbtPlugin("com.sohoffice" % "sbt-doc-extract" % "0.0.3")
