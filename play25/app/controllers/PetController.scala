package controllers

import io.Pet
import javax.inject._
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

@Singleton
class PetController @Inject() extends Controller {

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
