package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GameFile {
    public static void main(String[] args) {
        String file0 = "Soccer.txt";
        String file1 = "Hockey.txt";
        String file2 = "Rugby.txt";

        GameFile gameFile = new GameFile();
        gameFile.CreateFile(file0);
        gameFile.writeToFile(file0,"11 players");
        gameFile.CreateFile(file1);
        gameFile.writeToFile(file1, "6 players");
        gameFile.CreateFile(file2);
        gameFile.writeToFile(file2,"15 players");
    }

    public void CreateFile(String game) {
        File file = new File(game);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile (String game, String text){
        try {
            FileWriter fileWriter = new FileWriter(game);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error... cannot write");
            e.printStackTrace();
        }
    }

}
