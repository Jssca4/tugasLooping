//Driver class

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Berapa Object yang dibuat? (Max 10)");
        int jumlah = in.nextInt();
        System.out.println("CD atau DVD?");
        String pilihan = in.next(); 


        //kondisi
        if (pilihan.equals("CD")){
            CD c1 = new CD(); 
            System.out.println("DATA CD YAITU : ");
            c1.print ();
             
        }else if (pilihan.equals("DVD")){    
            DVD d1 = new DVD();
            System.out.println("DATA DVD YAITU : ");
            d1.print (); 
        }else {
            System.out.println("Input SALAH.");
        }
      

        //Buat objek berdasarkan pilihan pengguna
        if (pilihan.equalsIgnoreCase("CD")) {
             for (int i = 1; i <= jumlah; i++) {
                System.out.println("Object CD ke-" + i);
                CD cd = new CD(); 
                cd.print(); 
                
            }
        }else if  (pilihan.equalsIgnoreCase("DVD")) {
            for (int i = 1; i <= jumlah; i++) {
                System.out.println("Object DVD ke-" + i);
                DVD dvd = new DVD(); 
                dvd.print();
                
            }
            
        } else {
            System.out.println("Input SALAH.");
        }
        
    }
        
        
    }

    