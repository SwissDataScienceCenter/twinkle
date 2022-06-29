## Twinkle

Twinkle is a simple SPARQL client. It's a fork of http://ldodds.com/projects/twinkle with a possibility of giving credentials when connecting to an endpoint with Basic Auth. The credentials might be defined in the config file as follows:

```
<http://192.168.1.112:3030/renku/sparql> a sources:Endpoint
    ; sources:username "admin"
    ; sources:password "admin"
    ; rdfs:label "Local Jena".
```

### Running

To run the app, the `twinkle.jar` needs to be downloaded as well as JRE be available. The run command is:
```bash
java -jar twinkle.jar
```

### Development

This project seems to be pretty old Ant project and although some libraries has been updated there's tons of work to be done.

To import it to Intellij following these steps might helpful: https://intellij-support.jetbrains.com/hc/en-us/community/posts/206190699-How-to-import-create-project-from-existing-Ant-build-xml-file- 