import javax.swing.*;

public class Arreglo4{

  private int numero;
  private int numeros[];

  public void principal(String[] l){
    numeros=new int[Integer.parseInt(l[0])];
    String str="";
    for(int i=0; i<this.numeros.length; i++){
      str="Valor de arreglo en ["+i+"]";
      numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(str));
    }
    for(int i=0; i<this.numeros.length; i++){
      System.out.println(numeros[i]);
    }
  }

  public static void main(String[] args) {
    Arreglo4 obj=new Arreglo4();
    obj.principal(args);
  }
}
