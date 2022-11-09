import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorBasico {
    public static void main (String[] args){
        //Cria e instala o security manager
        //System.setSecurityManager(new RMISecurityManager() );
        try{
            //Cria Calc_Impl
            Registry registry = LocateRegistry.createRegistry(50996);
            CalcBasic_Impl obj = new CalcBasic_Impl();
            registry.rebind("ServidorBasico", obj);
            System.out.println("O servidor básico está pronto");
        }catch (Exception e){
            System.out.println("ServidorBasico erro" + e.getMessage());
        }
    }
}
