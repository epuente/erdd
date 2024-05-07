package controllers;

import actions.Autenticar;
import actions.ConfirmarAdministradorPM;
import actions.Encabezados;
import play.mvc.Controller;
import play.mvc.With;

@With({Encabezados.class, Autenticar.class, ConfirmarAdministradorPM.class})
public abstract class ControladorSeguroPM extends ControladorDefault {}