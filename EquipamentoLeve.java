public class EquipamentoLeve extends Equipamento implements GerenciarEquipamentos {
    
    @Override
    public int calcularQuantidades(int quantidades){
        return getQuantidades();
    }
    @Override
    public String especificarOTipoDoEquipamento(String modelo){
        return getModelo();
    }
    public EquipamentoLeve(){}
    public EquipamentoLeve(String nome, int codigo, String modelo, int quantidade, double preco, String categoria){
        setNome(getNome());
        setCodigo(getCodigo());
        setModelo(getModelo());
        setQuantidades(getQuantidades());
        setPreco(getPreco());
        setCategoria(getCategoria());
        


}
}