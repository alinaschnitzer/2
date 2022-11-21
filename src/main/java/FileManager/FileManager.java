package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        String file = "LegionFile.txt";
        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "The Floral Showhouse has once again transformed into a lush fall paradise as cascading chrysanthemum blooms adorn every corner of its showrooms.\n" +
                "\n" +
                "The design in the first house highlights fall traditions and is rich with bursts of pink and orange. The second house is a dramatic display accented in shades of yellow, purple and orange. The showstopper in this year’s show is a stunning chrysanthemum tree set against the backdrop of the Floral Showhouse’s moon gate.");
        fileManager.readFromFile(file);
        fileManager.deleteFile(file);
    }

    public void createFile(String fileName) {

        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. cannot write....");
            e.printStackTrace();
        }
    }

    public void readFromFile(String fileName) {
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
//             while (scanner.hasNextLine()){
//                 String row = scanner.nextLine();
//                 System.out.println(row);
//             }
            for (int i = 0; scanner.hasNextLine(); i++) {
                String row = scanner.nextLine();
                System.out.println(i);
                System.out.println(row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}


