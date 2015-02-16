package models

import play.api.libs.json.Json

/**
 * Created by ObjectiveTruth on 2/16/2015.
 */

case class Person(name: String)

object Person {
  implicit val personFormat = Json.format[Person]
}
