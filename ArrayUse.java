import java.util.Scanner;
public class ArrayUse {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter element in Array");
        n= scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values:");

        for(int i=0;i < n; i++)
        {
            arr[i]= scn.nextInt();
        }
        System.out.println("Values are:");
        for(int i=0;i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
