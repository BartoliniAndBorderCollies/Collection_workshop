package com.klodnicki.collections;

import com.klodnicki.generics.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Collections
        // Array
        // List (interface) -> ArrayList, LinkedList konkretne implementacje
        // Set (interface) -> HashSet, LinkedHashSet, TreeSet(trzyma kolejność dodawania i unikaty, bez duplikatów) konkretne implementacje - gdy nie chcesz duplikatów
        // Map (interface) -> HashMap, LinkedHashMap, TreeMap konkretne implementacje - gdy potrzebujesz pary wartości
        // Queue (interface) -> LinkedList and PriorityQueue implementations -> FIFO (First In First Out), like in the store, put new items at the back, old ones at the front
        // Dequeue (interface) -> LinkedList and ArrayDeque implementations -> A deque (“double-ended queue”) is a type of queue that allows us to access elements from the front and the back of the queue.
        // The Collections utility algorithm static methods like sort(), binarySearch(), max(), min(), and reverse().
        // Collection stream pipelines and aggregate operations with lambdas.

        //--------------------------------------------------------------------------------------------------------------
        //ARRAY

        // 1 sposób
        int[] numbers1 = {1, 2, 4};

        // 2 sposób
        int[] numbers2;
        numbers2 = new int[]{24, 34, 55};

        numbers2[0] = 42;

        // 3 sposób
        int[] numbers3 = new int[3];

        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;

        System.out.println(Arrays.toString(numbers3));

        int[] temp = new int[4];
        for (int i = 0; i < numbers3.length; i++) {
            temp[i] = numbers3[i];
        }
        temp[3] = 4;

        numbers3 = temp;

        System.out.println(Arrays.toString(numbers3));


        //-----------------------------------------------------------------------------------------------------------------------
        //ARRAYLIST
        ArrayList<Integer> numbersArrList = new ArrayList<>();
        numbersArrList.add(1);
        System.out.println(numbersArrList.size());

        // Castowanie
        long smallNumber = 3_000_000_000L;
        int anotherNumber = (int) smallNumber;
        // min int = -2_147_483_646
        // max int = 2_147_483_647

        //----------------------------------------------------------------------------------------------------------------------
        //MAP

        // Map to interfejs, a HashMap, TreeMap, LinkedHashMap to konkretne implementacje
        // I tak samo dla List. List to interfejs, a ArrayList, LinkedList to konkretne implementacje.
        // Set to interfejs, a HashSet, TreeSet to konkretna implementacja

        Map<String, Double> menu = new HashMap<>();  //Map stosuje sie gdy potrzebujesz pary wartości.
        // Set jesli jest taki sam to nie wydrukuje się. Set i List jest bardzo podobny, Set sie preferuje, zeby nie bylo duplikatów.
        menu.put("Mojito", 20.0);
        menu.put(null, 18.0);
        menu.put("baaa", 20.0);
        menu.put("Sex on the Beach", 18.0);

        menu.putIfAbsent(null, 20.0);

        System.out.println(menu.containsKey("baaa"));
        System.out.println(menu.containsValue(100.0));

        System.out.println(menu.remove("Mojito"));
        System.out.println(menu.remove("Tego nie ma"));

        menu.putIfAbsent("Mojito", 10.0);

        System.out.println(menu);

        //----------------------------------------------------------------------------------------------
        // SET

        // Set jesli jest taki sam to nie wydrukuje się. Set i List jest bardzo podobny, Set sie preferuje, zeby nie bylo duplikatów.
        Set<String> imiona = new HashSet<>();
        imiona.add("Bartek");
        imiona.add("Szymon");
        imiona.add("Bartek");
        imiona.add("Marek");

        System.out.println(imiona);
        System.out.println(imiona.size());


//----------------------------------------------------------------------------------------------------------------------
        //STREAM

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(1 + i);
        }

        System.out.println(numbers);
//        for (Integer n : numbers) {
//            System.out.print(n + ", ");
//        }
//        System.out.println();

        // Stream: https://www.youtube.com/watch?v=u0ysjMnk7sM
        // filter
        // map
        // sorted
        // collect
        // forEach

        // Supplier to interfejs funkcyjny
        // 4 podstawowe interfejsy funkcyjne to:
        // Supplier - przyjmuje 0 parametrów, ale coś zwraca
        // Consumer - przyjmuje 1 parametr, ale nic nie zwraca
        // (note) BiConsumer
        // Function - Przyjmuje jakieś parametry i coś zwraca
        // Predicate - przyjmuje parametr, zwraca boolean
        Integer findFour = numbers.stream()
                .filter(x -> {
                    System.out.print(x + ", ");
                    return x == 4;
                })
                .findFirst()
                .get();


        System.out.println();
        System.out.println(findFour);

        int result = findFour + 4;
        System.out.println(result);


        //        List<Integer> newNumbersFromStream = Stream.generate(() -> 1).limit(10).toList();
        List<Integer> newNumbersFromStream = IntStream.rangeClosed(1, 10).boxed().toList();

        System.out.println(newNumbersFromStream);
        //1+3+2+1+3+2+2+3+2+1+1=
        List<String> names = Arrays.asList("Dorota", "Bartek", "Szymon", "Aga", "Bartek", "Lala", "Lala", "Bartek",
                "Szymon", "Weronika", "Zbigniew", "Agnieszka");

        Optional<String> bartek = names.stream()
                .filter(n -> n.equals("Bartek"))
                .findAny();

        String foundBartek = bartek.orElseThrow(() -> new RuntimeException("Bartek was not found."));
        System.out.println(foundBartek);

        // ----------------------------------------------------------------------------------------------------
        // EXERCISES

        // Wypisz listę wszystkich imion razem z liczbą ich powtórzeń:
        // printNamesWithoutStream()
        printNamesWithoutStreamForEach(names);
        printNamesWithoutStreamForLoop(names);

        // printNamesUsingStream()
        printNamesWithStream(names);

        //wydrukuj najdłuższe imię z ArrayList używając Stream

        printTheLongestName(names);

        groupElementsToMapWhereKeyIsAStringLengthAndValuesAreNamesWithSuchLength(names);

        sortStringsByLengthAndFilterShorterThanTwoAndPrintItOnScreen();

        printAmountOfStringsWhichStartWithBLetter();

        changeStringsToUppercaseAndPrintThem();

        removeDuplicatesFromStringList();

        convertToSetToRemoveDuplicates();

        countAverageForIntegerList();

        countSumOfEvenNumbersAndSumOfOddNumbers();

        findMaximumAndMinimumValueInList();

        findSecondLargestAndSecondLowestNumberInList();

        joinThreeListsIntoOneUsingStream();

        Test<Integer, Double> number = new Test<>();
    }

    private static void printNamesWithoutStreamForEach(List<String> names) {
        HashMap<String, Integer> namesCount = new HashMap<>();

        int count = 0;

        for (String name : names) {
            for (String name2 : names) {
                if (name.equals(name2)) {
                    count++;
                    namesCount.put(name, count);
                }
            }
            count = 0;
        }
        System.out.println(namesCount);
    }

    private static void printNamesWithoutStreamForLoop(List<String> names) {
        HashMap<String, Integer> namesCount = new HashMap<>();

        String name;
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            name = names.get(i);
            for (int j = 0; j < names.size(); j++) {
                if (name.equals(names.get(j))) {
                    count++;
                    namesCount.put(name, count);
                }
            }
            count = 0;
        }
        System.out.println(namesCount);
    }

    private static void printNamesWithStream(List<String> names) {

        Map<String, Integer> namesCount = names.stream()
                .collect(Collectors.toMap(name -> name, name -> 1, Integer::sum));

        System.out.println("To jest zrobione przez Stream" + namesCount);
    }

    private static void printTheLongestName(List<String> names) {

        String longestName = names.stream()
                .max(Comparator.comparing(String::length))
                .orElse("there is no name in stream"); //I put this instead of get() cause no value can exist
        System.out.println(longestName);
    }

    private static void groupElementsToMapWhereKeyIsAStringLengthAndValuesAreNamesWithSuchLength(List<String> names) {

        Map<Integer, List<String>> groupedNames = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedNames);
        System.out.println("---------------------------------------------------------------------------------");
    }

    private static void sortStringsByLengthAndFilterShorterThanTwoAndPrintItOnScreen() {

        List<String> names = Arrays.asList("Dorota", "Bartek", "Szymon", "Aga", "Bartek", "Lala", "Lala", "Bartek",
                "Szymon", "Weronika", "Zbigniew", "Agnieszka", "Ok", "Ka");

        List<String> sortNames = names.stream()
                .sorted()
                .filter(s -> s.length() <= 2) // filter out strings shorter than two
                .toList(); // collect the filtered strings into a list

//        names.stream().sorted().filter(s->s.length() <2).forEach(System.out::println); lub od razu drukowanie

        sortNames.forEach(System.out::println); // print each string on the screen
    }


    public static void printAmountOfStringsWhichStartWithBLetter() {
        List<String> names = Arrays.asList("Dorota", "Bartek", "Szymon", "Aga", "Bartek", "Lala", "Lala", "Bartek",
                "Szymon", "Weronika", "Zbigniew", "Agnieszka", "Ok", "Ka", "Bogdan", "Bogusia");

        Long namesStartWithB = names.stream().
                filter(s -> s.startsWith("B")).
                count();


        System.out.println(namesStartWithB);
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public static void changeStringsToUppercaseAndPrintThem() {
        List<String> names = Arrays.asList("Dorota", "Bartek", "Szymon", "Aga", "Bartek", "Lala", "Lala", "Bartek",
                "Szymon", "Weronika", "Zbigniew", "Agnieszka", "Ok", "Ka", "Bogdan", "Bogusia");

        List<String> namesUppercase = names.stream().
                map(String::toUpperCase)
                .toList();

        namesUppercase.forEach(System.out::println);
        System.out.println(namesUppercase);

        //lub drukowanie od razu

        names.stream().map(String::toUpperCase).forEach(System.out::println);

        //lub
        System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println("------------------------------------------------------------------------------");
    }

    public static void removeDuplicatesFromStringList() {
        List<String> names = Arrays.asList("Dorota", "Bartek", "Szymon", "Aga", "Bartek", "Lala", "Lala", "Bartek",
                "Szymon", "Weronika", "Zbigniew", "Agnieszka", "Ok", "Ka", "Bogdan", "Bogusia");

        names.stream().distinct().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void convertToSetToRemoveDuplicates() {
        List<String> names = Arrays.asList("Dorota", "Bartek", "Szymon", "Aga", "Bartek", "Lala", "Lala", "Bartek",
                "Szymon", "Weronika", "Zbigniew", "Agnieszka", "Ok", "Ka", "Bogdan", "Bogusia");

        Set<String> namesWithoutDuplicates = new HashSet<>(names);

        List<String> namesListOfStrings = new ArrayList<>(namesWithoutDuplicates);

        System.out.println(namesListOfStrings);
        System.out.println("----------------------------------------------------------------------------");
    }

    public static void countAverageForIntegerList() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 14, 20, 34, 56, 98);

        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("Average: " + average);
    }

    public static void countSumOfEvenNumbersAndSumOfOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 14, 20, 34, 56, 98, 100, 123, 211, 325);

        double sumOfEvenNumbers = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        double sumOfOddNumbers = numbers.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public static void findMaximumAndMinimumValueInList() {
        List<Integer> numbers = Arrays.asList(1, 2,  3, 5, 14, 20, 34, 56, 98, 100, 123, 211, 325);

        int minValueInList = numbers.stream().mapToInt(Integer::intValue).min().orElse(0);
        int maxValueInList = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);

        System.out.println("Min value in a list: " + minValueInList);
        System.out.println("Max value in a list: " + maxValueInList);
    }

    public static void findSecondLargestAndSecondLowestNumberInList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 14, 20, 34, 56, 98, 100, 123, 211, 325);

        int secondLowestValueInList = numbers.stream().sorted().skip(1).findFirst().orElse(0);
        int secondHighestValueInList = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

        System.out.println("Second lowest value in list: " + secondLowestValueInList);
        System.out.println("Second highest value in list: " + secondHighestValueInList);
    }

    public static void joinThreeListsIntoOneUsingStream() {
        List<String> names = Arrays.asList("Dorota", "Bartek", "Szymon", "Aga", "Bartek", "Lala", "Lala", "Bartek",
                "Szymon", "Weronika", "Zbigniew", "Agnieszka", "Ok", "Ka", "Bogdan", "Bogusia");
        List<String> cars = Arrays.asList("Volvo", "Bmw", "Fiat");
        List<String> dogs = Arrays.asList("Border collie", "German Shepherd");

        List<String> joinedList = Stream.of(names.stream(), cars.stream(), dogs.stream())
                .flatMap(Function.identity())
                .toList();

        System.out.println("Joined list: " + joinedList);
    }


}


