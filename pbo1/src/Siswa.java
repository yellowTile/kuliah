import java.util.ArrayList;

public class Siswa {
    private String nama;
    private String nisn;
    private ArrayList<MataPelajaran> daftarMataPelajaran;
    public Siswa(String nama, String nisn){
        this.nama = nama;
        this.nisn = nisn;
        this.daftarMataPelajaran = new ArrayList<>();
    }

    public String getNama(){
        return nama;
    }
    public String getNisn(){
        return nisn;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNisn(String nisn){
        this.nisn = nisn;
    }

    public void pilihMataPelajaran(MataPelajaran m){
        daftarMataPelajaran.add(m);
    }

    public void tampilMataPelajaran(){
        for(MataPelajaran m : daftarMataPelajaran){
            System.out.println(m.getNama());
        }
    }
}
