package br.com.ufc.es.poo.model;
import br.com.ufc.es.poo.exec.*;
import java.util.Scanner;


public class Tamagoshi {
	private int energia;
	private int saciedade;
	private int limpeza;
	private int diamantes;
	private int idade;
	
	
	public Tamagoshi(int energia, int saciedade, int limpeza) {
		this.energia = energia;
		this.saciedade = saciedade;
		this.limpeza = limpeza;
		this.diamantes = 0;
		this.idade = 0;	
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getSaciedade() {
		return saciedade;
	}

	public void setSaciedade(int saciedade) {
		this.saciedade = saciedade;
	}

	public int getLimpeza() {
		return limpeza;
	}

	public void setLimpeza(int limpeza) {
		this.limpeza = limpeza;
	}
	
	public int getDiamantes() {
		return diamantes;
	}
	
	public void setDiamantes(int diamantes) {
		this.diamantes = diamantes;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	
	public void verificaAtributos(Tamagoshi tamagoshi) {
		if(tamagoshi.getEnergia() > 21) {
			tamagoshi.setEnergia(20);
		}else if(tamagoshi.getSaciedade() > 10) {
			tamagoshi.setSaciedade(10);
		}else if(tamagoshi.getLimpeza() > 15) {
			tamagoshi.setLimpeza(15);
		}
	}
	
		public void jogando(Tamagoshi tamagoshi) {
			tamagoshi.setEnergia(tamagoshi.getEnergia() - 2);
			tamagoshi.setSaciedade(tamagoshi.getSaciedade() -1);
			tamagoshi.setLimpeza(tamagoshi.getLimpeza() - 3);
			tamagoshi.setDiamantes(tamagoshi.getDiamantes() + 1);
			tamagoshi.setIdade(tamagoshi.getIdade() +1);
				tamagoshi.verificaAtributos(tamagoshi);
					System.out.println("Os atributos do seu tamagoshi são:" +tamagoshi.getEnergia()+ ", saciedade " +tamagoshi.getSaciedade()+
							", nível de limpeza"+tamagoshi.getLimpeza() +", os diamantes conquistados: " +tamagoshi.getDiamantes()+ ", e a idade:" +tamagoshi.getIdade());
		}
		
		public void comendo(Tamagoshi tamagoshi) {
			tamagoshi.setEnergia(tamagoshi.getEnergia() -1 );
			tamagoshi.setSaciedade(tamagoshi.getSaciedade() + 4);
			tamagoshi.setLimpeza(tamagoshi.getLimpeza() -2 );
			tamagoshi.setDiamantes(tamagoshi.getDiamantes() + 1 );
				tamagoshi.verificaAtributos(tamagoshi);	
					System.out.println("Os atributos do seu tamagoshi são: Energia: " +tamagoshi.getEnergia()+ ",saciedade: " 
					+tamagoshi.getSaciedade()+ ", nível de limpeza " +tamagoshi.getLimpeza()+ ", diamantes conquistados" +tamagoshi.getDiamantes());
		}
		
		public void dormindo(Tamagoshi tamagoshi) {
			tamagoshi.setEnergia(20);
				tamagoshi.verificaAtributos(tamagoshi);
					System.out.println("A energia do seu pet:" +tamagoshi.getEnergia()+ ", os outros atributos continuaram os mesmos");
		}
		
		public void limparTamagoshi(Tamagoshi tamagoshi) {
			tamagoshi.setEnergia(tamagoshi.getEnergia() - 3);
			tamagoshi.setSaciedade(tamagoshi.getSaciedade() - 1);
			tamagoshi.setLimpeza(15);
			tamagoshi.setIdade(tamagoshi.getIdade() + 2);
				tamagoshi.verificaAtributos(tamagoshi);
					System.out.println("Os atributos do seu pet são: Energia:" + tamagoshi.getEnergia()+ ", saciedade "  +tamagoshi.getSaciedade()+ ", nível de limpeza" +tamagoshi.getLimpeza()+ ", e a sua idade: " +tamagoshi.getIdade());
		}

		@Override
		public String toString() {
			return "Tamagoshi [energia=" + energia + ", saciedade=" + saciedade + ", limpeza=" + limpeza
					+ ", diamantes=" + diamantes + ", idade=" + idade + "]";
		}
		


}
