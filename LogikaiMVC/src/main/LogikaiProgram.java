package main;

import modell.Feladat;
import modell.Lada;
import nezet.CUINezet;
import nezet.JopNezet;
import vezerlo.CuiVezerlo;
import vezerlo.JopVezerlo;

public class LogikaiProgram {

    public static void main(String[] args) {
        new LogikaiProgram().ini();
    }
    
    public void ini(){
        Feladat modell = new Feladat();
//        CUINezet nezet = new CUINezet();
//        new CuiVezerlo(nezet, modell);
        
        JopNezet nezet = new JopNezet();
        new JopVezerlo(nezet, modell);
    }
    
}
