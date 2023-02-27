package conta.model;

import conta.util.Cores;

public abstract class ProducaoAudioVisual {
	private String titulo;
	private String genero;
	private int duracao;
	private int status;
	private int classificacao;

	public ProducaoAudioVisual(String titulo, String genero, int duracao, int status, int classificacao) {

		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;
		this.status = status;
		this.classificacao = classificacao;
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

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public void visualizar() {
		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                        Dados do(s) filme(s)                       ");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("Título: " + this.titulo);
		System.out.println("Gênero: " + this.genero);
		switch (this.status) {
		case 1 -> System.out.println("Status: Não assistido");
		case 2 -> System.out.println("Status: Assistido");
		}
		switch (this.classificacao) {
		case 0 -> {
			System.out.println("Classificação: ☆☆☆☆☆");
		}
		case 1 -> {
			System.out.println("Classificação: ★☆☆☆☆");
		}
		case 2 -> {
			System.out.println("Classificação: ★★☆☆☆");
		}
		case 3 -> {
			System.out.println("Classificação: ★★★☆☆");
		}
		case 4 -> {
			System.out.println("Classificação: ★★★★☆");
		}
		case 5 -> {
			System.out.println("Classificação: ★★★★★");
		}

		}

	}

}
