import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] arr = {7,3,1,6,2,5,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to delete: ");
        int inputValue = scanner.nextInt();
        System.out.println("original array: " + Arrays.toString(arr));

        arr = delete(arr,getIndex(arr,inputValue));

        System.out.println("original array: " + Arrays.toString(arr));

    }

    public static int getIndex(int[] arr, int value) {
        int index = -1;
        for (int i=0;i<arr.length;i++)
            if (value==arr[i]) {
                index = i;
                break;
            }
        return index;
    }

    public static int[] delete(int a[], int index) {
        int[] newArr;
        if (a == null || index<0 || index >= a.length)
            return a;
        newArr = new int[a.length - 1];

        for (int i=0,k=0;i<a.length;i++){
            if (i == index)
                continue;
            newArr[k++] = a[i];
        }
        return newArr;
    }

}
