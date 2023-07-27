public class Main {
    public static void main(String[] args) {
        ContaBancaria conta001 = new ContaBancaria("Alice");

        System.out.printf("Bem vindo %s a sua conta bancária! \n\n", conta001.getNomeCompleto());

        System.out.printf("Dados da conta:\n Nome: %s \n Saldo: %f",
                conta001.getNomeCompleto(), conta001.getSaldo());
    }
}