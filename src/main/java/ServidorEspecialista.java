import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorEspecialista {
    public static void main (String[] args){
        //Cria e instala o security manager
        //System.setSecurityManager(new RMISecurityManager() );
        try{
            //Cria Calc_Impl
            Registry registry = LocateRegistry.createRegistry(50997);
            CalcEspecialista_Impl obj = new CalcEspecialista_Impl();
            registry.rebind("ServidorEspecialista", obj);

            System.out.println("O servidor especialista está pronto");
        }catch (Exception e){
            System.out.println("ServidorEspecialista erro" + e.getMessage());
        }
    }
}
