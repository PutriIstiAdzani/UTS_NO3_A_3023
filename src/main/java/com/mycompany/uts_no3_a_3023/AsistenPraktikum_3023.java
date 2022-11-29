/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3023;

/**
 *
 * @author Fajar
 */
public class AsistenPraktikum_3023 extends Mahasiswa_3023 implements iPendapatan_3023 {
    String mkAsistensi_3023;
    int jmlPertemuan_3023;
    
    public String getmkAsistensi_3023(){
        return mkAsistensi_3023;
    }
    
    public void setmkAsistensi_3023(){
        this.mkAsistensi_3023 = mkAsistensi_3023;
    }
    
    public int getjmlPertemuan_3023(){
        return jmlPertemuan_3023;
    }
    
    public void setJmlPertemuan_3023(int jmlPertemuan_3023){
        this.jmlPertemuan_3023 = jmlPertemuan_3023;
    }
    public void tampilDataMhs_3023(){
        System.out.println("NIM                 : "+nim_3023);
        System.out.println("Nama                : "+nama_3023);
        System.out.println("Jurusan             : "+jurusan_3023);
        System.out.println("IPK                 : "+ipk_3023);
        System.out.println("Matkul Asistensi    : "+mkAsistensi_3023);
        System.out.println("Jumlah Pertemuan    : "+jmlPertemuan_3023);
    }
    
    public double totalPendapatan_3023(){
        double totalPendapatan_3023;
        return totalPendapatan_3023 = jmlPertemuan_3023*50000;       
    }
    
}
