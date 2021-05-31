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
public class Projetoproduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        produto produto1 = new produto();
        produto1.setDescricao("“Pulseira Smartwatch Tela 1.3 Polegadas");
        produto1.setQtdprod(31);
        produto1.setPrecoprod(130.05f);
        
        produto produto2 = new produto();
        produto2.setDescricao("“Fone De Ouvido Par AirPods TWS Para IOS e Android Recarregável");
        produto2.setQtdprod(74);
        produto2.setPrecoprod(34.02f);
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("ProdutoA.............: " + produto1.getDescricao());
        System.out.println("Quantidade...........: " + produto1.getQtdprod());
        System.out.println("Valor................: " + produto1.getPrecoprod());
        System.out.println("Valor total em stoque: " + produto1.venderTodoEstoque());
        System.out.println("-------------------------------------------------------------------");
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("ProdutoB.............: " + produto2.getDescricao());
        System.out.println("Quantidade...........: " + produto2.getQtdprod());
        System.out.println("Valor................: " + produto2.getPrecoprod());
        System.out.println("Valor total em stoque: " + produto2.venderTodoEstoque());
        System.out.println("-------------------------------------------------------------------");
    
}
}

