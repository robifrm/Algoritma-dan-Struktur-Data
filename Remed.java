import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String namaMahasiswa;
    String mataKuliah;
    int SKS;
    int nilai;

    public Mahasiswa(String namaMahasiswa, String mataKuliah, int SKS, int nilai){
        this.namaMahasiswa = namaMahasiswa;
        this.mataKuliah = mataKuliah;
        this.SKS = SKS;
        this.nilai = nilai;
    }
}
public class Remed {
    public static void main (String[] args) {
        Scanner inputan = new Scanner(System.in);
        ArrayList<Mahasiswa> input = new ArrayList<>();
        input.add(new Mahasiswa("Dipsi", "Logika", 3, 100));
        input.add(new Mahasiswa("Lala", "Algoritma", 3, 90));
        input.add(new Mahasiswa("Pou", "Kalkulus", 2, 70));
        input.add(new Mahasiswa("Tingky", "Organisasi", 1, 100));
        input.add(new Mahasiswa("Justin", "Statistika", 3, 80));

        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Selesai");
        System.out.println();

        int pilihan;
        do{
            System.out.print("Menu : ");
            pilihan = inputan.nextInt();
            inputan.nextLine();

            switch (pilihan){
                case 1:
                System.out.println("Daftar Mahasiswa");
                  System.out.println("===============================================");
                  System.out.println("No\tNama\tMata Kuliah\tSKS\tNilai");
                  System.out.println("===============================================");
                  int jumlahSKS = 0;
                  int jumlahNilai = 0;

                  for (int i = 0; i<input.size(); i++){
                    Mahasiswa mhs = input.get(i);
                    System.out.println((i + 1) + "\t" + mhs.namaMahasiswa + "\t" + mhs.mataKuliah + "\t" + mhs.SKS +  "\t" + mhs.nilai);
                    jumlahSKS += mhs.SKS;
                    jumlahNilai += mhs.nilai;
                  }

                  System.out.println("===============================================");
                  System.out.println("Jumlah SKS" + "\t" + "\t" + "\t" + jumlahSKS);
                  System.out.println("Jumlah Nilai" + "\t" + "\t" + "\t" + "\t" + jumlahNilai);
                  break;

                case 2:

                  System.out.println("Masukkan Nama");
                  String namaMahasiswa = inputan.nextLine();

                  System.out.println("Mata Kuliah");
                  String mataKuliah = inputan.nextLine();

                  System.out.println("SKS");
                  int SKS = inputan.nextInt();

                  System.out.println("Nilai ");
                  int nilai = inputan.nextInt();

                  input.add(new Mahasiswa(namaMahasiswa, mataKuliah, SKS, nilai));
                  System.out.println("Succeed");
                  break;

                case 3:
                  break;

                default:
                  System.out.println("Pilihan tidak valid");
                  break;

            }
        } while (pilihan != 3);


        inputan.close();
    }
}