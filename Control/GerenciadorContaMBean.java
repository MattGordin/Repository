package Control;

import Entidade.ContaBancaria;

public class GerenciadorContaMBean {
    
    public boolean abrirConta(String numeroConta, String agencia, String titular, Double saldo, String tipoConta, String dataAbertura) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(numeroConta);
        conta.setAgencia(agencia);
        conta.setTitular(titular);
        conta.setSaldo(saldo);
        conta.setTipoConta(tipoConta);
        conta.setDataAbertura(dataAbertura);

        return true;
    }

    public boolean fecharConta() {
        return true;
    }
    public double consultarSaldo() {
        return 0.0;
    }
    public boolean sacar(ContaBancaria conta, double valorSaque) {
        double novoSaldo = conta.getSaldo() - valorSaque;
        conta.setSaldo(novoSaldo);
        return true;
    }
    public boolean depositar(ContaBancaria conta, double valorDeposito) {
        if (valorDeposito > 0) {
            double novoSaldo = conta.getSaldo() + valorDeposito;
            conta.setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    public double calcularImposto(ContaBancaria conta) {
        double saldo = conta.getSaldo();
        double imposto = saldo * 0.01;
        return imposto;
    }
}
