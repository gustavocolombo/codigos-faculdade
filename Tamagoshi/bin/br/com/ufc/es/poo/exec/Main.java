package br.com.ufc.es.poo.exec;
import java.util.Scanner; 
import br.com.ufc.es.poo.model.*;


public class Main {
	
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);		
		
		boolean parar = false ;
		int opcaoMenu;
		int energia = 20, saciedade = 10, limpeza  =15;
		int acaoTamagoshi;
		Tamagoshi tamagoshi = null;
			while(parar != true) {
				System.out.println("Olá! Quer brincar de tamagoshi?");
				System.out.println("Sim - 1");
				System.out.println("Não - 2");
					opcaoMenu = ler.nextInt();
					
					switch(opcaoMenu) {
					case 1 :
						if(opcaoMenu == 1) {
							 tamagoshi = new Tamagoshi(energia,  saciedade,  limpeza);
							System.out.println("Seu tamagoshi foi criado!");
							break;
						}
					break;
					
					case 2:
						System.out.println("Desculpe, volte outra hora então");
						parar = true;
						break;
					}
					
					while(parar != true) {
						if(opcaoMenu == 1) {
							System.out.println("Digite sua opção a seguir para escolher uma ação do Tamagoshi");
							System.out.println("Comer  -> 1");
							System.out.println("Jogar  -> 2");
							System.out.println("Dormir  -> 3");
							System.out.println("Limpar  -> 4");
							System.out.println("Parar de jogar -> 5");
							acaoTamagoshi = ler.nextInt();
							
							switch(acaoTamagoshi) {
								case 1:
									tamagoshi.comendo(tamagoshi);
									break;
								case 2:
									tamagoshi.jogando(tamagoshi);
									break;
								case 3: 
									tamagoshi.dormindo(tamagoshi);
									break;
								case 4: 
									tamagoshi.limparTamagoshi(tamagoshi);
									break;
								case 5:
									parar = true;
									break;
								default :
									tamagoshi.toString();
							}
							if(tamagoshi.getEnergia() <= 0) {
								System.out.println("Seu tamagoshi morreu!Pelo menos um dos atributos passou ou cheogu a zero, recomeçe o jogo");
								parar = true;
								break;
							}else if(tamagoshi.getSaciedade() <= 0) {
								System.out.println("Seu tamagoshi morreu!Pelo menos um dos atributos passou ou cheogu a zero, recomeçe o jogo");
								parar = true;
								break;
							}else if(tamagoshi.getLimpeza() <= 0) {
								System.out.println("Seu tamagoshi morreu!Pelo menos um dos atributos passou ou cheogu a zero, recomeçe o jogo");
								parar = true;
								break;
		
							}
						}
					}
		
				
		}
	}
}
