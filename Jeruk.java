import java.util.Scanner;

public class Jeruk {
    
    public static void main (String []args) throws Exception{

        int pembeli,uangpelanggan,total,kembalian,jeruk = 15000;
        Scanner input = new Scanner (System.in);

        //input
        System.out.print("Membeli (kg): ");
        pembeli = input.nextInt();
        System.out.print("Uang Pelanggan Rp :");
        uangpelanggan = input.nextInt();

        //frekuensi
        total = (pembeli * jeruk);
        kembalian = (uangpelanggan - total);
        System.out.println("Kembalian : Rp" + kembalian);
        input.close();


    }
}
