package exception;

public class CpfInvalidoException extends Exception{
	public CpfInvalidoException(){
		super("Cpf inv�lido");
	}
	
	public CpfInvalidoException(String messagem){
		super(messagem);
	}
}
