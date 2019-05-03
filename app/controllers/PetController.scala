package controllers

import io.Pet
import javax.inject.{Inject, Singleton}
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class PetController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val pets = collection.mutable.Buffer(
    new Pet("Lassie", 7.8)
  )

  /**
    * Get a pet by name
    *
    * @param name Pet's name. Put 'Lassie' to get a result.
    * @return
    */
  def get(name: String) = Action { req =>
    pets.find(_.name == name) match {
      case Some(pet) =>
        Ok(Json.toJson(pet))
      case _ =>
        NotFound
    }
  }

  def home = Action { req =>
    PermanentRedirect("/docs/swagger-ui/index.html?url=/assets/swagger.json")
  }
}
