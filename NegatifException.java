package exeption;

public class NegatifException extends Exception {
	 NegatifException(String msg)
	{
		super("impossible de noter des nombres negatifs ! ");
	}
	

}
