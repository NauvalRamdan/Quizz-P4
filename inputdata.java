import java.util.ArrayList;
import java.util.Scanner;

public class inputdata {
    public static void main(String[] args) {
        ArrayList<pesanan> p = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;
        
        String nama,alamat,tlp,email,ket;
        
        System.out.println("--- Car Cleaning.. Anda Pesan Kami Datang ----");
        System.out.println("=============================================");
        System.out.println();                    
        System.out.println("-------------------oOo--------------------");
        System.out.println("*Masukan Data Pemesan*");
        System.out.print("Masukkan Nama   ");
        nama = sc.nextLine();
        System.out.print("Masukkan Alamat   ");
        alamat = sc.nextLine();
        System.out.print("Masukkan No. Tlp   ");
        tlp = sc.nextLine();
        System.out.print("Masukkan Email   ");
        email = sc.nextLine();
        
        do{
            System.out.println();
            System.out.println("*Jenis Jasa*");
            System.out.println("1. Cuci Mobil");
            System.out.println("2. Salon Mobil Interior");
            System.out.println("3. Salon Mobil Eksterior");
            System.out.println();
            System.out.print("Pilih Jasa: ");
            pilihan = sc.nextInt();
        
            if(pilihan == 2){
                p = interior( p );
                break;
            }
        }while (pilihan != 1);
    }
        
        private static ArrayList<pesanan> interior( ArrayList<pesanan> p ){ 
        Scanner sc = new Scanner(System.in);
        Scanner ab = new Scanner(System.in);
        String ket;
        Integer pilihan = 0;
        int total,penyedia,jasa,bahan,transportasi;
        
        System.out.println();
        System.out.println("*Team Penyedia Jasa *");
        System.out.println("1. Team Sea [2 Orang]");
        System.out.println("2. Team Mountain [4 Orang]");
        System.out.println("3. Team Forest [5 Orang]");
        System.out.println();
        System.out.print("Pilih Team: ");
        pilihan = sc.nextInt();
        System.out.println();
        
        System.out.println("Berikan Keterangan Pemesan:");
        ket = ab.nextLine();System.out.println();
        
        
        System.out.print("Masukkan Biaya Penyedia Jasa  Rp.");
        penyedia = sc.nextInt();
        
        System.out.print("Masukkan Biaya Jasa Alat  Rp.");
        jasa = sc.nextInt();
        System.out.print("Masukkan Biaya Bahan Jasa  Rp.");
        bahan = sc.nextInt();
        System.out.print("Masukkan Biaya Transportasi  Rp.");
        transportasi = sc.nextInt();
        
        total=penyedia+jasa+bahan+transportasi;
        
        System.out.println("-------------------oOo--------------------");
        System.out.println("=============================================");
        
        
        System.out.println("Jasa yang di Pesan          Salon Mobil Interior     ");
        System.out.println("Nama Penyendia              Team Mountain            ");
        System.out.println("Keterangan                  "+ket+"                  ");
        System.out.println();
        System.out.println("Total Biaya yang di Bayar Pemesan Rp."+total+"");
        System.out.println();
        System.out.println("Salam Bersih Andre Terimakasih");
        return p;
        }
    }



    
