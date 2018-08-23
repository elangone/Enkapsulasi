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
public class elang {

    public elang() {
    }
    
    
    private String namaAyah, namaIbu, namaSendiri, namaSaudara, alamat, hobi, citacita;
    private int umur;
    
    public String getNamaAyah(){
        return namaAyah;
    } 
    
    public String getNamaIbu(){
        return namaIbu;
    }
    
    public String getNamaku(){
        return namaSendiri;
    }
    
    public String getNamaSaudara(){
        return namaSaudara;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getHobi(){
        return hobi;
    }
    
    public String getCitacita(){
        return citacita;
    }
    
    public int getUmur(){
        return umur;
    }
    
    
    public void setNamaAyah(String NamaAyah){
        namaAyah = NamaAyah;
    }
    public void setNamaIbu(String NamaIbu){
        namaIbu = NamaIbu;
    }
    public void setNamaku(String Namaku){
        namaSendiri = Namaku;
    }
    public void setNamaSaudara(String NamaSaudara){
        namaSaudara = NamaSaudara;
    }
    public void setAlamat(String Alamat){
        alamat = Alamat;
    }
    public void setHobi(String Hobi){
        hobi = Hobi;
    }
    public void setCitacia(String Citacita){
        citacita = Citacita;
    }
    public void setUmur(int Umur){
        umur = Umur;
    }
}
