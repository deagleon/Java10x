import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> listaNinjas = new LinkedList<>();
        listaNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaNinjas.add(new Ninja("Temari", 18, "Areia"));

        Scanner scan = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.println("------Programa Ninja------");
            System.out.println("1 - Adicionar ninja");
            System.out.println("2 - Listar ninjas");
            System.out.println("3 - Remover ninja");
            System.out.println("4 - Buscar ninja");
            System.out.println("5 - Ordenar lista");
            System.out.println("6 - Buscar ninja por nome");
            System.out.println("7 - Encerrar programa");
            System.out.println("--------------------------");
            System.out.print("Digite a opção desejada: ");
            int opcao = scan.nextInt();
            scan.nextLine();
            Scanner input = new Scanner(System.in);
            switch (opcao) {
                case 1:
                    System.out.println("------Adicionando Ninja------");
                    System.out.print("Digite o nome: ");
                    String nome = input.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite a aldeia: ");
                    String aldeia = input.nextLine();
                    System.out.println("--------------------------");
                    listaNinjas.addFirst(new Ninja(nome, idade, aldeia));
                    break;
                case 2:
                    System.out.println("------Listagem de ninjas------");
                    listarNinjas(listaNinjas);
                   break;
                case 3:
                    System.out.println("------Remoção de ninja------");
                    Ninja removido = listaNinjas.removeFirst();
                    System.out.println(removido.nome() + " removido com sucesso!");
                    break;

                case 4:
                    System.out.println("------Buscar ninja------");
                    System.out.print("Digite a posição do ninja: ");
                    int index = input.nextInt();
                    input.nextLine();
                    System.out.println("O ninja na posição " + index + " é: " + listaNinjas.get(index).nome());
                    System.out.println("--------------------------");
                    break;
                case 5:
                    System.out.println("------Ordenar lista ninja------");
                    System.out.print("Digite como deseja ordernar (nome, idade ou vila): ");
                    ordenarLista(listaNinjas, scan.nextLine());
                    System.out.println("------Lista após a ordenação------");
                    listarNinjas(listaNinjas);
                    break;
                case 6:
                    System.out.println("------Buscar ninja por nome------");
                    System.out.print("Digite o nome: ");
                    String nomeInput = scan.nextLine();
                    for(Ninja ninja : listaNinjas){
                        if (Objects.equals(ninja.nome().toLowerCase(), nomeInput.toLowerCase() )){
                            System.out.println("------Informações do ninja------");
                            System.out.println(ninja);
                            break;
                        }
                    }
                    break;

                case 7:
                    stop = true;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void ordenarLista(List<Ninja> lista,String por){
        switch (por.toLowerCase(Locale.ROOT)){
            case "nome":
                Comparator<Ninja> compararPorNome = Comparator.comparing(Ninja::nome);
                lista.sort(compararPorNome);
                break;
            case "idade":
                Comparator<Ninja> compararPorIdade = Comparator.comparing(Ninja::idade);
                lista.sort(compararPorIdade);
                break;
            case "vila":
                Comparator<Ninja> compararPorAldeia = Comparator.comparing(Ninja::vila);
                lista.sort(compararPorAldeia);
                break;
            default:
                System.out.println("Opção inválida!\n Opções válidas: 'Nome', 'Idade' e 'Vila'");
        }
    }

    public static void listarNinjas(List<Ninja> lista){
        for (Ninja ninja : lista) {
            System.out.println(ninja);
        }
        System.out.println("Total de ninjas: " + lista.size());
        System.out.println("--------------------------");
    }


}
