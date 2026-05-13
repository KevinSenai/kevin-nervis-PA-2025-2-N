import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<ContaBancaria> listaBancaria;

    public Banco(){
        listaBancaria = new ArrayList<>();
    }

    public void addConta(ContaBancaria c){
        listaBancaria.add(c);
    }

    public ContaBancaria sacar(String titulo, int saque){
        for( ContaBancaria c : listaBancaria) {
            if (c.getNomeTitular().equals(titulo)) {
                if (saque <= 0) {
                    throw new IllegalArgumentException("Saque negativo");
                } else if (saque > c.getSaldo()) {
                    throw new IllegalArgumentException("Saque exede o saldo");
                }
                if (c.getSaldo() >= saque) {
                    double novoSaldo = c.getSaldo() - saque;
                    c.setSaldo(novoSaldo);
                    return c;
                }
            }
            throw new IllegalAccessError("Conta Invalida!");
        }
        return null;
    }

    public ContaBancaria depositar(String titulo, int deposito){
        for (ContaBancaria c : listaBancaria){
            if (c.getNomeTitular().equals(titulo)){
                double novoSaldo = c.getSaldo() + deposito;
                c.setSaldo(novoSaldo);
                return c;
            }else {
                throw new IllegalAccessError("Conta Invalida!");
            }
        }
        return null;
    }

    public ContaBancaria trasferir(String nomeOrigem, double valor, String nomeDestino){
        ContaBancaria contaOrigem = null;
        ContaBancaria contaDestino = null;
        for (ContaBancaria c : listaBancaria){
            if (c.getNomeTitular().equals(nomeOrigem)){ contaOrigem = c;}
            if (c.getNomeTitular().equals(nomeDestino)){contaDestino = c;}
        }
        if (contaOrigem == null || contaDestino == null){
            throw new IllegalAccessError("Erro: Uma ou ambas contas nao foram encontaradas.");
        }
        if (contaOrigem.getSaldo() < valor){
            throw new IllegalAccessError("Erro: Saldo menor que valor de trasferencia");
        }
        contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);

        return null;
    }

    public ContaBancaria simulador(String Conta, double valor, int tempoInvestido){
        for( ContaBancaria c : listaBancaria){
            if (c.getNomeTitular().equals(Conta)){
                if (c.getSaldo() == valor){
                    double investidosaldo = (c.getSaldo()*(1+0.01)*(tempoInvestido));
                    c.setSaldo(investidosaldo);
                    return c;
                }
            }else{
                throw new IllegalAccessError("Conta Invalido!");
            }
        }
        return null;
    }

    public ContaBancaria Relatorio(){
       List<ContaBancaria> historicoAlterados = new ArrayList<>();

       return null;
    }
}
