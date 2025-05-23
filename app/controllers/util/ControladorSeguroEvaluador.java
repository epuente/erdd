package controllers.util;

import actions.Encabezados;
import play.mvc.With;
import actions.Autenticar; 
import actions.ConfirmarEvaluador;

@With({Encabezados.class, Autenticar.class, ConfirmarEvaluador.class})
public abstract class ControladorSeguroEvaluador extends ControladorDefault {}

