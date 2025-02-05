public class Main {
    public static void main(String[] args) {

        ContaCorrente naruto = new ContaCorrente(1000);
        ContaPoupanca sasuke = new ContaPoupanca(1000);

        naruto.depositar(150);
        sasuke.depositar(150);

        System.out.println("sasuke = " + sasuke.consultarSaldo());
        System.out.println("naruto = " + naruto.consultarSaldo());
        naruto.transferencia(500, sasuke);
        System.out.println("-----Depois da transferencia-----");
        System.out.println("sasuke = " + sasuke.consultarSaldo());
        System.out.println("naruto = " + naruto.consultarSaldo());

    }
}

