package level1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile
{
    public static void main(String[] args)
    {
        Path path= Paths.get("src/level1/Test.txt");

        try{
            String content= Files.readString(path);
            System.out.println("Content of file "+path.getFileName()+":"+content);
        }catch (IOException e)
        {
            System.out.println("IO Exception!");
        }

    }
}