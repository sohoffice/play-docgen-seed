Sample projects to integrate [docExtract](https://github.com/sohoffice/docExtract) and 
[play-swagger](https://github.com/iheartradio/play-swagger) to streamline swagger doc generation.

> I've modified play-swagger so it can accept description file, but the change haven't been merged.
> Please follow the instruction in [sohoffice Play-swagger](#sohoffice-play-swagger) to install the customized version locally.

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


sohoffice Play-swagger
----------------------

Publish the sohoffice version of play-swagger to local ivy repo.
You'll need to do this once to use the seed project.

- Clone [my modified version of play-swagger](https://github.com/sohoffice/docExtract)

- In the cloned play-swagger directory, switch to play2.6 branch

```
git checkout play2.6
```

- In the cloned play-swagger directory, publish the artifact to local

```sbtshell
sbt
> publishLocal
```
