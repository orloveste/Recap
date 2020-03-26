package Udemy.tutorials.basic;

// Data Structures intro: Arrays
public class _13_Arrays {
    public static void main(String[] args) {
        int x;
        int [] myArray;
//        myArray = new int[4];
        myArray = new int[] {1,2,3,4,56,6};
        _09_Person[] people;
        /*x=5;
        myArray[0] = x;
        myArray[1] = 3;
        myArray[2] = 0;
        myArray[3] = 1;*/
//        System.out.println(myArray[2]);
        /*for (int counter = 0; counter <10; counter++){
            myArray[counter] = counter;
        }*/

        /*for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }*/
        for (int number : myArray){
            System.out.println(number);
        }
    }
}
