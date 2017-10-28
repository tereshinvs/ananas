enablePlugins(JavaAppPackaging)

lazy val root = (project in file("."))
    .settings(
        name := "Ananas",
        scalaVersion := "2.12.2"
    )

mainClass in (Compile, run) := Some("Ananas")

packageName in Docker := "ananas"

version in Docker := "0.0.1"

dockerBaseImage := "openjdk"

dockerExposedPorts := Seq(8080)
