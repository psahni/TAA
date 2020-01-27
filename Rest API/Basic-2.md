
API - A contract between the API provider and consumer.

#---------------------------------

  Contract First Approach
  You write your specifications in the document, then you run tool and a skelton is generated.
#---------------------------------

  Contract Last Approach
  You write your code first and annotate it with std comments, you run tool and specs document is generated.
  It is tough to keep the code and documentation in sync

  So, Contract First approach is recommended.

  ==> Think?

#

  Swagger specification ===> Developer documentation, server code, client code, virtual services or mocking

  WSDL - Rest specification standard. Also a formal way of documenting SOAP api (XML-format)
  For REST, there is no std. way

# What is Swagger

Develop, document api

Interact with api

YAML is used ofr writing swagger specification

editor.swagger.io

There are some node-tools also for creating swagger documentation
Install Swagger lib in node.


# Swagger 2.0

https://github.com/acloudfan/REST-API-Course-Security

Info has the metadata

Metadata
  info
  Tags
  externalDocs
    description
    url
Root Document - schemes
Exertnal documentation
Tags
Definitions
  definitions  parameters securityDefinitions
Paths


* You may skip the definition section and describe the schema under the operation but then the schema will not be re-usable. As a good practice use dfinitions


API metadata
API request
API response

BluePrint for the api.


# API MANAGEMENT

Lifecycle
Build -> publish -> Deprecated -> Retired
