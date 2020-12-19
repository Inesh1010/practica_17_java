import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            File f = new File("f.txt");
            f.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }


        Scanner scan = new Scanner(System.in);

        System.out.print("Введите строку в файл: ");

        try {

            FileWriter fwriter = new FileWriter("f.txt");
            fwriter.write(scan.nextLine());
            fwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            File f = new File("f.txt");
            Scanner fscan = new Scanner(f);
            while (fscan.hasNextLine()) {
                String s = fscan.nextLine();
                System.out.println(s);
            }
            fscan.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {

            FileWriter fwriter = new FileWriter("f.txt");
            fwriter.write(scan.nextLine());
            fwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }




        String s = "";

        try {

            File f = new File("textfile.txt");
            Scanner fscan = new Scanner(f);
            while (fscan.hasNextLine()) {
                s += fscan.nextLine();
                System.out.println(s);
            }
            fscan.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {

            FileWriter fwriter = new FileWriter("f.txt");
            fwriter.write(s + scan.nextLine());
            fwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            File file = new File("f.txt");
            Scanner fscan = new Scanner(file);
            while (fscan.hasNextLine()) {
                String newStr = fscan.nextLine();
                System.out.println(newStr);
            }
            fscan.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
