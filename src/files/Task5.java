package files;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import  java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = Paths.get("C:\\asd\\myFile.txt").toFile();


        System.out.print("Podaj co chcesz zamieniać: ");
        String whichWord = scanner.nextLine();

        System.out.print("Podaj na co chcesz zamieniać: ");
        String forWhatWord = scanner.nextLine();


        StringBuilder newString = new StringBuilder();

        List<String> lines = null;
        try {
           lines =   Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (String line : lines) {
            newString.append(line.replace(whichWord, forWhatWord)).append("\n");
        }

        try {
            Files.write(file.toPath(), newString.toString().getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
