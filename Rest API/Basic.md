https://stackoverflow.com/questions/15092137/difference-between-clustering-and-load-balancing

- Clustering means you run a program on several machines (nodes). One reason why you want to do this is: Load balancing. If you have too much load/ work to do for a single machine you can use a cluster of machines instead. A load balancer then can distribute the load over the nodes in the cluster.

-Clustering has a formal meaning. A cluster is a group of resources that are trying to achieve a common objective, and are aware of one another. Clustering usually involves setting up the resources (servers usually) to exchange details on a particular channel (port) and keep exchanging their states, so a resource’s state is replicated at other places as well. It usually also includes load balancing, wherein, the request is routed to one of the resources in the cluster as per the load balancing policy.

#

MongoDB cloud
cloud.mongodb.com

TODO
How to query mongodb ?

#

Imdb example

# What is API

- Provider and consumer
  Provides provides some data in some format that consumer can consume (Contract).
  Data is consumed by the applcations not by the humans.

Read basic about XML + SOAP
https://stackify.com/soap-vs-rest/

REST is prefered unless there is a strong case to use SOAP. SOAP provides additional security.


- XML based protocols worked out very very well till
we started to see the emergence of mobile technologies,
IPhone, Android phones i-Pad and also single page applications like G-mail application.
Now when these things started to pop up, developers started to complain about XML and SOAP protocol

- XML is heavy
- So you can't have large payloads crossing over from the web servers to the iPhone for example.
Parsing of XML is cpu intensive and memory intensive, known fact about XMLl.
Also the performance of XML parsing in a browser front end was really not that good and it also made the code very complex.
because of the heavy network traffic the mobile devices were suffering from bad battery performance.

In 2006 JSON came into picture. Yahoo and google offer their apis in JSON.
With the rise of the single page applications, REST/JSON have gained popularity.


# DEF

Representational State
Store as row in database -> API -> JSON -> Consumer


#

3 types:-
PUBLIC PRIVATE PARTNER

It is recommneded to create develpor portal for the api.

The suggestion is that you create a developer portal and manage the access request from that developer portal. The developer portal, can automatically grant access or initiate a manual flow for granting the access. Since it is portal.

4 things matter
API access
API security
SLA management - Service level aggreement.
Documentation


#

REST architectural contstraints (6)
Or
6 Design Rules

* Client - Server
* Uniform Interface
* Statelessness
* Caching
* Layered System
* Code on Demand (Optional)


- Client Server
  Client and Server are decoupled, they do not run in the same process

  Server          Client

  Security        UI
  Performance     Multiform
  Database
  Authen & Auth

- Uniform Interface
  Communication contract between client and the server
  Identity of the resource (URLS) [Resouce indentification]
  Data format                     [Resouce representation]
  Headers: Metadata - Content-Type, HTTP Status Code HOST from server
  Metadata - Accept(application/json) by Client
  422 unprocessable entity

  HyperMedia
  Response = data + links to actions to access the other resources

- Statelessness
  Each request is independent
  There is no session management
  Server receives all the info it needs in the request
  No state management in mid tier or the server side
  If the client wants to manage, then it can do within the client

- Caching
  Caching counter balances the -ve impact because of the Statelessness
  Headers
  Cache-Control mechanism from the server
  Expires
  Last-Modified
  E-Tag - Unique identifier associated with the response.

  It can happen on Server, client or Mid Tier

- Layered System

  Client does not directly request the app server
  There is gateway or reverse proxy which can load balance
  Scalability is easy
  Complexity is hidden

- Code on Demand
  This is an optional contraint
  In this, server sends some executable code to the client along with the data like some javascript

# Richardson maturity model for REST API
Level 0:  Level zero suggests the use of its HTTP as a transport protocol for all our RPCs.

Level 1: The REST API deals with the resources, not the end points.

Level 2: HTTP verbs

Level 3: Hypermedia. Data + media and links

# API value chain

First principle that I use is unambiguous design principle.

Simplicity

The most important link in this API value chain is the app developer. The idea is that if you are writing an API

or if you're designing an API that does not appeal to your app developers, they're not going to use it.

The best way to approach it is by way of thinking of an API as a product.


Stay consistent.

The idea here is that in your APIs, you should use common patterns.

- Use of nouns in the url to get the resource not the verb like getAccounts, or getSomething. Use plurals

- Actions can be verb, but standalone like '/search' is fine.

RFC2616 - HTTP Status codes
401 Unauthorized “you aren’t authenticated"
400 Bad Request (Eg: Validation failed)
403 Forbidden, not allowed to access the resource
406 Not Acceptable: client error response code indicates that the server cannot produce a response matching the list of acceptable values
https://developer.mozilla.org/en-US/docs/Web/HTTP/Status

PATCH is used when you want to update the part of the resource.

Response must contain
  Content-Type
  HTTP status code

 ** Your HTTP status should be 415, if the client has requested a format that your API does not support.

/search?format=json or search.json

#

Sample Error Response Template

{
    // Meant for the developer
    text: message,
    timestamp: new Date(),
    // POST, GET ....
    method: httpMethod,
    // Endpoint information
    endpoint: endpointInformation,
    // An array of all errors
    errors : errorList,
    // OPTIONAL - Use only during development
    payload: receivedPayload
}

- As a designer you would restrict the number of HTTP status codes used in your application to a maximum of 8

#

- Caching depends upon time sensitivity, speed of change of data and security of the data.

#

28th Lecture

Cache Control Directives
RFC 2616
Who can cache
What can be cache
How long ?

API consumer can set the cache control header in the header, and it can override the caching behaviour
and also it can protect the sensitive data to be cached.

Cache Control: 'no-store' -> No caching anywhere

no-cache E-Tag

no-cache
The no-cache directive means that a browser may cache a response, but must first submit a validation request to an origin server.

E-Tag is used to check whether the data is changed or not.

cleint -> server
The server sends back 304 not modified, with the same etag value, in case of no modification
The server sends back 304 not modified, with the same etag value, in case of no modification

E-Tag can help us to deal with network latency, for long responses.

Code: https://github.com/acloudfan/REST-API-Caching/blob/master/public/index.html

#

Partial Responses Example

/example.com/places?fields=id, name, state


Partial Responses query is supported in mongoose db layer with node.js
It has collections, on which we can query.
Read about Projection in mongodb

#

Pagination
- Cursor Based
- Offset, limit based
- Link header based

 Cursor method is most efficient way for pagination.
 Every response has link to prev page and next page.

 https://stackoverflow.com/questions/18314687/how-to-implement-cursors-for-pagination-in-an-api


# API authnetication
  API request should come from the authenticated consumer

  * Basic Authentication
    Authorization: Basic <Base64 enodeded username>:<Base64 encoded password>
  - In every api call, the authorization header is sent in the header, because session can not be made.
  - Not secure with HTTP, secure with SSL
  - Not secure for mobile application

* Token Based Authentication

- Token is requested with credentials in the body in json format
- Once token is fetched, two cases:-
    1. Token is saved on the front end in the cookie
       Tokenhttps://capgemini-odigo.atlassian.net/browse/PROBLEM-12437 is read from the cookie and set in the header also and sent to the server.
       Server matches the token in the header with the token.
       This ensure protection from CSRF, because server ensures it is coming from javascript of the trusted origin only
       Because In the cross site request, Origin header is set which will differ, than the original site and the request will
       be outrightly unatuthorized (401)
   2. Token is saved at the middle server like node.js server or Ver.tex
      Then like on console, a websocket connection is made between angular and messaging app
      angular app sends the command to the messaging app and messaging app in turn sends the http api request to the target
      according to the urls saved in the webservices file.

    Refs: https://stackoverflow.com/questions/1612177/are-http-cookies-port-specific
    Cookies are shared between ports of the same domain, they are not isolated from ports.

    https://stackoverflow.com/questions/10636611/how-does-access-control-allow-origin-header-work

    Origin header is forbidden
    https://stackoverflow.com/questions/46808011/how-to-set-the-origin-request-header/46808287

    Cors
    https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#The_HTTP_request_headers

    V Good Resource of angular
    https://docs.angularjs.org/api/ng/service/$http

    https://stackoverflow.com/questions/36751304/jwt-token-strategy-for-frontend-and-backend

    code
    https://github.com/acloudfan/REST-API-Course-Security/tree/tokens

# API KEY SECRET
  - How to store api key and secret ?
    - One is env variables
    - One is save it on the server in the file or some app
    - Never save it in your code base
    - Use of firebase or some api managemen application
    - Discuss

# OAUTH

  Authorization Token
  - Issued after user logs in and authorize
  Access Token
  - Credentials for accessing protecting resource (has expriry, so refresh token)

  Secure access to the 3rd party app on behalf of the main application

  First Oauth client gets the authorization token by sending client_id and redirect_url
  Next is request for access token by sending client_id, client_secret, and authorization token, redirect_url
  Client gets the access token
  Further resource request can be called by access_token

  Grant Types (5 Types)
  - Authorization Scope Grant (These 2 are imp)
  - Implicit Grant (No authorization, for example in javascript application, i.e for single page apps)
  - Resource owner credentials. when example.com wants to access api.example.com, then client passes credentials to example.com => api.example.com
  - Client credentials, when resource owner and client are same.
  https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/

  http://www.bubblecode.net/en/2016/01/22/understanding-oauth2/

  Example of auth provider:- https://developer.spotify.com/documentation/general/guides/authorization-guide/

# API SECURITY
  Open Web Application Security Project (OWASP)

  - SQL injection attacks
  - Fuzzing
  - CSRF (Malicious link, script executes in users browsers), use POST instead of GET.
  - Token Hijaking (The hacker is able to access the session token of the user through some script, via a malicious link)

  sqlfiddle.com

  Tools for testing
  HttpMaster
  PARASOFT
  SoapUI