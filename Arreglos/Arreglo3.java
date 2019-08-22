import javax.swing.*;

public class Arreglo3{

  private int numero;
  private int numeros[];

  public void principal(String[] l){
    numeros=new int[Integer.parseInt(l[0])];
    this.numero=5;
    numeros[0]=this.numero;
    for(int i=0; i<this.numeros.length; i++){
      System.out.println(numeros[i]);
    }
  }

  public static void main(String[] args) {
    Arreglo3 obj=new Arreglo3();
    obj.principal(args);
  }
}
