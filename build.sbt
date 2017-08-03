lazy val ScalaVersion = "2.12.2"
lazy val MetaVersion = "2.0.0-M1"

lazy val library = project
  .settings(
    scalaVersion := ScalaVersion,
    addCompilerPlugin("org.scalameta" % "scalahost" % MetaVersion cross CrossVersion.full),
    scalacOptions ++= Seq(
      "-Yrangepos",
      "-Xplugin-require:scalahost"
    )
  )

lazy val app = project
  .settings(
    scalaVersion := ScalaVersion,
    libraryDependencies += "org.scalameta" %% "scalameta" % MetaVersion,
    buildInfoPackage := "app.internal.build",
    buildInfoKeys := Seq("libraryClasspath" -> classDirectory.in(library, Compile).value.getAbsolutePath)
  )
 .dependsOn(library)
 .enablePlugins(BuildInfoPlugin)

