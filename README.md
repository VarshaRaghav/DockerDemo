# DockerDemo
Creating Docker Image, Build That Image and Finally push it to DockerHub


To Build Docker Image Run Following Command :

docker build -f Dockerfile -t docker-spring-boot .

After Building Image Successfully to Run that Image use following Command :

docker-run -p 8085:8085 demo-docker

To Push Image to Docker hub Use Following Commands :

i.  docker images

ii. docker Login : Use ur credintials 

iii. docker tag demo-doecker:latest varshadivakar/demo-doecker

iv.  docker push varshadivakar/demo-doecker 
