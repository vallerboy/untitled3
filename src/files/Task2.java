package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("C:\\asd\\myFile.txt");

        File createFileFromPath = path.toFile();
        if(!createFileFromPath.exists()){

            try {
                createFileFromPath.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        String answer;
        do{
            System.out.print("Tekst: ");
            answer = scanner.nextLine();

//            if(answer.equals("exit"))
//                break;

            try {
                Files.write(path, ("\n" + answer).getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Nie udało sie zapisać do pliku!");
            }

        }while (!answer.equals("exit"));
    }
}
