public class MataPelajaran {
    protected String kode;
    protected String nama;

    public MataPelajaran(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
}
