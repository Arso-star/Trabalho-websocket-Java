import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcEspecialista extends Remote {
    public double Porcentagem(int a, int b) throws RemoteException;
    public double Potencia(int a, int b) throws RemoteException;
    public double RaizQuadrada(int a, int b) throws RemoteException;
}
