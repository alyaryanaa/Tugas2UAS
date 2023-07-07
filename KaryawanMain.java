//Alya Ryana Putri Rahmadyna
//227064516080

package MenghitungGajiKaryawan;
public class KaryawanMain {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();
        
        karyawan1.karyawan("1234567890", "Alya Ryana", "Perempuan");
        karyawan1.jumlahhari = 15;
        karyawan1.absenKerja();
        karyawan1.hitungGaji(15);
        
        System.out.println();
        
        Dosen dosen1 = new Dosen();
        
        dosen1.karyawan("0987654321", "Ghina Rahma", "Perempuan");
        dosen1.jumlahhari = 5;
        dosen1.absenKerja();
        dosen1.jumlah_sks = 3;
        dosen1.upah_per_sks = 500000;
        dosen1.hitungGaji();
        
        System.out.println();
        
        Staff staff1 = new Staff();
        
        staff1.karyawan("1324576809", "Sanda Fiona", "Perempuan");
        staff1.jumlahhari = 10;
        staff1.absenKerja();
        staff1.hitungGaji(10);
        
        
    }
    
}
