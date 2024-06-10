public class Curso extends Conteudo{

    /* Atributos e metodos da classe, uma boa pratica é colocar modificadores de acesso nos atributos mesmo sendo public*/
    
    public int cargaHoraria;
   

    @Override
    public double calcularXp() {
        return XP_Padrao * cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
   
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }


}
