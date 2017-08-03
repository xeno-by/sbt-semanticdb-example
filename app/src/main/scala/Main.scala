import scala.meta._

object Main {
  def main(args: Array[String]): Unit = {
    val classpath = app.internal.build.BuildInfo.libraryClasspath
    println(Database.load(Classpath(classpath)))
  }
}
