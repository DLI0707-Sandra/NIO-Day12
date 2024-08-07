package level1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteToFile
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Path path= Paths.get("src/level1/file.txt");

        if(Files.exists(path))
        {
            System.out.println("Enter the content to be appended:");
            String content=scanner.nextLine();
            try {
                Files.write(path,content.getBytes(),StandardOpenOption.APPEND);
            }catch (IOException e)
            {}
        }
        else
        {
            try {
                Files.createFile(path);
                System.out.println("Enter the content to be written to new file:");
                String content=scanner.nextLine();
                Files.write(path,content.getBytes(),StandardOpenOption.CREATE);
            }catch (IOException e){}
        }

    }
}
