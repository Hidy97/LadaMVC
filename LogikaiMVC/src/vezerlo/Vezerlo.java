package vezerlo;

import modell.Feladat;

public abstract class Vezerlo {
    private Feladat modell;

    public Vezerlo(Feladat modell) {
        this.modell = modell;
    }

    public Feladat getModell() {
        return modell;
    }
    
}
