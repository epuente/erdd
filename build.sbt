name := """erdd"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  javaEbean,
  "org.webjars" % "bootstrap" % "3.3.7",
  "org.webjars" % "jquery" % "1.12.0",
  "org.webjars" % "jquery-ui" % "1.12.1",

  //"org.webjars" % "jquery" % "2.2.4",
  //"org.webjars" % "jquery-ui" % "1.12.1",

  //"org.webjars" % "jquery" % "3.3.1",
  //"org.webjars" % "jquery-ui" % "1.12.1",
  //"org.webjars" % "bootstrap" % "3.3.7-1",
	


  //"mysql" % "mysql-connector-java" % "5.1.26",

  "mysql" % "mysql-connector-java" % "8.0.33",

  "com.feth" %% "play-authenticate" % "0.6.8",
  "org.json" % "org.json" % "chargebee-1.0",

  "org.apache.poi" % "poi" % "3.9",
  "org.apache.poi" % "poi-ooxml" % "3.9",

  "com.itextpdf" % "itextpdf" % "5.5.8",
  "com.itextpdf.tool" % "xmlworker" % "5.4.4",
  "org.webjars" % "animate.css" % "3.3.0",

  "org.webjars" % "bootstrap-notify" % "3.1.3",

  "org.webjars" % "datatables" % "1.10.16",
  "org.webjars" % "datatables-buttons" % "1.5.1"
 
)



libraryDependencies += filters     

lazy val root = (project in file(".")).enablePlugins(PlayJava)

play.PlayImport.PlayKeys.playDefaultPort := 8080



doc in Compile <<= target.map(_ / "none")


// Para hacer una distribucion tipo debian server    mediante play debian:packageBin

import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

import com.typesafe.sbt.packager.archetypes.ServerLoader
serverLoading in Debian := ServerLoader.Systemd

maintainer in Linux := "Eduardo Puente <epuente@ipn.mx>"
packageSummary in Linux := "Sistema ERDD"
packageDescription := "Sistema de Evaluación de Recursos Didácticos Digitales"



// Para hacer uso de firebase admin de google (para enviar notificaciones a celular)
libraryDependencies += "com.google.firebase" % "firebase-admin" % "6.3.0"

// https://mvnrepository.com/artifact/com.google.code.gson/gson
//libraryDependencies += "com.google.code.gson" % "gson" % "2.8.5"

libraryDependencies += "org.webjars" % "Eonasdan-bootstrap-datetimepicker" % "4.17.47"



// https://mvnrepository.com/artifact/org.webjars.npm/moment
libraryDependencies += "org.webjars.npm" % "moment" % "2.22.2"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")