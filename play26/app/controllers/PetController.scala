package controllers

import io.Pet
import javax.inject.{Inject, Singleton}
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api._
import play.api.mvc._

@Singleton
class PetController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * Get a pet by id
    *
    * @param id Unique pet id
    * @return
    */
  def get(id: Long) = Action { req =>
    Ok(Json.toJson(Pet("Pet Doe", 3)))
  }
}
