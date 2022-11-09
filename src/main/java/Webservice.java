import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import static spark.Spark.*;

public class Webservice {
    public static void main (String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        exception(Exception.class, (e, req, res) -> e.printStackTrace());
        port(8000);
        String addressServidorBasico = "rmi://localhost:50996";
        CalcBasico basico = (CalcBasico)Naming.lookup(addressServidorBasico + "/CalcBasico");
        String addressServidorEspecialista = "rmi://localhost:50997";
        CalcEspecialista especialista = (CalcEspecialista)Naming.lookup(addressServidorEspecialista + "/CalcEspecialista");

        post("/soma", (req, res) -> {
            try{
                int numero1 = Integer.parseInt(req.queryParams("numero1"));
                int numero2 = Integer.parseInt(req.queryParams("numero2"));
                return basico.Soma(numero1, numero2);
            }catch (Exception e){
                return "Valores inválidos: Digite os números (número 1 e número 2)!";
            }
        });

        post("/subtracao", (req, res) -> {
            try{
                int numero1 = Integer.parseInt(req.queryParams("numero1"));
                int numero2 = Integer.parseInt(req.queryParams("numero2"));
                return basico.Subtracao(numero1, numero2);
            }catch (Exception e){
                return "Valores inválidos: Digite os números (número 1 e número 2)!";
            }
        });

        post("/multiplicacao", (req, res) -> {
            try{
                int numero1 = Integer.parseInt(req.queryParams("numero1"));
                int numero2 = Integer.parseInt(req.queryParams("numero2"));
                return basico.Multiplicacao(numero1, numero2);
            }catch (Exception e){
                return "Valores inválidos: Digite os números (número 1 e número 2)!";
            }
        });

        post("/divisao", (req, res) -> {
            try{
                int numero1 = Integer.parseInt(req.queryParams("numero1"));
                int numero2 = Integer.parseInt(req.queryParams("numero2"));
                return basico.Divisao(numero1, numero2);
            }catch (Exception e){
                return "Valores inválidos: Digite os números (número 1 e número 2)!";
            }
        });

        post("/porcentagem", (req, res) -> {
            try{
                int numero1 = Integer.parseInt(req.queryParams("numero1"));
                int numero2 = Integer.parseInt(req.queryParams("numero2"));
                return especialista.Porcentagem(numero1, numero2);
            }catch (Exception e){
                return "Valores inválidos: Digite os números (número 1 e número 2)!";
            }
        });

        post("/raizquadrada", (req, res) -> {
            try{
                int numero1 = Integer.parseInt(req.queryParams("numero1"));
                int numero2 = Integer.parseInt(req.queryParams("numero2"));
                return especialista.RaizQuadrada(numero1, numero2);
            }catch (Exception e){
                return "Valores inválidos: Digite os números (número 1 e número 2)!";
            }
        });

        post("/potencia", (req, res) -> {
            try{
                int numero1 = Integer.parseInt(req.queryParams("numero1"));
                int numero2 = Integer.parseInt(req.queryParams("numero2"));
                return especialista.Potencia(numero1, numero2);
            }catch (Exception e){
                return "Valores inválidos: Digite os números (número 1 e número 2)!";
            }
        });
    }
}
