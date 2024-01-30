package controllers;

import play.mvc.Controller;
import play.mvc.With;
import actions.Autenticar;
import actions.ConfirmarAdministradorProceso;

@With({Autenticar.class, ConfirmarAdministradorProceso.class})
public abstract class ControladorSeguroCoordinador extends Controller {}