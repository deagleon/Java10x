public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("-----Informações do ninja-----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Habilidade:" + this.habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("-----Habilidade-----");
        System.out.println("Executando: " + this.habilidade);
    }
}