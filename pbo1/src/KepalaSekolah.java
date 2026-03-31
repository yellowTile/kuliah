import java.time.LocalDate;

public class KepalaSekolah extends Pegawai{
    private double tunjangan;
    private int masaJabatan;
    private LocalDate masaAwal;

    public KepalaSekolah(String nip, String nama, int umur, String jenisKelamin,
                        double tj, int majab, LocalDate masal){
        super(nip, nama, umur, jenisKelamin);
        this.tunjangan = tj;
        this.masaJabatan = majab;
        this.masaAwal = masal;
    }

    public void hitungGaji(){
        this.gaji = 5000000 + tunjangan;
    }

    public LocalDate getMasaAkhirJabatan(){
        return masaAwal.plusYears(masaJabatan);
    }

    public int getMasaJabatan(){
        return masaJabatan;
    }

    public void setMasaAwal(LocalDate masaAwal){
        this.masaAwal = masaAwal;
    }

    public LocalDate getMasaAwal(){
        return masaAwal;
    }
}
