import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
        ArrayList<EquipamentoLeve> equipamento = new ArrayList<EquipamentoLeve>();
        boolean parar = true;
        while (parar) {
           
            System.out.println("---ACADEMIA TAURUS---");
            System.out.println("1 - Cadastrar\n2 - Listar\n3 - Consultar\n4 - Atualizar\n5 - Remover\n6 - Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    EquipamentoLeve barra = new EquipamentoLeve();
                    System.out.println("Nome do equipamento: ");
                    barra.setNome(scanner.next());
                    System.out.println("Código do equipamento: ");
                    barra.setCodigo(scanner.nextInt());
                    System.out.println("Modelo do equipamento: ");
                    barra.setModelo(scanner.next());
                    System.out.println("Quantidade desse equipamentos: ");
                    barra.setQuantidades(scanner.nextInt());
                    System.out.println("Preço do equipamento: ");
                    barra.setPreco(scanner.nextDouble());
                    System.out.println("Categoria do equipamento: ");
                    barra.setCategoria(scanner.next());
                    equipamento.add(barra);

                    break;
                case 2:
                    for (int i = 0; i < equipamento.size(); i++) {
                        System.out.println("\nControle de Compras de Equipamentos");
                        System.out.println("Nome do equipamento: " + equipamento.get(i).getNome() + "\nCódigo do equipamento: " + equipamento.get(i).getCodigo() + "\nModelo do equipamento: " + equipamento.get(i).getModelo() + "\nQuantidade desse equipamentos: " + equipamento.get(i).getQuantidades() + "\nPreço do equipamento: " + equipamento.get(i).getPreco() + "\nCategoria do equipamento: " + equipamento.get(i).getCategoria() + "\nÍndice: " + i);
                    
 
                    }
                    break;

                case 3:
                    System.out.println("Digite o código do item que você deseja consultar: ");    
                    int verificarCodigo = scanner.nextInt();
                    for (EquipamentoLeve p : equipamento)
                        if (p.getCodigo() == verificarCodigo) {
                            System.out.println("Item selecionado: ");
                            System.out.println("Nome do equipamento: " + p.getNome());
                            System.out.println("Código do equipamento: " + p.getCodigo());
                            System.out.println("Modelo do equipamento: " + p.getModelo());
                            System.out.println("Quantidade desse equipamento: " + p.getQuantidades());
                            System.out.println("Preço do equipamento: " + p.getPreco());
                            System.out.println("Categoria do equipamento: " + p.getCategoria());
                        } else {
                            System.out.println("Este item não está no estoque!");
                        }
                    break;

                case 4:
                    System.out.println("Digite o código do item a ser alterado: ");
                    int editarItem = scanner.nextInt();
                    for (EquipamentoLeve i : equipamento) {
                        if (editarItem == i.getCodigo()) {
                            editarItem = i.getCodigo();
                            System.out.println("Nome do equipamento: ");
                            i.setNome(scanner.next());
                            System.out.println("Código do equipamento: ");
                            i.setCodigo(scanner.nextInt());
                            System.out.println("Modelo do equipamento: ");
                            i.setModelo(scanner.next());
                            System.out.println("Quantidade desse equipamentos: ");
                            i.setQuantidades(scanner.nextInt());
                            System.out.println("Preço do equipamento: ");
                            i.setPreco(scanner.nextDouble());
                            System.out.println("Categoria do equipamento: ");
                            i.setCategoria(scanner.next());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Digite o código do item a ser excluído: ");
                    int deletarItem = scanner.nextInt();

                    for(int i = 0; i < equipamento.size(); i++){
                        if (deletarItem == equipamento.get(i).getCodigo()) {
                            equipamento.remove(i);
                        }
                    }
                    break;

                case 6:
                    parar = false;

                    break;

                default:
                    System.out.println("Comando não identificado.");
                    break;
            }
        }
        } catch (InputMismatchException ex) {
          System.out.println("Bugou animal");
        }
    }
}