package controllers.util;

import actions.Encabezados;
import play.mvc.With;
import actions.Autenticar;
import actions.ConfirmarAdministradorProceso;

@With({Encabezados.class, Autenticar.class, ConfirmarAdministradorProceso.class})
public abstract class ControladorSeguroCoordinador extends ControladorDefault {}
