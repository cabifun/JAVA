import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static String LerString(){
        String valor = leitor.nextLine();
        return valor;
    }
    public static int LerInt(){
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }
    public static float LerFloat(){
        float valor = leitor.nextFloat();
        leitor.nextLine();
        return valor;
    }
    public static double LerDouble(){
        double valor = leitor.nextDouble();
        leitor.nextLine();
        return valor;
    }
    }




