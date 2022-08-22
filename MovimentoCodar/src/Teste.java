
public class Teste {

	public static void main(String[] args) {

		Aprendiz a[] = new Aprendiz[2];
		a[0] = new Aprendiz("Aprendiz1", "OAprendiz1");
		a[1] = new Aprendiz("Aprendiz2", "OAprendiz2");

		Cursos c[] = new Cursos[3];
		c[0] = new Cursos("Alura Midi", "Front-end");
		c[1] = new Cursos("Barbearia Alura", "Front-end");
		c[2] = new Cursos("Byte-bank", "Back-end");

		Visualizacao v[] = new Visualizacao[5];
		v[0] = new Visualizacao(c[0], a[0]); // Aprendiz1 realizando o curso Alura Midi
		v[1] = new Visualizacao(c[1], a[0]); // Aprendiz1 realizando o curso Barbearia Alura
		v[2] = new Visualizacao(c[2], a[0]); // Aprendiz1 realizando o curso Byte-bank
		v[3] = new Visualizacao(c[0], a[1]); // Aprendiz2 realizando o curso Alura Mid
		v[4] = new Visualizacao(c[1], a[1]); // Aprendiz2 realizando o curso Barbearia Alura

		System.out.println("Aprendiz " + a[0].getNome() + " encerrou o curso de " + c[0].getTitulo() + " na área de "
				+ c[0].getArea());

		System.out.println("Total de cursos Aprendiz 1: " + a[0].getTotalCursos() + ", experiência = "
				+ a[0].getExperiencia() + " \nTotal de cursos Aprendiz 2: " + a[1].getTotalCursos() + ", experiência = "
				+ a[1].getExperiencia());

		Mentor m = new Mentor("Mentor1", "OMentor1");
		Mentor m2 = new Mentor("Mentor2", "OMentor2");

		a[0].setDuvidaTecnica("Como faço para herdar caracteristicas de outra classe? "); // Aprendiz1 externando sua
																							// dúvida técnica que será
																							// respondida por um mentor;
		m.setSolucaoDuvidaTecnica(
				"Basta utilizar 'implements' para vincular a classe que voce deseja extrair características"
						+ " de uma super classe "); // solução do Mentor1 à duvida

		System.out.println(a[0].getDuvidaTecnica());
		System.out.println(m.getSolucaoDuvidaTecnica());

		m.setEvento("Explicação Desafio"); // Mentor1 cria evento
		a[0].participaEvento("Explicação desafio"); // Aprendiz1 participa de evento, contando +1 no total de eventos
													// participados.
		a[1].participaEvento("Explicação desafio"); 

		System.out.println(a[0].getTotalEventos()); // 1

		m2.setEvento("Solução de dúvidas Orientação objeto"); // Mentor2 cria evento
		a[0].participaEvento("Solução de dúvidas Orientação objeto"); // Aprendiz2 participa de evento, e soma mais 1 no
																		// Total de Eventos.

		Organizador o = new Organizador("Organizador1", "Organizador1");

		a[1].setDuvidaProcessos("Como faço para logar na plataforma 'Alura' ? "); // Aprendiz2 externando uma dúvida
																					// processual
		o.setSolucaoDuvidasProcessos("Você receberá um e-mail com o seu respectivo 'login' e 'senha'. "); // Organizador
																											// solucionando
																											// a
																											// respectiva
																											// dúvida.
		
		m2.setDesafio("Página em html/css/JavaScript", 2, 3); //Mentor2 cria desafio
		a[1].setParticipaDesafio("Página em html/css/JavaScript"); //Aprendiz2 participa, aumentando sua experiência.
		
		System.out.println("A experiencia atual do Aprendiz 2 é : " + a[1].getExperiencia());
		
		
		

	}
}