package main;

public class Main {
    public static void main(String[] args) {
        Moottori moottori = new Moottori("polttomoottori", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(moottori.getMoottorityyppi());
        System.out.println(moottori.getValmistaja());
    }
}
