public class TesteContaEmBanco {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente("Daniel");
        Cliente c2 = new Cliente("Pedro");
        Conta conta1 = new Conta(c1);
        Conta conta2 = new Conta(c2);

        conta1.depositar(5000);

        conta1.transferir(400, conta2);

        conta1.imprimirInfosComuns();
        conta2.imprimirInfosComuns();

    }
}
