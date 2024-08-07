package level2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class DirectoryTree
{
    public static void main(String[] args)
    {
        String basePath = "src/level2/directory";
        String[] subdirectories = {
                "subdirectory1",
                "subdirectory2",
                "subdirectory3"
        };
        
        for (String new_addition : subdirectories)
        {
            Path path = Paths.get(basePath, new_addition);
            try
            {
                Files.createDirectories(path);
                System.out.println("Created directory: " + path);
            } catch (IOException e) {
                System.err.println("Failed to create directory: " + path);
                e.printStackTrace();
            }
        }
    }
}
