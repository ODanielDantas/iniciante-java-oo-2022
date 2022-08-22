
public class Mentor extends Integrantes {

	private String solucaoDuvidaTecnica;
	private String desafio;
	private String evento;
	private int inicio;
	private int fim;

	public void setDesafio(String desafio, int inicio, int fim) {
		this.desafio = desafio;
		this.inicio = inicio;
		this.fim = fim;
	}
	public String getDesafio() {
		return desafio;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}


	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public String getSolucaoDuvidaTecnica() {
		return solucaoDuvidaTecnica;
	}

	public void setSolucaoDuvidaTecnica(String solucaoDuvidaTecnica) {
		this.solucaoDuvidaTecnica = solucaoDuvidaTecnica;
	}

	public Mentor(String nome, String discord) {
		super(nome, discord);
	}

}
