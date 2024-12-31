package FunctionalProgramming.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {

        int[] values = {12, 19, 2394, 28, 95, 194, 11, 51};

        // display all values larger than 50
        for (int value : values) {
            if (value > 50) {
                System.out.print(value + " ");
            }
        }
        System.out.println();

        int[] alValuesL50 = Arrays.stream(values).filter(value -> value > 50).toArray();
        System.out.println("Values > 50: " + Arrays.toString(alValuesL50));

        // count of values
        System.out.println("Count: " + Arrays.stream(values).count());

        // min value
        System.out.println("Min: " + Arrays.stream(values).min().getAsInt());

        // max value
        System.out.println("Max: " + Arrays.stream(values).max().getAsInt());

        // average value
        System.out.println("Average: " + Arrays.stream(values).average().getAsDouble());

        String[] words = "welcome to the test of JAVA As JAVA is always easy to test".split(" ");
        System.out.println("Words: " + Arrays.toString(words));

        // store first four words
        String[] first4 = new String[4];
        for (int i = 0; i < 4 && i < words.length; i++) {
            first4[i] = words[i];
        }

        System.out.println("First 4 words: " + Arrays.stream(words).limit(4).toList());

        // display first four words [sorted]
        System.out.println("First 4 words [sorted]: " + Arrays.stream(words).limit(4).sorted().toList());

        // display first four sorted words
        System.out.println("First 4 sorted words: " + Arrays.stream(words).sorted().limit(4).toList());

        // display first four sorted words [unique words only]
        System.out.println("First 4 sorted words: " +
                Arrays
                        .stream(words)
                        .sorted()
                        .distinct()
                        .limit(4)
                        .toList()
        );

        // display the count of unique words
        System.out.println("Total unique words: " + Arrays.stream(words).distinct().count());

        // display all words with length >= 3
        System.out.println("Words [length >= 3]: " +
                Arrays.stream(words)
                        .filter(token -> token.length() >= 3)
                        .toList()
        );

        // display all words sorted [ignoring the case and not using the first 4 words]

        // lambda : (o1, o2) -> o1.compareToIgnoreCase(o2)
        System.out.println("Skipping first 4 words [sorted words ignoring case]: " +
                Arrays.stream(words)
                        .skip(4)
                        .sorted(String::compareToIgnoreCase)
                        .toList()
        );

        // get the largest word with length >= 3
        System.out.println("Largest word [with length >= 3]: " +
                Arrays.stream(words)
                        .filter(s -> s.length() >= 3)
                        .max(String::compareTo)
                        .get()
        );

        // get the smallest word [alphabetically smallest]
        System.out.println("Smallest word [alphabetically]: " +
                Arrays.stream(words)
                        .sorted()
                        .min(String::compareToIgnoreCase)
                        .get()
        );

        // check and return the status of whether all names start with a capital alphabet
        System.out.println("Are all words starting with capital: " +
                Arrays.stream(words)
                        .allMatch(s -> Character.isUpperCase(s.charAt(0)))
        );
        // display all words not starting with capital
        System.out.println("All words starting with capital: " +
                Arrays.stream(words)
                        .filter(s -> Character.isUpperCase(s.charAt(0)))
                        .toList()
        );

        // check and return the status where no word begins with JA
        System.out.println("No words starting with 'JA': " +
                Arrays.stream(words)
                        .noneMatch(s -> s.startsWith("JA"))
        );

        // get the first element in the stream
        System.out.println("First element: " + Arrays.stream(words).findFirst().get());

        // display the first element of the stream in lowercase
        // System.out.println("First element: " + Arrays.stream(words).findFirst().get().toLowerCase());
        System.out.println("First element: " + Arrays.stream(words).map(String::toLowerCase).findFirst().get());

        // display all words in lower case
        System.out.println("All [lower case]: " + Arrays.stream(words).map(String::toLowerCase).toList());

        // write a method which takes words as parameters and returns an array consisting of all words in lowercase
        String []lowerCaseWords = toLowerCase(words);

        // display all words with length >= 3 in the format word:word_length
        Arrays.stream(words)
                .filter(s -> s.length() >= 3)
                .forEach( s -> System.out.printf("%s: %d\n", s, s.length()) );
        // values
        int[] NewValues = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};

        System.out.println("Values: " + Arrays.toString(NewValues));

        // adding each value i.e. ans = v1 + v2 ... + vN
        System.out.println("Values [sum]: " + Arrays.stream(NewValues).sum());

        // multiplying each value i.e. ans = v1 * v2 ... * vN
        System.out.println("Values [mul]: " + Arrays.stream(NewValues)
                .reduce(1, (left, right) -> left * right));

        // display as CSV
        System.out.println("Values [CSV]: " +
                Arrays.stream(NewValues)
                        .mapToObj(String::valueOf)
                        .reduce((s1, s2) -> s1 + ", " + s2)
                        .get()
        );


        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        // count number of characters of all names
        System.out.println("Number of characters in all names: " +
                Arrays.stream(names)
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                        .length()
        );

        // all names [into ArrayList]
//        ArrayList<String> al = (ArrayList<String>) Arrays.stream(names)
//                .toList();

        System.out.println("In ArrayList [all names]: " +
                Arrays.stream(names)
                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll)
        );

        // fetch a set of all ames [all names should be in upper case]
        System.out.println("In Set [all names]: " +
                Arrays.stream(names)
                        .map(String::toUpperCase)
                        .collect(Collectors.toSet())
        );

        // all names [into Map]
        System.out.println("In Map [all names]: "
                + Arrays.stream(names)
                .collect(Collectors.toMap(s -> s, String::length))
        );

        // count of all characters in all names
        System.out.println("Number of characters in all names: "
                + Arrays.stream(names)
                .collect(Collectors.summarizingInt(String::length))
        );
        CSTStudent[] students = {
                new CSTStudent("AA1", "AA2", "CST", 45, 89),
                new CSTStudent("BB1", "BB2", "CNT", 25, 79),
                new CSTStudent("CC1", "CC2", "CAST", 55, 55),
                new CSTStudent("DD1", "DD2", "CNT", 35, 49),
                new CSTStudent("EE1", "EE2", "CST", 25, 92),
        };

        // using streams provide the following
        // average grade of students for every program
        Arrays.stream(students)
                .collect(Collectors.groupingBy(CSTStudent::getProgramName, TreeMap::new, Collectors.averagingDouble(CSTStudent::getScore)))
                .forEach((program, aDoubleScore) -> System.out.printf("%-10s %4.2f\n", program, aDoubleScore));
    }

    private static String[] toLowerCase(String[] words) {
        // return (String[]) Arrays.stream(words).map(String::toLowerCase).toArray();
        return Arrays.stream(words).map(String::toLowerCase).toArray(String[]::new);
    }

}
