package level2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindandReplace
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Path path= Paths.get("src/level2/file.txt");
        System.out.println("Enter the word to be replaced:");
        String old=scanner.next();
        System.out.println("Enter the new value:");
        String new_string=scanner.next();

        try
        {
            boolean first=true;
            List<String>lines=Files.readAllLines(path);
            for(String line:lines)
            {
                if(first)
                {
                    String [] words=line.split(" ");
                    for(int i=0;i<words.length;i++)
                    {
                        if(words[i].equals(old)) {
                            words[i]=new_string;
                            if(i==0)
                                Files.writeString(path,words[i]+" ");
                            else
                                Files.writeString(path, words[i]+" ", StandardOpenOption.APPEND);
                        }
                        else {
                            if(i==0)
                                Files.writeString(path,words[i]+" ");
                            else
                                Files.writeString(path, words[i]+" ", StandardOpenOption.APPEND);
                        }
                    }
                    first=false;
                }
                else {
                    String [] words=line.split(" ");
                    for(int i=0;i<words.length;i++)
                    {
                        if(words[i].equals(old)) {
                            words[i]=new_string;
                            Files.writeString(path,words[i], StandardOpenOption.APPEND);
                        }
                        else
                            Files.writeString(path,words[i],StandardOpenOption.APPEND);
                    }
                }
                Files.writeString(path,"\n",StandardOpenOption.APPEND);
            }

        }catch (IOException e)
        {
            System.out.println("File not found!");
        }


    }
}
