public class Guru extends Pegawai{
    private String sertifikasi;
    private double tunjanganSertifikasi;
    private MataPelajaran mataPelajaran;
    private int jamMengajar;

    public Guru(String nip, String nama, int umur, String jenisKelamin, 
                String sertif, double ts, MataPelajaran mapel, int jm){
        super(nip, nama, umur, jenisKelamin);
        this.sertifikasi = sertif;
        this.tunjanganSertifikasi = ts;
        this.mataPelajaran = mapel;
        this.jamMengajar = jm;    
    }


    public void hitungGaji(){
        double gajiPokok = 3000000;
        this.gaji = gajiPokok + tunjanganSertifikasi + (jamMengajar * 50000);
    }

    public Penilaian inputNilai(Siswa siswa, Ujian ujian, int nilai)
            throws NilaiTidakValidException {
        return new Penilaian(siswa, ujian, nilai);
    }
    public Penilaian inputNilai(Siswa siswa, Ujian ujian, String grade)
        throws NilaiTidakValidException {

        int nilaiAngka;

        switch(grade.toUpperCase()){
            case "A": nilaiAngka = 90; break;
            case "B": nilaiAngka = 80; break;
            case "C": nilaiAngka = 70; break;
            case "D": nilaiAngka = 60; break;
            default: nilaiAngka = 0;
        }

        return new Penilaian(siswa, ujian, nilaiAngka);
    }
    public MataPelajaran getMataPelajaran(){
        return mataPelajaran;
    }
    public int getJamMengajar(){
        return jamMengajar;
    }

    public String getSertifikasi(){
        return sertifikasi;
    }
}
