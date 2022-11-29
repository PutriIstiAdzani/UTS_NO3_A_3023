/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3023;

/**
 *
 * @author Fajar
 */
public class StudentStaff_3023 extends Mahasiswa_3023 implements iPendapatan_3023 {
   String unitKerja_3023;
   int jamKerja_3023;
   
   public String getUnitKerja_3023() {
        return unitKerja_3023;
    }

    public void setUnitKerja_3023(String unitKerja_3023) {
        this.unitKerja_3023 = unitKerja_3023;
    }

    public int getJamKerja_3023() {
        return jamKerja_3023;
    }

    public void setJamKerja_3023(int jamKerja_3023) {
        this.jamKerja_3023 = jamKerja_3023;
    }

   public void tampilDataMhs_3023(){
       System.out.println("NIM          : "+nim_3023);
       System.out.println("Nama         : "+nama_3023);
       System.out.println("Jurusan      : "+jurusan_3023);
       System.out.println("IPK          : "+ipk_3023);
       System.out.println("Unit Kerja   : "+unitKerja_3023);
       System.out.println("Jam Kerja    : "+jamKerja_3023);
   }
   
   public double totalPendapatan_3023(){
       double totalPendapatan_3023;
       return totalPendapatan_3023 = jamKerja_3023*30000;
   }
}
