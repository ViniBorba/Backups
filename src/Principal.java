
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*Empresa*/		
		//Array das empresas
		Empresa[] empresas = new Empresa[3];
		
		//objetos empresas
		Empresa google = new Empresa();
		Empresa facebook = new Empresa();
		Empresa microsoft = new Empresa();
		
		//setado as empresas no array
		empresas[0] = google;
		empresas[1] = facebook;
		empresas[2] = microsoft;
		
		//Setando o nome das empresas
		empresas[0].setNome("Goole");
		empresas[1].setNome("Facebook");
		empresas[2].setNome("Microsoft");
/*Empresa*/	
		
/*Funcionario*/
		//Array para receber os objetos funcionarios
		Funcionario[] arrayDeFuncionario = new Funcionario[10];
		
		//Criando os objetos funcionarios
		Funcionario funcionarioUm = new Funcionario("Um", "TI", 100.0);
		Funcionario funcionarioDois = new Funcionario("Dois");
		Funcionario funcionarioTres = new Funcionario("Tres", "RH", 200.0);
		Funcionario funcionarioQuatro = new Funcionario("Quatro", "TI", 50.0);
		Funcionario funcionarioCinco = new Funcionario("Cinco");
		Funcionario funcionarioSeis = new Funcionario("Seis", "TI", 100.0);
		Funcionario funcionarioSete = new Funcionario("Sete", "TI", 100.0);
		Funcionario funcionarioOito = new Funcionario("Oito", "TI", 100.0);
		Funcionario funcionarioNove = new Funcionario("Nove", "TI", 100.0);
		Funcionario funcionarioDez = new Funcionario("Dez", "TI", 100.0);
		
		
		//Seta funcionarios no array de funcionarios
		arrayDeFuncionario[0] = funcionarioUm;
		arrayDeFuncionario[1] = funcionarioDois;
		arrayDeFuncionario[2] = funcionarioTres;
		arrayDeFuncionario[3] = funcionarioQuatro;
		arrayDeFuncionario[4] = funcionarioCinco;
		arrayDeFuncionario[5] = funcionarioSeis;
		arrayDeFuncionario[6] = funcionarioSete;
		arrayDeFuncionario[7] = funcionarioOito;
		arrayDeFuncionario[5] = funcionarioNove;
		arrayDeFuncionario[9] = funcionarioDez;
		
		
		
		google.setFuncionario(funcionarioUm);
		google.setFuncionario(funcionarioDois);
		
		System.out.println(google.mostraNomeDoFuncionario());
		
	}
	
	

}
