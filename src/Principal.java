import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String testa;
		
		Scanner nai = new Scanner(System.in);
		
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
		Funcionario funcionarioCinco = new Funcionario("Cinco", "Fora",100.0);
		Funcionario funcionarioSeis = new Funcionario("Seis", "TI", 100.0);
		Funcionario funcionarioSete = new Funcionario("Sete", "TI", 100.0);
		Funcionario funcionarioOito = new Funcionario("Oito", "TI", 100.0);
		Funcionario funcionarioNove = new Funcionario("Nove");
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
		arrayDeFuncionario[8] = funcionarioNove;
		arrayDeFuncionario[9] = funcionarioDez;
		
		
		funcionarioUm.setpegaEmpresaondeTrabalha(microsoft);
		funcionarioDois.setpegaEmpresaondeTrabalha(facebook);
		funcionarioTres.setpegaEmpresaondeTrabalha(google);
		funcionarioQuatro.setpegaEmpresaondeTrabalha(microsoft);
		funcionarioCinco.setpegaEmpresaondeTrabalha(facebook);
		funcionarioSeis.setpegaEmpresaondeTrabalha(google);
		funcionarioSete.setpegaEmpresaondeTrabalha(google);
		funcionarioOito.setpegaEmpresaondeTrabalha(microsoft);
		funcionarioNove.setpegaEmpresaondeTrabalha(facebook);
		funcionarioDez.setpegaEmpresaondeTrabalha(google);
		

		System.out.println("Coloca numro: ");
		testa = nai.next();
		
		System.out.println(testa);
		
		
		//percore o array com o length, sem precisar informar o tamanho do array
		for(int aux = 0; aux < arrayDeFuncionario.length; aux ++){
			
			System.out.println(arrayDeFuncionario[aux].getNome()+" " +arrayDeFuncionario[aux].getNomeDaEmpresa());
			
		}
		
		
		
		System.out.println(testa);
		
		
	}
	
	

}
