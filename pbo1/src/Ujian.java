public class Ujian {
    private MataPelajaran mataPelajaran;
    private String jenis;

    public Ujian(MataPelajaran m, String jenis){
        this.mataPelajaran = m;
        this.jenis = jenis;
    }

    public void setMataPelajaran(MataPelajaran m){
        this.mataPelajaran = m;
    }

    public MataPelajaran getMataPelajaran(){
        return mataPelajaran;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getJenis(){
        return jenis;
    }    
}
