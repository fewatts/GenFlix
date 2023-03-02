package conta.model;

import conta.util.Cores;

public abstract class ProducaoAudioVisual {
	private String titulo;
	private String genero;
	private int classificacao;
	private int duracao_h;
	private int duracao_m;
	public ProducaoAudioVisual(String titulo, String genero, int classificacao, int duracao_h, int duracao_m) {
		this.titulo = titulo;
		this.genero = genero;
		this.classificacao = classificacao;
		this.duracao_h = duracao_h;
		this.duracao_m = duracao_m;
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
	public int getDuracao_h() {
		return duracao_h;
	}
	public void setDuracao_h(int duracao_h) {
		this.duracao_h = duracao_h;
	}
	public int getDuracao_m() {
		return duracao_m;
	}
	public void setDuracao_m(int duracao_m) {
		this.duracao_m = duracao_m;
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
		System.out.println("Duração: " + this.duracao_h + " h " + this.duracao_m + " min ");
	}
	
}
