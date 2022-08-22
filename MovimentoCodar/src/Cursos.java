
public class Cursos implements Alura {
	
	public String titulo;
	public String area;
	
	public Cursos(String titulo, String area) {
		this.titulo = titulo;
		this.area = area;
	}

	@Override
	public void iniciado() {

	}
	@Override
	public void encerrado() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	

}
