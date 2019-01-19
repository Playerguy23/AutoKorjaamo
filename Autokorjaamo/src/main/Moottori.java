package main;

public class Moottori extends Osa{

    private String moottoriTyyppi;

    public Moottori(String tunnus, String kuvaus, String valmistaja, String moottoriTyyppi) {
        super(tunnus, valmistaja, kuvaus);

        this.moottoriTyyppi = moottoriTyyppi;
    }

    public String getMoottorityyppi() {
        return moottoriTyyppi;
    }

}
