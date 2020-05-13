package desing;
import javax.swing.*;
public class InicioDs extends JFrame{
    JLabel l1;
    public InicioDs(){
        setLayout(null);
        setSize(400,400);
        setLocationRelativeTo(null);
        setResizable(false);
        l1=new JLabel("Inicio");
        l1.setBounds(190,20,50,20);
        add(l1);
        
    }
    public static void main(String[]args){
        InicioDs a=new InicioDs();
    }
    
}
