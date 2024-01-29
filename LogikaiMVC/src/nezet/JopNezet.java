package nezet;

import javax.swing.JOptionPane;

public class JopNezet extends Nezet{
    
    
    protected void nezetbeIr(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @Override
    public int valasztas(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
