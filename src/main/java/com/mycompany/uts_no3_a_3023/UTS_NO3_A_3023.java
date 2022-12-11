/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_a_3023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author Fajar
 */
public class UTS_NO3_A_3023 {
    
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
            AsistenPraktikum_3023 AS = new AsistenPraktikum_3023(null,null,null,0,null,0);
            StudentStaff_3023 SS = new StudentStaff_3023(null,null,null,0,null,0);
            
            ArrayList <AsistenPraktikum_3023> asprak =new ArrayList<>();
            System.out.print("Jumlah Asisten Praktikum: ");
            int input = Integer.parseInt(br.readLine());
            System.out.println("=== Input Data Asisten Praktikum ===");
            for (int i = 0; i<input; i++){ 
                System.out.print("NIM                     : " ); 
                AS.nim_3023 = br.readLine();
                System.out.print("Nama                    : " );
                AS.nama_3023 = br.readLine();
                System.out.print("Jurusan                 : " );
                AS.jurusan_3023 = br.readLine();
                System.out.print("IPK                     : " );
                AS.ipk_3023 = Float.parseFloat(br.readLine());
                System.out.print("MK Asistentsi           : " );
                AS.setMkAsistensi_3023(br.readLine());
                System.out.print("Jumlah Pertemuan        : " );
                AS.setJmlPertemuan_3023(Integer.parseInt(br.readLine()));
                asprak.add(AS);
                System.out.println("");
            }
            ArrayList <StudentStaff_3023> stutaf =new ArrayList<>();
            System.out.print("Jumlah Student Staff    : ");
            int INPUT = Integer.parseInt(br.readLine());
            System.out.println("=== Input Data Student Staff ===");
            for (int i = 0; i<INPUT; i++){ 
                System.out.print("NIM                     : "); 
                SS.nim_3023 = br.readLine();
                System.out.print("Nama                    : ");
                SS.nama_3023 = br.readLine();
                System.out.print("Jurusan                 : ");
                SS.jurusan_3023 = br.readLine();
                System.out.print("IPK                     : ");
                SS.ipk_3023 = Float.parseFloat(br.readLine());
                System.out.print("Unit Kerja              : ");
                SS.setUnitKerja_3023(br.readLine());
                System.out.print("Jam Kerja               : ");
                SS.setJamKerja_3023(Integer.parseInt(br.readLine()));
                stutaf.add(SS);
                System.out.println("");
            }
            System.out.println("");
            System.out.println("=== Data Asisten Praktikum ===");
            for(int i = 0; i < asprak.size(); i++){
                AS.tampilDataMhs_3023();
            }
            System.out.println("");
            System.out.println("=== Data Student Staff ===");
            for(int i = 0; i < stutaf.size(); i++){
                SS.tampilDataMhs_3023();
            }
        }
        catch(IOException ex){
            System.out.println(); 
        }
    }

}

