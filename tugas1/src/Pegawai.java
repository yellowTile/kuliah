public abstract class Pegawai{
    protected String nip;
    protected String nama;
    protected int umur;
    protected double gaji;
    protected String jenisKelamin;


    public Pegawai(String nip, String nama, int umur, String jenisKelamin){
        this.nip = nip;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public abstract void hitungGaji();

    public void getinfo(){
        System.out.println("NIP: " + nip +
                            "\nNama: " + nama +
                            "\numur: " + umur +
                            "\ngaji: " + gaji +
                            "\njenis kelamin: " + jenisKelamin
        );
    }

    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }

    public String getJenisKelamin(){
        return jenisKelamin;
    }
    public void setJenisKelamin(String jk){
        if(jk.equals("Perempuan") || jk.equals("Laki-laki")){
            this.jenisKelamin = jk;
        }else{
            System.out.println("Jenis Kelamin hanya boleh Perempuan atau Laki-laki");
        }
    }




}