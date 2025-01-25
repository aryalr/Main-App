import java.util.Scanner;
import logic.logikaKonversi;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        logikaKonversi konversi = new logikaKonversi();

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
                    System.out.print("Masukan angka: ");
                    int bilangan = scanner.nextInt();
                    scanner.nextLine();
                    String hasilKonversi = konversi.convertToBinary(bilangan);
                    System.out.println("Hasil Konversi: " + hasilKonversi);
                    break;
                case 2:
                    System.out.println("Masukan kalimat: ");
                    String kata = scanner.nextLine();
                    for (char c : kata.toCharArray()){
                        System.out.println(konversi.convertCharToBinary(c) + " ");
                    }
                    System.out.println();
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
