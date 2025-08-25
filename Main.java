//import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         String nome = "Matteus Gordin";
//         Integer idade = 25;
//         Integer num1 = 10;
//         Integer num2 = 5;
//         System.out.println("Meu nome é " + nome);
//         System.out.println("Tenho " + idade + " anos");
//         System.out.println("A soma de " + num1 + " + " + num2 + " é " + (num1 + num2));
//         //Scanner scanner = new Scanner(System.in);
//     }
// }





//import java.util.Scanner; // Importa a classe Scanner para ler entrada do console

// public class Main {
//     public static void main(String[] args) {

//         System.out.println("Digite o seu nome: "); // Saída Padrão. Imprime no console
        
//         String user; // Local para armarzenar texto (String)
//         Scanner reader = new Scanner(System.in); // Entrada Padrão. Lê do console (Criação do objeto para ler do console)
//         user = reader.nextLine(); // Entrada Padrão (Lê uma linha do console. Captura o que foi digitado pelo usuário no console)

//         System.out.println("Olá " + user + "! Seja bem vindo(a)!"); // Saída Padrão. Imprime no console
//         reader.close(); // Fecha o leitor (Scanner)
//     }
// }





// Exercício: Desenvolva um programa que solicite ao usuário que insira os seguintes dados:
// Nome (String)
// Idade (int)
// Sexo (char)
// Profissão (String)
// Salário (double)
// Após a entrada dos dados, o programa deve exibir uma mensagem formatada com todas as informações fornecidas pelo usuário.


// import java.util.Scanner; // Importa a classe Scanner para ler entrada do console

// public class Main {
//      public static void main(String[] args) {

//         //Criação das variáveis
//         String nome;
//         int idade;
//         char sexo;
//         String profissao;
//         double salario;

//         // Solicitação e leitura dos dados do usuário (Entrada)
//         Scanner reader = new Scanner(System.in);
//         System.out.println("Digite os seus dados.");

//         // Solicitação e leitura do nome
//         System.out.print("Nome: ");
//         nome = reader.nextLine();

//         // Solicitação e leitura da idade
//         System.out.print("Idade: ");
//         reader = new Scanner (System.in); // reinicializando o objeto scanner
//         idade = reader.nextInt();

//         // Solicitação e leitura do sexo
//         System.out.print("Sexo (M/F): ");
//         reader = new Scanner (System.in); // reinicializando o objeto scanner
//         sexo = reader.next().charAt(0); // Lê o próximo token e pega

//         // Solicitação e leitura da profissão
//         System.out.print("Profissão: ");
//         reader = new Scanner (System.in); // reinicializando o objeto scanner
//         profissao = reader.nextLine();

//         // Solicitação e leitura do salário
//         System.out.print("Salário: ");
//         reader = new Scanner (System.in); // reinicializando o objeto scanner
//         salario = reader.nextDouble();

//         // Exibição dos dados formatados (Saída)
//         System.out.println("\nOlá "+nome+"! Segue abaixo os seus dados:");
//         System.out.println("Idade: "+idade+" anos");
//         System.out.println("Sexo: "+sexo);
//         System.out.println("Profissão: "+profissao);
//         System.out.println("Salário: R$ "+salario);
//     }
// }





// Exercício: Desenvolva um algoritmo que receba como entrada 4 notas de um aluno e exiba a média final.


// import java.util.Scanner; // Importa a classe Scanner para ler entrada do console

// public class Main {
//      public static void main(String[] args) {
        
//         //Declaração das variáveis
//         double nota1;
//         double nota2;
//         double nota3;
//         double nota4;
//         double media;

//         // Solicitação e leitura das notas do aluno (Entrada)
//         Scanner reader = new Scanner(System.in);
//         System.out.print("Digite a nota 01: ");
//         nota1 = reader.nextDouble();

//         System.out.print("Digite a nota 02: ");
//         nota2 = reader.nextDouble();

//         System.out.print("Digite a nota 03: ");
//         nota3 = reader.nextDouble();

//         System.out.print("Digite a nota 04: ");
//         nota4 = reader.nextDouble();
       
//         // Cálculo da média
//         media = (nota1 + nota2 + nota3 + nota4) / 4;

//         // Exibição da média final (Saída)
//         System.out.println("\nA média final do aluno é: " + media);
//      }
// }





/** Exercício: Desenvolva um algoritmo que receba como entrada:
1 - Valor de um produto
2 - Valor de desconto (em %)
O algoritmo deve calcular e exibir o valor final do produto já com o desconto aplicado. 
*/


// import java.util.Scanner; // Importa a classe Scanner para ler entrada do console

// public class Main {
//      public static void main(String[] args) {

//         //Declaração das variáveis
//         double valorProduto;
//         double valorDesconto;
//         double valorFinal;

//         // Solicitação e leitura do valor do produto (Entrada)
//         Scanner reader = new Scanner(System.in);
//         System.out.print("Digite o valor do produto: R$ ");
//         valorProduto = reader.nextDouble();

//         // Solicitação e leitura do valor do desconto (Entrada)
//         System.out.print("Digite o valor do desconto (%): ");
//         valorDesconto = reader.nextDouble();

//         // Cálculo do valor final com desconto
//         valorFinal = valorProduto - (valorProduto*(valorDesconto/100));

//         // Exibição do valor final com desconto (Saída)
//         System.out.println("\nValor final do produto com desconto: R$ "+valorFinal);
//      }
// }





/** Faça um programa que calcule a aprovação ou reprovação de um aluno baseado na média de suas notas.
 * O programa deve receber como entrada:
 * - Nota da primeira prova (peso de 30%)
 * - Nota da segunda prova (peso de 50%)
 * - Nota do trabalho (peso de 20%)
 * Com base nas entradas, o programa deve calcular a média ponderada do aluno e deve exibir como saída:
 * - A mensagem: "APROVADO" se a média for maior ou igual a 7.0
 * - A mensagem: "REPROVADO" se a média for menor que 7.0
*/


// import java.util.Scanner; // Importa a classe Scanner para ler entrada do console

// public class Main {
//      public static void main(String[] args) {

//         // Declaração das variáveis
//         double nota1;
//         double nota2;
//         double notaTrabalho;
//         double media;

//         // Solicitação e leitura das notas do aluno (Entrada)
//         Scanner reader = new Scanner(System.in);
//         System.out.print("Digite a nota da primeira prova: ");
//         nota1 = reader.nextDouble();

//         System.out.print("Digite a nota da segunda prova: ");
//         nota2 = reader.nextDouble();

//         System.out.print("Digite a nota do trabalho: ");
//         notaTrabalho = reader.nextDouble();

//         // Cálculo da média ponderada
//         media = (nota1*0.3) + (nota2*0.5) + (notaTrabalho*0.2);

//         // Exibição do resultado (Saída)
//         System.out.println("\nMédia final: "+media);
//         if (media >= 7.0){
//             System.out.println("APROVADO!");
//         }else{
//             System.out.println("REPROVADO!");
//         }
//      }
// }
