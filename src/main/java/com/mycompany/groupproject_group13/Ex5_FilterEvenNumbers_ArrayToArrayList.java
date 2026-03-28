import java.util.*;
import java.util.Arrays;
public class Ex5_FilterEvenNumbers_ArrayToArrayList {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers for array do you want?");
        int numbers=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your array:");
        int[] arr=new int[numbers];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Array ");
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> even_number= new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                even_number.add(arr[i]);
        }

        System.out.print("ArrayList containing ");
        System.out.println(even_number);
    }
}
