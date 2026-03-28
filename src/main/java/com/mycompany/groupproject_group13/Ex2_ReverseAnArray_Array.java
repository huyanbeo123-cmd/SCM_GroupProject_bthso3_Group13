import java.util.*;

public class Ex2_ReverseAnArray_Array {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers do you want?");
        int length= Integer.parseInt(scanner.nextLine());
        float numbers[]= new float[length];
        System.out.println("Input your array: ");
        for(int i=length-1;i>=0;i--){
            numbers[i]=Float.parseFloat(scanner.nextLine());
        }
        System.out.print("[");
        for(int i=0;i<length;i++){
            System.out.print(numbers[i]);
            if(i!=length-1)
                System.out.print(", ");
        }
        System.out.print("]");

    }
}
