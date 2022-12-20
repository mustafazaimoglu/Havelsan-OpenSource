# Docker on Ubuntu Virtual Machine

### Create directory and Dockerfile 

![create_files](/src/1.png)

<br>

### Configure Dockerfile

![configure_dockerfile](./src/2.png)

<br>

### Check Docker version and images

![docker_check](./src/3.png)

<br>

### Build docker image with name 'havelsan-docker'

```bash
  sudo docker build -t havelsan-docker .
```

![build_container](./src/4.png)

<br>

### Run Dockerfile on port 80

```bash
  sudo docker run -p 80:8080 havelsan-docker
```

![run_dockerfile](./src/5.png)

<br>

### Test the app on Postman

```batch
  GET http://localhost/api/users/getAll
```

![result](./src/6.png)

<br>

<p align="right">
<strong><i>Mustafa ZAİMOĞLU</i></strong>
</p>
