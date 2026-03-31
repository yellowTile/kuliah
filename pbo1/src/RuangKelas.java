public class RuangKelas {
    private String kode;
    private int kapasitas;

    public RuangKelas() {
        this.kode = "";
        this.kapasitas = 0;
    }

    public String getKode(){
        return kode;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public int getKapasitas(){
        return kapasitas;
    } 
    
    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }
}
