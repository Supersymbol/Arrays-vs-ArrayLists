import java.util.ArrayList;

public class ArrayVSArrayLists {
    public static void main(String[] args) {
        // Example 1: Arrays vs ArrayLists
        
        // Arrays (static size, must specify type)
        int[] array = new int[5]; // Creating an array of integers with size 5
                // Arrays have fixed size (cannot change once initialized)
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        //int[] intArray = {1, 2, 3, 4, 5};

        // ArrayLists (dynamic size, can hold objects of any type)
        ArrayList<Integer> arrayList = new ArrayList<>(); // Creating an ArrayList of integers
                // ArrayLists can grow or shrink dynamically
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        
        // Accessing Elements
        
        // Accessing Elements In Array
        System.out.println("Elements in array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // Accessing Elements In ArrayList
        System.out.println("Elements in Array List:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        
        // Adding Elements
        
        // Adding an element to array (not straightforward)
        //array[5] = 6; // This will cause an ArrayIndexOutOfBoundsException
        
        // Adding an element to ArrayList (simple)
        arrayList.add(6);
        
        System.out.println("Updated elements in Array List:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();        
    }
}
