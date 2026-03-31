Elza Khoirisma Carrynda 24060124130065
Amelia Aristianti 24060124120008
Dinda Isyariani 24060124140165
Zulfa Nabilah 24060124130095
Novelya Cherina 24060124140174


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // 1. Membuat sekolah
        Sekolah sekolah1 = new Sekolah("SMK Teknologi");

        // 2. Membuat mata pelajaran
        MataPelajaran mtk = new MataPelajaran("MTK101", "Matematika");
        MataPelajaran ipa = new MataPelajaran("IPA101", "Ilmu Pengetahuan Alam");

        // 3. Membuat siswa
        Siswa siswa1 = new Siswa("Ali", "S001");
        Siswa siswa2 = new Siswa("Budi", "S002");

        siswa1.pilihMataPelajaran(mtk);
        siswa1.pilihMataPelajaran(ipa);
        siswa2.pilihMataPelajaran(mtk);

        sekolah1.tambahSiswa(siswa1);
        sekolah1.tambahSiswa(siswa2);

        // 4. Membuat guru
        Guru guru1 = new Guru("G001", "Ibu Siti", 35, "Perempuan",
                "S1 Pendidikan Matematika", 500000, mtk, 12);

        Guru guru2 = new Guru("G002", "Bapak Joko", 40, "Laki-laki",
                "S1 IPA", 600000, ipa, 10);

        sekolah1.tambahPegawai(guru1);
        sekolah1.tambahPegawai(guru2);

        // 5. Hitung gaji
        guru1.hitungGaji();
        guru2.hitungGaji();

        System.out.println("Gaji Guru 1: " + guru1.getNama() + " = " + guru1.gaji);
        System.out.println("Gaji Guru 2: " + guru2.getNama() + " = " + guru2.gaji);

        // 6. Kepala sekolah
        KepalaSekolah kepala = new KepalaSekolah(
                "KS01", "Pak Rudi", 50, "Laki-laki",
                1000000, 2, LocalDate.of(2025, 1, 1));

        kepala.hitungGaji();
        sekolah1.tambahPegawai(kepala);

        System.out.println("Gaji Kepala Sekolah: " + kepala.getNama() + " = " + kepala.gaji);
        System.out.println("Masa jabatan berakhir: " + kepala.getMasaAkhirJabatan());

        // 7. Membuat ujian
        Ujian ujianMTK = new Ujian(mtk, "Ujian Tengah Semester");
        Ujian ujianIPA = new Ujian(ipa, "Ujian Akhir Semester");

        System.out.println("\nInput Nilai:");

        try {
            Penilaian nilai1 = guru1.inputNilai(siswa1, ujianMTK, 85);
            Penilaian nilai2 = guru1.inputNilai(siswa2, ujianMTK, "B");
            Penilaian nilai3 = guru2.inputNilai(siswa1, ujianIPA, 90);

            System.out.println(nilai1.getSiswa().getNama()
                    + " - " + nilai1.getUjian().getJenis()
                    + " : " + nilai1.getNilai());

            System.out.println(nilai2.getSiswa().getNama()
                    + " - " + nilai2.getUjian().getJenis()
                    + " : " + nilai2.getNilai());

            System.out.println(nilai3.getSiswa().getNama()
                    + " - " + nilai3.getUjian().getJenis()
                    + " : " + nilai3.getNilai());

        } catch (NilaiTidakValidException e) {
            System.out.println("Error Nilai: " + e.getMessage());
        }

        // 8. Jadwal
        RuangKelas r1 = new RuangKelas();
        r1.setKode("R101");
        r1.setKapasitas(30);

        Jadwal jadwal1 = new Jadwal(guru1, r1, "Senin 08:00-10:00");
        Jadwal jadwal2 = new Jadwal(guru2, r1, "Senin 08:00-10:00");
        Jadwal jadwal3 = new Jadwal(guru1, r1, "Senin 10:00-12:00");

        System.out.println("\nCek konflik jadwal:");

        try {
            jadwal1.cekKonflik(jadwal2);
            System.out.println("Jadwal1 & Jadwal2 tidak konflik");
        } catch (JadwalKonflikException e) {
            System.out.println(e.getMessage());
        }

        try {
            jadwal1.cekKonflik(jadwal3);
            System.out.println("Jadwal1 & Jadwal3 tidak konflik");
        } catch (JadwalKonflikException e) {
            System.out.println(e.getMessage());
        }

        // 9. Tampilkan mapel siswa
        System.out.println("\nMata Pelajaran " + siswa1.getNama() + ":");
        siswa1.tampilMataPelajaran();
    }
}
