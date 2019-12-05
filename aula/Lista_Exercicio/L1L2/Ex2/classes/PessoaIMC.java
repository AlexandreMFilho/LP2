package L1L2.Ex2.classes;
public abstract class PessoaIMC extends Pessoa{
    double peso;
    double altura;

    public PessoaIMC(String name, String date, double weight, double height){
        super(name,date);
        setpeso(weight);
        setaltura(height);
    }

    public abstract String resultIMC();

    public double calculaIMC(double pes,double alt){
        return (pes/(alt*alt));
    }

    public String toString(){
        return (super.toString()+"\nPeso: "+getpeso()+"\nAltura: "+getaltura());
    }

    //-------------------------------GETERS
    public double getpeso(){
        return this.peso;
    }
    public double getaltura(){
        return this.altura;
    }

    //-------------------------------SETERS
    protected void setpeso(double a){
        this.peso = a;
    }
    protected void setaltura(double a){
        this.altura = a;
    }
}
