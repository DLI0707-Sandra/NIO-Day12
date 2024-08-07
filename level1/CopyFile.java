package level1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile
{
    public static void main(String[] args)
    {
        Path source= Paths.get("src/level1/source.txt");
        Path destination=Paths.get("src/level1/destination.txt");

        try
        {
            Files.copy(source,destination, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e)
        {
            System.out.println("IO exception!");
        }

    }
}
