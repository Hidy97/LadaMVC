package vezerlo;

import modell.Feladat;
import nezet.CUINezet;

public class CuiVezerlo extends Vezerlo{
    private CUINezet nezet;
    private Feladat modell;

    public CuiVezerlo(CUINezet nezet, Feladat modell) {
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
