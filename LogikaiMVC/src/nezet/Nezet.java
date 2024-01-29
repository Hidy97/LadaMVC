package nezet;

public abstract class Nezet {
    protected static final String SEP = System.lineSeparator();
    
    protected abstract void nezetbeIr(String msg);
    
    public abstract int valasztas(String msg);
    
     public void leirasMegjelenito(String msg){
        nezetbeIr(msg + SEP);
    }
    
    public void feladatMegjelenito(String msg){
        nezetbeIr(msg + SEP);
    }
    
    
    
    public void eredmenyMegjelenito(String msg){
        nezetbeIr(SEP);
    }
}
