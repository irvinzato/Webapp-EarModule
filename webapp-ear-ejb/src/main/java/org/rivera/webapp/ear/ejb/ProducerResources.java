package org.rivera.webapp.ear.ejb;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@ApplicationScoped
public class ProducerResources {

  @PersistenceUnit(name = "ejemploJPA") //Una conexión por cada request, el nombre lo puse en "persistence.xml"
  private EntityManagerFactory emf;

  @Produces //Para registrarlo en el contenedor
  @RequestScoped
  private EntityManager beanEntityManager() {
    return emf.createEntityManager();
  }

  public void close(@Disposes EntityManager entityManager) {
    if( entityManager.isOpen() ) {
      entityManager.close();
      System.out.println("Cerrando conexión del Entity Manager");
    }
  }

}
