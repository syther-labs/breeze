//enablePlugins(GitVersioning)

Common.commonSettings

name := "breeze-parent"
ThisBuild / scalaVersion := "3.1.0"
ThisBuild / organization := "syther.labs"
ThisBuild / githubOwner := "syther-labs"
ThisBuild / githubRepository := "breeze"

ThisBuild / githubWorkflowPublishTargetBranches += RefPredicate.Equals(Ref.Branch("master"))
ThisBuild / versionScheme := Some("semver-spec")

enablePlugins(GitHubPackagesPlugin)
enablePlugins(DynVerPlugin)

lazy val root = project
  .in(file("."))
  .aggregate(math, natives, viz, macros)
  .dependsOn(math, viz)

lazy val macros = project.in(file("macros"))

lazy val math = project.in(file("math")).dependsOn(macros)

lazy val natives = project.in(file("natives")).dependsOn(math)

lazy val viz = project.in(file("viz")).dependsOn(math)

lazy val benchmark = project.in(file("benchmark")).dependsOn(math, natives).settings(
    githubIsWorkflowBuild := false,
    githubWorkflowArtifactUpload := false,
    publish / skip := true,
  )

Global / onChangedBuildSource := ReloadOnSourceChanges