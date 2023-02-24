package conta.model;

public class ProducaoAudioVisual {
	private String titulo;
	private String genero;
	private int status;
	private int classificacao;
	
	public ProducaoAudioVisual(String titulo, String genero, int status, int classificacao) {
		
		this.titulo = titulo;
		this.genero = genero;
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

	public String getDuracao() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
