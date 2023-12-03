import java.util.Locale;
import java.util.Scanner;

/**
 * @author Renan Miranda
 * @since 03/12/2023
 * @version 1.0
 * */

public class ContaTerminal {
    /**
     * @param numeroConta Armazena o numero da conta do usuario
     * @param agencia Armazena o numero da agencia
     * @param nomeCliente Armazena o nome do cliente
     * @param saldo Armazena o saldo da conta de cada usuario
     * */
    int numeroConta;
    String agencia, nomeCliente;
    double saldo;

    public ContaTerminal()
    {
    }

    /**
     * @return Cria uma conta bancaria para um novo usuario
     * */
    public void criarConta()
    {
        //String agencia, int numeroConta, String nomeCliente, double saldo
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da agencia: ");
        String numeroAgencia = scanner.next();
        setAgencia(numeroAgencia);

        System.out.println("Digite o numero da conta:");
        int numeroConta = scanner.nextInt();
        setNumeroConta(numeroConta);

        System.out.println("Digite seu nome (Apenas o primeiro nome): ");
        String nomeCliente = scanner.next();
        setNomeCliente(nomeCliente);

        System.out.println("Digite o valor do deposito de abertura da conta: (Apenas numeros)");
        double saldo = scanner.nextDouble();
        setSaldo(saldo);
    }

    public String mensagemContaCriadaSucesso()
    {
        return "Olá " + getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                getAgencia() + " conta " + getNumeroConta() +  " e seu saldo de R$" +
                getSaldo() + " já está disponível para saque.";
    }
    public String mensagemFalhaCriarConta()
    {
        return "Erro ao criar a conta, verifique os dados digitados e tente novamente";
    }


    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    private void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    private void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
