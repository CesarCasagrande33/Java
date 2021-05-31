/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoproduto;

/**
 *
 * @author cesar.liranco
 */
public class produto {

   private String descricao;
   private int qtdprod;
   private float precoprod;
    
    /**
     * @return the descricao
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
     * @return the qtdprod
     */
    public int getQtdprod() {
        return qtdprod;
    }

    /**
     * @param qtdprod the qtdprod to set
     */
    public void setQtdprod(int qtdprod) {
        this.qtdprod = qtdprod;
    }

    /**
     * @return the precoprod
     */
    public float getPrecoprod() {
        return precoprod;
    }

    /**
     * @param precoprod the precoprod to set
     */
    public void setPrecoprod(float precoprod) {
        this.precoprod = precoprod;
    }
   
    public float venderTodoEstoque(){
        return precoprod * qtdprod;
}



}
