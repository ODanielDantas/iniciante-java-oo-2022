
public class Organizador extends Integrantes {
	
	private int eventos;
	private String solucaoDuvidaProcessos;

	public Organizador(String nome, String discord) {
		super(nome, discord);
	}

	public int getEventos() {
		return eventos;
	}

	public void setEventos(int eventos) {
		this.eventos = eventos;
	}

	public String getSolucaoDuvidaProcessos() {
		return solucaoDuvidaProcessos;
	}

	public void setSolucaoDuvidasProcessos(String solucaoDuvidaProcessos) {
		this.solucaoDuvidaProcessos = solucaoDuvidaProcessos;
	}
	
	

}
