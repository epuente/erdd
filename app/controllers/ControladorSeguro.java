package controllers;

import play.mvc.Controller;
import play.mvc.With;
import actions.Autenticar; 
import actions.ConfirmarAdministradorSistema;

@With({Autenticar.class, ConfirmarAdministradorSistema.class})
public abstract class ControladorSeguro extends Controller {}