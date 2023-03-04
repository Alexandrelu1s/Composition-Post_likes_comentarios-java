package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicacao {
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Publicacao(String titulo, String conteudo) {
		this.titulo = titulo;
		this.conteudo = conteudo;
		likes = 0;
		momento = new Date();
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	public Integer getLikes() {
		return likes;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public Date getMomento() {
		return momento;
	}


	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void addComentario(Comentario texto) {
		comentarios.add(texto);
	}
	
	public void removeComentario(Comentario texto) {
		comentarios.remove(texto);
	}
	
	public void addLikes() {
		likes++;
	}
	
	public void removeLikes() {
		likes--;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(conteudo + "\n");
		sb.append(likes + " likes\n");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Comentarios: \n");
		for(Comentario c : comentarios) {
			sb.append(c.getText() + " " + sdf.format(new Date()) + "\n" );
		}
		return sb.toString();
	}
}