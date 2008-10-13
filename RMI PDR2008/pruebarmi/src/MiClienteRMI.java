
public class MiClienteRMI {

	private MiClienteRMI(){
		
	};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	   try
	   {
		 String strConect =   "//" +args[0] + ":" + args[1] + "/PruebaRMI";
	     InterfaceRemoata mir = (InterfaceRemoata)java.rmi.Naming.lookup(strConect);
	 
	     int temp = 0;
	     for (int i=1;i<=20;i++)
	     {
	    	  temp = mir.suma(i, temp); 
	     }
	       
	   }
	   catch (Exception e)
	   {
	     e.printStackTrace();
	   }


	}

}
