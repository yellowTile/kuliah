public class Penilaian {
    private Siswa siswa;
    private Ujian ujian;
    private int nilai;

    public Penilaian(Siswa siswa, Ujian ujian, int nilai)
            throws NilaiTidakValidException {

        if(nilai < 0 || nilai > 100){
            throw new NilaiTidakValidException(
                "Nilai harus berada di antara 0 - 100"
            );
        }

        this.siswa = siswa;
        this.ujian = ujian;
        this.nilai = nilai;
    }

    public Siswa getSiswa(){
        return siswa;
    }

    public Ujian getUjian(){
        return ujian;
    }

    public int getNilai(){
        return nilai;
    }
}