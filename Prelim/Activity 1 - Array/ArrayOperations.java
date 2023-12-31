import java.util.*;


class ArrayOperations {
    int[] array;
    Scanner input = new Scanner(System.in);

    public ArrayOperations(int MAXSIZE) {
        array = new int[MAXSIZE];
    }

    public void populate(int[] myArray) {
        System.out.print("Please enter " + myArray.length + " Integers: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }
    }

    public void print(int[] myArray) {
        System.out.println("Array Contents");
        for (int j : myArray) {
            System.out.print(" " + j);
        }
    }

    public int getMin(int[] myArray) {
        int min = myArray[0];
        for (int j : myArray) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public int getMax(int[] myArray) {
        int max = myArray[0];
        for (int j : myArray) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public int[] insertBeginning(int element, int[] myArray) {
        int[] newArray = new int[myArray.length + 1];
        newArray[0] = element;
        System.arraycopy(myArray, 0, newArray, 1, myArray.length);
        return newArray;
    }

    public int[] insertMiddle(int element, int position, int[] myArray) {
        if (position < 0 || position > myArray.length) {
            System.out.println("Invalid position for insertion.");
            return myArray;
        }

        int[] newArray = new int[myArray.length + 1];
        System.arraycopy(myArray, 0, newArray, 0, position);
        newArray[position] = element;
        System.arraycopy(myArray, position, newArray, position + 1, myArray.length - position);
        return newArray;
    }

    public int[] insertEnd(int element, int[] myArray) {
        int[] newArray = Arrays.copyOf(myArray, myArray.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public int[] removeItem(int element, int[] myArray) {
        int indexToRemove = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == element) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            int[] newArray = new int[myArray.length - 1];
            for (int i = 0, j = 0; i < myArray.length; i++) {
                if (i != indexToRemove) {
                    newArray[j] = myArray[i];
                    j++;
                }
            }
            return newArray;
        } else {
            System.out.println("Element not found in the array.");
            return myArray;
        }
    }

    public int search(int element, int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int[] sort(int[] myArray) {
        Arrays.sort(myArray);
        return myArray;
    }
}//End of Class