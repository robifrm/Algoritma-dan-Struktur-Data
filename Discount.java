import java.util.Scanner;

public class Discount {

    public static void main(String[] args) throws Exception{
        Double totalBelanja, discount;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan total belanja : ");
        totalBelanja = input.nextDouble();

        if(totalBelanja >= 1000000){
            discount = totalBelanja * 5/100;
            totalBelanja = totalBelanja - discount;

        }

        System.out.println("Total yang harus dibayar : " + totalBelanja);
        input.close();
    }
    
}
