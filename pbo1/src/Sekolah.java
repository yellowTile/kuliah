import java.util.ArrayList;

public class Sekolah {
    private String namaSekolah;
    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

    public Sekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
    }

    public void tambahSiswa(Siswa s){
        daftarSiswa.add(s);
    }

    public void tambahPegawai(Pegawai p){
        daftarPegawai.add(p);
    }

    public void setNamaSekolah(String ns){
        this.namaSekolah = ns;
    }
    
    public String getNamaSekolah(){
        return namaSekolah;
    }
}
