package models

import play.api.libs.json._
import java.util.UUID;

case class Todo(var id: String, text: String, done: Boolean, order: Int)

object TodoJsonFormat {

  implicit object TodoFormat extends Format[Todo] {
    def reads(json: JsValue): Todo = Todo(
      (json \ "id").asOpt[String].getOrElse(UUID.randomUUID.toString),
      (json \ "text").as[String],
      (json \ "done").as[Boolean],
      (json \ "order").as[Int]
    )
    def writes(t: Todo): JsValue = JsObject(List(
      "id" -> JsString(t.id),
      "text" -> JsString(t.text),
      "done" -> JsBoolean(t.done),
      "order" -> JsNumber(t.order)))
  }

}