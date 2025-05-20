//intreface podem conter métodos concretos.

//A intenção basica é prover implementação padrão para métodos, de modo a evitar
//1)repetição de implementação em toda classe que implemente a interface
//2)a necessidade de se criar classes abstratas para prover reuso da implementção

//Outras vantagens:
//manter a retrocompatibilidade com sistemas existentes
//permitir que "interfaces funcionais"(que devem conter apenas um métodos
//possam prover outras oeprações padrão reutilizaveis

//e se existir uma taxa de juros de outro pais? USA


import service.BrazilInterestService;
import service.InterestService;
import service.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + "months: ");
        System.out.println(String.format("%.2f", payment));

//Sim: agora interfaces podem prover reuso
        //podemos aproveitar implementações que estão na propria interface
//Sim: agora temos uma forma de herança múltipla
        //mas o commpilador reclama se houver mais de um métodos
        //com a mesma assinatura, obrigando a seobrescreve-lo
//Interfaces ainda são bem diferentes de classes abstratas. Interfaces não
//possuem recursos tais como construtores e atributos.

    }
}

