import java.util.Scanner;
public class helloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        boolean maiorIdade = verificaIdade(idade);
        printMensagem(maiorIdade, idade);
        scanner.close();
    }
    public static void printMensagem(boolean SoN, int idade ){
        if(SoN){
            System.out.println("Voce é maior de idade, está é sua idade " + idade);
        }
        System.out.println("Voce ainda e menor de idade. Idade: " + idade);
    }
    public static boolean verificaIdade(int idade){
        return idade >= 18;
    }
    
}