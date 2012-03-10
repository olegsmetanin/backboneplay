package controllers


import play.api.mvc._
import play.api.libs.json._
import Json._

import models.Todo
import models.TodoJsonFormat._

object Todos extends Controller {

  def list = Action {
    Ok(toJson(JsArray(TodoStore map  { case (i,t) => toJson(t) } toList ): JsValue))
  }

  def add = Action { request =>

    val todo = request.body.asJson.map(_.as[Todo]).getOrElse(
      throw new RuntimeException("could not create todo")
    )

    TodoStore += (todo.id -> todo)
    Ok(toJson(todo))
  }


  def update(id:String) = Action { request =>

    val todo = request.body.asJson.map(_.as[Todo]).getOrElse(
      throw new RuntimeException("could not update todo")
    )

    TodoStore += (todo.id -> todo)
    Ok(toJson(todo))
  }

  def delete(id:String) = Action { request =>
    TodoStore -= id
    Ok("").as("text/html")
  }

}

object TodoStore extends scala.collection.mutable.HashMap[String,Todo]

