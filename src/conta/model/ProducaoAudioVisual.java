package conta.model;

import conta.util.Cores;

public abstract class ProducaoAudioVisual {
	private String titulo;
	private String genero;
	private int classificacao;
	private int duracao;
	public ProducaoAudioVisual(String titulo, String genero, int classificacao, int duracao) {
		this.titulo = titulo;
		this.genero = genero;
		this.classificacao = classificacao;
		this.duracao = duracao;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public int getClassificacao() {
		return classificacao;
	}



	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}



	public int getDuracao() {
		return duracao;
	}



	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}



	public void visualizar() {
		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                        Dados do(s) filme(s)                       ");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("Título: " + this.titulo);
		System.out.println("Gênero: " + this.genero);
		switch (this.classificacao) {
			case 0 -> System.out.println("Classificação: ☆☆☆☆☆");
			case 1 -> System.out.println("Classificação: ★☆☆☆☆");
			case 2 -> System.out.println("Classificação: ★★☆☆☆");
			case 3 -> System.out.println("Classificação: ★★★☆☆");
			case 4 -> System.out.println("Classificação: ★★★★☆");
			case 5 -> System.out.println("Classificação: ★★★★★");
	
		}
		System.out.println("Duração do filme [Minutos]: " + this.duracao);
	}

}
