//package com.viborotto.javasdkdynamodb.entity;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

//
///**
// * The DynamoDBMapper class is the entry point to Amazon DynamoDB.
// * It provides access to a DynamoDB endpoint and enables you to access
// * your data in various tables. It also enables you to perform various
// * create, read, update, and delete (CRUD) operations on items,
// * and run queries and scans against tables.
// * This class provides the following methods for working with DynamoDB.
// * **/
//public class MusicMapper {
//    public static void main(String[] args) {
//
//        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
//
//        DynamoDBMapper mapper = new DynamoDBMapper(client);
//
//        MusicItem keySchema = new MusicItem();
//        keySchema.setArtist("No One You Know");
//        keySchema.setSongTitle("Call Me Today");
//
//        try {
//            MusicItem result = mapper.load(keySchema);
//            if (result != null) {
//                System.out.println(
//                        "The song was released in "+ result.getYear());
//            } else {
//                System.out.println("No matching song was found");
//            }
//        } catch (Exception e) {
//            System.err.println("Unable to retrieve data: ");
//            System.err.println(e.getMessage());
//        }
//
//    }
//}
