/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungkeramik;

/**
 *
 * @author Chiesa Yuarsa
 */
public class Keramik {
    	//Atribut
    int luasLantai;
    
    //Constuctor
    Keramik (int luas){
        this.luasLantai = luas;
    }
    
    //Methods non void
    double keramikA(){
        double ukurankeramik = 0.3 * 0.3; //satuan diubah ke dalam bentuk meter
        int pcs = 10;  //isi perbox
        int harga = 54000; //harga perbox
        double total = ((this.luasLantai / ukurankeramik) / pcs)* harga;
        return total;
    }

    double keramikB(){
        double ukurankeramik = 0.4 * 0.4;  //satuan diubah ke dalam bentuk meter
        int pcs = 5; //isi perbox
        int harga = 65000; //harga perbox
        double total = ((this.luasLantai / ukurankeramik) / pcs)* harga;
        return total;
    }
    
    double keramikC(){
        double ukurankeramik = 0.3 * 0.4;  //satuan diubah ke dalam bentuk meter
        int pcs = 8; //isi perbox
        int harga = 60000; //harga perbox
        double total = ((this.luasLantai / ukurankeramik) / pcs)* harga;
        return total;
    }
}
