import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public void criarConta(String numero, String titular) {
        if (!contas.containsKey(numero)) {
            Conta novaConta = new Conta(numero, titular);
            contas.put(numero, novaConta);
        } else {
            System.out.println("Conta com esse número já existe.");
        }
    }

    public Conta buscarConta(String numero) {
        return contas.get(numero);
    }

    public void depositar(String numero, double valor) {
        Conta conta = buscarConta(numero);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void sacar(String numero, double valor) {
        Conta conta = buscarConta(numero);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void consultarSaldo(String numero) {
        Conta conta = buscarConta(numero);
        if (conta != null) {
            System.out.println("Saldo da conta " + numero + ": " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
