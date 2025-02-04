import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinjaAvancado Naruto = new NinjaAvancado("Naruto", 18, TipoHabilidade.NINJUTSU, "Ar");
        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke", 23, TipoHabilidade.RINNEGAN, "Fogo");
        Sasuke.mostrarInformacoes();
        Sasuke.executarHabilidade();
    }
}
