import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.slf4j:slf4j-log4j12:${slf4jVersion}",
ivy"org.slf4j:slf4j-api:${slf4jVersion}",
ivy"org.postgresql:postgresql:42.2.18.jre7",
ivy"log4j:log4j:1.2.17"
    // Dependices
  )
}
