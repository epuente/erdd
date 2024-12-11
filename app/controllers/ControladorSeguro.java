package controllers;

import actions.Encabezados;
import play.mvc.With;
import actions.Autenticar; 
import actions.ConfirmarAdministradorSistema;

@With({Encabezados.class, Autenticar.class, ConfirmarAdministradorSistema.class})
public abstract class ControladorSeguro extends ControladorDefault {}


