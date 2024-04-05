package CCOMPLEX;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class MatrizGeneral {
    public int matrizA[][],matrizB[][],matrizR[][];
    byte x,j,opciones,filas,columnas;
    public void imprimir(){
        dataMatriz();
    }
    private void dataMatriz(){
        JOptionPane.showMessageDialog(null,"Bienvenido");
        JOptionPane.showMessageDialog(null,"A continuación ingresa el tamaño de "
                + "las fialas y columnas de la matriz \n Como recordatorio"
                + " recuerda que en programacion las matrices \n comienzan con el 0"
                + " \n  Procura que sean cuadraticas");
        filas=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la cantidad de "
                + "filas"));
        columnas=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la cantidad "
                + "de columnas"));
        menu();
        
    }
    private void menu(){
        switch(opciones){
            case 'A':
                break;
            case 'B':
                break;
            case'C':
                break;
            case 'D':
                break;
            default:
                JOptionPane.showMessageDialog(null,"Por favor seleciona"
                        + " una opcion valida");
        }
    }
}
