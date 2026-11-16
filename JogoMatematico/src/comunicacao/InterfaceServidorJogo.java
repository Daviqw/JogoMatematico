package comunicacao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import modelo.EstadoPartida;
import modelo.Jogador;

public interface InterfaceServidorJogo extends Remote {

    String entrarNaPartida(
        Jogador jogador,
        InterfaceClienteJogo cliente
    ) throws RemoteException;

    void enviarResposta(
        String identificadorJogador,
        int resposta
    ) throws RemoteException;

    EstadoPartida consultarEstado(
        String identificadorJogador
    ) throws RemoteException;

    void sairDaPartida(
        String identificadorJogador
    ) throws RemoteException;
}