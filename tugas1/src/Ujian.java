public class Ujian {
    private MataPelajaran mapel;
    private String jenis;

    public Ujian(MataPelajaran m, String jenis){
        this.mapel = m;
        this.jenis = jenis;
    }

    public MataPelajaran getmapel(){
        return mapel;
    }
    public void setMapel(MataPelajaran m){
        this.mapel = m;
    }

    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

}
