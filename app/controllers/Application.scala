package controllers

import play.api._
import models.Person
import models.DB
import play.api.data.Forms._
import play.api.data.Form
import play.api.libs.json.Json
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    val persons = DB.query[Person].fetch
    Ok(views.html.index(persons.toList))
  }

  val personForm: Form[Person] = Form {
    mapping(
      "name" -> text
    )(Person.apply)(Person.unapply)
  }

  def addPerson = Action {implicit request =>
    val person = personForm.bindFromRequest.get
    DB.save(person)
    Redirect(routes.Application.index())

  }

  def getPersons = Action {
    val persons = DB.query[Person].fetch
    Ok(Json.toJson(persons))
  }
}