package org.java.escola.mano;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static Scanner leia = new Scanner(System.in);
	static TreeSet<Alunos> alunos;
	
	public static void main(String[] args) {
		alunos = new TreeSet<Alunos>();
			menu();
	}

	private static void menu() {
	    
	    while (true) {
	        System.out.println("Olá professor!\n\n 1 - Adicionar aluno\n 2 - Listar Alunos\n 3 - Achar Aluno\n 4 - Adicionar Nota ao aluno\n 0 - Sair");
	        int opcao = leia.nextInt();
	        
	        switch (opcao) {
            case 0:
                System.out.println("Encerrando o programa. Até logo!");
                System.exit(opcao);
                break;
                
	            case 1:
	                adicionar();
	                break;
	            case 2:
	            	listar();
	            	break;
	            case 3:
	            	achar();
	            	break;
	            case 4:
	            	addNota();
	            	break;

	            default:
	                System.out.println("Opção inválida. Tente novamente.");
	        }
	    }
	}


	private static void addNota() {
		if (!alunos.isEmpty()) {
		    System.out.println("Matrícula do Aluno:");
		    	int matricula = leia.nextInt();

		    for (Alunos a : alunos) {
		        if (a.getMatricula() == matricula) {
		            double[] notas = new double[2]; 
		            
		            for (int i = 0; i < 2; i++) {
		                System.out.println("Nota " + (i + 1) + " do aluno:");
		                	notas[i] = leia.nextDouble();
		            }
		            
		            a.setNotas(notas); 
		            	System.out.println("Notas adicionadas com sucesso!");
		            		break;
		        }
		    }
		} else {
		    System.out.println("Não há alunos registrados");
		}
		menu();

	}

	private static void achar() {
		if(!alunos.isEmpty()) {
			System.out.println("Matrícula do Aluno:");
			int matricula = leia.nextInt();
				for(Alunos a : alunos) {
					if(a.getMatricula() == matricula) {
						System.out.println(a);
						break;
					} 
			}
		}
		menu();
	}

	private static void listar() {
		if(!alunos.isEmpty()) {
			for(Alunos a : alunos) {
				System.out.println(a);
			}
		} else {
			System.out.println("Não há alunos registrados");
		}
	menu();
	}

	private static void adicionar() {
			System.out.println("Nome do Aluno:");
				leia.nextLine();
					String nome = leia.nextLine();
			System.out.println("Matrícula: ");
					int matricula = leia.nextInt();
					
						boolean matriculaEmUso = false;

					for (Alunos a : alunos) {
					    if (a.getMatricula() == matricula) {
					        System.out.println("Essa matrícula já está em uso!");
					        	matriculaEmUso = true;
					        		break;
					    }
					}

					if (!matriculaEmUso) {
					    	Alunos aluno = new Alunos(nome, null, matricula);
					    		alunos.add(aluno);
					}

					menu();

				    }

		}


