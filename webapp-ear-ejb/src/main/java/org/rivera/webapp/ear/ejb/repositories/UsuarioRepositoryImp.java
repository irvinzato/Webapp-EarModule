package org.rivera.webapp.ear.ejb.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.rivera.webapp.ear.ejb.entities.Usuario;

import java.util.List;

@RequestScoped  //Le inyectare el EntityManager(También puede ser ApplicationScope)
public class UsuarioRepositoryImp implements UsuarioRepository{

  @Inject
  private EntityManager em;

  @Override
  public List<Usuario> toList() {
    return em.createQuery("FROM Usuario", Usuario.class)  //Lo mismo a "SELECT u FROM Usuario u"
            .getResultList();
  }
}
