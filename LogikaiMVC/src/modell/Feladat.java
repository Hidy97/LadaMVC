package modell;

public class Feladat {
    private Lada[] ladak;//ladak->null

    public Feladat() {
        Lada arany = new Lada("arany", "Én rejtem a kincset!");
        Lada ezust = new Lada("ezüst", "Nem én rejtem a kincset!", true);
        Lada bronz = new Lada("bronz", "Arany hazudik!");
        ladak = new Lada[3];//ladak[0] -> null, ladak[1] -> null... stb
        ladak[0] = arany;
        ladak[1] = ezust;
        ladak[2] = bronz;
    }

    /*ez valójában egy setter...*/
    public Lada[] getLadak() {
        return ladak;
    }

}
