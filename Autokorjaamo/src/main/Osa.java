package main;

public class Osa {
    private String tunnus;
    private String valmistaja;
    private String kuvaus;

    public Osa(String tunnus, String valmistaja, String kuvaus) {
        this.tunnus = tunnus;
        this.valmistaja = valmistaja;
        this.kuvaus = kuvaus;
    }

    public String getTunnus() {
        return tunnus;
    }

    public String getValmistaja() {
        return valmistaja;
    }

    public String getKuvaus() {
        return kuvaus;
    }
}
