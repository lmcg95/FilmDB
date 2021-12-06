
# Film Database App

This project presents a list of films based on the mySQL sakila Database. Users can search for and add new films to the database using the front end which is stored in the repository FilmDBFront.

## API Reference

#### Get all films

```http
This is currently stored locally:
  GET http://localhost:8080/films
```

#### Get all actors

```http
This is currently stored locally:
  GET http://localhost:8080/actors
```



#### Get film

```http
  GET http://localhost:8080/filmsByID/{film_id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `film_id`      | `int` | **Required**. Unique number identifying a film in the database. |

#### Get actor
```
GET http://localhost:8080/actorsByID/{actor_id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `actor_id`      | `int` | **Required**. Unique number identifying an actor in the database. |

#### Add a film
This requires an API platform such as postman.

An ID is automatically created for each new film added.
```
POST http://localhost:8080/addFilm?title={title}&release_year={release_year}&description={description}&length={length}&rating={rating}
```
#### Add an actor

This requires an API platform such as postman.

An ID is automatically created for each new actor added.
```
POST http://localhost:8080/addActor?first_name={first_name}&last_name={last_name}
```
#### Delete a film 

```
DELETE https://localhost:8080/deleteFilm{film_id}

```

#### Delete an actor

```
DELETE https://localhost:8080/deleteActor{actor_id}

```


## Appendix

The front end of this application can be found in this gitHub repo:

https://github.com/lmcg95/FilmDBFrontEnd




## Authors

- [Lauren McGonnagle](https://github.com/lmcg95)

