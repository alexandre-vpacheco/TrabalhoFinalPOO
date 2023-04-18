package pessoa;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private int senha;
	private Cargo tipo;

	public Pessoa(String nome, String cpf, int senha, Cargo tipo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.tipo = tipo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public Cargo getTipo() {
		return tipo;
	}

	public void setTipo(Cargo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + "]";
	}
}
