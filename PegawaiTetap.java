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
public class PegawaiTetap extends Pegawai {
    int gajitetap;
    int tunjangan;
    int jam;
    int lembur;
    
    public PegawaiTetap(int gt, int t, int j, int l) {
        this.gajitetap=gt;
        this.tunjangan=t;
        this.jam=j;
        this.lembur=l;
    }
    
    @Override
    public double totalpenghasilan() {
        super.totalpenghasilan();
        return gajitetap+tunjangan+(jam*lembur);
    }
}
