package escolaDatabase;

import java.util.Scanner;


public class Student 
{

	private String nome;
	private String sobrenome; 
	private String alunoid;
	private int ano;
	private String cursos = null;
	private int balanco = 0;
	private static int custo = 600;
	private static int id = 1000;
	
	// Construtor: solicita que o usuário insira o nome e o ano
	public Student() 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Entre com o nome do aluno: ");
		this.nome = in.nextLine();
		
		System.out.print("Entre com o sobrenome do aluno: ");
		this.sobrenome = in.nextLine();
		
		System.out.print("1 - Calouro\n2 - Segundo ano\n3 - Terceiro ano\n4 - Formando\nEntre com o ano do aluno: ");
		this.ano = in.nextInt();
		
		setStudentId();
	}
	
	// Gerar ID do aluno
	private void setStudentId() 
	{
		// incrementa o id toda vez que um novo aluno é criado
		id++;
		
		// ano + id
		this.alunoid = ano + "" + id;
	}
	
	// Inscreva-se no curso
	public void matricula() 
	{
		// entra no loop interno, até que o usuário digite Q
		do 
		{
			System.out.print("Entre no curso para se inscrever (Q para sair):");
			System.out.print("\nCursos disponiveis História 101, Matemática 101, Inglês 101, Química 101, Ciência da Computação 101:");
			System.out.print("\nO custo de cada curso é de 600 reais");
			Scanner in = new Scanner(System.in);
			String curso = in.nextLine();
			if (!curso.equals("Q")) {
				cursos += "\n " + curso;
				balanco = balanco + custo;
			} else 
			{
				break;
				}
		} while (1 != 0 );
	}
	
	// Ver balanco
	public void verBalanco() 
	{
		System.out.println("Seu balanço é de: R$" + balanco);
	}
	
	// Pague a mensalidade
	public void mensalidade() 
	{
		verBalanco();
		System.out.print("Insira o valor do seu pagamento:: R$");
		Scanner in = new Scanner(System.in);
		int pagamento = in.nextInt();
		balanco -= pagamento;
		System.out.println("Obrigado pelo seu pagamento de: " + pagamento);
		verBalanco();
	}
	

	// Mostrar status
	public String toString() 
	{
		return "Nome: " + nome + " " + sobrenome + 
				"\nAno do curso: " + ano +
				"\nID do aluno: " + alunoid + 
				"\nCursos matriculados: " + cursos + 
				"\nBalanço: R$" + balanco;
	}
}