import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("José");
        Cliente cliente2 = new Cliente("Chico");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.depositar(100);
        cc.transferir(50, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Banco banco = new Banco();

        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        banco.setContas(contas);

        banco.mostrarClientes();
    }
}