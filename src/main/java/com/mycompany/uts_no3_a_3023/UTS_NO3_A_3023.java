/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_a_3023;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Fajar
 */
public class UTS_NO3_A_3023 {

    public static void main(String[] args) {
        AsistenPraktikum_3023 Asprak1 = new AsistenPraktikum_3023();
        StudentStaff_3023 SS1 = new StudentStaff_3023();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("=== Input Data Asisten Praktikum ===");
            System.out.println("NIM : ");
            Asprak1.nim_3023 = br.readLine();
            System.out.println("Nama    : ");
            Asprak1.nama_3023 = br.readLine();
            System.out.println("Jurusan : ");
            Asprak1.jurusan_3023 = br.readLine();
            System.out.println("IPK : ");
            Asprak1.ipk_3023 = Float.parseFloat(br.readLine());
            System.out.println("MK Asistensi    : ");
            Asprak1.mkAsistensi_3023 = br.readLine();
            System.out.println("Jumlah Pertemuan    : ");
            Asprak1.jmlPertemuan_3023 = Integer.parseInt(br.readLine());
            System.out.println(" ");
            
            System.out.println("=== Input Data Student Staff ===");
            System.out.println("NIM    : ");
            SS1.nim_3023 = br.readLine();
            System.out.println("Nama    : ");
            SS1.nama_3023 = br.readLine();
            System.out.println("Jurusan : ");
            SS1.jurusan_3023 = br.readLine();
            System.out.println("IPK : ");
            SS1.ipk_3023 = Float.parseFloat(br.readLine());
            System.out.println("Unit Kerja  : ");
            SS1.unitKerja_3023 = br.readLine();
            System.out.println("Jam Kerja   : ");
            SS1.jamKerja_3023 = Integer.parseInt(br.readLine());
            System.out.println(" ");
            
            System.out.println("=== Data Asisten Praktikum ===");
            Asprak1.tampilDataMhs_3023();
            System.out.println("Total Pendapatan    : "+Asprak1.totalPendapatan_3023());
            System.out.println(" ");
            System.out.println("=== Data Student Staff ===");
            SS1.tampilDataMhs_3023();
            System.out.println("Total Pendapatan    : "+SS1.totalPendapatan_3023());
            System.out.println(" ");
        }
        catch(Exception ex){
            System.out.println("ex");
        }
    }
}
