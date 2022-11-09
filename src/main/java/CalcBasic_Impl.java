import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcBasic_Impl extends UnicastRemoteObject implements CalcBasico {
    public CalcBasic_Impl() throws RemoteException{
        super();
    }

    @Override
    public int Soma(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int Subtracao(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int Multiplicacao(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int Divisao(int a, int b) throws RemoteException {
        return a / b;
    }
}
