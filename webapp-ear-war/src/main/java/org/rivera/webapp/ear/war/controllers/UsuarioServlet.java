package org.rivera.webapp.ear.war.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.rivera.webapp.ear.ejb.services.UsuarioService;

import java.io.IOException;

@WebServlet({"/listar", "/"})
public class UsuarioServlet extends HttpServlet {

  @Inject
  private UsuarioService service;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("users", service.toList());
    getServletContext().getRequestDispatcher("/listar.jsp").forward(req, resp);
  }

}
