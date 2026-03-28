import java.util.*;
public class Ex3_CountOccurrencesArray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers do you want?");
        int length=Integer.parseInt(scanner.nextLine());
        System.out.println("Input your arrays: ");
        float numbers[]=new float[length];
        for(int i=0;i<length;i++){
            numbers[i]=Float.parseFloat(scanner.nextLine());
        }
        System.out.println("Which numbers do you want to find?");
        float x = Float.parseFloat(scanner.nextLine());
        int count=0;
        for(int i=0 ; i<length;i++){
            if(x == numbers[i])
                count++;
        }
        System.out.println("The number " + x + " appears " + count +  " times.");

    }
}
