import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File myFile = new File("test.txt");
        String str = in.nextLine();
        Pattern p = Pattern.compile( "(?<!\\S)" + "((25[0-5]|2[0-4]\\d|1\\d\\d|\\d?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d\\d|\\d?\\d)" + "(?!\\S)");
        Matcher m = p.matcher(str);
        try(FileWriter fw = new FileWriter("test.txt")) {
            if (m.find()) {
                fw.write((m.group()));
            } else
                fw.write("Не найдено");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}