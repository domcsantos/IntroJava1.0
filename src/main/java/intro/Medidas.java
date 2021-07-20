// 1 - Pacote
package intro;

// 2 - Referência às bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracterísricas

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        // Condicional = verificar uma condição - Faz uma pergunta à uma pessoa, um hardware ou software

        // Ultilizar o Class Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo CUrto");
        System.out.println("d - Contar Ate Dez");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem regressiva de 10 a 0");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        //switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do softaware

        //String opcao = "curto";

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar o método ContagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
                calcularAreaModoExtenso();
                break;


        }

    }
    public static void ifSimples(){
        // Condicional = verificar uma condição - Faz uma pergunta à uma pessoa, um hardware ou software

        // if = se
        // else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }

        else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto(){

        System.out.println("Cálculo de Areas Modo Curto");

        // Cálculo da área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + largura * comprimento + "m2");
    }

    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de Areas Modo Extenso");

        // Cálculo da área - Exemplo: o tamanho do tapete ou do piso
        int  largura;
        int comprimento;
        int resultado;

        largura = 4; // Largura recebe 4
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + resultado + "m2");
    }

 public static void contarAteDez(){

        // Loops ou repetições
        // for = repetições incondicionais 
     System.out.println("Contagem Crescente");

     for(int numero = 1; numero <= 10; numero++){
         System.out.println(numero);

     }
}

 public static void contagemRegressiva(){
     System.out.println("Contagem Regressiva");

     for(int numero = 10; numero > -1; numero--){
         System.out.println(numero);
     }
 }
}


