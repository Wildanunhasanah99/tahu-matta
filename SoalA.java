package m3;
import java.util.Scanner;

public class SoalA {

   static String nama; //static variable
    
    static void setNama(String nama){ //cons dg parameter 
        SoalA.nama = nama; 
    }
    
    static String getNama(){
        return nama;
    }
    
    void display(){
        System.out.println("nama universitas yang di input adalah : " + getNama());
    }
    
    public static void main(String[] args) {
        String kata;
        Scanner userIn = new Scanner(System.in);
        SoalA obj = new SoalA();
        
        System.out.print("Masukkan nama Universitas : ");
        kata = userIn.nextLine();
        SoalA.nama = kata;
        obj.display();
    }
}