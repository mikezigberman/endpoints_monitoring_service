# Endpoints monitoring service

## 📃 Content

  - Task description

## The task is to create a REST API JSON Java microservice which allows you to monitor particular http/https URLs.

## The service should allow you to
  - create, edit and delete monitored URLs and list them for a particular user (CRUD),
  - monitor URLs in the background and log status codes + the returned payload,
  - and to list the last 10 monitored results for each particular monitored URL.

### Data model (just a suggestion for the data model):

1. `MonitoredEndpoint`:
    - `id`: (any type you want)
    - `name`: String
    - `url`: String
    - `date of creation`: DateTime
    - `date of last check`: DateTime
    - `monitored interval`: Integer (in seconds)
    - `owner`: User

2. `MonitoringResult`:
    - `id`: (any type you want)
    - `date of check`: DateTime
    - `returned http status code`: Integer
    - `returned payload`: String
    - `monitoredEndpointId`: MonitoredEndpoint

3. `User` (CRUD isn’t necessary, it’s perfectly ﬁne to have it seeded in the database):
    - `id`: (any type you want)
    - `username`: String
    - `email`: String
    - `access token` : UUID like String

### What’s expected:

```
{
    name: "Applifting",
    email: "info@applifting.cz",
    accessToken: "93f39e2f-80de-4033-99ee-249d92736a25"
},
{  
    name: "Batman",
    email: "batman@example.com",
    accessToken: "dcb20f8a-5657-4f1b-9f7f-ce65739b359e"
}
```

### In detail:
- Design REST endpoints for the management of `MonitoredEndpoints` (if you don’tknow how, don’t hesitate to ask us!)
- Monitor endpoints in the background and create `MonitoringResult`
- Implement an endpoint for getting `MonitoringResult`
- Implement a microservice created in Java, ideally written in `Spring Boot`. Use `MySQL` for the database. Use `Spring MVC` as a REST framework
- Authentication: do it in the HTTP header according to your choice, you will get the accessToken in it
- Authorization: a `User` can see only `MonitoredEndpoints` and `Result` for him/herself only (according to `accessToken`)
- Don’t forget model validations (you decide what’s necessary to validate)
- Write basic tests in `JUnit` or `TestNG`
- Push everything into a public repo on `GitHub`
- Create a readme ﬁle where you explain how to start and use the service
- Send us a link to the `GitHub`
- `Bonus points`: create a `Dockerﬁle`, add docker-compose and describe how to startand run it in `Docker`
