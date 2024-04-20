package Model;

public class mobil {
    private String noPlat, merkMobil, warnaMobil, penyewa;
    private int tahunKeluaran;

    public mobil(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaran, String penyewa) {
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaran = tahunKeluaran;
        this.penyewa = penyewa;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public String getWarnaMobil() {
        return warnaMobil;
    }

    public String getPenyewa() {
        return penyewa;
    }

    public int getTahunKeluaran() {
        return tahunKeluaran;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public void setWarnaMobil(String warnaMobil) {
        this.warnaMobil = warnaMobil;
    }

    public void setTahunKeluaran(int tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setPenyewa(String penyewa) {
        this.penyewa = penyewa;
    }
}
