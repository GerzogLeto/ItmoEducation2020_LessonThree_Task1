import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10);
        }
        int max = arr[0];
        int min = arr[0];
        int medium = 0;
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            if(i < min) min = i;

        }
        System.out.println("minimum value: " + min);
        for (int i : arr) {
            if(i > max) max = i;

        }
        System.out.println("maximum value: " + max);
        for (int i : arr) {
            medium += i;

        }
        System.out.println("medium value: " + medium/arr.length);
    }
}
