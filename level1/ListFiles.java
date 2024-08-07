package level1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class ListFiles
{
    public static void main(String[] args)
    {
        Path directory= Paths.get("src");
        try {
            System.out.println(Files.list(directory).collect(Collectors.toList()));
        }catch (IOException e)
        {
            System.out.println("IO Exception!");
        }

    }
}
