package org.rivera.webapp.ear.ejb.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.rivera.webapp.ear.ejb.entities.Usuario;
import org.rivera.webapp.ear.ejb.repositories.UsuarioRepository;

import java.util.List;

@Stateless  //También puede ser Stateful y contexto RequestScoped
public class UsuarioServiceImp implements UsuarioService{

  @Inject
  private UsuarioRepository repository;

  @Override
  public List<Usuario> toList() {
    return repository.toList();
  }

}
