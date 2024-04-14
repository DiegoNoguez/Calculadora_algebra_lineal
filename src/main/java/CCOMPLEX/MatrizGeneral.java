package CCOMPLEX;
import javax.swing.JOptionPane;
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
        matrizA=new int [filas][columnas];
        matrizB=new int [filas][columnas];
        System.out.println("A continuacion ingresa la matriz A");
        for(x=0;x<filas;x++){
            for(j=0;j<columnas;j++){
                matrizA[x][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el "
                        + "termino ubicado en la posicion  "+x+"con subindice "+j));
                System.out.print(matrizA[x][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("A continuacion ingresa la matriz B");
        for(x=0;x<filas;x++){
            for(j=0;j<columnas;j++){
                matrizB[x][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el termino en la"
                        + " posición "+x+" con el subindice "+j));
                System.out.print(matrizB[x][j]+"\t");
            }
            System.out.println();
        }
        opciones=Byte.parseByte(JOptionPane.showInputDialog("Selecciona la opcion"
                + " que desas realizar \n 1.-Suma \n 2.-Resta \n 3.-Multiplicación"
                + "\n 4.-Division "));
        menu();
        
    }
    private void menu(){
        switch(opciones){
            case 1 -> sumaMatriz();
            case 2 -> {
                byte opt;
                opt=Byte.parseByte(JOptionPane.showInputDialog("RESTA DE MATRIZ"
                        + "\n 1.-MATRIZA-MATRIZB \n 2.-MATRIZB-MATRIZA"));
                switch(opt){
                    case 1->restaMatrizB();
                    case 2->restaMatrizA();
                }
            }
            case 3 -> {multiplicacionMatrix();
            }
            case 4 -> {
            }
            default -> JOptionPane.showMessageDialog(null,"Por favor seleciona"
                        + " una opcion valida");
        }
    }
    
    private void sumaMatriz(){
        System.out.println("A continuacion se te mostrara la matriz Resulatante");
        matrizR=new int [filas][columnas];
        for(x=0;x<filas;x++){
            for(j=0;j<columnas;j++){
                matrizR[x][j]=matrizA[x][j]+matrizB[x][j];
                System.out.print(matrizR[x][j]+"\t");
            }
            System.out.println();
        }
        
    }
    private void restaMatrizB(){
       System.out.println("A continuacion se te mostrara la matriz Resulatante");
        matrizR=new int [filas][columnas];
        for(x=0;x<filas;x++){
            for(j=0;j<columnas;j++){
                matrizR[x][j]=matrizA[x][j]-matrizB[x][j];
                System.out.print(matrizR[x][j]+"\t");
            }
            System.out.println();
        } 
    }
    private void restaMatrizA(){
        System.out.println("A continuacion se te mostrara la matriz Resulatante");
        matrizR=new int [filas][columnas];
        for(x=0;x<filas;x++){
            for(j=0;j<columnas;j++){
                matrizR[x][j]=matrizB[x][j]+matrizA[x][j];
                System.out.print(matrizR[x][j]+"\t");
            }
            System.out.println();
        }
    }
    private void multiplicacionMatrix(){
        
    }
}
