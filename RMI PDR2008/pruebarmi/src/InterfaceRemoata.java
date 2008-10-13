/**
 * 
 */

import java.rmi.Remote;

/**
 * @author neburs
 *
 */
public interface InterfaceRemoata extends Remote {
	
	public int suma(int a,int b) throws java.rmi.RemoteException;

}
