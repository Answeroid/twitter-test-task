# twitter-test-task

Write Create/Update/Delete tests for single tweet on twitter (ability to create/update/delete tweet using twitter
API).
Test coverage should be defined by yourself. Tests should be also written in Scala, and executed via SBT task.

## Description for lib usage
Test task uses twitter4j https://github.com/DanielaSfregola/twitter4s lib to handle API requests.
But to start using some API from scratch without any known library you should create it from scratch using official docs about API endpoints and auth methods for them.
In general:
- you should obtain an API key to be able to authenticate on server side
- to have API documentation
- to have library that covers raw HTTP requests or to do that lib by your own

## Additional notes
If you want to create lib for you needs that will handle API requests you need to follow few rules:
1) to code API client which will be using your API secret for authentication and authorisation under the hood
2) to cover all possible or needed raw API requests into functions that will process input parameters in function body, uses GET POST PUT DELETE specific features of HTTP
3) to include code which converts/returns data from one format to another (json, xml etc) so it can be parsed further 
4) ofc be sure that you processed status codes correctly

Also client library should follow HTTP principles to be able to make valid request:
1) to have valid resource URL
2) to use proper method (GET, POST, PUT, DELETE)
3) include optional headers
4) include body with information needed

## TODO
- to get dev account
- to finish with task
- more to go...