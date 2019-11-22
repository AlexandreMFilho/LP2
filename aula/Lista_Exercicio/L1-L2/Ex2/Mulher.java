public class Mulher extends PessoaIMC{

    public Mulher(String name, String date, double weight, double height){
        super(name,date,weight,height);
    }

    public String resultIMC (){
        double val = super.calculaIMC(super.getpeso(),super.getaltura());
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
}
