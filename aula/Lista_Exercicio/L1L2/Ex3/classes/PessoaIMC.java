//package L1L2.Ex3.classes;

public abstract class PessoaIMC extends Pessoa{
    double peso;
    double altura;
    double imc;
    public PessoaIMC(String name, String date, double weight, double height){
        super(name,date);
        setpeso(weight);
        setaltura(height);
        calculaIMC(getpeso(),getaltura());
    }

    public abstract String resultIMC();

    public double calculaIMC(double pes,double alt){
        setimc(pes/(alt*alt));
        return this.imc;
    }

    public String toString(){
        return (super.toString()+"\nPeso: "+getpeso()+"\nAltura: "+getaltura()+"\nImc: "+(float)getimc());
    }

    //-------------------------------GETERS
    public double getpeso(){
        return this.peso;
    }
    public double getaltura(){
        return this.altura;
    }
    public double getimc(){
        return this.imc;
    }
    //-------------------------------SETERS
    protected void setpeso(double a){
        this.peso = a;
    }
    protected void setaltura(double a){
        this.altura = a;
    }
    protected void setimc(double a){
        this.imc = a;
    }
}
