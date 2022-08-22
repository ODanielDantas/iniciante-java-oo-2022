
public abstract class Integrantes {
	
	protected String nome;
	protected String discord;
	
	public Integrantes(String nome, String discord) {
		this.nome = nome;
		this.discord = discord;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiscord() {
		return discord;
	}
	public void setDiscord(String discord) {
		this.discord = discord;
	}
	
	

}
