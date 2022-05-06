name                  := "dike"
organization          := "fiatjaf"
scalaVersion          := "2.13.8"
version               := "0.1.0"
libraryDependencies   ++= Seq(
  "com.fiatjaf" % "immortan_2.13" % "0.1.1",
  "com.lihaoyi" % "requests_2.13" % "0.7.0",
  "com.iheart" % "ficus_2.13" % "1.5.0",
  "org.xerial" % "sqlite-jdbc" % "3.27.2.1",
  "org.scalafx" % "scalafx_2.13" % "16.0.0-R24"
)
libraryDependencies ++= {
  // determine OS version of JavaFX binaries
  lazy val osName = System.getProperty("os.name") match {
    case n if n.startsWith("Linux") => "linux"
    case n if n.startsWith("Mac") => "mac"
    case n if n.startsWith("Windows") => "win"
    case _ => throw new Exception("Unknown platform!")
  }
  Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
    .map(m => "org.openjfx" % s"javafx-$m" % "16" classifier osName)
}
assemblyMergeStrategy := {
  case x if x.endsWith("module-info.class") => MergeStrategy.discard
  case x => (assembly / assemblyMergeStrategy).value(x)
}
