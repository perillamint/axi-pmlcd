// See README.md for license details.

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "1.0.0"
ThisBuild / organization     := "moe.silicon.fpga.project.axi_pmlcd"
ThisBuild / transitiveClassifiers := Seq(Artifact.SourceClassifier)

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

lazy val root = (project in file("."))
  .settings(
    name := "axi-pmlcd",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % "3.5.+",
      "org.easysoc" %% "layered-firrtl" % "1.1-SNAPSHOT",
      "edu.berkeley.cs" %% "chiseltest" % "0.5.+" % "test"
    ),
    scalacOptions ++= Seq(
      "-Ymacro-annotations",
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit"
    ),
    addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.5.+" cross CrossVersion.full)
  )
