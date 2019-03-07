package threads;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        do{
            System.out.println("Podaj link: ");
            answer = scanner.nextLine();

            String readWebsite = readWebsite(answer);
            Matcher m = Pattern.compile("https?://.*").matcher(readWebsite);

            while (m.find()) {
                System.out.println(m.group());
            }
        }while (!answer.equals("exit"));



    }

    public static String readWebsite(String url){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            InputStream inputStream = connection.getInputStream();

            int a;
            while ((a = inputStream.read()) != -1){
                stringBuilder.append((char) a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
