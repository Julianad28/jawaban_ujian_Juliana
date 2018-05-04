/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class TUGAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int barang,total = 0,jumlah_pembelian = 0,harga= 0,status;
        String nama,kode_barang = null,sttus_anggota,status_anggota=null;
        
        Scanner inputan= new Scanner(System.in);
        
        System.out.println("1. Aqua 1.5L");
        System.out.println("2. Susu Dancow");
        System.out.println("3. Indomie");
        System.out.println("4. Telor");
        System.out.println("5. Oatmeal");
        
        System.out.println("Kode Barang [1/2/3/4] : ");
        barang=inputan.nextInt();        
      
        System.out.println("Jumlah Pembelian: ");
       jumlah_pembelian=inputan.nextInt();
       
       inputan.nextLine();
       
       System.out.println("Status [Member /[Non Member ] : ");
       status_anggota=inputan.nextLine();
       
      
        
        switch(barang){
            case 1:
                kode_barang="Aqua 1.5L" ;
        harga = 5000;
                break;
            case 2: 
                kode_barang="Susu Dancow";
                harga=32000;
                break;
            case 3:
                kode_barang="Indomie";
                harga=2200;
                break;
            case 4:
                kode_barang="Telor";
                harga=29000;
                break;
            case 5:
                kode_barang="Oatmeal";
                harga=8000;
                break;
            default:
                
           }  
        
       
        
        switch(status_anggota){
            case "Member" :
         sttus_anggota = "dapat diskon";
         total=harga*jumlah_pembelian*30/100;
                break;
            case "Non Member":
                sttus_anggota="tidak dapat diskon";
                total=harga*jumlah_pembelian;
                break;
            
                        
                
                
                
        
    }

      
        
            System.out.println("Terimakasih telah melakukan transaksi dengan rincian sebagai berikut");
            System.out.println("Nama Barang : "+kode_barang);
            System.out.println("Status : "+status_anggota);
            System.out.println("Harga : "+harga);
            System.out.println("Total yang harus dibayar : Rp" +total);
            System.out.println("Semoga pelayanan kami memuaskan");
             
  
                
        
           
            
        
                
        
        
        
            
     
    }}
                    
                    
                      
                   
                    
             
            
    
    
