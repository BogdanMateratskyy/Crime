val dependancies = Seq (
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

lazy val root = (project in file(".")).settings(
  name := "crime",
  version := "0.1",
  scalaVersion := "2.12.8",
  libraryDependencies ++= dependancies
)