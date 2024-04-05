package CCOMPLEX;
import javax.swing.JOptionPane;
public class AllMets {
    public int real1,real2,ima1,ima2,rt,sim,m1,m2,z1,z2,valori,i;
    public byte a,fila,columna,columna2,fila2,x,j;
    int matrizA[][]= new int [fila][columna];
    int matrizB[][]= new int [fila][columna];
    public void solicitudDatos(){
        JOptionPane.showMessageDialog(null,"A continuacion ingresa los numeros"
                + " con los cuales vamos a trabajar hoy");
        real1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la parte real"));
        ima1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la parte imaginaria"));
        real2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la parte real"));
        ima2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la parte imaginaria"));
        a=Byte.parseByte(JOptionPane.showInputDialog("1.-SUMA \n 2.-RESTA \n"
                + "3.-MULTIPLICACIÓN \n 4.-DIVISIÓN \n 5.-Exponete de i"));
        operacion();
    }
    public void operacion(){
        switch (a){
            case 1:
                sumaReales();
                sumaImaginario();
                JOptionPane.showMessageDialog(null,"El resultado de la suma de"
                        + " los numeros complejos proporcionado es de "+rt+"+"
                + sim+" i");
                break;
            case 2:
                resReal();
                resIma();
                JOptionPane.showMessageDialog(null,"El resultado es "+rt+" "+sim+
                        " i");
                break;
            case 3:
                mulRe();
                mulIma();
                JOptionPane.showMessageDialog(null,"Resultado es "+rt+" "+sim
                +" i");
                break;
            case 4:
                break;
            case 5:
                i=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la exponenciación"
                + " que tenga I"));
                expoI();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Seleciona una opcion valida");
                
        }
    }
    
    private int sumaReales (){
        rt=(real1)+(real2);
        return rt;
    }
    private int sumaImaginario(){
        sim=(ima1)+(ima2);
        return sim;
    }
    private int resReal(){
        rt=(real2)-(real1);
        return rt;
    }
    private int resIma(){
        sim=(ima2)-(ima1);
        return sim;
    }
    private int mulRe(){
        m1=(real1*real2);
        m2=(real1*ima2);
        mulIma();
        rt=m1-z2;
        return rt;
    }
    private int mulIma(){
        z1=(ima1*real2);
        z2=(ima1*ima2);
        sim=z1+m2;
        return sim;
    }
    private int expoI(){
        valori=i%4;
        System.out.println(valori);
        switch (valori){
            case 0:
                JOptionPane.showMessageDialog(null,"El valor de i a esa potencia "
                        + "es  1");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"El valor de i a esa potencia "
                        + "es  i");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"El valor de i a esa potencia "
                        + "es  -1");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"El valor de i a esa potencia "
                        + "es  -i");
                break;
        }
        return valori;
    }
    
    // operaciones con matrices y pedida de datos de la misma


        

}
