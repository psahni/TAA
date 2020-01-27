$ docker  run -p5000:5000 stkatz/serve

#

Git Repo 15Dkatz



#

The following example shows how to create a service consisting of three replica containers deployed within the swarm. The service is given a name that makes it easy to identify. Port mappings are defined. In this example, the service uses the nginxdemos/hello image.:




 docker service create --replicas 3 --name hello -p 80:80 nginxdemos/hello

 docker service ls

 docker service ps ID|SERVICE

 ID                NAME     SERVICE  IMAGE             LAST STATE             DESIRED STATE  NODE


 https://docs.oracle.com/cd/E37670_01/E75728/html/docker-swarm-service-create.html