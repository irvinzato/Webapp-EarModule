package org.rivera.webapp.ear.ejb.repositories;

import org.rivera.webapp.ear.ejb.entities.Usuario;

import java.util.List;

public interface UsuarioRepository {
  List<Usuario> toList();
}
