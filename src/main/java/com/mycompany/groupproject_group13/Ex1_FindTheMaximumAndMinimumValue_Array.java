import java.util.*;
public class Ex1_FindTheMaximumAndMinimumValue_Array {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers do you want?");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter your array: ");
        float number[]= new float[length];
        for(int i=0 ; i < length;i++){
            number[i]= Float.parseFloat(scanner.nextLine());
        }
        float min=number[0];
        float max=number[0];
        for(int i=0;i<length;i++){
            if(min > number[i])
                min = number[i];
        }
        for(int i=0;i<length;i++){
            if(max < number[i])
                max = number[i];
        }
        System.out.println("The maximum value is: "+max);
        System.out.println("The minimum value is: "+min);

    }
}
