# sample-java-dynamo-sdk
Sample Application, with CRUD operations using DynamoDB(NoSQL database) SDK AWS Resource.


## Start DynamoDB Local

We have 2 options to start dynamoDB local

1. Command in Terminal

    [Download](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DynamoDBLocal.DownloadingAndRunning.html) and Extract zip before execute command...
    
    Go to directory extracted and execute:
 
    ```shell script
    java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
    ```

2. With Docker Compose

    We have a docker-compose.yml with steps to run
    
    
   ```shell script
    docker-compose up
   ```

- To verify dynamodb local is working access in browser `localhost:8000/shell`



## Create Table and Populate in DynamoDB Local

1. Create Table
    ```shell script
       aws dynamodb create-table --cli-input-json file://music_table.json --endpoint-url=http://localhost:8000
    ```
       
   - Verify if tabla was created with success:
   ```shell script
      aws dynamodb list-tables --endpoint-url=http://localhost:8000
   ```
   
2. Populate data with POST
    - url: `localhost:8080/aws/dynamo/musics`
        - body request:
        ```json
         {
             "id":"1",
             "artist": "Vittoria",
             "songTitle": "Go DynamoDB",
             "albumTitle": "AWS",
             "year": 2021
         }
        ```
       - HTTP Status 201
3. Verify Registration in Table 
    ```shell script
       aws dynamodb scan --table-name Music --endpoint-url http://localhost:8000
    ```