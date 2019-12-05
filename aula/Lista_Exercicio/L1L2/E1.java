import java.io.*;
import java.util.*;
import L1L2.Ex1.classes.*;

public class E1 {
  int num;
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  //_________________________________________CONSTRUCTOR:
  public E1(int x){
    setnum(x);

  }
  private void calculaSalario(){
    FuncionarioContratado[] func = new FuncionarioContratado[this.num];
    ArrayList<FuncionarioContratado> lista = new ArrayList<FuncionarioContratado>();
    for(int i = 0; i < getnum(); i++){
      func[i] = criafuncionario();
      lista.add(func[i]);
    }
    if(getnum() != 0){
      System.out.println("\n___Folha Salarial:");
      for(int i = 0; i<getnum();i++){
        System.out.println(lista.get(i));
      }
    }
  }

  private FuncionarioContratado criafuncionario(){
    String e,y,a = null,b = null;
    int d = 0;
    String[] z;
    float salario = 0.0f;
    try{
      System.out.print("Forneça o nome do funcionario : ");
      a = in.readLine();

      System.out.print("Forneça o codigo do funcionario : ");
      y = in.readLine();
      z = y.split(" ");
      b = z[0];

      System.out.print("Forneça o salario do funcionario : ");
      y = in.readLine();
      z = y.split(" ");
      salario = Float.parseFloat(z[0]);

      System.out.print("Forneça a quantidade de dependentes do funcionario : ");
      y = in.readLine();
      z = y.split(" ");
      d = Integer.parseInt(z[0]);
    }catch(IOException s){
      System.out.println("ERRO de entrada, abortando o programa.");
      System.out.println(s);
      System.exit(1);
    }catch(NumberFormatException s){
      System.out.println("ERRO valor digitado inválido, abortando o programa.");
      System.out.println(s);
      System.exit(1);
    }catch(Exception s){
      System.out.println("ERRO inesperado, abortando o programa.");
      System.out.println(s);
      System.exit(1);
    }
    FuncionarioContratado funcionario = new FuncionarioContratado(a,b,salario,d);
    return funcionario;
  }

  //_________________________________________SETERS:
  private void setnum(int a){
    this.num = a;
  }

  //_________________________________________GETERS:
  private int getnum(){
    return this.num;
  }

  //_________________________________________MAIN:
  public static void main(String[] args)throws IOException{
    String d[];
    String a,b;
    int c;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("\nForneça a quantidade de funcionarios : ");
    a = in.readLine();
    d = a.split(" ");
    c = Integer.parseInt(d[0]);

    E1 instancia = new E1(c);
    instancia.calculaSalario();
  }
}
