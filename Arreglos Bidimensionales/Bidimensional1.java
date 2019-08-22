import javax.swing.JOptionPane;

public class Bidimensional1 {
  private String[][] datos;
  private int renglones;
  private int columnas;

  public void obtenerDatos(){
    String pos="";
    for(int i=0; i<columnas; i++){
      for(int j=0; j<renglones; j++){
        pos="Introduzca el valor en ["+i+"]"+"["+j+"]";
        datos[i][j]=JOptionPane.showInputDialog(pos);
      }
    }
  }

  public void desplegarDatos(){
    String str="";
    for(int i=0; i<columnas; i++){
      for(int j=0; j<renglones; j++){
        str+="Casilla ["+i+"]["+j+"] ="+datos[i][j] + "\n";
      }
    }
    JOptionPane.showMessageDialog(null,str);
  }

  public Bidimensional1(String[] args){
    renglones=Integer.parseInt(args[0]);
    columnas=Integer.parseInt(args[1]);

    datos=new String[renglones][columnas];

    System.out.println(datos.length + " " + datos[0].length);

    obtenerDatos();
    desplegarDatos();
  }

  public static void main(String[] args) {
    Bidimensional1 obj=new Bidimensional1(args);
  }

}
