import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("textfile.txt");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");

        try {
            FileWriter fileWriter = new FileWriter("textfile.txt");
            fileWriter.write(scanner.nextLine());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File("textfile.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String str = reader.nextLine();
                System.out.println(str);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("textfile.txt");
            fileWriter.write(scanner.nextLine());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String str = "";

        try {
            File file = new File("textfile.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                str += reader.nextLine();
                System.out.println(str);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("textfile.txt");
            fileWriter.write(str + scanner.nextLine());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File("textfile.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String newStr = reader.nextLine();
                System.out.println(newStr);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
