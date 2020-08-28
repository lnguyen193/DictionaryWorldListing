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
            for (int j = i + 1; j < 10 - 1; j++) {

                if (fruits[i].compareTo(fruits[j]) > 0) {

                    fruitName = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = fruitName;
                }
            }
        }
        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Alphabetical Order: ");
        for (int i = 0; i < 10 - 1; i++) {
            System.out.print(fruits[i] + ", ");
                System.out.println("------");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10 - 1; j++) {

                if (fruits[i].compareToIgnoreCase(fruits[j]) > 0) {

                    fruitName = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = fruitName;
                }
            }
        }
        //Displaying the strings after sorting them on reserved alphabetical order
        System.out.print("Reserved Alphabetical Order: ");
        for (int i = 0; i < 10 - 1; i++) {
                System.out.print(fruits[i] + ", ");
                    System.out.println("------");
        }
    }
}