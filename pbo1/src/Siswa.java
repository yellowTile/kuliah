import java.util.ArrayList;

public class Siswa {
    private String nama;
    private String nisn;
    private ArrayList<MataPelajaran> daftarMapel;
    public Siswa(String nama, String nisn){
        this.nama = nama;
        this.nisn = nisn;
        this.daftarMapel = new ArrayList<>();
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

    public void pilihMapel(MataPelajaran m){
        daftarMapel.add(m);
    }

    public void tampilMapel(){
        for(MataPelajaran m : daftarMapel){
            System.out.println(m.getNama());
        }
    }

    
}
