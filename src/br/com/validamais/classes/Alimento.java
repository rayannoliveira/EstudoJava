/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.validamais.classes;

import java.util.Date;

/**
 *
 * @author Rayanne
 */
public class Alimento {
   private int idAlimento;
   private String nomeAlimento;
   private String tipoAlimento;
   private Date validade;
   
   
  public void Alimento(){
      
  }

    /**
     * @return the idAlimento
     */
    public int getIdAlimento() {
        return idAlimento;
    }

    /**
     * @param idAlimento the idAlimento to set
     */
    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    /**
     * @return the nomeAlimento
     */
    public String getNomeAlimento() {
        return nomeAlimento;
    }

    /**
     * @param nomeAlimento the nomeAlimento to set
     */
    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    /**
     * @return the tipoAlimento
     */
    public String getTipoAlimento() {
        return tipoAlimento;
    }

    /**
     * @param tipoAlimento the tipoAlimento to set
     */
    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    /**
     * @return the validade
     */
    public Date getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(Date validade) {
        this.validade = validade;
    }
  
  
    
}
