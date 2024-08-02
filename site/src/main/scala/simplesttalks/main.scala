//> using dep "com.wbillingsley::doctacular::0.3.0"
//> using dep "org.scala-js::scalajs-dom::2.2.0"

package simplesttalks

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scalajs.js
import js.Thenable.Implicits._
import org.scalajs.dom

def loadLists():Future[js.Dynamic] = {
  val url ="lists.json"
  for 
    response <- dom.fetch(url)
    j <- response.json()
  yield j.asInstanceOf[js.Dynamic]
}

def loadList(url:String) = 
  for 
    response <- dom.fetch(url)
    j <- response.json()
  yield j



@main def main() = {
    println("boo")
}