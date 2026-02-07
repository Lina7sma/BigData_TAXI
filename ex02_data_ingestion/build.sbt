ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.17"

lazy val root = (project in file("."))
  .settings(
    name := "ex02_data_ingestion"
  )

// Dépendances Spark pour ingestion de données
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.5.5"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.5"

// Dépendance AWS pour l'interaction avec Minio ou S3
libraryDependencies += "org.apache.hadoop" % "hadoop-aws" % "3.3.4"
libraryDependencies += "com.amazonaws" % "aws-java-sdk-bundle" % "1.12.262"
libraryDependencies += "org.postgresql" % "postgresql" % "42.7.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.4.0" % Provided
