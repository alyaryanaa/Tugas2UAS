//Alya Ryana Putri Rahmadyna
//227064516080

package MenghitungGajiKaryawan;

public class Karyawan {
    String NIP;
    String nama;
    String jeniskelamin;
    int jumlahhari;
    int totalgaji;
    
    void karyawan(String NIP, String nama, String jeniskelamin){
        System.out.println("NIP             : " + NIP );
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jeniskelamin);
    }
    
    void absenKerja(){
        System.out.println("Jumlah Hari     : " + jumlahhari);
    }
    
    void hitungGaji(){
        
    }
    
    void hitungGaji(int jumlah_hari){
        System.out.println("Total Gaji      : " + (totalgaji = jumlahhari*50000));
    }
}

class Dosen extends Karyawan{
    String golongan;
    int jumlah_sks;
    int upah_per_sks;
   
    
    void hitungGaji(){
        System.out.println("Total Gaji      : " + (totalgaji = upah_per_sks * jumlah_sks * jumlahhari));
    }
}

class Staff extends Karyawan{
   
}
