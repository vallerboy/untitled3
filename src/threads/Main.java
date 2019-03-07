package threads;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        long startTime = System.currentTimeMillis();

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(readWebsite("https://agile-caverns-26516.herokuapp.com/test"));
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(readWebsite("https://agile-caverns-26516.herokuapp.com/test"));
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(readWebsite("https://agile-caverns-26516.herokuapp.com/test"));
            }
        });

        long stopTime = System.currentTimeMillis();

        System.out.println((stopTime - startTime));
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
