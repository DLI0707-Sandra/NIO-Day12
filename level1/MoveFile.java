package level1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFile
{
    public static void main(String[] args)
    {
        Path source= Paths.get("src/file2.txt");
        Path destination =Paths.get("src/level1/file2.txt");

        try{
            Files.move(source,destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Move successful!");
        }catch (IOException e)
        {
            System.out.println("IO exception!");
        }




    }
}
