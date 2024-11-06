package com.exemplo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
    private static EntityManagerFactory emf;
    
    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("h2PU");
        }
        return emf.createEntityManager();
    }
    
    public static void fecharEntityManager() {
        if (emf != null) {
            emf.close();
        }
    }
}
