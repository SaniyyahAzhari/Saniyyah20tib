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
public class PegawaiProjek extends Pegawai{
    int gajitetap;
    int lembur;
    int jam;
    int projek;
    
    public PegawaiProjek(int gt, int l, int j, int p) {
        this.gajitetap=gt;
        this.jam=j;
        this.lembur=l;
        this.projek=p;
    }
    
    @Override
    public double totalpenghasilan() {
        super.totalpenghasilan();
        return gajitetap+(jam*lembur)+(0.02*projek);
    }
}
