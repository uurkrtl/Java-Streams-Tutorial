import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class StreamDemo {
    public static List<String> mapDemo() {
        List<String> cities = List.of("Frankfurt", "Heidelberg", "Mannheim", "Karlsruhe");
        return cities
                .stream()
                .map(String::toUpperCase)
                .toList();
    }

    public static List<Integer> filterDemo() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }

    public static Set<String> collectDemo () {
        List<String> fruits = List.of("Apfel", "Pfirsich", "Banane", "Kirsche", "Banane", "Pfirsich");
        return fruits
                .stream()
                .collect(Collectors.toSet());
    }

    public static List<Integer> flatMapDemo() {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        return numbers.stream()
                .flatMap(List::stream) // Innere Listen zu einem Stream kombinieren
                .collect(Collectors.toList());
    }

    public static int reduceDemo() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return numbers
                .stream()
                .reduce(0, Integer::sum);
    }

    public static List<Integer> forEachDemo() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = new ArrayList<>();
        numbers
                .forEach(number -> result.add(number*2));
        return result;
    }

    public static List<Integer> distinctDemo() {
        List<Integer> numbers = List.of(1, 1, 2, 3, 4, 4, 4, 5, 5);
        return numbers
                .stream()
                .distinct()
                .toList();
    }

    public static List<Integer> sortedDemo () {
        List<Integer> numbers = List.of(3, 1, 6, 8, 2, 4, 5, 9, 7);
        return numbers
                .stream()
                .sorted()
                .toList();
    }

    public static List<Integer> skipDemo() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        return numbers
                .stream()
                .skip(2)
                .toList();
    }

    public static List<Integer> limitDemo() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        return numbers
                .stream()
                .limit(3)
                .toList();
    }

    static List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    public static boolean anyMatchDemo() {
        return numbers
                .stream()
                .anyMatch(num -> num == 5);
    }

    public static boolean noneMatchDemo() {
        return numbers
                .stream()
                .noneMatch(num -> num == 5);
    }

    public static boolean allMatchDemo() {
        return numbers
                .stream()
                .allMatch(num -> num > 0);
    }
}