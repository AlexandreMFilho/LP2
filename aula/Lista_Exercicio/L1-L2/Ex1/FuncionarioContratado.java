public class FuncionarioContratado extends Funcionario{

  //_________________________________________ATRIBUTOS:
  protected int dependentes;
  protected double salario_familia;
  protected static double valorPorDep = 9.58;
  protected static double aliquotaIR = 15;

  //_________________________________________CONSTRUCTOR:
  public FuncionarioContratado(String a, String b,float c, int d){
    super(a,b,c); //ativa somente o construtor da classe pai.
    setdependentes(d);
    if(d == 0){
      calculaSalario();
    }
    else{
      calculaSalario(getdependentes());
    }
    //System.out.println(this.toString());
  }
  //_________________________________________METODOS PERSONALIZADOS:
  void calculaSalario (){
    super.calculaSalario(aliquotaIR);
  }
  void calculaSalario (int dependentes){
    setsalario_familia(valorPorDep * (double)dependentes);
    super.setsalario(super.getsalario()+getsalario_familia());
    super.calculaSalario(aliquotaIR);
  }
  public String toString(){
    return ("\n"+super.toString()+"\nSalario Liquido : "+sal_liq+"\n");
  }

  //_________________________________________GETERS:
  private int getdependentes(){
    return this.dependentes;
  }
  private double getsalario_familia(){
    return this.salario_familia;
  }

  //_________________________________________SETERS:
  protected void setdependentes(int a){
    this.dependentes = a;
  }
  protected void setsalario_familia(double a){
    this.salario_familia = a;
  }
}
