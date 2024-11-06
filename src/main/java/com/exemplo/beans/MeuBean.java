package com.exemplo.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManager;
import com.exemplo.util.Conexao;
import java.io.Serializable;

@Named
@SessionScoped
public class MeuBean implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private EntityManager em;
    
    public MeuBean() {
        em = Conexao.getEntityManager();
    }
    
    // Adicione métodos da aplicação
}
