import java.util.*;

public class Ex1_FindTheMaximumAndMinimumValue_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon nhap bao nhieu so?");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap cac phan tu cua mang: ");
        float number[] = new float[length];
        for (int i = 0; i < length; i++) 
        {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            number[i] = Float.parseFloat(scanner.nextLine());
        }
        float min = number[0];
        float max = number[0];
        for (int i = 0; i < length; i++) 
        {
            if (min > number[i])
                min = number[i];
        }
        for (int i = 0; i < length; i++) 
        {
            if (max < number[i])
                max = number[i];
        }
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("Gia tri nho nhat la: " + min);
    }
}