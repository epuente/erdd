package controllers.util;

import actions.Encabezados;
import play.mvc.Controller;
import play.mvc.With;

@With({ Encabezados.class})
public abstract class ControladorDefault extends Controller {}