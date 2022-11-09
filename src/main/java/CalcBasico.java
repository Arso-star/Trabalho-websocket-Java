import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcBasico extends Remote {
    int Soma(int a, int b) throws RemoteException;
    int Subtracao(int a, int b) throws RemoteException;
    int Multiplicacao(int a, int b) throws RemoteException;
    int Divisao(int a, int b) throws RemoteException;
}
