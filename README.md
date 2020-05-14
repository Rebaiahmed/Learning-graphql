<h1 align="center"> Roadmap-To-learn-Graphql </h1> <br>
<p align="center">
  <a href="https://gitpoint.co/">
    <img alt="Graphql" title="Graphql" src="https://img.icons8.com/color/2x/graphql.png" width="450">
  </a>
</p>

<p align="center">
  My Roadmap to practise graphql with different technologies and discover different libraries
</p>

## Table of Contents

- [Spring Boot Graphql ](#Spring-graphql)
- [Nodejs Graphql ](#Nodejs_graphql)
- [Apollo server](#Apollo_server)
- [Apollo client](#Apollo_client)
- [Angular Github Graphql API](#Angular_graphql)
- [Prisma](#Prisma)
- [React Relay](#React_relay)
- [Other ..](#Other)


## Spring-graphql  :heavy_check_mark:


Maven dependncies :

```xml
<dependency>
			<groupId>com.graphql-java</groupId>
			<artifactId>graphql-spring-boot-starter</artifactId>
			<version>5.0.2</version>
		</dependency>
		<dependency>
			<groupId>com.graphql-java</groupId>
			<artifactId>graphql-java-tools</artifactId>
			<version>5.2.4</version>
</dependency>
```

GraphQL Schema :


```
type Vehicle
{
id: ID!,
type: String,
modelCode: String,
brandName: String,
launchDate: String
}

type Query {
vehicles(count: Int):[Vehicle]
vehicle(id:ID):Vehicle
}

type Mutation
{
createVehicle(type: String!, modelCode: String!, brandName: String, launchDate: String):Vehicle
}
```


Query Resolver :


```
@Component
public class VehicleQuery implements GraphQLQueryResolver {
```

Mutation :

```@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
```
---

## Nodejs_graphql  :heavy_check_mark:


npm dependncies :

```
"dependencies": {
    "express": "^4.17.1",
    "express-graphql": "^0.9.0",
    "graphql": "^15.0.0"
  }
```

GraphQl Schema :

```
// Build the schema //
var schema = buildSchema(
    `
   type Query {
       hello:String
   } 
    
    `
)
```

GraphQl Resolver:

```
var root = {
    hello: () => {
      return 'Hello world!';
    },
  };
```

---

## Apollo_server :lock_with_ink_pen:

---

## Apollo_client :lock_with_ink_pen:

---

## Angular_graphql :lock_with_ink_pen:

---

## Prisma :lock_with_ink_pen:

---

## React Relay :lock_with_ink_pen:

---

## Other :lock_with_ink_pen:

