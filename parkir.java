import java.util.Scanner;

 public class parkir{

    public static void main(String[] args) throws Exception{

        int JamMasuk,jamkeluar,BiayaPerjam = 2000, total;
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Jam Masuk : ");
        JamMasuk = input.nextInt();
        System.out.print("Jam Keluar : ");
        jamkeluar = input.nextInt();

        //frekuensi
        total = (jamkeluar - JamMasuk) * BiayaPerjam;
        System.out.println("total biaya parkir : Rp" + total);
        input.close();
    }
 }