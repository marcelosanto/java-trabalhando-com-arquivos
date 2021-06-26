package usandofileandbuffereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\isp.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException env){
            System.out.println(env.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
