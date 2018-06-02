package exemplopraticoguanabara;

import java.util.Scanner;

public class ExemploPraticoGuanabara {
    public static void main(String[] args) {
        Banco conta1 = new Banco();
        Banco conta2 = new Banco();
        
        Scanner entrada = new Scanner(System.in);
        
        String criar = "";
        String conta = "";
        String Nome = "";
        float valor = 0f;
        int numconta = 0;
        
        System.out.printf("Tipo de conta(cp / cc): ");
        conta = entrada.next();
        conta1.CriandoConta(conta);
        
        System.out.printf("Numero da conta: ");
        numconta = entrada.nextInt();
        conta1.setConta(numconta);
        
        System.out.printf("Nome do dono: ");
        Nome = entrada.next();
        conta1.setDono(Nome);
        
        System.out.printf("Depositar na conta: ");
        valor = entrada.nextFloat();
        conta1.Deposito(valor);
        
        System.out.printf("Sacar: ");
        valor = entrada.nextFloat();
        conta1.SacarConta(valor);
        conta1.status();
        
        System.out.printf("Tipo de conta(cp / cc): ");
        conta = entrada.next();
        conta2.CriandoConta(conta);
        
        System.out.printf("Numero da conta: ");
        numconta = entrada.nextInt();
        conta2.setConta(numconta);
        
        System.out.printf("Nome do dono: ");
        Nome = entrada.next();
        conta2.setDono(Nome);
        
        System.out.printf("Depositar na conta: ");
        valor = entrada.nextFloat();
        conta2.Deposito(valor);
        
        System.out.printf("Sacar: ");
        valor = entrada.nextFloat();
        conta2.SacarConta(valor);
        
        conta2.status();
    }   
}
