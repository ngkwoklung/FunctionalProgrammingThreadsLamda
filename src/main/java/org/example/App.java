package org.example;

//How we want to solve the probem - loop, if statements
//Say what we want
public class App 
{
    public static void main( String[] args )
    {
//        //Data - manipulate
//        //Stream
//        //Data should be immutable
//        //Pure Function
//        //Filter
//        //Map
//        ArrayList<String> beatles = new ArrayList<>(Arrays.asList(
//                "John",
//                "Paul",
//                "George",
//                "Ringo"
//        ));
//
//        beatles.stream() //creates stream
//                .filter(name -> name.contains("o")) //intermediate operations (give back stream)
//                .map(String::toUpperCase)
//                .forEach(System.out::println); //terminal operation
////                .toList()

        //String - take every letter in the alphabet
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(containsAllAlphbet(sentence));
    }

    private static boolean containsAllAlphbet(String word) {
        //fluent api - using human readable words
        return word
                .toLowerCase()
                .chars()
                .filter(letter -> letter >= 'a' && letter <='z')
                .distinct()
                .sorted()
                .peek(System.out::println)
                .count() ==26;
    }
}
