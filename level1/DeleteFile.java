package level1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile
{
    public static void main(String[] args)
    {
        Path path= Paths.get("src/level1/file2.txt");
        try
        {
            Files.delete(path);
            System.out.println("Deletion successful!");
        }catch (IOException e)
        {
            System.out.println("IO Exception!");
        }

    }
}
