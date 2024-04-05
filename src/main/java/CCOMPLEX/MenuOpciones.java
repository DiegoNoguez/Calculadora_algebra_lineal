package CCOMPLEX;
import javax.swing.JOptionPane;
public class MenuOpciones {
    public static void main(String[] args) {
        AllMets ob1 = new AllMets();
        MatrizGeneral obs = new MatrizGeneral();
        byte x, cx;
        do{
            cx=Byte.parseByte(JOptionPane.showInputDialog("1.-Operaciones con"
                    + " números compljos \n 2.-Operaciones con matriz"));
            switch(cx){
                case 1:
                    ob1.solicitudDatos();
                    break;
                case 2:
                    obs.imprimir();
                    break;
            }
            
            
            x=Byte.parseByte(JOptionPane.showInputDialog("Ingresa 1 si deseas volver a "
                    + "ejecutar el programa "));
        }while(x==1);
        
    }
    
}
