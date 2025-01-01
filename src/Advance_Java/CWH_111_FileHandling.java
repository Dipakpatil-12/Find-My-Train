package Advance_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_111_FileHandling {
    public static void main(String[] args) {
        /*
        *File Handling in Java:
-File handling is a crucial part of any programming language.
-In Java, file handling is done with the help of the File class of the java.io package.

*Common file handling operations :

-Creating a new file.
-Writing in a file.
-Reading an existing file.
-Deleting a file.

*To perform any of the above operations on a file in Java, we need to create an object of the File class as shown in the below code:
  */

        // 1.Creating a new file :
        // -createNewFile() method is used to create a new file. Take a look at the below example


        File myfile = new File("CWH_111.txt");
//        try{
//        myfile.createNewFile();
//        }
//        catch(IOException e){
//            System.out.println("Unable to create a file due to some technical issues");
//            e.printStackTrace();
//        }



        //2.Writing to a file :
        //FileWriter class is used with its write() method to write some content in a file.
        //Do not forget to use the close() method when you're finished writing to a file. Take a look at the below

        /*
        try {
            FileWriter fileWriter = new FileWriter("CWH_111.txt");
            fileWriter.write("CodeWithHarry is one step solution for your all programming problems.\nKeep learning, Keep coding!");
            fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

         */

       //3. Reading a file :
        //-The Scanner class is used to read a file.
        //-It is important to enclose the method in a try-catch block to handle the IOException.

//        try {
//            Scanner sc = new Scanner(myfile);
//            while (sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        // Deleting a file :
        //The delete() method is used to delete a file in Java.
        //Example :

        if(myfile.delete()){
            System.out.println("I have deleted: " + myfile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
