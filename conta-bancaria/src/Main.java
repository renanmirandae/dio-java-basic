import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        ContaTerminal novaContaBancaria = new ContaTerminal();

        System.out.println("Seja Bem-vindo. Por favor digite seus dados para criar uma conta em nosso banco");

        try {
            novaContaBancaria.criarConta();
            System.out.println(novaContaBancaria.mensagemContaCriadaSucesso());

        }catch(Exception e) {
            System.out.println(novaContaBancaria.mensagemFalhaCriarConta());
            novaContaBancaria.criarConta();
            System.out.println(novaContaBancaria.mensagemContaCriadaSucesso());
        }
    }
}