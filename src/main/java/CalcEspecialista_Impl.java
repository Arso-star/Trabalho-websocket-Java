import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcEspecialista_Impl extends UnicastRemoteObject implements CalcEspecialista {
    public CalcEspecialista_Impl() throws RemoteException{
        super();
    }

    @Override
    public double Porcentagem(int a, int b) throws RemoteException {
        return (double) (a * b)/100;
    }

    @Override
    public double Potencia(int a, int b) throws RemoteException {
        return Math.pow(a, b);
    }

    @Override
    public double RaizQuadrada(int a, int b) throws RemoteException {
        return Math.pow(a, b);
    }
}
