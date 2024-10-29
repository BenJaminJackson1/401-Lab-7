/*
 * Created on 2024-10-16 
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */
public class BinarySearch {

    public static int searchForCat(Cat[] array, int key) {
        int left = 0;
        int right = array.length - 1;
    
        while (left <= right) {
            int mid = (right + left) / 2; 
    
            if (array[mid].getAge() == key) {
                System.out.println(array[mid].getName());
                return mid; // Found the key
            } else if (key < array[mid].getAge()) {
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
    
        System.out.println("BinarySearch: Did not find the key " + key);
        return -1; // Key not found
    }
}