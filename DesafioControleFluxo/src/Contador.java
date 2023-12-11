import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int primeiroNumero = 0, segundoNumero = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            try
            {
                System.out.println("Digite o primeiro numero");
                primeiroNumero = scanner.nextInt();

                System.out.println("Digite o segundo numero");
                segundoNumero = scanner.nextInt();
            }catch (InputMismatchException e)
            {
                System.out.println("O número digitado nao é valido");
            }
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.primeiroNumeroMaiorQueOSegundo());
        }
    }
    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException
    {
        if(primeiroNumero > segundoNumero) throw new ParametrosInvalidosException();

        int contagem =  segundoNumero - primeiroNumero;

        for(int i = 1; i <= contagem; i++)
        {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
