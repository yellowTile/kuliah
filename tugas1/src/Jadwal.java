public class Jadwal {
    private Guru guru;
    private RuangKelas ruang;
    private String waktu;

    public Jadwal(Guru guru, RuangKelas ruang, String waktu){
        this.guru = guru;
        this.ruang = ruang;
        this.waktu = waktu;
    }

    public Guru getGuru(){
        return guru;
    }

    public RuangKelas getRuang(){
        return ruang;
    }

    public String getWaktu(){
        return waktu;
    }

    // cek konflik jadwal
    public void cekKonflik(Jadwal j)
            throws JadwalKonflikException {

        boolean ruangBentrok =
                this.ruang.equals(j.ruang) &&
                this.waktu.equals(j.waktu);

        boolean guruBentrok =
                this.guru.equals(j.guru) &&
                this.waktu.equals(j.waktu);

        if(ruangBentrok || guruBentrok){
            throw new JadwalKonflikException(
                "Terjadi konflik jadwal!"
            );
        }
    }
}