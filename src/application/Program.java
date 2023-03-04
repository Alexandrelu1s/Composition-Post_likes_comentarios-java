package application;

import java.util.Scanner;

import entities.Comentario;
import entities.Publicacao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Titulo do post: ");
		String titulo = sc.nextLine();

		System.out.print("Conteudo do post: ");
		String conteudo = sc.nextLine();

		Publicacao post = new Publicacao(titulo, conteudo);

		System.out.println();

		System.out.print("Deseja curtir o post? ");
		String continuar = sc.nextLine().toUpperCase();
		while (continuar.equals("SIM")) {
			post.addLikes();
			System.out.print("Deseja curtir o post? ");
			continuar = sc.nextLine().toUpperCase();
		}

		System.out.println();

		System.out.print("Deseja comentar o post? ");
		continuar = sc.nextLine().toUpperCase();
		while (continuar.equals("SIM")) {
			System.out.print("Comentario: ");
			String comentario = sc.nextLine();
			post.addComentario(new Comentario(comentario));
			System.out.print("Deseja comentar o post? ");
			continuar = sc.nextLine().toUpperCase();
		}
		System.out.println(post);

		sc.close();
	}
}
