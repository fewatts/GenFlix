package conta.model;

public class ProducaoAudioVisual {
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

	public ProducaoAudioVisual() {}

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
		System.out.println("***********************");
		System.out.println("                       ");
		System.out.println("     DADOS DO FILME    ");
		System.out.println("                       ");
		System.out.println("***********************");
		System.out.println("Título: " + this.titulo);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Status: " + this.status);
		System.out.println("Classificação: " + this.classificacao);
	}
	
}
