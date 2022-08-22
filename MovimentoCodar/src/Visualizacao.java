
public class Visualizacao {
	
	private Cursos conteudo;
	private Aprendiz espectador;
	
	public Visualizacao(Cursos conteudo, Aprendiz espectador) {
		this.conteudo = conteudo;
		this.espectador = espectador;
		this.espectador.setTotalCursos(this.espectador.getTotalCursos() + 1);
		this.espectador.setExperiencia(this.espectador.getExperiencia() + 25);
	}

	public Cursos getConteudo() {
		return conteudo;
	}

	public void setConteudo(Cursos conteudo) {
		this.conteudo = conteudo;
	}

	public Aprendiz getEspectador() {
		return espectador;
	}

	public void setEspectador(Aprendiz espectador) {
		this.espectador = espectador;
	}
	
	
	

}
