/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

/**
 *
 * @author Fikham
 */
public class PegawaiApp {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("Tiara", "Manager");
        Pegawai p2 = new Pegawai("Adinda", "Programmer");
        
        
        PegawaiTetap pt1 = new PegawaiTetap(4000000, 500000, 4, 50000);
        PegawaiProjek pt2 = new PegawaiProjek(3000000, 500000, 4, 300000);
        
        System.out.println("Nama Pegawai : "+p1.getNama_pegawai());
        System.out.println("Jenis Pegawai : "+p1.getJenis_pegawai());
        System.out.println((int)pt1.totalpenghasilan());
        System.out.println("");
        
        System.out.println ("Nama Pegawai : "+p2.getNama_pegawai());
        System.out.println("Jenis Pegawai : "+p2.getJenis_pegawai());
        System.out.println((int)pt2.totalpenghasilan());
    }
}
