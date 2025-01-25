package logic;

public class logikaKonversi {
    //fungsi untuk konversi bilangan
    public String convertToBinary(int number){
        return Integer.toBinaryString(number);
    }

    public String convertCharToBinary(char kalimat){
        return String.format("%8s", Integer.toBinaryString(kalimat)).replace(' ', '0');
    }

}
