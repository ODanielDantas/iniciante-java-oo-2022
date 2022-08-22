
public class Teste {
	
	public static void main(String [] args) {
		
		Aprendiz a[] = new Aprendiz[4];
		a[0] = new Aprendiz()
		
		Mentor mentor = new Mentor();
		mentor.setNome("Daniel");
		mentor.setFuncao("Desenvolvedor back-end");
		
		Organizador organizador = new Organizador();
		organizador.setNome("Francisco");
		organizador.setFuncao("Desenvolvedor Front-end");
		
		System.out.println("Funcionario " + organizador.getNome() + " na área de: " + organizador.getFuncao());
		System.out.println("Funcionario " + mentor.getNome() + " na área de: " + mentor.getFuncao());
	}

}
