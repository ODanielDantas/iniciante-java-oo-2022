
public class Aprendiz extends Integrantes {

	private String duvidaTecnica;
	private String duvidaProcessos;
	private String participaEvento;
	private String participaDesafio;
	private String tituloEvento;
	private String tituloDesafio;
	private int totalEventos;
	private int experiencia;
	private int totalCursos;

	public Aprendiz(String nome, String discord) {
		super(nome, discord);
		this.totalCursos = 0;
		this.experiencia = 0;
		this.totalEventos = 0;
	}
	
	public String getParticipaEvento() {
		return participaEvento;
	}

	public void setParticipaEvento(String participaEvento) {
		this.participaEvento = participaEvento;
	}

	public String getParticipaDesafio() {
		return participaDesafio;
	}

	public void setParticipaDesafio(String participaDesafio) {
		this.participaDesafio = participaDesafio;
		setExperiencia(getExperiencia() + 100);
	}

	public String getTituloEvento() {
		return tituloEvento;
	}

	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}

	public String getTituloDesafio() {
		return tituloDesafio;
	}

	public void setTituloDesafio(String tituloDesafio) {
		this.tituloDesafio = tituloDesafio;
	}
	
	public void participaEvento(String titulo) { 
		this.tituloEvento = titulo;
		setTotalEventos(getTotalEventos() + 1);
		setExperiencia(getExperiencia() +50);
	}
	
	public int getTotalEventos() {
		return totalEventos;
	}

	public void setTotalEventos(int totalEventos) {
		this.totalEventos = totalEventos;
	}

	public String getDuvidaTecnica() {
		return duvidaTecnica;
	}

	public void setDuvidaTecnica(String duvidaTecnica) {
		this.duvidaTecnica = duvidaTecnica;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getTotalCursos() {
		return totalCursos;
	}

	public void setTotalCursos(int totalCursos) {
		this.totalCursos = totalCursos;
	}

	public String getDuvidaProcessos() {
		return duvidaProcessos;
	}

	public void setDuvidaProcessos(String duvidaProcessos) {
		this.duvidaProcessos = duvidaProcessos;
	}
}
