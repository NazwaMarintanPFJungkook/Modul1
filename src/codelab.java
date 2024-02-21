import  java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class codelab {

    public static void main(String[] args) {
        //DATA YANG HARUS DI ISI
        String nama;
        char jenisKelamin;
        String tanggalLahir;


        //OBJEK CLASS SCANNER
        Scanner input = new Scanner(System.in);
        System.out.print("Nama                            :");
        nama = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin (p/l)    :");
        jenisKelamin = input.next().charAt(0);
        input.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd)       :");
        tanggalLahir = input.next();
        LocalDate lahir = LocalDate.parse(tanggalLahir);
        LocalDate hariIni = LocalDate.now();


        Period periode = Period.between(lahir, hariIni);
        int umur = periode.getYears();
        int bulan = periode.getMonths();


        if (jenisKelamin == 'p' || jenisKelamin == 'P'){
            System.out.println("Nama          :"+nama);
            System.out.println("Jenis Kelamin : Perempuan");
            System.out.printf("Umur        :"+ umur +" Tahun"+ bulan +" bulan");
        } else if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            System.out.println("Nama          :"+nama);
            System.out.println("Jenis Kelamin : Laki-laki");
            System.out.printf("Umur      :"+ umur +" Tahun "+ bulan +" bulan");
        }

    }
}


