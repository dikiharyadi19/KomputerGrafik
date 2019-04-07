/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafik;
import java.awt.Graphics;
import java.awt.Graphics;

/**
 *
 * @author dikkidikki
 */
public class KomputerGrafik {

    /**
     * @param args the command line arguments
     */
    
        /*
        class grafik 2D
        -Pemetaan objek2 kedalam dunia 2 dimensi
        -Pemodelan dan proses rendering relatif lebih mudah dari grafik 3d (tidak perlu proueksi dll)
        -Konsep dasar grafik 3d meliputi
            -rendering pipe line
        -sistem koordinate (object, word, device,)
        -grafik prumitif
        -transformasi ( 
        -warna
        -font. dan sebagainya
        
        proses rendering relatif
        konstruksi objek
        transformasi(rotasi(perputaran,transalsi(),scaling(ukuran/zoom))
        penambahan warna dan properti lain
        proses render di grafik device
        
        
        Sistem koordinat
        koordinat yang umum koordinate kartesius
        sumbu x:horizontal
        sumbu y:vertikal
        
        Ruang space->
        objek space->bentuknya
        
        ruang dunia(world space)->isi/warnanya
        device space->hardware
        
        tugas
        diagram
        kurva
        poligon
        elipse
        overlap->tidak sesuai ukuran
        
        konsep pixel 
        pixel adalah representasi sebuah titik terkecil dalam sebuah fambar grafis
        pixwl kecil->kualitas gambar bagus
        
        contoh objek(poligon)
        garis
        segitiga
        segiempat
        #pixel per inc
        #dot per inch
        
        translasi
        
        12MPx12000
        1024 ->1MP
        
        image i/o ->baca/tulis image dalam berbagai format
        java 2d ->membuat grafit 2d dan imaging (pengolahan citr)
        swing->membuat UI berbasis grafik di java
        awt->kumpulan API untuk mengimplementasikan user interface berbasis grafik
        
        package
        javax ->komposnen yang membutuhkan grafix
        
        */
    public static void main(String[] args) {
        // TODO code application logic here
        DrawPolyPanel poly=new DrawPolyPanel();
        
        
        
    }
    
}
