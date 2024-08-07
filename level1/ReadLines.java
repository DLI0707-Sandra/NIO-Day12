package level1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadLines
{
    public static void main(String[] args) {
        List<String >list=new ArrayList<>();

        Path path= Paths.get("src/level1/Test.txt");
        try(Stream<String> stream=Files.lines(path))
        {
            stream.forEach(System.out::println);
//            list=stream.toList();
//            System.out.println(list);
        }catch (IOException e)
        {

        }



    }
}
