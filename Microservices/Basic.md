Course: https://globallogic.udemy.com/course/microservices-software-architecture-patterns-and-techniques/


Advantage of MicroServices:-

1. Can be developed parallely.


DrawBacks:-
1. Infrastructure costs are usually higher.
2. Integration testing complexity.


Microservices Template:-x
  - Logging
  - Metrices

Mono Vs Discrete

Microservices Decompostion
- Microservices that change together should be kept together
- Can be decomposed based on functionality and objective

Message Bus Comminication - Async Message Based Communication
Publis Subscribe Pattern

The communication can be sync or async.
Customer creating and placing an order is sync
Payment calling Bank to check customer funds is sync
The email notification to customer is async
Watching and logging the order and calculating insights to sep system is asyc

# MICROSERVICE REGISTRY
- There is a registry, when a service starts it registers itself with the registry
- When service stops, it removes itself from the registry
- Registry has health check api which checks at regular intervals whether the service is up or not.


# Microservice Discovery

- The consumer service calls the service registry for finding the requried service to consume.
- The service registry does the discovery part and also manages load balancing.

Server Side Discovery
  - consumer calls the load balancer which in turn finds the right service (through service registry) to call.

# Databases
- Shared Db
- One db per microservice
  - We can use diff db per service

# Event Source
  - Message Broker
  - Product Service -> Product DB
  - Snapshot of the objects is taken into event source db periodically
  - Every object update is pushed to event source db
  - State of the object is constructed after the last snapshot

Event source is subscribed to the product udpate and order creation service so the updates are pushed to it.

# API composition
Service queries data from more than one service db and then comnines them into

# Two Phase commit
To ensure the integrity of data in distributed scenario


 # Saga
 - Choreography-based saga
    Event Based
 - Orchestration-based saga
    Command based


https://dzone.com/articles/distributed-sagas-for-microservices
https://microservices.io/patterns/data/saga.html
https://www.youtube.com/watch?v=WnZ7IcaN_JA&t=76s

# Circuit Breaker
S1 => S2 (unavailable)
S1 + Circuit Breaker => S2


# Health Api


# Logging Techniques