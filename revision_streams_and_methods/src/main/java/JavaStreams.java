import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) throws IOException  {

        //1 Ex
        IntStream
                .range(1, 10)
                .forEach(System.out::println);

        //2 Ex
        int number = IntStream
                .range(2, 5)
                .sum();
        System.out.println(number);

        //3 Ex
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //4 Ex
        String[] names = new String[4];
        names[0] = "Dana";
        names[1] = "Donek";
        names[2] = "Dzban";
        names[3] = "Oana";

        Arrays.stream(names)
                .filter(x -> x.startsWith("D"))
                .sorted()
                .forEach(System.out::println);


        Stream.of(names)
                .filter(x -> x.startsWith("D"))
                .sorted()
                .forEach(System.out::println);

        //Ex 5
        List<String> people = Arrays.asList("Aona", "Doma", "alfonso");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);


        //Ex 6
        Stream<String> bands = Files.lines(Paths.get("revision_streams_and_methods/src/main/resources/bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();


        //Ex 7
        List<String> bands2 = Files.lines(Paths.get("revision_streams_and_methods/src/main/resources/bands.txt"))
                .filter(x -> x.contains("Singh"))
                .collect(Collectors.toList());
        bands2.forEach(System.out::println);

        //Ex 8
        Stream<String> rows1 = Files.lines(Paths.get("revision_streams_and_methods/src/main/resources/data.txt"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length ==3)
                .count();
        System.out.println(rowCount + " rows");
        rows1.close();


        //Ex 9
        Stream<String> rows2 = Files.lines(Paths.get("revision_streams_and_methods/src/main/resources/data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));

        rows2.close();
        System.out.println("asd");

        //Ex 10
        Stream<String> rows3 = Files.lines(Paths.get("revision_streams_and_methods/src/main/resources/data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1]))
                );
        rows3.close();
        for (String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}

