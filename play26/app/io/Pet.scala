package io

import play.api.libs.json.Json

/**
  * Pet is an animal who is considered to be a family member
  *
  * @param name Pet usually has one name
  * @param age Current age of a Pet
  */
case class Pet(
  name: String,
  age: Int
)

object Pet {

  implicit val petFormat = Json.format[Pet]

}
