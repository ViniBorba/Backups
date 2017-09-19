
public class Empresa {
	
	private String nomeDaEmpresa;
	//private String cnpj;
	private Funcionario trabalhadorDaEmpresa;
	
	
	
	//Get para mostrar com return e set para mudar o valor com void
	//Sempore que a empresa receber um funcionário incrementa + 1
	
	
	//mostrar o nome do Funcionario
	public String mostraNomeDoFuncionario (){
		return this.trabalhadorDaEmpresa.getNome();
	}

	//set para mudar o valor e com void
	public void setNome(String nome){
		this.nomeDaEmpresa = nome;
	}
	public String getNome(){
		return this.nomeDaEmpresa;
	}
	
	
	//set para mudar o nome da empresa com void
	public void setFuncionario(Funcionario empregado){
		this.trabalhadorDaEmpresa = empregado;
	}
	public Funcionario getTrabalhadorDaEmpresa(){
		return this.trabalhadorDaEmpresa;
	}
	
	
	
}
