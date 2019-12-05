//package L1L2.Ex3.classes;

public class Mulher extends PessoaIMC{
    double imc;
    public Mulher(String name, String date, double weight, double height){
        super(name,date,weight,height);
    }

    public String resultIMC (){
        double val = super.calculaIMC(super.getpeso(),super.getaltura());
        this.imc = val;
        if(val < 19.0){    //Abaixo peso ideal
            return "\tAbaixo do peso.\n";
        }else if(val > 25.8){  //Acima peso ideal
            return "\tAcima do peso.\n";
        }else{     //Dentro peso ideal
            return "\tPeso ideal.\n";
        }
    }

    public String toString(){
        return super.toString()+resultIMC();
    }
    public double getimc(){
        return this.imc;
    }
}
