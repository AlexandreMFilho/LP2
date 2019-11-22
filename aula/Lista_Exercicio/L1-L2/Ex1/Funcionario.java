public class Funcionario {
  //_________________________________________ATRIBUTOS:
  protected String nome;
  protected String codigo;
  protected double salario;
  protected double sal_liq;
  //_________________________________________CONSTRUCTOR:
  public Funcionario(String a, String b, float c){
    this.setnome(a);
    this.setcodigo(b);
    this.setsalario(c);
    this.setsal_liq(c);
  }
  //_________________________________________METODOS PERSONALIZADOS:
  protected double calculaSalario(double desconto){
    this.setsal_liq(this.getsalario() - (this.getsalario() * ((double)desconto)/100.0));
    return (float)this.getsal_liq();
  }
  public String toString(){
    return ("Nome : "+this.nome+"\nCodigo : "+this.codigo+"\nSalario Base : "+this.salario);
  }
  //_________________________________________GETERS:
  protected String getnome(){
    return this.nome;
  }
  protected String getcodigo(){
    return this.codigo;
  }
  protected double getsalario(){
    return this.salario;
  }
  protected double getsal_liq(){
    return this.sal_liq;
  }
  //_________________________________________SETERS:
  protected void setnome(String a){
    this.nome = a;
  }
  protected void setcodigo(String a){
    this.codigo = a;
  }
  protected void setsalario (double a){
    this.salario = a;
  }
  protected void setsal_liq(double a){
    this.sal_liq = a;
  }
}
