
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;
	
	void imprimir() {
		System.out.println("Nome        : "+nome);
		System.out.println("Cargo       : "+cargo);
		System.out.println("Salario R$  : "+salario);
	}
	
	void aumentarSalario (double percentual) {
		salario = salario * (1+(percentual /100));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
