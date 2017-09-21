
public class Funcionario {
	private String nomeDoFuncionario;
	private String departamentoDoFuncionario;
	private double salarioDoFuncionario;
	private String rgDoFuncionario;
	private boolean efetividadeDoFuncionario;
	private Empresa empresaOndeTrabalha;
	
	
	//Construtor
	//Obrigado Nome, Departamento e salário efetividade set para true
	Funcionario(String nome, String departamento,double salario ){
		this.nomeDoFuncionario = nome;
		this.departamentoDoFuncionario = departamento;
		this.salarioDoFuncionario = salario;
		this.efetividadeDoFuncionario = true;
	}
	
	//Construtor dois
	Funcionario(String nome){
		this.nomeDoFuncionario = nome;
	}
	

	//Metodo para receber aumento
	public void recebeAumento(double aumento){
		this.salarioDoFuncionario += aumento;
	}
	
	//Metdo para mostrar o ganho anual do FUncionario
	public double calculaGanhoAnual(){
		return this.salarioDoFuncionario * 12;
	}
	
	//metodo para demitir o cara
	public void demite(){
		this.efetividadeDoFuncionario = false;
	}
	
	//metodo para recontratar o funcionario
	public void contrata(){
		this.efetividadeDoFuncionario = true;
	}
	

	//Get para pegar e ver e Set com VOID para setar e mudar
	public String getNome(){
		return this.nomeDoFuncionario;
	}
	public void setNome(String nome){
		this.nomeDoFuncionario = nome;
	}
	
	//Get para mostrar com retunr e set para mudar o valor
	public String getDepartamento(){
		return this.departamentoDoFuncionario;
	}
	public void setDepartamento(String departamento){
		this.departamentoDoFuncionario = departamento;
	}
	
	//Get para mostrar com return e set para mudar o valor com void
	public double getSalario(){
		return this.salarioDoFuncionario;
	}
	public void setSalario(double valor){
		this.salarioDoFuncionario = valor;
	}
	
	//Get para mostrar com retunr e set para mudar o valor com void
	public String getRg(){
		return this.rgDoFuncionario;
	}
	public void setRg(String rg){
		this.rgDoFuncionario = rg;
	}
	
	//Get para mostrar com o return e set para mudar o valor com void
	//No caso da efetivifdade só preciso mostrar
	public boolean getEfetividadeDoFuncionario(boolean status){
		if(status == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setpegaEmpresaondeTrabalha(Empresa empresa){
		this.empresaOndeTrabalha = empresa;
	}
	public String getNomeDaEmpresa(){
		return this.empresaOndeTrabalha.getNome();
	}
	

}
