package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("123", "Velayutham", "Secret");
        String filename = "userfile.ser";
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(user1);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
            System.out.println("IOException is caught");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Deserialization
        User user2 = null;
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            user2 = (User)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("UserId = " + user2.userId);
            System.out.println("userName = " + user2.userName);
            System.out.println("password = " + user2.password);
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }



    }
}