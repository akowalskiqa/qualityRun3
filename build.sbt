name := "quality"

version := "1.0"

scalaVersion := "2.12.2"
wartremoverErrors ++= Warts.unsafe
wartremoverErrors ++= Warts.all

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"


