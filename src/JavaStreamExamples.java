import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStreamExamples {
    public static void main(String[] args) {
        // Example 1
        IntStream.range(1, 10).filter(n -> n % 2 == 0).forEach(System.out::println);

        // Example 2
        IntStream.range(1, 10).map(n -> n * n).forEach(System.out::println);

        //Example 3
        int sum = IntStream.range(1, 10).reduce(0, (a, b) -> a + b);
        System.out.println("Ex. 3 :" + sum);

        //Example 4
        IntStream.range(1, 10).forEach(System.out::println);

        //Example 5
        IntStream.range(1, 10).peek(System.out::println).count();

        //Example 6
        IntStream.range(1, 10).limit(5).forEach(System.out::println);

        //Example 7
        IntStream.range(1, 10).skip(5).forEach(System.out::println);

        //Example 8
        IntStream.range(1, 10).distinct().forEach(System.out::println);

        //Example 9
        List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Ex. 9 : "+upperCaseNames);

        //Example 10
        List<String> names2 = Arrays.asList("John", "Jane", "Alice", "Bob");
        List<String> sortedNames = names2.stream().sorted().collect(Collectors.toList());
        System.out.println("Ex. 10 : "+sortedNames);

        //Example 11
        List<String> names3 = Arrays.asList("John", "Jane", "Alice", "Bob");
        Optional<String> result = names3.stream().filter(name3 -> name3.startsWith("A")).findFirst();
        System.out.println(result);

        //Example 12
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("ex. 12 : " + sum2);

        //Example 13
        List<Integer> numbers2 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers2.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);

        //Example 14
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flattenedList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flattenedList);


        //Example 15
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        boolean allEven = numbers3.stream().allMatch(n -> n % 2 == 0);
        boolean anyOdd = numbers3.stream().anyMatch(n -> n % 2 != 0);
        System.out.println(allEven);
        System.out.println(anyOdd);


        //Example 16
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = numbers4.stream().mapToInt(Integer::intValue).summaryStatistics();
        int max = stats.getMax();
        int min = stats.getMin();
        System.out.println(max);
        System.out.println(min);




    }
}
