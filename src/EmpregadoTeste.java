
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado emp1;
		emp1 = new Empregado();
		
		emp1.setNome("Marcia");
		emp1.setCargo("Programadora");
		emp1.setSalario(1200.0);
		
		emp1.imprimir();
		
		emp1.aumentarSalario(25);
		
		emp1.imprimir();
	}

}
