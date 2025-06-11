import sbt.compiler.ComponentCompiler.javaVersion

name := """erdd"""

version := "1.2.8-SNAPSHOT"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  javaEbean,
  "org.webjars" % "bootstrap" % "3.3.7",
  //"org.webjars" % "jquery" % "1.12.0",
  "org.webjars" % "jquery-ui" % "1.12.1",

  //"mysql" % "mysql-connector-java" % "8.0.33",
  "com.mysql" % "mysql-connector-j" % "8.3.0",
  "org.mariadb.jdbc" % "mariadb-java-client" % "3.0.7",

  "com.feth" %% "play-authenticate" % "0.6.8",
  "org.json" % "org.json" % "chargebee-1.0",

  //"org.apache.poi" % "poi" % "3.9",
  //"org.apache.poi" % "poi-ooxml" % "3.9",
  "org.apache.poi" % "poi" % "5.4.1",
  "org.apache.poi" % "poi-ooxml" % "5.4.1",

  //"com.itextpdf" % "itextpdf" % "5.5.8",
  "com.itextpdf" % "itextpdf" % "5.5.13.3",
  "com.itextpdf.tool" % "xmlworker" % "5.4.4",
  "org.webjars" % "animate.css" % "3.3.0",

  "org.webjars" % "bootstrap-notify" % "3.1.3",

  "org.webjars" % "datatables" % "1.10.16",
  "org.webjars" % "datatables-buttons" % "1.5.1"






)



libraryDependencies += filters     

lazy val root = (project in file(".")).enablePlugins(PlayJava)

play.PlayImport.PlayKeys.playDefaultPort := 80



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




//libraryDependencies += "org.webjars.npm" % "moment" % "2.22.2"
//libraryDependencies += "org.webjars.npm" % "moment" % "2.29.4"


// Actualizaciones por vulnerabilidad
//libraryDependencies += "org.webjars.npm" % "moment" % "2.10.3"
//libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.5.13"
//libraryDependencies += "io.netty" % "netty-common" % ".1.118"
//libraryDependencies += "org.seleniumhq.selenium" % "selenium-ie-driver" % "4.14.1"
//libraryDependencies += "com.ning" % "async-http-client" % "1.8.17"
//libraryDependencies += "org.webjars" % "jquery" % "3.5.0"
//libraryDependencies += "org.eclipse.jetty" % "jetty-util" % "9.4.17.v20190418"
//libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.12.4"
//libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.4.2"
//libraryDependencies += "com.google.oauth-client" % "google-oauth-client" % "1.33.3"
//libraryDependencies += "xalan" % "xalan" % "2.7.3"
//libraryDependencies += "org.yaml" % "snakeyaml" % "2.0"
//libraryDependencies += "org.eclipse.jetty" % "jetty-http" % "12.0.12"
//libraryDependencies += "commons-collections" % "commons-collections" % "20040102.233541"
//libraryDependencies += "net.sourceforge.nekohtml" % "nekohtml" % ""



// Fin de actualizaciones por vulnerabilidad


//javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

//javaOptions ++= Seq("-source", "1.8", "-target", "1.8")



