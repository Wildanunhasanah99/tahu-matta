package m3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        inputData data = new inputData();
        Scanner input = new Scanner(System.in);
        int pilih; 
        char ulang;
        do {
            System.out.println("Menu");
            System.out.println("1. Masukkan Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Exit Program");
            System.out.print("pilih opsi : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    do {
                       data.Data();
                        System.out.println("Input lagi? y(Ulangi) / t(tidak) ");
                        ulang = input.next().charAt(0);
                    } while (ulang == 'y' || ulang == 'Y');
                    break;
                case 2:
                    data.printDataMahasiswa();
                    break;
            }
        } while (pilih == 1 || pilih == 2);
    }
}

//}

