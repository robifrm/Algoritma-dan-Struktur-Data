import java.util.Scanner;

public class Ganjilgenap {
    
    public static void main(String[] args) throws Exception{

        //menghitung bilangan ganjil atau genap
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka = input.nextInt();

        if (angka % 2 == 0){
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
            input.close();
        }
    }
}
