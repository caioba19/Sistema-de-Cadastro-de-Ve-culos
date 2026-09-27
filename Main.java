public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setMarca("Toyota");
        veiculo1.setModelo("Corolla");
        veiculo1.setAno(2022);
        veiculo1.setQuilometragem(15000);
        veiculo1.setDisponivel(true);

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setMarca("Fiat");
        veiculo2.setModelo("Argo");
        veiculo2.setAno(2020);
        veiculo2.setQuilometragem(32000);
        veiculo2.setDisponivel(false);

        System.out.println("--- Veículo 1 ---");
        veiculo1.exibirDados();
        veiculo1.realizarLocacao();
        veiculo1.exibirDados();

        System.out.println("\n--- Veículo 2 ---");
        veiculo2.exibirDados();
        veiculo2.realizarLocacao();

        System.out.println("\nDevolvendo veículo 2...");
        veiculo2.devolverVeiculo();
        veiculo2.exibirDados();
    }
}
