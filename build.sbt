// Project name (Maven artifact name)
name := "stanford-corenlp"

organization := "edu.stanford.nlp"

version := "3.6.1-SNAPSHOT"

// project description
//description := ""

// Enables publishing to maven repo
publishMavenStyle := true

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

// library dependencies. (orginization name) % (project name) % (version)
libraryDependencies ++= Seq(
   "com.io7m.xom" % "xom" % "1.2.10",
   "joda-time" % "joda-time" % "2.9",
   "de.jollyday" % "jollyday" % "0.4.8", //"0.4.7",
   "com.googlecode.efficient-java-matrix-library" % "ejml" % "0.23",
   "javax.json" % "javax.json-api" % "1.0",
   "org.slf4j" % "slf4j-api" % "1.7.2",
   "com.google.protobuf" % "protobuf-java" % "2.6.1",
   "org.apache.lucene" % "lucene-core" % "4.2.0",
   "org.apache.lucene" % "lucene-analyzers-common" % "4.2.0",
   "org.apache.lucene" % "lucene-queryparser" % "4.2.0",
   "org.apache.commons" % "commons-lang3" % "3.1",
   "javax.servlet" % "javax.servlet-api" % "3.1.0",
   "com.apple" % "AppleJavaExtensions" % "1.4",
   // testing
   "com.novocode" % "junit-interface" % "0.11" % "test",
   "com.pholser" % "junit-quickcheck-generators" % "0.6.1"
   //"com.pholser" % "junit-quickcheck" % "0.6.1"

)
