/**
 * 
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author neburs
 *
 */
public class ObjetoRemoto extends UnicastRemoteObject implements
		InterfaceRemoata {
	
	public ObjetoRemoto() throws RemoteException{
		
	}

	/* (non-Javadoc)
	 * @see pruebarmi.InterfaceRemoata#suma(int, int)
	 */
	public int suma(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("sumando "+ a + "+" + b + "...");
		return a + b;
	}
	
	public static void main(String[] args)
	 {
	   try
	   {
		   ObjetoRemoto mir = new ObjetoRemoto();
	     java.rmi.Naming.rebind("//" + java.net.InetAddress.getLocalHost().getHostAddress() +
	                             ":" + args[0] + "/PruebaRMI", mir);
	   }
	   catch (Exception e)
	   {
	   }
	 }


}
