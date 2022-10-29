# Working With Virtual Servers

### Configuration On Virtual Box
### Port Forwarding

![port_forwarding](./src/port_forwarding.png)

<br>

### Sending Jar file to virtual machine

```batch
  scp -P 3322 RestAPI.jar user@localhost:~/
```

![sending_file](./src/sending_file.png)

<br>

### Connection to virtual machine

```batch
  ssh -p 3322 user@localhost
```

![server_connection](./src/server_connection.png)

<br>

### Running Jar file

```batch
  Java -jar RestAPI.jar
```

![run_jar_file](./src/run_jar_file.png)

<br>

### Overview of API on Swagger

```batch
  http://localhost:3380/swagger-ui/index.html
```

![api_specs](./src/api_specs.png)

<br>

### Get Request On Postman

```batch
  GET localhost:3380/api/users/getAll
```

![postman_get_request](./src/postman_get_request.png)

<br>

### Post Request On Postman (Adding My Indian Friend :))

```batch
  POST localhost:3380/api/users/add
```

![new_user_added](./src/new_user_added.png)

<br>

### Get Request On Postman (Get All Sorted)

```batch
  GET localhost:3380/api/users/getAllSortedBySalaryDesc
```

![get_all_sorted_desc](./src/get_all_sorted_desc.png)

##### As you can see Deep is up there on the second line!

<br>

<p style='text-align: right;'>
<strong><i>Mustafa ZAİMOĞLU</i></strong>
</p>
