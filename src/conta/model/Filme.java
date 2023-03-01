package conta.model;

public class Filme extends ProducaoAudioVisual {
	private int status;

	public Filme(String titulo, String genero, int classificacao, int duracao, int status) {
		super(titulo, genero, classificacao, duracao);
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public void visualizar(){
		super.visualizar();
		switch(status){
			case 1 -> System.out.println("Status: Não assistido.");
			case 2 -> System.out.println("Status: Assistido.");
		}

	}
	
}
