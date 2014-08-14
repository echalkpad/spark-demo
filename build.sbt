name := "spark-demo"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.10.4", "2.11.1")

resolvers ++= Seq(
  "Archiver Managed Spark Repository" at "https://repository.apache.org/content/repositories/orgapachespark-1025/",
  "sonatype-oss" at "https://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= Seq(
  "org.apache.spark"  % "spark-core_2.10" % "1.1.0" % "provided",
  "org.elasticsearch" % "elasticsearch-spark_2.10" % "2.1.0.BUILD-SNAPSHOT" changing()
)

assemblySettings
