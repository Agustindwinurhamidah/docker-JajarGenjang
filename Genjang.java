
package jajargenjang;
public class Genjang {

    public int tinggi,panjang,sisimiring ;
    Genjang(){
        
    }
    int hitungLuas(){
        return tinggi*panjang;
    }
    int hitungKeliling(){
        return (sisimiring+panjang)*2;
    }
}
