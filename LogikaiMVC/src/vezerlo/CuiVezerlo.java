package vezerlo;

import modell.Feladat;
import modell.Lada;
import nezet.CUINezet;

/**
 *
 * @author csaladi.alexandra
 */
public class CuiVezerlo extends Vezerlo{
    private CUINezet nezet;
    private Feladat modell;

    public CuiVezerlo(CUINezet nezet, Feladat modell) {
        super(modell);
        this.nezet = nezet;
        this.modell = super.getModell();
        
        nezet.leirasMegjelenito("Csak 1 igaz!");
        
        Lada[] ladak = modell.getLadak();
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
