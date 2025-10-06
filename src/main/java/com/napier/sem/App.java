package com.napier.sem;

HEAD

import com.mongodb.client.MongoClient;   // NEW import
import com.mongodb.client.MongoClients;  // NEW import
release/0.1.0.2
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Boo yah!");
        System.out.println("boo yahha ayah");
        System.out.println("just after changing to java 17 from 25");
        System.out.println("Just checking on tuesday");

<<<<<<< HEAD

=======
        // Connect to MongoDB (new API)
        MongoClient mongoClient = MongoClients.create("mongodb://mongo-dbserver:27017");

        // Do something simple to test
        System.out.println("Connected to MongoDB successfully!");
>>>>>>> release/0.1.0.2
    }
}
