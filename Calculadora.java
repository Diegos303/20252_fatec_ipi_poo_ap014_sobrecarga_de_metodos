//package ap014_sobrecarga_de_metodos;

public class Calculadora {
  //public int somar(int a, int b) {
    //return a + b;
  //}
  //public int somar(int a, int b, int c) {
    //return a + b + c;
  //}

  //public int somar(int a,int b, int c,int d) {
    //return a + b + c + d;
  //}

 
  public double somar(double a, double b) {
    return a + b;
  }

  public int somar (int... vetor) { //vararg java5+
    int ac = 0;
    //for each enhanced for java5+
    for (int aux : vetor) {
      ac += aux;
    }
    return ac;
  }

  public int somar(String a, String b) {
    return Integer.parseInt(a) + Integer.parseInt(b);
  }

  public int somar(int a, String b) {
    return a + Integer.parseInt(b);
  }

  public int somar (String s, int a) {
    //não pode usar o  operador +
    return this.somar(a,s);
  }
}