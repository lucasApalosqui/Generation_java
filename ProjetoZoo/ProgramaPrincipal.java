package ProjetoZoo;

import java.util.Scanner;

import ProjetoZoo.Sub_Classes.Insetos.Cerambicideo_gigante;
import ProjetoZoo.Sub_Classes.Insetos.Opiliao;
import ProjetoZoo.Sub_Classes.Mamiferos.TamanduaBandeira;
import ProjetoZoo.Sub_Classes.Mamiferos.TatuCanastra;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		String entrada;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome de um Animal: ");
		entrada = in.next();
	
		////////////////////////////////////////////////
		
		//MAMIFEROS

		//TAMANDUA
		
		TamanduaBandeira tb = new TamanduaBandeira();
		
		tb.setNome("Tamanduá-Bandeira");
		tb.setExpcVida(12);
		tb.setHabitat("terrestre");
		tb.setExtincao(true);
		tb.setPesoMax(43);
		tb.setTamanhoMax(110);
		tb.setComida("Formiga");
		
		
		//TATU
		
		TatuCanastra tc = new TatuCanastra();
		
		tc.setNome("Tatu-Canastra");
		tc.setExpcVida(15);
		tc.setHabitat("terrestre");
		tc.setExtincao(true);
		tc.setPesoMax(33);
		tc.setTamanhoMax(100);
		tc.setComida("Aranhas e escorpiões");
		
		//////////////////////////////////////////////
		
		if(entrada.equalsIgnoreCase("tamandua")) {
			System.out.println("Nome: " + tb.getNome() + " | Tamanho: " + tb.getTamanhoMax() +
			"\nExpc. Vida: " + tb.getExpcVida() + " | Peso Max: " + tb.getNome() + 
			"\nAmeaçado de Ex: " + tb.isExtincao() + " | Habitat: " + tb.getHabitat() + " | Comida: " +
			tb.getComida());
		} else if (entrada.equalsIgnoreCase("tatu")) {
			System.out.println("Nome: " + tc.getNome() + " | Tamanho: " + tc.getTamanhoMax() +
			"\nExpc. Vida: " + tc.getExpcVida() + " | Peso Max: " + tc.getNome() + 
			"\nAmeaçado de Ex: " + tc.isExtincao() + " | Habitat: " + tc.getHabitat() + " | Comida: " +
			tc.getComida());
		}
		
		////////////////////////////////////////////
		in.close();
		
		////////////////////////////////////////////
		//INSETOS
		
		//ADICIONANDO ANIMAL 1
		Cerambicideo_gigante cg = new Cerambicideo_gigante();
		cg.setNome("Cerambicideo");
		cg.setExpcVida(150);
		cg.setHabitat("Terrestre");
		cg.setExtincao(false);
		cg.setPesoMax(300);
		cg.setTamanhoMax(20);
		cg.setVenenoso(false);
		cg.setComida("Madeira em decomposição");
		
		//MOSTRANDO INFORMAÇÕES SOBRE O ANIMAL 1
		System.out.println("Nome: " + cg.getNome() + " | Tamanho: " + cg.getTamanhoMax() +
				"\nExpc. Vida: " + cg.getExpcVida() + " | Peso Max: " + cg.getNome() + 
				"\nAmeaçado de Ex: " + cg.isExtincao() + " | Habitat: " + cg.getHabitat() + " | Comida: " +
				cg.getComida()+"\n");
		
		//GERANDO AÇÕES DO ANIMAL 1
		cg.som();
		cg.alimentar();
		cg.dieta("madeira");
		System.out.println("\n");
		
		//ADICIONANDO ANIMAL 2
				Opiliao op = new Opiliao();
				op.setNome("Opilião");
				op.setExpcVida(76);
				op.setHabitat("Terrestre");
				op.setExtincao(true);
				op.setPesoMax(0);
				op.setTamanhoMax(5);
				op.setVenenoso(false);
				op.setComida("Pequenos invertebrados");
				
				//MOSTRANDO INFORMAÇÕES SOBRE O ANIMAL 1
				System.out.println("Nome: " + op.getNome() + " | Tamanho: " + op.getTamanhoMax() +
						"\nExpc. Vida: " + op.getExpcVida() + " | Peso Max: " + op.getNome() + 
						"\nAmeaçado de Ex: " + op.isExtincao() + " | Habitat: " + op.getHabitat() + " | Comida: " +
						op.getComida()+"\n");
				
				//GERANDO AÇÕES DO ANIMAL 1
				op.som();
				op.alimentar();
				op.dieta("Invertebrados", "ovinhos");
				System.out.println("\n");
		
	}

}
