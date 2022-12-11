/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3023;

/**
 *
 * @author Fajar
 */
public abstract class Mahasiswa_3023 {
    String nim_3023;
    String nama_3023;
    String jurusan_3023;
    float ipk_3023;
    
    public Mahasiswa_3023 (String nim_3023, String nama_3023, String jurusan_3023, float ipk_3023){
        this.nim_3023 = nim_3023;
        this.nama_3023 = nama_3023;
        this.jurusan_3023 = jurusan_3023;
        this.ipk_3023 = ipk_3023;
    }
    
    public abstract void tampilDataMhs_3023(); 
}
