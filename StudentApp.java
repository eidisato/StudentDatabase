package escolaDatabase;

import java.util.Scanner;

public class StudentApp 
{

	public static void main(String[] args) 
	{
		
		// Pergunte quantos alunos matricular
		System.out.println("Digite o n�mero de novos alunos a se matricular: ");
		Scanner in = new Scanner(System.in);
		int numdealuno = in.nextInt();
		Student[] alunos = new Student[numdealuno];
		
		// Crie n n�mero n de alunos
		for (int n = 0; n < numdealuno; n++) 
		{
			alunos[n] = new Student();
			alunos[n].matricula();
			alunos[n].mensalidade();
		}
		
		// Imprime as informa��es dos alunos
		for (int n = 0; n < numdealuno; n++) 
		{
			System.out.println(alunos[n].toString());
		}
		
	}

}