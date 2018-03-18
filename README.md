Sample projects to integrate [docExtract](https://github.com/sohoffice/docExtract) and 
[play-swagger](https://github.com/iheartradio/play-swagger) to streamline swagger doc generation.

play-swagger can read your routes file and generate swagger.json.
It will accept a java properties file to supply the descriptions.
docExtract will be used to extract the scaladoc from your scala source files.

Putting the 2 plugins together, we should get good quality of API documentation without too much effort.

Once we have the swagger spec, [Swagger Codegen](https://swagger.io/swagger-codegen/) can be used to generate server access stubs or client code.


Play 2.6
--------

docExtract and play-swagger are configured so that the output of docExtract become the input of play-swagger.

Play 2.5
--------

docExtract doesn't support sbt 0.13, so this is basically a placeholder for future improvement.
