import javax.swing.*;

public class Arreglo5{

  private int numero;
  private int numeros[];

  public void crearArreglo(int l){
    numeros=new int[l];
  }

  public void obtenerDatos(){
    String str="";
    for(int i=0; i<this.numeros.length; i++){
      str="Valor de arreglo en ["+i+"]";
      numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(str));
    }
  }

  public void desplegar(){
    for(int i=0; i<this.numeros.length; i++){
      System.out.println(numeros[i]);
    }
  }

  public void principal(String[] l){
    crearArreglo(Integer.parseInt(l[0]));
    obtenerDatos();
    desplegar();
  }

  public static void main(String[] args) {
    Arreglo5 obj=new Arreglo5();
    obj.principal(args);
  }
}
