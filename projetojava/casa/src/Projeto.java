import java.util.ArrayList;

public class Projeto
{
    private int id; //CÓDIGO DO PROJETO
    private String identificacao; //NOME DO PROJETO
    private String descricao; //SERIA UMA ESPÉCIE DE "SINOPSE/RESUMO" DO PROJETO
    private String dataInicio;
    private String dataTermino;
    private Usuario coordenadorProjeto; //SÓ PODE SER UM "COORDENADOR" OU UM "PESQUISADOR"
    private ArrayList<Atividade> atividades;   
    private ArrayList<Usuario> usuariosProjeto;
    private VigenciaBolsa periodoBolsa;
    

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the identificacao
     */
    public String getIdentificacao() {
        return identificacao;
    }

    /**
     * @param identificacao the identificacao to set
     */
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return String return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return String return the dataTermino
     */
    public String getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * @return Usuario return the coordenadorProjeto
     */
    public Usuario getCoordenadorProjeto() {
        return coordenadorProjeto;
    }

    /**
     * @param coordenadorProjeto the coordenadorProjeto to set
     */
    public void setCoordenadorProjeto(Usuario coordenadorProjeto) {
        this.coordenadorProjeto = coordenadorProjeto;
    }

    /**
     * @return ArrayList<Atividade> return the atividades
     */
    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    /**
     * @param atividades the atividades to set
     */
    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }

    /**
     * @return ArrayList<Usuario> return the usuariosProjeto
     */
    public ArrayList<Usuario> getUsuariosProjeto() {
        return usuariosProjeto;
    }

    /**
     * @param usuariosProjeto the usuariosProjeto to set
     */
    public void setUsuariosProjeto(ArrayList<Usuario> usuariosProjeto) {
        this.usuariosProjeto = usuariosProjeto;
    }

    /**
     * @return VigenciaBolsa return the periodoBolsa
     */
    public VigenciaBolsa getPeriodoBolsa() {
        return periodoBolsa;
    }

    /**
     * @param periodoBolsa the periodoBolsa to set
     */
    public void setPeriodoBolsa(VigenciaBolsa periodoBolsa) {
        this.periodoBolsa = periodoBolsa;
    }

}