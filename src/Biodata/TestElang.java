/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;

/**
 *
 * @author Taka
 */
public class TestElang {
    public static void main(String[] args) {
        elang data = new elang();
        data.setNamaAyah("Bapakku");
        data.setNamaIbu("Ibuku");
        data.setNamaku("Elang");
        data.setNamaSaudara("Excel");
        data.setAlamat("Jl. Danau Ranau G7A/13");
        data.setHobi("Bermain Dota2");
        data.setCitacia("Game Developer");
        data.setUmur(17);
        
        System.out.println("Dibawah Ini Adalah Data Biodata Anda");
        System.out.println();
        System.out.println(" Nama Ayah : "+data.getNamaAyah()+ "\n Nama Ibu : "+data.getNamaIbu()+ "\n Nama Saya : "+data.getNamaku()+ 
                            "\n Nama Saudara : "+data.getNamaSaudara()+ "\n Alamat : "+data.getAlamat()+ "\n Hobi : "+data.getHobi()+ 
                            "\n Cita Cita : "+data.getCitacita()+ "\n Umur : "+data.getUmur());
    }
}
