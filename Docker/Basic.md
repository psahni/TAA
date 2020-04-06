What is Docker
  - A platform for containerizing applications
What is Container
  - That contains the running app in an isolated env
  - Loose Coupled Isolation (less)
  - Put limit on resource usage
  - One container process can not affect other container process
VM vs Container
Application of a Container
Container and images
Docker compose and Swarm



https://github.com/15Dkatz/docker-guides

Enable Hyper-V on windows
Using Power Shell

-----

File System and resources between containers can be shared.


What is Kernal ?
  - This is a core of the operating system with complete control

Docker runs on the top of the Kernal, which makes it the host machine

What is Docker Engine ?
  - Server, API and command line engine

Docker Daemon
  - Daemon: Background Process on an Operating system
  - Daemon receives the requests to create container

-------

- Image has instructions to create container

--------------------------------------------------------------------

$ docker create --name=foo -it ubuntu bash

--------------------------------------------------------------------

-it: this is for interactive mode

$ docker container ls

- This above comand shows ouput only when contaner is started
- docker container ls -a => this will give all containers

$ docker start foo
$ docker container ls

$ docker attach foo
ctrl + p, ctrl + q to exit the container, the container will keep running

$ docker logs foo

$ docker stop foo
$ docker rm foo

$ docker run --name=bar -it ubuntu bash
ctrl+p ctrl+q

$ docker rm -f
Kills the container - stops and removes

* REMOVE ALL CONTAINERS
$ docker container ls -aq | xargs docker container rm
x`
* Remove all images:
docker image ls -aq | xargs docker rmi -f

* Search for a docker image

Example: docker search ubuntu
                      <image>

$ docker build . -t <image_name>
$ docker image ls
$ docker run --name=serve -p=3001:5000 <image_name>

==> node.js has serve module to serve directory

$ docker run --name=express -d -p=3002:80 <image_name>

$ .dockerignore file ignores the files
$ COPY . .
Copy the entire content except the files in the .dockerignore
FROM node
COPY . .
RUN npm install
CMD ["node", "server.js"]

# Layered cache system

FROM node
COPY package.json package.json
RUN npm install
COPY . .
CMD ["node", "server.js"]

$ docker exec -it express bash
Go to the bash of the container, express is the name of the container

To execute a command in the running container:-
Usage: docker exec <container name/id> <command>

* EXPOSE 80
This is informational and documentation kind of, to inform the devs while building an image

* Go to docker hub to find more usage


* Usage for removing the image: docker image rmi <image id>
* Remove all images docker image ls -aq | xargs docker rmi -f
* Usage: docker search <image>

# Docker Storage:- MOUNTS

Container Storage
- Mounting the volume from host machine to docket container
- Bind Mounts Directly link direcot from host to docker conta, non docker process can also modify the bind mount
- Tmpfs mount

docker volumn create shared_vol
dcoker inspect shared_vol

- docker vol is useful for sharing data across containers
- Only docker process has the ability to access the shared_vol
- With screen command you can access it, have to check for windows

docker volume rm shared_vol

$ docker run -it --name=foo --mount source=shared-vol,target=/src/shared ubuntu bash

* Bind Mounts
$ docker run -it --name=foo --mount type=bind, source=D:\\Downloads\\docker, target=/src/mountdir ubuntu* bash

If we write something in docker dir, then it will be available in mountdir and viceversa

* Tmpf Mounts
The data does not persist across multiple containers, it only persits with in one session of container

$ docker run -it --name=baz --mount type=tmpfs,destination=/tmpdir ununtu* bash

# DOCKER NETWORKING
* The communication between multiple containers is achieved through Docker container networking.
  Bridge, None, Host

  $ docker network create private_net

  $ docker run -itd --network=private_net busybox

  $ docker container ls -aq | xargs docker rm -f

* By default it is bridge network, one docker container is able to ping other docker container by its name or ip

# Docker Compose
* A tool for building and composing applications with more than one docker container.
* Can start multiple containers one command.
* Creates a Private network automatically.

* depends_on option in compose.yml
  Use the depends_on key and specify dependencies with a list. Each container dependency is marked by a dash, such as: -backend

* docker compose up
* docker compose up --build [Rebuild]

* Node.js for backend, php for front end (call the conainer by DNS, the service name)
* Every time we change the code, we need to revuild the images.



Exersise
1. Do this - https://globallogic.udemy.com/course/docker-containers/learn/lecture/8936468#overview
2. Create an angular app local machine and run it inside docker container



# DOCKER SWARM

Multiple servers running their own docker engine.
Orchaterstaing your containers
Stack = List of services


https://github.com/tsmean/docker-tutorial

watch later
https://www.youtube.com/watch?v=bU2NNFJ-UXA



#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

https://linuxize.com/post/how-to-remove-docker-images-containers-volumes-and-networks/

https://linuxize.com/post/how-to-remove-docker-images-containers-volumes-and-networks/