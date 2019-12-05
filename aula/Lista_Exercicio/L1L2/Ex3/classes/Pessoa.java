//package L1L2.Ex3.classes;

public class Pessoa{
    protected String nome;
    protected String DataNasc;

    public Pessoa(String name, String date){
        setnome(name);
        setdata(date);
    }

    public String toString(){
        return ("\nNome: "+getnome()+"\nData de Nascimento: "+getdata());
    }

    //-------------------------------GETERS
    public String getnome(){
        return this.nome;
    }
    public String getdata(){
        return this.DataNasc;
    }

    //-------------------------------SETERS
    protected void setnome(String nome){
        this.nome = nome;
    }
    protected void setdata(String a){
        this.DataNasc = a;
    }

}
