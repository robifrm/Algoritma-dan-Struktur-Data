import java.util.Scanner;

public class Nilai {
    
    public static void main(String[] args) throws Exception{
        
        //menghitung ganjil genap
        Double nilai;
        String indeksiNilai;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        nilai = input.nextDouble();

       if (nilai >= 75){
            indeksiNilai = "A";
       } else if (nilai >= 65){
        indeksiNilai ="B";
       } else if (nilai >= 55){
        indeksiNilai = "C";
       } else {
        indeksiNilai = "D";
       }

       System.out.println("Indeks nilai : " + indeksiNilai);
       input.close();
    }
}
