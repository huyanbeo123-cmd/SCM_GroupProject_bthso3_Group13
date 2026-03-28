import java.util.*;
public class Ex4_To_DoListManagementArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> program = new ArrayList<>();
        int choice;
        System.out.println("--- CHUONG TRINH QUAN LY CONG VIEC ---");
        do {
            System.out.println("\nChon mot con so tu 1 den 3 (Bam 0 de thoat):");
            System.out.println("1. Them cong viec moi.");
            System.out.println("2. Xem tat ca cong viec.");
            System.out.println("3. Xoa mot cong viec theo vi tri (index).");
            System.out.print("Lua chon cua ban: ");           
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap noi dung cong viec: ");
                    String task1 = scanner.nextLine();
                    program.add(task1);
                    System.out.println("Da them thanh cong!");
                    break;
                case 2:
                    System.out.println("Danh sach cong viec hien tai:");
                    if (program.isEmpty()) {
                        System.out.println("(Trong)");
                    } else {
                        for (int i = 0; i < program.size(); i++) {
                            System.out.println(i + ". " + program.get(i));
                        }
                    }
                    break;
                case 3:
                    if (program.isEmpty()) {
                        System.out.println("Danh sach dang trong, khong co gi de xoa.");
                    } else {
                        System.out.print("Nhap vi tri (so thu tu) muon xoa: ");
                        int task3 = Integer.parseInt(scanner.nextLine());
                        if (task3 >= 0 && task3 < program.size()) {
                            program.remove(task3);
                            System.out.println("Da xoa xong!");
                        } else {
                            System.out.println("Vi tri khong hop le!");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Dang thoat chuong trinh...");
                    break;
                default:
                    System.out.println("Loi: Vui long chi chon tu 0 den 3.");
            }
        } while (choice != 0);
    }
}