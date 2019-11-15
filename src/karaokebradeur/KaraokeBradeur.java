/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karaokebradeur;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LABKOM01-RPL07
 */
public class KaraokeBradeur {

    /**
     * @param args the command line arguments
     */
    public 
            static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double disk1 = 11.11/100*55000;
        double disk2 = 11.11/100*70000;
        double disk3 = 11.11/100*120000;
        double disk4 = 11.11/100*150000;
        
        System.out.println("Karaoke Syariah Haiyuuu");
        System.out.println("1. Room Small Hanya Rp55.000/jam");
        System.out.println("2. Room Medium Hanya Rp70.000/jam");
        System.out.println("3. Room Large Hanya Rp120.000/jam");
        System.out.println("4. Family Room Hanya Rp150.000/jam");
        System.out.println("ADA INFO EVENT 11.11 NIH, ADA DISKON 11.11% BUAT QM YANG BOOKING 3 JAM ATAU LEBIH MWEHEHE");
        System.out.println("Haiyu atu Booking (y/t):");
        String pil = sc.nextLine();
        if(pil.equals("y")||pil.equals("Y"))
        {
            System.out.println("Asyiquee!!");
            System.out.println("Mau Pilih Room Nomor Berapa Coba :");
            Integer room = sc.nextInt();
            if(room==1)
            {
                System.out.println("Kamu Pilih Room Small dengan Harga Rp55.000/jam");
                System.out.println("Kamu Mau Booking Berapa lama bradeur :");
                Integer lama = sc.nextInt();
                if(lama<3)
                {
                    System.out.println("Oke qm Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Sapa Nama qm :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("Ahayy qm udah booking nich");  
                    System.out.println("Nich Infonya Bradeur :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Small");
                    System.out.println("3. Lama Booking : "+lama);
                    System.out.println("4. Total : Rp."+55000*lama);
                }
                if(lama>=3)
                {
                    System.out.println("Oke qm Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Sapa Nama qm :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    if(nama.isEmpty()){}
                    else{
                    System.out.println("==============================");
                    System.out.println("Ahayy qm udah booking nich");  
                    System.out.println("CIEEE DAPET DISKON 11.11%");  
                    System.out.println("Nich Infonya Bradeur :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Small");
                    System.out.println("3. Lama Booking : "+lama);
                    Integer total1 = 55000*lama;
                    double dsj = total1-disk1;
                    System.out.println("4. Total : Rp."+dsj);    
                    JOptionPane.showConfirmDialog(null, "dsfjhkf");}               
                }
                
            }
            if(room==2)
            {
                System.out.println("Kamu Pilih Room Medium dengan Harga Rp70.000/jam");
                System.out.println("Kamu Mau Booking Berapa lama bradeur :");
                Integer lama = sc.nextInt();
                if(lama<3)
                {
                    System.out.println("Oke qm Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Sapa Nama qm :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("Ahayy qm udah booking nich");  
                    System.out.println("Nich Infonya Bradeur :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Medium");
                    System.out.println("3. Lama Booking : "+lama);
                    System.out.println("4. Total : Rp."+70000*lama);
                }
                if(lama>=3)
                {
                    System.out.println("Oke qm Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Sapa Nama qm :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("Ahayy qm udah booking nich");  
                    System.out.println("CIEEE DAPET DISKON 11.11%");  
                    System.out.println("Nich Infonya Bradeur :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Medium");
                    System.out.println("3. Lama Booking : "+lama);
                    Integer total1 = 70000*lama;
                    double dsj = total1-disk2;
                    System.out.println("4. Total : Rp."+dsj);
                }
                
            }
            if(room==3)
            {
                System.out.println("Kamu Pilih Room Large dengan Harga Rp120.000/jam");
                System.out.println("Kamu Mau Booking Berapa lama bradeur :");
                Integer lama = sc.nextInt();
                if(lama<3)
                {
                    System.out.println("Oke qm Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Sapa Nama qm :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("Ahayy qm udah booking nich");  
                    System.out.println("Nich Infonya Bradeur :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Large");
                    System.out.println("3. Lama Booking : "+lama);
                    System.out.println("4. Total : Rp."+120000*lama);
                }
                if(lama>=3)
                {
                    System.out.println("Oke qm Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Sapa Nama qm :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("Ahayy qm udah booking nich");  
                    System.out.println("CIEEE DAPET DISKON 11.11%");  
                    System.out.println("Nich Infonya Bradeur :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Large");
                    System.out.println("3. Lama Booking : "+lama);
                    Integer total1 = 120000*lama;
                    double dsj = total1-disk3;
                    System.out.println("4. Total : Rp."+dsj);
                }
                
            }
            if(room==4)
            {
                System.out.println("Kamu Pilih Family Room  dengan Harga Rp150.000/jam");
                System.out.println("Kamu Mau Booking Berapa lama bradeur :");
                Integer lama = sc.nextInt();
                if(lama<3)
                {
                    System.out.println("Oke qm Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Sapa Nama qm :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("Ahayy qm udah booking nich");  
                    System.out.println("Nich Infonya Bradeur :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Family Room");
                    System.out.println("3. Lama Booking : "+lama);
                    System.out.println("4. Total : Rp."+150000*lama);
                }
                if(lama>=3)
                {
                    System.out.println("Oke qm Udah Pesen "+lama+ " jam");
                    System.out.println("Aku Lupa Tanya Sapa Nama qm :(");
                    System.out.println("Nama Kamu :");
                    String nama = sc.next();
                    System.out.println("==============================");
                    System.out.println("Ahayy qm udah booking nich");  
                    System.out.println("CIEEE DAPET DISKON 11.11%");  
                    System.out.println("Nich Infonya Bradeur :");
                    System.out.println("1. Nama Kamu : "+nama);
                    System.out.println("2. Nama Room : Family Room");
                    System.out.println("3. Lama Booking : "+lama);
                    Integer total1 =150000*lama;
                    double dsj = total1-disk4;
                    System.out.println("4. Total : Rp."+dsj);
                }
                
            }
            
        }
        else if(pil.equals("t")||pil.equals("T"))
        {
            System.err.println("Yahh QM Gak Asyique :(");
        }
        else
        {
            System.err.println("Pilihannya juga Cuman Ada Y sama T ai kamu :(");
        }
        
    }
    
}
