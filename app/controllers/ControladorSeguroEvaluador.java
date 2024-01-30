package controllers;

import play.mvc.Controller;
import play.mvc.With;
import actions.Autenticar; 
import actions.ConfirmarEvaluador;

@With({Autenticar.class, ConfirmarEvaluador.class})
public abstract class ControladorSeguroEvaluador extends Controller {}

