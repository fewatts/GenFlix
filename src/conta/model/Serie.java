package conta.model;

public class Serie extends ProducaoAudioVisual {
	private int numTemporadas;
	private int numEpisodios;
	private int episodiosAssistidos;
	
	public Serie(String titulo, String genero, int status, int classificacao, 
			int numTemporadas, int numEpisodios,int episodiosAssistidos) {
		super(titulo, genero, status, classificacao);
		this.numTemporadas = numTemporadas;
		this.numEpisodios = numEpisodios;
		this.episodiosAssistidos = episodiosAssistidos;
	}

	public Serie() {}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public int getNumEpisodios() {
		return numEpisodios;
	}

	public void setNumEpisodios(int numEpisodios) {
		this.numEpisodios = numEpisodios;
	}

	public int getEpisodiosAssistidos() {
		return episodiosAssistidos;
	}

	public void setEpisodiosAssistidos(int episodiosAssistidos) {
		this.episodiosAssistidos = episodiosAssistidos;
	}
}
