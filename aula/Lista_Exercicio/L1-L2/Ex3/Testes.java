import java.util.*;

public class Testes{
    String nome;
    double num;
    Testes(String a,double b){
        this.nome = a;
        this.num = b;
    }
    public static Comparator Comp = new Comparator(){
        public int comparen(Object a,Object b){
            double n1,n2;
            n1 = (double)a.getnum();
            n2 = (double)b.getnum();
            return (int)n1-n2;
        }
        public int compares(Object a,Object b){

        }
    };

    public static void main(String[] args){
    String a,b,c,d,e;
    //String[] vetl = null;
    double n1,n2,n3,n4,n5;
    //double[] vetn = null;
    a = "Alexandre";    b = "Willam";    c = "Janoel";    d = "Madalena";    e = "Baiano";
    n1 = 10;    n2 = 30;    n3 = 50;    n4 = 70;    n5 = 80;
    //vetl[0] = a;    vetl[1] = b;    vetl[2] = c;    vetl[3] = d;    vetl[4] = e;
    //vetn[0] = n1;   vetn[1] = n2;    vetn[2] = n3;  vetn[3] = n4;   vetn[4] = n5;

    Testes t1 = new Testes(a,n1);
    Testes t2 = new Testes(b,n2);
    Testes t3 = new Testes(c,n3);
    Testes t4 = new Testes(d,n4);
    Testes t5 = new Testes(e,n5);


    ArrayList<Testes> lista1 = new ArrayList<Testes>();
    lista1.add(t1);
    lista1.add(t2);
    lista1.add(t3);
    lista1.add(t4);
    lista1.add(t5);
    ArrayList<String> lista2 = new ArrayList<String>();
    lista2.add(a);
    lista2.add(b);
    lista2.add(c);
    lista2.add(d);
    lista2.add(e);
    ArrayList<Double> lista3 = new ArrayList<Double>();
    lista3.add(n1);
    lista3.add(n3);
    lista3.add(n5);
    lista3.add(n4);
    lista3.add(n2);

    System.out.println(lista1);
    Collections.sort(lista1,Comp);
    System.out.println("DPS DE ORDENAR-------->"+lista1);
    }
}
