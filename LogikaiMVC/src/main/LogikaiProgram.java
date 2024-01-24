package main;

import modell.Lada;
import nezet.CUINezet;

public class LogikaiProgram {

    public static void main(String[] args) {
        Lada arany = new Lada("arany", "Én rejtem a kincset!");
        Lada ezust = new Lada("ezüst", "Nem én rejtem a kincset!", true);
        Lada bronz = new Lada("bronz", "Arany hazudik!");
        
        CUINezet nezet = new CUINezet();
        nezet.leirasMegjelenito("Csak 1 igaz állítás van!");
        Lada [] ladak = {arany, ezust, bronz};
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag() + ": ";
            String felirat = lada.getFelirat();
            nezet.feladatMegjelenito(anyag + felirat);
        }
        
        int valasztas = nezet.valasztas("melyik (0..2):");
        Lada lada = ladak[valasztas];
        String str = "";
        if (lada.isKincs()) {
            str = "talált, a kicset a(z) ";
        }else{
            str = "nem talált, a kicset nem a(z) ";
        }
        nezet.eredmenyMegjelenito(str + lada.getAnyag() + " rejti.");
    }
    
}
