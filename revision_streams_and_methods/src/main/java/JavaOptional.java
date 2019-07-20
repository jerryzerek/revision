import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaOptional {

    public static void main(String[] args) {

        String name = "jedrek";
        Optional<String> opt = Optional.of(name);
        System.out.println(opt);

        Element element = new Element();
        Optional<String> opt2 = Optional.ofNullable(element.field);
        boolean trueOrFalse = opt2.isPresent();
        System.out.println(trueOrFalse);


        Optional<String> opt3 = Optional.of("Baeldung");
        opt3.ifPresent(name1 -> System.out.println(name1.length()));

        String nullName = null;
        Optional<String> name3 = Optional.ofNullable(nullName);
        System.out.println(name3);

        Integer year = 2016;
        Integer yearOpt = Optional.ofNullable(year).orElse(1);

        String name4 = Optional.ofNullable(nullName).orElseGet(() -> "john");
        System.out.println(name4);


        String nullName2 = null;
        String name5 = Optional.ofNullable(element.field).orElseThrow(IllegalAccessError::new);


        List<String> companyNames = Arrays.asList("asd", "asd");
        Optional<List<String>> list = Optional.of(companyNames);

        int size = list
                .map(List::size)
                .orElse(0);

        System.out.println(size);

        Optional<Integer> year99 = Optional.of(2016);
        boolean a = Optional.of(year99).isPresent();
        System.out.println(a);

        String opt11 = Optional.of(name).orElse("ee");

        String nullName4 = "asd";
        String name99 = Optional.ofNullable(nullName4).orElse("asd");


        String answer = "yes";
        Optional<String> answer2 = Optional.ofNullable(answer);







    }
}
