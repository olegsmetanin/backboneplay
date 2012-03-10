import controllers.{TodoStore}
import play.api._
import models._

object Global extends GlobalSettings {
  
  override def onStart(app: Application) {
//    InitialData.insert()
  }

}

object InitialData {

  def insert() = {
    TodoStore += ("0" -> new Todo("0","cool",false, 1))
    TodoStore += ("1" -> new Todo("1","cool",false, 1))
  }

}
