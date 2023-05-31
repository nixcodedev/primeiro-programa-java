package cursojava.interfaces;


/*Esta interface será o nosso contrato de autenticação*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
	
}
