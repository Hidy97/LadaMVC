package vezerlo;

import modell.Feladat;
import nezet.JopNezet;

/**
 *
 * @author csaladi.alexandra
 */
public class JopVezerlo extends Vezerlo{
    private JopNezet nezet;
    private Feladat modell;

    public JopVezerlo(JopNezet nezet, Feladat modell) {
        super(modell);
        this.nezet = nezet;
        this.modell = super.getModell();
        
        
        
        mutat();
    }
    
    protected int valasztasKezelo(){
        int valasztas = nezet.valasztas("melyik (0..2): ");
        return valasztas;
    }

    @Override
    public void mutat() {
        nezet.leirasMegjelenito("Csak 1 igaz!");
        nezet.feladatMegjelenito(feladatOsszeallito());
        int valasztas = valasztasKezelo();
        nezet.eredmenyMegjelenito(eredmenyOsszeallito(valasztas));
    }
}
