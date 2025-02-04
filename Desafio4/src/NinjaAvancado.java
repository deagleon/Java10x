public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade especial: " + this.especialidade);
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
        System.out.println("Executando habilidade especial: " + this.habilidade);
    }
}
