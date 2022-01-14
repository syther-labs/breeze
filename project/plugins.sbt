scalacOptions in Global += "-deprecation"

//addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.0.2")

addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "2.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")

addSbtPlugin("org.scalanlp" % "sbt-breeze-expand-codegen" % "0.2.1")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")
addSbtPlugin("com.timushev.sbt" % "sbt-updates"               % "0.6.0")
addSbtPlugin("com.codecommit"   % "sbt-github-actions"        % "0.14.2")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "5.0.0-M3")