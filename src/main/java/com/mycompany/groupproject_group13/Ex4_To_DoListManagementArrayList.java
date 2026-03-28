import java.util.*;
public class Ex4_To_DoListManagementArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> program = new ArrayList<>();
        System.out.println("Pick a number from 1->3 (0 for ending the program): ");
        int choice = 4;
        do {
            System.out.println("1. Add a new task. ");
            System.out.println("2. View all tasks.");
            System.out.println("3. Remove a task by its position (index). ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter a task: ");
                    String task1 =scanner.nextLine();
                    program.add(task1);
                    System.out.println("Successful");
                    break;
                case 2:
                    System.out.println(program);
                    break;
                case 3:
                    System.out.print("Choosing a task that you want to remove(choose number): ");
                    int task3=Integer.parseInt(scanner.nextLine());
                    program.remove(task3);
                    break;
                case 0:
                    break;
                default: {
                    System.out.println("Please choose 0–3.");
                }
            }
        }while(choice!=0);
    }
}
