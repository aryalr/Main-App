import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){

            System.out.println("=== Menu Pilihan ===");
            System.out.println("1. Konversi Angka");
            System.out.println("2. Konversi Kalimat");
            System.out.println("3. Exit");
            System.out.print("Masukan Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Mengkonversi angka kedalam binner");
                    break;
                case 2:
                    System.out.println("Menkonversi kalimat kedalam binner");
                    break;
                case 3:
                    System.out.println("Terimakasih telah menggunakan aplikasi ini");
                    running = false;
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid! (Masukan angka pilihan)");
                    break;
            }

        }

        scanner.close();
        
    }
}
