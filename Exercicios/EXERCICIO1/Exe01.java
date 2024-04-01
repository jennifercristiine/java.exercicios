public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        float resultado = 0;

        switch (opcao) {
            case 1:
                resultado = Calculadora.adicionar(num1, num2);
                break;
            case 2:
                resultado = Calculadora.subtrair(num1, num2);
                break;
            case 3:
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case 4:
                resultado = Calculadora.dividir(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
