/*
Enter 10 words: kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

* Original Order:
kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

* Alphabetical Order:
apple banana cherry grapes kiwi melon orange pineapple strawberry watermelon

* Reversed Alphabetical Order:
watermelon strawberry pineapple orange melon kiwi grapes cherry banana apple

* Upper case array:
APPLE BANANA CHERRY GRAPES KIWI MELON ORANGE PINEAPPLE STRAWBERRY WATERMELON

* Extra Challenge:
Identify words that starts with a vowel (a, e, i, o, u):
Words that starts with a vowel:
apple orange

* Print a final array where all vowels have been changed to 'A'.
Words with changed vowels:
appla banana charra grapas kawa malan aranga panaappla strawbarra watarmalan
 */


import java.util.Scanner;
import java.util.Arrays;

public class DictionaryWorldListing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fruitName;

//<datatype> [] <arrayName> = new <datatype>[<size>];
        String[] fruits = new String[10];
        //Entering the strings and stored in an array
        System.out.println("PLease enter 10 fruit names: ");


        for (int i = 0; i < 10; i++) {
            fruitName = keyboard.nextLine();
            fruits[i] = fruitName;
        }
        System.out.println("Original Oder: " + Arrays.toString(fruits)); //System.out.println(Arrays.toString(arrayName))
        System.out.println("------");

        //Sorting the strings
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {

                if (fruits[i].compareTo(fruits[j]) > 0) {

                    fruitName = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = fruitName;
                }
            }
        }
        //Displaying the strings after sorting them based on alphabetical order
        System.out.println("Alphabetical Order: ");
        for (int i = 0; i <= 10 - 1; i++) {
            System.out.print(fruits[i] + ", ");

        }
        //Displaying the strings after sorting them on reserved alphabetical order
        System.out.println();
        System.out.println("Reversed Alphabetical Order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(fruits[i] + ", ");
        }
        //Displaying the strings to be upper case
        System.out.println();
        System.out.println("UPPER CASE ARRAYS: ");
        for (int i = 0; i < 10; i++) {
            fruits[i] = fruits[i].toUpperCase();
            System.out.print(fruits[i] + ", ");
        }
        //Displaying the words that start with vowels "a, e, o, u i"
        System.out.println();
        System.out.println("Words that start with vowels 'a, e, o ,u, i': ");
        for (int i = 0; i < 10; i++) {
            char vowel = fruits[i].charAt(0);
            char[] currentArray = fruits[i].toCharArray();
            if (vowel == 'A' || vowel == 'E' || vowel == 'O' || vowel == 'U' || vowel == 'I') {
                System.out.println((vowel));
                String word = new String(currentArray);
                System.out.println(word);
            }
        }
        //Displaying all vowels have been changed to 'A'
        System.out.println();
        System.out.println("Words with all vowels have been changed to 'A': ");

        for (int i = 0; i < 10; i++) {
            char vowel = fruits[i].charAt(0);
            char[] currentArray = fruits[i].toCharArray();
            if (vowel == 'A' || vowel == 'E' || vowel == 'O' || vowel == 'U' || vowel == 'I') {
                vowel = 'A';
            }
                System.out.println((vowel));
                String word = new String(currentArray);
                System.out.println(word);


            }
        }
    }

