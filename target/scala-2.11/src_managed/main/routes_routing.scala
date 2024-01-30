// @SOURCE:/home/epuente/playFramework/erdd2024/conf/routes
// @HASH:b1a641008ce39e036bdf8d6f8de96dc61cc447bb
// @DATE:Tue Jan 30 11:54:32 CST 2024


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_RecursoWebController_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_RecursoWebController_index0_invoker = createInvoker(
controllers.RecursoWebController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_RecursoWebController_recibido1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solRecibida/"),DynamicPart("nc", """[^/]+""",true))))
private[this] lazy val controllers_RecursoWebController_recibido1_invoker = createInvoker(
controllers.RecursoWebController.recibido(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "recibido", Seq(classOf[String]),"GET", """""", Routes.prefix + """solRecibida/$nc<[^/]+>"""))
        

// @LINE:9
private[this] lazy val controllers_Application_login2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login2_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:10
private[this] lazy val controllers_Application_logout3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout3_invoker = createInvoker(
controllers.Application.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:11
private[this] lazy val controllers_Application_autentica4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autentica"))))
private[this] lazy val controllers_Application_autentica4_invoker = createInvoker(
controllers.Application.autentica(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "autentica", Nil,"POST", """""", Routes.prefix + """autentica"""))
        

// @LINE:12
private[this] lazy val controllers_Application_timeOut5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timeOut"))))
private[this] lazy val controllers_Application_timeOut5_invoker = createInvoker(
controllers.Application.timeOut(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "timeOut", Nil,"GET", """""", Routes.prefix + """timeOut"""))
        

// @LINE:13
private[this] lazy val controllers_AdminController_index6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
private[this] lazy val controllers_AdminController_index6_invoker = createInvoker(
controllers.AdminController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "index", Nil,"GET", """""", Routes.prefix + """admin"""))
        

// @LINE:14
private[this] lazy val controllers_CoordinadorController_index7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coord"))))
private[this] lazy val controllers_CoordinadorController_index7_invoker = createInvoker(
controllers.CoordinadorController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CoordinadorController", "index", Nil,"GET", """""", Routes.prefix + """coord"""))
        

// @LINE:15
private[this] lazy val controllers_Application_cambiarPassword8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cambiarPassword"))))
private[this] lazy val controllers_Application_cambiarPassword8_invoker = createInvoker(
controllers.Application.cambiarPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "cambiarPassword", Nil,"POST", """""", Routes.prefix + """cambiarPassword"""))
        

// @LINE:16
private[this] lazy val controllers_Application_cambiarEmail9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cambiarEmail"))))
private[this] lazy val controllers_Application_cambiarEmail9_invoker = createInvoker(
controllers.Application.cambiarEmail(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "cambiarEmail", Nil,"POST", """""", Routes.prefix + """cambiarEmail"""))
        

// @LINE:18
private[this] lazy val controllers_EvaluacionEvaluadorController_index10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ev"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_index10_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "index", Nil,"GET", """""", Routes.prefix + """ev"""))
        

// @LINE:19
private[this] lazy val controllers_EvaluacionEvaluadorController_resumen11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evResumen"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_resumen11_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.resumen(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "resumen", Nil,"GET", """""", Routes.prefix + """evResumen"""))
        

// @LINE:20
private[this] lazy val controllers_EvaluacionEvaluadorController_porEvaluar12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("porEvaluar"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_porEvaluar12_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.porEvaluar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "porEvaluar", Nil,"GET", """""", Routes.prefix + """porEvaluar"""))
        

// @LINE:21
private[this] lazy val controllers_EvaluacionEvaluadorController_enProceso13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("enProceso"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_enProceso13_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.enProceso(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "enProceso", Nil,"GET", """""", Routes.prefix + """enProceso"""))
        

// @LINE:22
private[this] lazy val controllers_EvaluacionEvaluadorController_listado14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evList"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_listado14_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.listado(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "listado", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int]),"GET", """""", Routes.prefix + """evList"""))
        

// @LINE:26
private[this] lazy val controllers_EvaluacionEvaluadorController_create15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evCreate"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_create15_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.create(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "create", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """evCreate"""))
        

// @LINE:32
private[this] lazy val controllers_EvaluacionEvaluadorController_edit16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evEdit"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_edit16_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.edit(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "edit", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """evEdit"""))
        

// @LINE:33
private[this] lazy val controllers_EvaluacionEvaluadorController_verDetalle17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evVerDetalle/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EvaluacionEvaluadorController_verDetalle17_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.verDetalle(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "verDetalle", Seq(classOf[Long]),"GET", """""", Routes.prefix + """evVerDetalle/$id<[^/]+>"""))
        

// @LINE:34
private[this] lazy val controllers_EvaluacionEvaluadorController_save18_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evSave/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("idAspecto", """[^/]+""",true))))
private[this] lazy val controllers_EvaluacionEvaluadorController_save18_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.save(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "save", Seq(classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """evSave/$id<[^/]+>/$idAspecto<[^/]+>"""))
        

// @LINE:35
private[this] lazy val controllers_EvaluacionEvaluadorController_porAtenderAdmin19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evPorAtenderAdmin"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_porAtenderAdmin19_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.porAtenderAdmin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "porAtenderAdmin", Nil,"GET", """""", Routes.prefix + """evPorAtenderAdmin"""))
        

// @LINE:36
private[this] lazy val controllers_EvaluacionEvaluadorController_porObservar20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evPorObservar"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_porObservar20_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.porObservar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "porObservar", Nil,"GET", """""", Routes.prefix + """evPorObservar"""))
        

// @LINE:37
private[this] lazy val controllers_EvaluacionEvaluadorController_concluidas21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evConcluidas"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_concluidas21_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.concluidas(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "concluidas", Nil,"GET", """""", Routes.prefix + """evConcluidas"""))
        

// @LINE:38
private[this] lazy val controllers_EvaluacionEvaluadorController_solicitudesCancelacion22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evSolicitudesCancelacion"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_solicitudesCancelacion22_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.solicitudesCancelacion(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "solicitudesCancelacion", Nil,"GET", """""", Routes.prefix + """evSolicitudesCancelacion"""))
        

// @LINE:39
private[this] lazy val controllers_EvaluacionEvaluadorController_atenderObservaciones23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evAtenderObservaciones/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("aspecto", """[^/]+""",true))))
private[this] lazy val controllers_EvaluacionEvaluadorController_atenderObservaciones23_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.atenderObservaciones(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "atenderObservaciones", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """evAtenderObservaciones/$id<[^/]+>/$aspecto<[^/]+>"""))
        

// @LINE:41
private[this] lazy val controllers_EvaluacionEvaluadorController_saveObservaciones24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evSaveObservaciones/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("aspecto", """[^/]+""",true))))
private[this] lazy val controllers_EvaluacionEvaluadorController_saveObservaciones24_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.saveObservaciones(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "saveObservaciones", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """evSaveObservaciones/$id<[^/]+>/$aspecto<[^/]+>"""))
        

// @LINE:43
private[this] lazy val controllers_CancelacionController_solicitudCancelacion25_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evSolicitudCancelacion/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CancelacionController_solicitudCancelacion25_invoker = createInvoker(
controllers.CancelacionController.solicitudCancelacion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CancelacionController", "solicitudCancelacion", Seq(classOf[Long]),"POST", """""", Routes.prefix + """evSolicitudCancelacion/$id<[^/]+>"""))
        

// @LINE:44
private[this] lazy val controllers_EvaluacionEvaluadorController_canceladasEvaluacion26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evCanceladasEvaluacion"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_canceladasEvaluacion26_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.canceladasEvaluacion(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "canceladasEvaluacion", Nil,"GET", """""", Routes.prefix + """evCanceladasEvaluacion"""))
        

// @LINE:45
private[this] lazy val controllers_EvaluacionEvaluadorController_canceladaEvaluacion27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evCanceladaEvaluacion"))))
private[this] lazy val controllers_EvaluacionEvaluadorController_canceladaEvaluacion27_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.canceladaEvaluacion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "canceladaEvaluacion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """evCanceladaEvaluacion"""))
        

// @LINE:48
private[this] lazy val controllers_AdminEvaluacionController_saveObservaciones28_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evSaveObservaciones/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("aspecto", """[^/]+""",true))))
private[this] lazy val controllers_AdminEvaluacionController_saveObservaciones28_invoker = createInvoker(
controllers.AdminEvaluacionController.saveObservaciones(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionController", "saveObservaciones", Seq(classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """evSaveObservaciones/$id<[^/]+>/$aspecto<[^/]+>"""))
        

// @LINE:50
private[this] lazy val controllers_RecursoWebController_create29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursoweb/new"))))
private[this] lazy val controllers_RecursoWebController_create29_invoker = createInvoker(
controllers.RecursoWebController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "create", Nil,"GET", """""", Routes.prefix + """recursoweb/new"""))
        

// @LINE:51
private[this] lazy val controllers_RecursoWebController_mastersave30_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursoweb"))))
private[this] lazy val controllers_RecursoWebController_mastersave30_invoker = createInvoker(
controllers.RecursoWebController.mastersave(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "mastersave", Nil,"POST", """""", Routes.prefix + """recursoweb"""))
        

// @LINE:52
private[this] lazy val controllers_RecursoWebController_masteredit31_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursoweb/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoWebController_masteredit31_invoker = createInvoker(
controllers.RecursoWebController.masteredit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "masteredit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """recursoweb/$id<[^/]+>"""))
        

// @LINE:53
private[this] lazy val controllers_RecursoWebController_mastereditAn32_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursowebAn"))))
private[this] lazy val controllers_RecursoWebController_mastereditAn32_invoker = createInvoker(
controllers.RecursoWebController.mastereditAn(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "mastereditAn", Nil,"GET", """""", Routes.prefix + """recursowebAn"""))
        

// @LINE:54
private[this] lazy val controllers_RecursoWebController_masterupdate33_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursoweb/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoWebController_masterupdate33_invoker = createInvoker(
controllers.RecursoWebController.masterupdate(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "masterupdate", Seq(classOf[Long]),"POST", """""", Routes.prefix + """recursoweb/$id<[^/]+>"""))
        

// @LINE:55
private[this] lazy val controllers_RecursoWebController_imprimirSolicitudAceptada34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aceptada"))))
private[this] lazy val controllers_RecursoWebController_imprimirSolicitudAceptada34_invoker = createInvoker(
controllers.RecursoWebController.imprimirSolicitudAceptada(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "imprimirSolicitudAceptada", Nil,"GET", """""", Routes.prefix + """aceptada"""))
        

// @LINE:56
private[this] lazy val controllers_RecursoWebController_verDatosEnviados35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("verDatosEnviados"))))
private[this] lazy val controllers_RecursoWebController_verDatosEnviados35_invoker = createInvoker(
controllers.RecursoWebController.verDatosEnviados(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "verDatosEnviados", Nil,"GET", """""", Routes.prefix + """verDatosEnviados"""))
        

// @LINE:59
private[this] lazy val controllers_Application_javascriptRoutes36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
private[this] lazy val controllers_Application_javascriptRoutes36_invoker = createInvoker(
controllers.Application.javascriptRoutes(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "javascriptRoutes", Nil,"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/javascripts/routes"""))
        

// @LINE:60
private[this] lazy val controllers_Assets_at37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at37_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:65
private[this] lazy val controllers_RecursoController_porObservarList38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursos/observarList"))))
private[this] lazy val controllers_RecursoController_porObservarList38_invoker = createInvoker(
controllers.RecursoController.porObservarList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "porObservarList", Nil,"GET", """""", Routes.prefix + """recursos/observarList"""))
        

// @LINE:66
private[this] lazy val controllers_RecursoController_porReObservarList39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursos/reObservarList"))))
private[this] lazy val controllers_RecursoController_porReObservarList39_invoker = createInvoker(
controllers.RecursoController.porReObservarList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "porReObservarList", Nil,"GET", """""", Routes.prefix + """recursos/reObservarList"""))
        

// @LINE:67
private[this] lazy val controllers_RecursoController_completoList40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursos/completoList"))))
private[this] lazy val controllers_RecursoController_completoList40_invoker = createInvoker(
controllers.RecursoController.completoList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "completoList", Nil,"GET", """""", Routes.prefix + """recursos/completoList"""))
        

// @LINE:68
private[this] lazy val controllers_RecursoController_observar41_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursos/observar/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoController_observar41_invoker = createInvoker(
controllers.RecursoController.observar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "observar", Seq(classOf[Long]),"GET", """""", Routes.prefix + """recursos/observar/$id<[^/]+>"""))
        

// @LINE:69
private[this] lazy val controllers_RecursoController_observacionessave42_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("observaciones"))))
private[this] lazy val controllers_RecursoController_observacionessave42_invoker = createInvoker(
controllers.RecursoController.observacionessave(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "observacionessave", Nil,"POST", """""", Routes.prefix + """observaciones"""))
        

// @LINE:71
private[this] lazy val controllers_RecursoController_revisar43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("revisar/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("aspecto", """[^/]+""",true))))
private[this] lazy val controllers_RecursoController_revisar43_invoker = createInvoker(
controllers.RecursoController.revisar(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "revisar", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """revisar/$id<[^/]+>/$aspecto<[^/]+>"""))
        

// @LINE:76
private[this] lazy val controllers_RecursoController_list44_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursos"))))
private[this] lazy val controllers_RecursoController_list44_invoker = createInvoker(
controllers.RecursoController.list(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """recursos"""))
        

// @LINE:79
private[this] lazy val controllers_RecursoController_edit45_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoController_edit45_invoker = createInvoker(
controllers.RecursoController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "edit", Seq(classOf[Long]),"GET", """GET     /recursos/new          			controllers.RecursoController.create()
POST    /recursos             			controllers.RecursoController.save()""", Routes.prefix + """recursos/$id<[^/]+>"""))
        

// @LINE:80
private[this] lazy val controllers_RecursoController_delete46_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursos/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_RecursoController_delete46_invoker = createInvoker(
controllers.RecursoController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """recursos/$id<[^/]+>/delete"""))
        

// @LINE:81
private[this] lazy val controllers_RecursoController_update47_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoController_update47_invoker = createInvoker(
controllers.RecursoController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """recursos/$id<[^/]+>"""))
        

// @LINE:82
private[this] lazy val controllers_RecursoController_ajaxListTabla48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajaxListTabla"))))
private[this] lazy val controllers_RecursoController_ajaxListTabla48_invoker = createInvoker(
controllers.RecursoController.ajaxListTabla(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "ajaxListTabla", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """ajaxListTabla"""))
        

// @LINE:83
private[this] lazy val controllers_RecursoController_ajaxDelete49_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recursos/"),DynamicPart("id", """[^/]+""",true),StaticPart("/ajaxDelete"))))
private[this] lazy val controllers_RecursoController_ajaxDelete49_invoker = createInvoker(
controllers.RecursoController.ajaxDelete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "ajaxDelete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """recursos/$id<[^/]+>/ajaxDelete"""))
        

// @LINE:86
private[this] lazy val controllers_OficioController_list50_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("oficios"))))
private[this] lazy val controllers_OficioController_list50_invoker = createInvoker(
controllers.OficioController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "list", Nil,"GET", """""", Routes.prefix + """oficios"""))
        

// @LINE:87
private[this] lazy val controllers_OficioController_create51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("oficios/"),DynamicPart("id", """[^/]+""",true),StaticPart("/asignarOficio"))))
private[this] lazy val controllers_OficioController_create51_invoker = createInvoker(
controllers.OficioController.create(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "create", Seq(classOf[Long]),"GET", """""", Routes.prefix + """oficios/$id<[^/]+>/asignarOficio"""))
        

// @LINE:88
private[this] lazy val controllers_OficioController_save52_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("oficios/"),DynamicPart("id", """[^/]+""",true),StaticPart("/oficioSave"))))
private[this] lazy val controllers_OficioController_save52_invoker = createInvoker(
controllers.OficioController.save(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "save", Seq(classOf[Long]),"POST", """""", Routes.prefix + """oficios/$id<[^/]+>/oficioSave"""))
        

// @LINE:89
private[this] lazy val controllers_OficioController_edit53_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("oficios/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_OficioController_edit53_invoker = createInvoker(
controllers.OficioController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """oficios/$id<[^/]+>/edit"""))
        

// @LINE:90
private[this] lazy val controllers_OficioController_update54_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("oficios/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
private[this] lazy val controllers_OficioController_update54_invoker = createInvoker(
controllers.OficioController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """oficios/$id<[^/]+>/update"""))
        

// @LINE:91
private[this] lazy val controllers_OficioController_verOficio55_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("verOficio/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_OficioController_verOficio55_invoker = createInvoker(
controllers.OficioController.verOficio(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "verOficio", Seq(classOf[Long]),"GET", """""", Routes.prefix + """verOficio/$id<[^/]+>"""))
        

// @LINE:93
private[this] lazy val controllers_VersionanteriorController_listaActualizaciones56_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("actualizacionesList"))))
private[this] lazy val controllers_VersionanteriorController_listaActualizaciones56_invoker = createInvoker(
controllers.VersionanteriorController.listaActualizaciones(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VersionanteriorController", "listaActualizaciones", Nil,"GET", """""", Routes.prefix + """actualizacionesList"""))
        

// @LINE:94
private[this] lazy val controllers_VersionanteriorController_eliminarActualizaciones57_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("actualizaciones/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_VersionanteriorController_eliminarActualizaciones57_invoker = createInvoker(
controllers.VersionanteriorController.eliminarActualizaciones(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VersionanteriorController", "eliminarActualizaciones", Seq(classOf[Long]),"POST", """""", Routes.prefix + """actualizaciones/$id<[^/]+>/delete"""))
        

// @LINE:95
private[this] lazy val controllers_VersionanteriorController_create58_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("actualizacionesCreate"))))
private[this] lazy val controllers_VersionanteriorController_create58_invoker = createInvoker(
controllers.VersionanteriorController.create(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VersionanteriorController", "create", Seq(classOf[Long]),"GET", """""", Routes.prefix + """actualizacionesCreate"""))
        

// @LINE:96
private[this] lazy val controllers_VersionanteriorController_save59_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("actualizacionesSave/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_VersionanteriorController_save59_invoker = createInvoker(
controllers.VersionanteriorController.save(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VersionanteriorController", "save", Seq(classOf[Long]),"POST", """""", Routes.prefix + """actualizacionesSave/$id<[^/]+>"""))
        

// @LINE:100
private[this] lazy val controllers_AutorfuncionController_list60_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autorfuncion"))))
private[this] lazy val controllers_AutorfuncionController_list60_invoker = createInvoker(
controllers.AutorfuncionController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "list", Nil,"GET", """""", Routes.prefix + """autorfuncion"""))
        

// @LINE:101
private[this] lazy val controllers_AutorfuncionController_create61_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autorfuncion/new"))))
private[this] lazy val controllers_AutorfuncionController_create61_invoker = createInvoker(
controllers.AutorfuncionController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "create", Nil,"GET", """""", Routes.prefix + """autorfuncion/new"""))
        

// @LINE:102
private[this] lazy val controllers_AutorfuncionController_save62_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autorfuncion"))))
private[this] lazy val controllers_AutorfuncionController_save62_invoker = createInvoker(
controllers.AutorfuncionController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "save", Nil,"POST", """""", Routes.prefix + """autorfuncion"""))
        

// @LINE:103
private[this] lazy val controllers_AutorfuncionController_edit63_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autorfuncion/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_AutorfuncionController_edit63_invoker = createInvoker(
controllers.AutorfuncionController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """autorfuncion/$id<[^/]+>"""))
        

// @LINE:104
private[this] lazy val controllers_AutorfuncionController_delete64_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autorfuncion/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_AutorfuncionController_delete64_invoker = createInvoker(
controllers.AutorfuncionController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """autorfuncion/$id<[^/]+>/delete"""))
        

// @LINE:105
private[this] lazy val controllers_AutorfuncionController_update65_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autorfuncion/new"))))
private[this] lazy val controllers_AutorfuncionController_update65_invoker = createInvoker(
controllers.AutorfuncionController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """autorfuncion/new"""))
        

// @LINE:113
private[this] lazy val controllers_NiveleducativoController_listDT66_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nivelList"))))
private[this] lazy val controllers_NiveleducativoController_listDT66_invoker = createInvoker(
controllers.NiveleducativoController.listDT(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "listDT", Nil,"GET", """GET     /nivelList          controllers.NiveleducativoController.list(p:Int ?= 0, s ?= "descripcion", o ?= "asc", f ?= "")""", Routes.prefix + """nivelList"""))
        

// @LINE:114
private[this] lazy val controllers_NiveleducativoController_create67_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nivel/new"))))
private[this] lazy val controllers_NiveleducativoController_create67_invoker = createInvoker(
controllers.NiveleducativoController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "create", Nil,"GET", """""", Routes.prefix + """nivel/new"""))
        

// @LINE:115
private[this] lazy val controllers_NiveleducativoController_save68_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nivel"))))
private[this] lazy val controllers_NiveleducativoController_save68_invoker = createInvoker(
controllers.NiveleducativoController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "save", Nil,"POST", """""", Routes.prefix + """nivel"""))
        

// @LINE:116
private[this] lazy val controllers_NiveleducativoController_edit69_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nivel/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_NiveleducativoController_edit69_invoker = createInvoker(
controllers.NiveleducativoController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """nivel/$id<[^/]+>"""))
        

// @LINE:117
private[this] lazy val controllers_NiveleducativoController_delete70_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nivel/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_NiveleducativoController_delete70_invoker = createInvoker(
controllers.NiveleducativoController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """nivel/$id<[^/]+>/delete"""))
        

// @LINE:118
private[this] lazy val controllers_NiveleducativoController_update71_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nivel/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_NiveleducativoController_update71_invoker = createInvoker(
controllers.NiveleducativoController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """nivel/$id<[^/]+>"""))
        

// @LINE:120
private[this] lazy val controllers_AreaconocimientoController_list72_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areaconocimientos"))))
private[this] lazy val controllers_AreaconocimientoController_list72_invoker = createInvoker(
controllers.AreaconocimientoController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "list", Nil,"GET", """""", Routes.prefix + """areaconocimientos"""))
        

// @LINE:121
private[this] lazy val controllers_AreaconocimientoController_create73_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areaconocimientos/new"))))
private[this] lazy val controllers_AreaconocimientoController_create73_invoker = createInvoker(
controllers.AreaconocimientoController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "create", Nil,"GET", """""", Routes.prefix + """areaconocimientos/new"""))
        

// @LINE:122
private[this] lazy val controllers_AreaconocimientoController_save74_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areaconocimientos"))))
private[this] lazy val controllers_AreaconocimientoController_save74_invoker = createInvoker(
controllers.AreaconocimientoController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "save", Nil,"POST", """""", Routes.prefix + """areaconocimientos"""))
        

// @LINE:123
private[this] lazy val controllers_AreaconocimientoController_edit75_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areaconocimientos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_AreaconocimientoController_edit75_invoker = createInvoker(
controllers.AreaconocimientoController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """areaconocimientos/$id<[^/]+>"""))
        

// @LINE:124
private[this] lazy val controllers_AreaconocimientoController_delete76_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areaconocimientos/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_AreaconocimientoController_delete76_invoker = createInvoker(
controllers.AreaconocimientoController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """areaconocimientos/$id<[^/]+>/delete"""))
        

// @LINE:125
private[this] lazy val controllers_AreaconocimientoController_update77_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areaconocimientos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_AreaconocimientoController_update77_invoker = createInvoker(
controllers.AreaconocimientoController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """areaconocimientos/$id<[^/]+>"""))
        

// @LINE:129
private[this] lazy val controllers_UnidadacademicaController_list78_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadacademica"))))
private[this] lazy val controllers_UnidadacademicaController_list78_invoker = createInvoker(
controllers.UnidadacademicaController.list(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """unidadacademica"""))
        

// @LINE:131
private[this] lazy val controllers_UnidadacademicaController_create79_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadacademica/new"))))
private[this] lazy val controllers_UnidadacademicaController_create79_invoker = createInvoker(
controllers.UnidadacademicaController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "create", Nil,"GET", """""", Routes.prefix + """unidadacademica/new"""))
        

// @LINE:132
private[this] lazy val controllers_UnidadacademicaController_save80_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadacademica"))))
private[this] lazy val controllers_UnidadacademicaController_save80_invoker = createInvoker(
controllers.UnidadacademicaController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "save", Nil,"POST", """""", Routes.prefix + """unidadacademica"""))
        

// @LINE:133
private[this] lazy val controllers_UnidadacademicaController_edit81_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadacademica/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadacademicaController_edit81_invoker = createInvoker(
controllers.UnidadacademicaController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """unidadacademica/$id<[^/]+>"""))
        

// @LINE:134
private[this] lazy val controllers_UnidadacademicaController_delete82_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadacademica/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_UnidadacademicaController_delete82_invoker = createInvoker(
controllers.UnidadacademicaController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """unidadacademica/$id<[^/]+>/delete"""))
        

// @LINE:135
private[this] lazy val controllers_UnidadacademicaController_update83_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadacademica/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadacademicaController_update83_invoker = createInvoker(
controllers.UnidadacademicaController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """unidadacademica/$id<[^/]+>"""))
        

// @LINE:139
private[this] lazy val controllers_RecursoController_masterlist84_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("master"))))
private[this] lazy val controllers_RecursoController_masterlist84_invoker = createInvoker(
controllers.RecursoController.masterlist(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "masterlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """master"""))
        

// @LINE:143
private[this] lazy val controllers_RecursoWebController_buscarNC85_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buscarNC/"),DynamicPart("nc", """[^/]+""",true))))
private[this] lazy val controllers_RecursoWebController_buscarNC85_invoker = createInvoker(
controllers.RecursoWebController.buscarNC(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "buscarNC", Seq(classOf[String]),"GET", """""", Routes.prefix + """buscarNC/$nc<[^/]+>"""))
        

// @LINE:146
private[this] lazy val controllers_DocumentoController_create86_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("documento"))))
private[this] lazy val controllers_DocumentoController_create86_invoker = createInvoker(
controllers.DocumentoController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentoController", "create", Nil,"GET", """""", Routes.prefix + """documento"""))
        

// @LINE:147
private[this] lazy val controllers_DocumentoController_upload87_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("documento/upload"))))
private[this] lazy val controllers_DocumentoController_upload87_invoker = createInvoker(
controllers.DocumentoController.upload(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentoController", "upload", Nil,"POST", """""", Routes.prefix + """documento/upload"""))
        

// @LINE:148
private[this] lazy val controllers_RecursoWebController_verAn88_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("documento/verAn/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoWebController_verAn88_invoker = createInvoker(
controllers.RecursoWebController.verAn(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "verAn", Seq(classOf[Long]),"GET", """""", Routes.prefix + """documento/verAn/$id<[^/]+>"""))
        

// @LINE:149
private[this] lazy val controllers_RecursoController_ver89_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("documento/ver/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoController_ver89_invoker = createInvoker(
controllers.RecursoController.ver(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "ver", Seq(classOf[Long]),"GET", """""", Routes.prefix + """documento/ver/$id<[^/]+>"""))
        

// @LINE:150
private[this] lazy val controllers_RecursoController_verOficioValoracion90_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("documento/verOficioValoracion/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoController_verOficioValoracion90_invoker = createInvoker(
controllers.RecursoController.verOficioValoracion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "verOficioValoracion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """documento/verOficioValoracion/$id<[^/]+>"""))
        

// @LINE:152
private[this] lazy val controllers_ReporteController_cesoe91_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reporte/cesoe/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ReporteController_cesoe91_invoker = createInvoker(
controllers.ReporteController.cesoe(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ReporteController", "cesoe", Seq(classOf[Long]),"GET", """""", Routes.prefix + """reporte/cesoe/$id<[^/]+>"""))
        

// @LINE:153
private[this] lazy val controllers_ReporteController_solicitudFirma92_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reporte/solicitudFirma/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ReporteController_solicitudFirma92_invoker = createInvoker(
controllers.ReporteController.solicitudFirma(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ReporteController", "solicitudFirma", Seq(classOf[Long]),"GET", """""", Routes.prefix + """reporte/solicitudFirma/$id<[^/]+>"""))
        

// @LINE:155
private[this] lazy val controllers_EvaluadorController_list93_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluadores"))))
private[this] lazy val controllers_EvaluadorController_list93_invoker = createInvoker(
controllers.EvaluadorController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "list", Nil,"GET", """""", Routes.prefix + """evaluadores"""))
        

// @LINE:156
private[this] lazy val controllers_EvaluadorController_create94_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluador/new"))))
private[this] lazy val controllers_EvaluadorController_create94_invoker = createInvoker(
controllers.EvaluadorController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "create", Nil,"GET", """""", Routes.prefix + """evaluador/new"""))
        

// @LINE:157
private[this] lazy val controllers_EvaluadorController_save95_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluador"))))
private[this] lazy val controllers_EvaluadorController_save95_invoker = createInvoker(
controllers.EvaluadorController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "save", Nil,"POST", """""", Routes.prefix + """evaluador"""))
        

// @LINE:158
private[this] lazy val controllers_EvaluadorController_delete96_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluador/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_EvaluadorController_delete96_invoker = createInvoker(
controllers.EvaluadorController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """evaluador/$id<[^/]+>/delete"""))
        

// @LINE:159
private[this] lazy val controllers_EvaluadorController_edit97_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluador/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_EvaluadorController_edit97_invoker = createInvoker(
controllers.EvaluadorController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """evaluador/$id<[^/]+>/edit"""))
        

// @LINE:160
private[this] lazy val controllers_EvaluadorController_update298_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluador/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
private[this] lazy val controllers_EvaluadorController_update298_invoker = createInvoker(
controllers.EvaluadorController.update2(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "update2", Seq(classOf[Long]),"POST", """""", Routes.prefix + """evaluador/$id<[^/]+>/update"""))
        

// @LINE:162
private[this] lazy val controllers_CtacorreoController_edit99_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ctaCorreo"))))
private[this] lazy val controllers_CtacorreoController_edit99_invoker = createInvoker(
controllers.CtacorreoController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CtacorreoController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """ctaCorreo"""))
        

// @LINE:163
private[this] lazy val controllers_CtacorreoController_update100_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ctaCorreo/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
private[this] lazy val controllers_CtacorreoController_update100_invoker = createInvoker(
controllers.CtacorreoController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CtacorreoController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """ctaCorreo/$id<[^/]+>/update"""))
        

// @LINE:165
private[this] lazy val controllers_PersonalController_AdminEdit101_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ctaAdminEdit"))))
private[this] lazy val controllers_PersonalController_AdminEdit101_invoker = createInvoker(
controllers.PersonalController.AdminEdit(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonalController", "AdminEdit", Nil,"GET", """""", Routes.prefix + """ctaAdminEdit"""))
        

// @LINE:166
private[this] lazy val controllers_PersonalController_AdminUpdate102_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ctaAdminEdit/update"))))
private[this] lazy val controllers_PersonalController_AdminUpdate102_invoker = createInvoker(
controllers.PersonalController.AdminUpdate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonalController", "AdminUpdate", Nil,"POST", """""", Routes.prefix + """ctaAdminEdit/update"""))
        

// @LINE:168
private[this] lazy val controllers_PersonalController_CoordEdit103_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ctaCoordEdit"))))
private[this] lazy val controllers_PersonalController_CoordEdit103_invoker = createInvoker(
controllers.PersonalController.CoordEdit(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonalController", "CoordEdit", Nil,"GET", """""", Routes.prefix + """ctaCoordEdit"""))
        

// @LINE:169
private[this] lazy val controllers_PersonalController_CoordUpdate104_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ctaCoordEdit/update"))))
private[this] lazy val controllers_PersonalController_CoordUpdate104_invoker = createInvoker(
controllers.PersonalController.CoordUpdate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonalController", "CoordUpdate", Nil,"POST", """""", Routes.prefix + """ctaCoordEdit/update"""))
        

// @LINE:172
private[this] lazy val controllers_AspectoController_list105_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aspectos"))))
private[this] lazy val controllers_AspectoController_list105_invoker = createInvoker(
controllers.AspectoController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "list", Nil,"GET", """""", Routes.prefix + """aspectos"""))
        

// @LINE:173
private[this] lazy val controllers_AspectoController_create106_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aspecto/new"))))
private[this] lazy val controllers_AspectoController_create106_invoker = createInvoker(
controllers.AspectoController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "create", Nil,"GET", """""", Routes.prefix + """aspecto/new"""))
        

// @LINE:174
private[this] lazy val controllers_AspectoController_delete107_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aspecto/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_AspectoController_delete107_invoker = createInvoker(
controllers.AspectoController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """aspecto/$id<[^/]+>/delete"""))
        

// @LINE:175
private[this] lazy val controllers_AspectoController_save108_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aspecto/"))))
private[this] lazy val controllers_AspectoController_save108_invoker = createInvoker(
controllers.AspectoController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "save", Nil,"POST", """""", Routes.prefix + """aspecto/"""))
        

// @LINE:176
private[this] lazy val controllers_AspectoController_edit109_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aspecto/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_AspectoController_edit109_invoker = createInvoker(
controllers.AspectoController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """aspecto/$id<[^/]+>/edit"""))
        

// @LINE:177
private[this] lazy val controllers_AspectoController_update110_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aspecto/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
private[this] lazy val controllers_AspectoController_update110_invoker = createInvoker(
controllers.AspectoController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """aspecto/$id<[^/]+>/update"""))
        

// @LINE:179
private[this] lazy val controllers_FormatoentregaController_list111_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("formatosentrega"))))
private[this] lazy val controllers_FormatoentregaController_list111_invoker = createInvoker(
controllers.FormatoentregaController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "list", Nil,"GET", """""", Routes.prefix + """formatosentrega"""))
        

// @LINE:180
private[this] lazy val controllers_FormatoentregaController_create112_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("formatoentrega/new"))))
private[this] lazy val controllers_FormatoentregaController_create112_invoker = createInvoker(
controllers.FormatoentregaController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "create", Nil,"GET", """""", Routes.prefix + """formatoentrega/new"""))
        

// @LINE:181
private[this] lazy val controllers_FormatoentregaController_delete113_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("formatoentrega/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_FormatoentregaController_delete113_invoker = createInvoker(
controllers.FormatoentregaController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """formatoentrega/$id<[^/]+>/delete"""))
        

// @LINE:182
private[this] lazy val controllers_FormatoentregaController_save114_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("formatoentrega/"))))
private[this] lazy val controllers_FormatoentregaController_save114_invoker = createInvoker(
controllers.FormatoentregaController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "save", Nil,"POST", """""", Routes.prefix + """formatoentrega/"""))
        

// @LINE:183
private[this] lazy val controllers_FormatoentregaController_edit115_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("formatoentrega/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_FormatoentregaController_edit115_invoker = createInvoker(
controllers.FormatoentregaController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """formatoentrega/$id<[^/]+>/edit"""))
        

// @LINE:184
private[this] lazy val controllers_FormatoentregaController_update116_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("formatoentrega/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
private[this] lazy val controllers_FormatoentregaController_update116_invoker = createInvoker(
controllers.FormatoentregaController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """formatoentrega/$id<[^/]+>/update"""))
        

// @LINE:186
private[this] lazy val controllers_TipodocumentoController_list117_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tiposdocumentos"))))
private[this] lazy val controllers_TipodocumentoController_list117_invoker = createInvoker(
controllers.TipodocumentoController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "list", Nil,"GET", """""", Routes.prefix + """tiposdocumentos"""))
        

// @LINE:187
private[this] lazy val controllers_TipodocumentoController_create118_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tipodocumento/new"))))
private[this] lazy val controllers_TipodocumentoController_create118_invoker = createInvoker(
controllers.TipodocumentoController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "create", Nil,"GET", """""", Routes.prefix + """tipodocumento/new"""))
        

// @LINE:188
private[this] lazy val controllers_TipodocumentoController_delete119_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tipodocumento/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_TipodocumentoController_delete119_invoker = createInvoker(
controllers.TipodocumentoController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """tipodocumento/$id<[^/]+>/delete"""))
        

// @LINE:189
private[this] lazy val controllers_TipodocumentoController_save120_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tipodocumento/"))))
private[this] lazy val controllers_TipodocumentoController_save120_invoker = createInvoker(
controllers.TipodocumentoController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "save", Nil,"POST", """""", Routes.prefix + """tipodocumento/"""))
        

// @LINE:190
private[this] lazy val controllers_TipodocumentoController_edit121_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tipodocumento/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_TipodocumentoController_edit121_invoker = createInvoker(
controllers.TipodocumentoController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """tipodocumento/$id<[^/]+>/edit"""))
        

// @LINE:191
private[this] lazy val controllers_TipodocumentoController_update122_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tipodocumento/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
private[this] lazy val controllers_TipodocumentoController_update122_invoker = createInvoker(
controllers.TipodocumentoController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """tipodocumento/$id<[^/]+>/update"""))
        

// @LINE:194
private[this] lazy val controllers_RecursoWebController_Correo123_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pruebaCorreo"))))
private[this] lazy val controllers_RecursoWebController_Correo123_invoker = createInvoker(
controllers.RecursoWebController.Correo(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "Correo", Nil,"GET", """""", Routes.prefix + """pruebaCorreo"""))
        

// @LINE:196
private[this] lazy val controllers_RecursoevaluadorController_asignarEvaluadoresList124_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("asignarEvaluadores"))))
private[this] lazy val controllers_RecursoevaluadorController_asignarEvaluadoresList124_invoker = createInvoker(
controllers.RecursoevaluadorController.asignarEvaluadoresList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "asignarEvaluadoresList", Nil,"GET", """""", Routes.prefix + """asignarEvaluadores"""))
        

// @LINE:197
private[this] lazy val controllers_RecursoevaluadorController_asignarEvaluadoresCreate125_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("asignarEvaluadores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_asignarEvaluadoresCreate125_invoker = createInvoker(
controllers.RecursoevaluadorController.asignarEvaluadoresCreate(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "asignarEvaluadoresCreate", Seq(classOf[Long]),"GET", """""", Routes.prefix + """asignarEvaluadores/$id<[^/]+>"""))
        

// @LINE:198
private[this] lazy val controllers_RecursoevaluadorController_asignarEvaluadoresSave126_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("asignarEvaluadoresSave/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("tipo", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_asignarEvaluadoresSave126_invoker = createInvoker(
controllers.RecursoevaluadorController.asignarEvaluadoresSave(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "asignarEvaluadoresSave", Seq(classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """asignarEvaluadoresSave/$id<[^/]+>/$tipo<[^/]+>"""))
        

// @LINE:199
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluadores127_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mostrarEvaluadores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluadores127_invoker = createInvoker(
controllers.RecursoevaluadorController.mostrarEvaluadores(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluadores", Seq(classOf[Long]),"GET", """""", Routes.prefix + """mostrarEvaluadores/$id<[^/]+>"""))
        

// @LINE:200
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesSinAtender128_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mostrarEvaluacionesSinAtender/"),DynamicPart("tipo", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesSinAtender128_invoker = createInvoker(
controllers.RecursoevaluadorController.mostrarEvaluacionesSinAtender(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesSinAtender", Seq(classOf[Int]),"GET", """""", Routes.prefix + """mostrarEvaluacionesSinAtender/$tipo<[^/]+>"""))
        

// @LINE:201
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesEnProceso129_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mostrarEvaluacionesEnProceso/"),DynamicPart("tipo", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesEnProceso129_invoker = createInvoker(
controllers.RecursoevaluadorController.mostrarEvaluacionesEnProceso(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesEnProceso", Seq(classOf[Int]),"GET", """""", Routes.prefix + """mostrarEvaluacionesEnProceso/$tipo<[^/]+>"""))
        

// @LINE:202
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesPorRevisar130_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mostrarEvaluacionesPorRevisar/"),DynamicPart("tipo", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesPorRevisar130_invoker = createInvoker(
controllers.RecursoevaluadorController.mostrarEvaluacionesPorRevisar(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesPorRevisar", Seq(classOf[Int]),"GET", """""", Routes.prefix + """mostrarEvaluacionesPorRevisar/$tipo<[^/]+>"""))
        

// @LINE:203
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesConObservaciones131_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mostrarEvaluacionesConObservaciones/"),DynamicPart("tipo", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesConObservaciones131_invoker = createInvoker(
controllers.RecursoevaluadorController.mostrarEvaluacionesConObservaciones(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesConObservaciones", Seq(classOf[Int]),"GET", """""", Routes.prefix + """mostrarEvaluacionesConObservaciones/$tipo<[^/]+>"""))
        

// @LINE:204
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesConcluidas132_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mostrarEvaluacionesConcluidas/"),DynamicPart("tipo", """[^/]+""",true),StaticPart("/"),DynamicPart("device", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_mostrarEvaluacionesConcluidas132_invoker = createInvoker(
controllers.RecursoevaluadorController.mostrarEvaluacionesConcluidas(fakeValue[Int], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesConcluidas", Seq(classOf[Int], classOf[String]),"GET", """""", Routes.prefix + """mostrarEvaluacionesConcluidas/$tipo<[^/]+>/$device<[^/]+>"""))
        

// @LINE:211
private[this] lazy val controllers_ClasificacionController_list133_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clasificacionList"))))
private[this] lazy val controllers_ClasificacionController_list133_invoker = createInvoker(
controllers.ClasificacionController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "list", Nil,"GET", """""", Routes.prefix + """clasificacionList"""))
        

// @LINE:212
private[this] lazy val controllers_ClasificacionController_create134_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clasificacionCreate"))))
private[this] lazy val controllers_ClasificacionController_create134_invoker = createInvoker(
controllers.ClasificacionController.create(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "create", Seq(classOf[Long]),"GET", """""", Routes.prefix + """clasificacionCreate"""))
        

// @LINE:213
private[this] lazy val controllers_ClasificacionController_save135_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clasificacionSave"))))
private[this] lazy val controllers_ClasificacionController_save135_invoker = createInvoker(
controllers.ClasificacionController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "save", Nil,"POST", """""", Routes.prefix + """clasificacionSave"""))
        

// @LINE:214
private[this] lazy val controllers_ClasificacionController_edit136_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clasificacionEdit"))))
private[this] lazy val controllers_ClasificacionController_edit136_invoker = createInvoker(
controllers.ClasificacionController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """clasificacionEdit"""))
        

// @LINE:215
private[this] lazy val controllers_ClasificacionController_update137_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clasificacionUpdate"))))
private[this] lazy val controllers_ClasificacionController_update137_invoker = createInvoker(
controllers.ClasificacionController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """clasificacionUpdate"""))
        

// @LINE:216
private[this] lazy val controllers_ClasificacionController_ejemplos138_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ejemplosClasificador"))))
private[this] lazy val controllers_ClasificacionController_ejemplos138_invoker = createInvoker(
controllers.ClasificacionController.ejemplos(fakeValue[Long], fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "ejemplos", Seq(classOf[Long], classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """ejemplosClasificador"""))
        

// @LINE:217
private[this] lazy val controllers_ClasificacionController_clasificacionRestricciones139_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clasificacionRestricciones"))))
private[this] lazy val controllers_ClasificacionController_clasificacionRestricciones139_invoker = createInvoker(
controllers.ClasificacionController.clasificacionRestricciones(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "clasificacionRestricciones", Nil,"POST", """""", Routes.prefix + """clasificacionRestricciones"""))
        

// @LINE:218
private[this] lazy val controllers_ClasificacionController_descripcionCriterio140_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("descripcionCriterio"))))
private[this] lazy val controllers_ClasificacionController_descripcionCriterio140_invoker = createInvoker(
controllers.ClasificacionController.descripcionCriterio,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "descripcionCriterio", Nil,"POST", """""", Routes.prefix + """descripcionCriterio"""))
        

// @LINE:220
private[this] lazy val controllers_RecursoController_canceladosList141_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("canceladoList"))))
private[this] lazy val controllers_RecursoController_canceladosList141_invoker = createInvoker(
controllers.RecursoController.canceladosList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "canceladosList", Nil,"GET", """""", Routes.prefix + """canceladoList"""))
        

// @LINE:221
private[this] lazy val controllers_RecursoController_solicitudCanceladoList142_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solicitudCanceladoList"))))
private[this] lazy val controllers_RecursoController_solicitudCanceladoList142_invoker = createInvoker(
controllers.RecursoController.solicitudCanceladoList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "solicitudCanceladoList", Nil,"GET", """""", Routes.prefix + """solicitudCanceladoList"""))
        

// @LINE:222
private[this] lazy val controllers_RecursoController_solicitudCancelado143_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solicitudCancelado/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoController_solicitudCancelado143_invoker = createInvoker(
controllers.RecursoController.solicitudCancelado(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "solicitudCancelado", Seq(classOf[Long]),"GET", """""", Routes.prefix + """solicitudCancelado/$id<[^/]+>"""))
        

// @LINE:223
private[this] lazy val controllers_RecursoController_cancelarRecursoEvaluacion144_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cancelarRecursoEvaluacion"))))
private[this] lazy val controllers_RecursoController_cancelarRecursoEvaluacion144_invoker = createInvoker(
controllers.RecursoController.cancelarRecursoEvaluacion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "cancelarRecursoEvaluacion", Seq(classOf[Long]),"POST", """""", Routes.prefix + """cancelarRecursoEvaluacion"""))
        

// @LINE:224
private[this] lazy val controllers_RecursoController_reactivarRecursoEvaluacion145_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reactivarRecursoEvaluacion"))))
private[this] lazy val controllers_RecursoController_reactivarRecursoEvaluacion145_invoker = createInvoker(
controllers.RecursoController.reactivarRecursoEvaluacion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "reactivarRecursoEvaluacion", Seq(classOf[Long]),"POST", """""", Routes.prefix + """reactivarRecursoEvaluacion"""))
        

// @LINE:226
private[this] lazy val controllers_RecursoController_canceladosEvaluacionList146_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("canceladosEvaluacion"))))
private[this] lazy val controllers_RecursoController_canceladosEvaluacionList146_invoker = createInvoker(
controllers.RecursoController.canceladosEvaluacionList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "canceladosEvaluacionList", Nil,"GET", """""", Routes.prefix + """canceladosEvaluacion"""))
        

// @LINE:229
private[this] lazy val controllers_RecursoController_canceladosClasificacionList147_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("canceladosClasificacion"))))
private[this] lazy val controllers_RecursoController_canceladosClasificacionList147_invoker = createInvoker(
controllers.RecursoController.canceladosClasificacionList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "canceladosClasificacionList", Nil,"GET", """""", Routes.prefix + """canceladosClasificacion"""))
        

// @LINE:232
private[this] lazy val controllers_CalendarioController_inicio148_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("calendario"))))
private[this] lazy val controllers_CalendarioController_inicio148_invoker = createInvoker(
controllers.CalendarioController.inicio(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "inicio", Nil,"GET", """""", Routes.prefix + """calendario"""))
        

// @LINE:233
private[this] lazy val controllers_CalendarioController_agregarFechaCalendario149_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("agregarFechaCalendario"))))
private[this] lazy val controllers_CalendarioController_agregarFechaCalendario149_invoker = createInvoker(
controllers.CalendarioController.agregarFechaCalendario(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "agregarFechaCalendario", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """agregarFechaCalendario"""))
        

// @LINE:234
private[this] lazy val controllers_CalendarioController_eliminarFechaCalendario150_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("eliminarFechaCalendario"))))
private[this] lazy val controllers_CalendarioController_eliminarFechaCalendario150_invoker = createInvoker(
controllers.CalendarioController.eliminarFechaCalendario(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "eliminarFechaCalendario", Seq(classOf[String]),"POST", """""", Routes.prefix + """eliminarFechaCalendario"""))
        

// @LINE:235
private[this] lazy val controllers_CalendarioController_hoyMasDias151_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("hoyMasDias"))))
private[this] lazy val controllers_CalendarioController_hoyMasDias151_invoker = createInvoker(
controllers.CalendarioController.hoyMasDias(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "hoyMasDias", Seq(classOf[Int]),"GET", """""", Routes.prefix + """hoyMasDias"""))
        

// @LINE:236
private[this] lazy val controllers_CalendarioController_fechaMasDias152_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fechaMasDias"))))
private[this] lazy val controllers_CalendarioController_fechaMasDias152_invoker = createInvoker(
controllers.CalendarioController.fechaMasDias(fakeValue[Int], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "fechaMasDias", Seq(classOf[Int], classOf[String]),"GET", """""", Routes.prefix + """fechaMasDias"""))
        

// @LINE:239
private[this] lazy val controllers_RecursoController_cambio153_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cambio"))))
private[this] lazy val controllers_RecursoController_cambio153_invoker = createInvoker(
controllers.RecursoController.cambio(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "cambio", Seq(classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """cambio"""))
        

// @LINE:244
private[this] lazy val controllers_auxCargaDatosController_cargaEvaluacionTabla154_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cargaEvaluacionTabla"))))
private[this] lazy val controllers_auxCargaDatosController_cargaEvaluacionTabla154_invoker = createInvoker(
controllers.auxCargaDatosController.cargaEvaluacionTabla(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.auxCargaDatosController", "cargaEvaluacionTabla", Nil,"GET", """""", Routes.prefix + """cargaEvaluacionTabla"""))
        

// @LINE:248
private[this] lazy val controllers_AdminEvaluacionTablaController_listarReactivos155_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionReactivosList"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_listarReactivos155_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.listarReactivos(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listarReactivos", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """evaluacionReactivosList"""))
        

// @LINE:249
private[this] lazy val controllers_AdminEvaluacionTablaController_createReactivo156_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionTablaEvaluacionCreate"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_createReactivo156_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.createReactivo(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "createReactivo", Nil,"GET", """""", Routes.prefix + """evaluacionTablaEvaluacionCreate"""))
        

// @LINE:250
private[this] lazy val controllers_AdminEvaluacionTablaController_editReactivo157_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionTablaEvaluacionEdit"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_editReactivo157_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.editReactivo(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "editReactivo", Seq(classOf[Long]),"GET", """""", Routes.prefix + """evaluacionTablaEvaluacionEdit"""))
        

// @LINE:251
private[this] lazy val controllers_AdminEvaluacionTablaController_saveReactivo158_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionTablaEvaluacionSave"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_saveReactivo158_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.saveReactivo(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "saveReactivo", Nil,"POST", """""", Routes.prefix + """evaluacionTablaEvaluacionSave"""))
        

// @LINE:252
private[this] lazy val controllers_AdminEvaluacionTablaController_updateReactivo159_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionTablaEvaluacionUpdate"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_updateReactivo159_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.updateReactivo(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "updateReactivo", Seq(classOf[Long]),"POST", """""", Routes.prefix + """evaluacionTablaEvaluacionUpdate"""))
        

// @LINE:253
private[this] lazy val controllers_AdminEvaluacionTablaController_deleteReactivo160_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionTablaEvaluacionDelete"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_deleteReactivo160_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.deleteReactivo(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "deleteReactivo", Seq(classOf[Long]),"POST", """""", Routes.prefix + """evaluacionTablaEvaluacionDelete"""))
        

// @LINE:255
private[this] lazy val controllers_AdminEvaluacionTablaController_removeTablaEvaluacion161_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionTablaRemove"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_removeTablaEvaluacion161_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.removeTablaEvaluacion(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "removeTablaEvaluacion", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """evaluacionTablaRemove"""))
        

// @LINE:256
private[this] lazy val controllers_AdminEvaluacionTablaController_listarTabla162_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionTablaEvaluacionList"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_listarTabla162_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.listarTabla(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listarTabla", Seq(classOf[Long]),"GET", """""", Routes.prefix + """evaluacionTablaEvaluacionList"""))
        

// @LINE:260
private[this] lazy val controllers_AdminEvaluacionTablaController_listarTablaDTSS163_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionTablaEvaluacionListDTSS"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_listarTablaDTSS163_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.listarTablaDTSS(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listarTablaDTSS", Nil,"GET", """""", Routes.prefix + """evaluacionTablaEvaluacionListDTSS"""))
        

// @LINE:262
private[this] lazy val controllers_AdminEvaluacionTablaController_listarReactivosInstrumento164_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listarReactivosInstrumento"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_listarReactivosInstrumento164_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.listarReactivosInstrumento(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listarReactivosInstrumento", Nil,"GET", """""", Routes.prefix + """listarReactivosInstrumento"""))
        

// @LINE:264
private[this] lazy val controllers_AdminEvaluacionTablaController_editTablaEvaluacion165_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tablaEvaluacionEdit"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_editTablaEvaluacion165_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.editTablaEvaluacion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "editTablaEvaluacion", Seq(classOf[Long]),"POST", """""", Routes.prefix + """tablaEvaluacionEdit"""))
        

// @LINE:265
private[this] lazy val controllers_AdminEvaluacionTablaController_listaReactivos166_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listaReactivos/"),DynamicPart("version", """[^/]+""",true))))
private[this] lazy val controllers_AdminEvaluacionTablaController_listaReactivos166_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.listaReactivos(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listaReactivos", Seq(classOf[Long]),"GET", """""", Routes.prefix + """listaReactivos/$version<[^/]+>"""))
        

// @LINE:266
private[this] lazy val controllers_AdminEvaluacionTablaController_listaEvaluacionTablaAjax167_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listaEvaluacionTablaAjax/"),DynamicPart("version", """[^/]+""",true),StaticPart("/"),DynamicPart("desde", """[^/]+""",true),StaticPart("/"),DynamicPart("hasta", """[^/]+""",true))))
private[this] lazy val controllers_AdminEvaluacionTablaController_listaEvaluacionTablaAjax167_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.listaEvaluacionTablaAjax(fakeValue[Long], fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listaEvaluacionTablaAjax", Seq(classOf[Long], classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """listaEvaluacionTablaAjax/$version<[^/]+>/$desde<[^/]+>/$hasta<[^/]+>"""))
        

// @LINE:270
private[this] lazy val controllers_TablaEvaluacionVersionController_versionCreate168_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nuevaVersion"))))
private[this] lazy val controllers_TablaEvaluacionVersionController_versionCreate168_invoker = createInvoker(
controllers.TablaEvaluacionVersionController.versionCreate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TablaEvaluacionVersionController", "versionCreate", Nil,"POST", """""", Routes.prefix + """nuevaVersion"""))
        

// @LINE:271
private[this] lazy val controllers_TablaEvaluacionVersionController_toggle169_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("toggle/"),DynamicPart("idVersion", """[^/]+""",true))))
private[this] lazy val controllers_TablaEvaluacionVersionController_toggle169_invoker = createInvoker(
controllers.TablaEvaluacionVersionController.toggle(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TablaEvaluacionVersionController", "toggle", Seq(classOf[Long]),"POST", """""", Routes.prefix + """toggle/$idVersion<[^/]+>"""))
        

// @LINE:272
private[this] lazy val controllers_AdminEvaluacionTablaController_agregarReactivo170_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluacionTablaAgregarReactivo"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_agregarReactivo170_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.agregarReactivo(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "agregarReactivo", Nil,"GET", """""", Routes.prefix + """evaluacionTablaAgregarReactivo"""))
        

// @LINE:274
private[this] lazy val controllers_ProrrogaController_list171_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prorrogaList"))))
private[this] lazy val controllers_ProrrogaController_list171_invoker = createInvoker(
controllers.ProrrogaController.list(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProrrogaController", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int]),"GET", """""", Routes.prefix + """prorrogaList"""))
        

// @LINE:276
private[this] lazy val controllers_ProrrogaController_save172_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prorrogaSave/"),DynamicPart("idRecEv", """[^/]+""",true))))
private[this] lazy val controllers_ProrrogaController_save172_invoker = createInvoker(
controllers.ProrrogaController.save(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProrrogaController", "save", Seq(classOf[Long]),"POST", """GET		/prorrogaCreate/:idRecEv/:ndias				controllers.ProrrogaController.create(idRecEv:Long, ndias:Int)""", Routes.prefix + """prorrogaSave/$idRecEv<[^/]+>"""))
        

// @LINE:277
private[this] lazy val controllers_ProrrogaController_edit173_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prorrogaEdit/"),DynamicPart("idRecEv", """[^/]+""",true),StaticPart("/"),DynamicPart("ndias", """[^/]+""",true))))
private[this] lazy val controllers_ProrrogaController_edit173_invoker = createInvoker(
controllers.ProrrogaController.edit(fakeValue[Long], fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProrrogaController", "edit", Seq(classOf[Long], classOf[Int]),"GET", """""", Routes.prefix + """prorrogaEdit/$idRecEv<[^/]+>/$ndias<[^/]+>"""))
        

// @LINE:278
private[this] lazy val controllers_ProrrogaController_delete174_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prorrogaDelete/"),DynamicPart("idPro", """[^/]+""",true))))
private[this] lazy val controllers_ProrrogaController_delete174_invoker = createInvoker(
controllers.ProrrogaController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProrrogaController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """prorrogaDelete/$idPro<[^/]+>"""))
        

// @LINE:279
private[this] lazy val controllers_EvaluacionEvaluadorController_solicitarProrroga175_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("prorrogaSolicitar/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("idAspecto", """[^/]+""",true),StaticPart("/"),DynamicPart("ndias", """[^/]+""",true))))
private[this] lazy val controllers_EvaluacionEvaluadorController_solicitarProrroga175_invoker = createInvoker(
controllers.EvaluacionEvaluadorController.solicitarProrroga(fakeValue[Long], fakeValue[Long], fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "solicitarProrroga", Seq(classOf[Long], classOf[Long], classOf[Int]),"POST", """""", Routes.prefix + """prorrogaSolicitar/$id<[^/]+>/$idAspecto<[^/]+>/$ndias<[^/]+>"""))
        

// @LINE:282
private[this] lazy val controllers_EncuestaWebController_create176_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("encuesta"))))
private[this] lazy val controllers_EncuestaWebController_create176_invoker = createInvoker(
controllers.EncuestaWebController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "create", Nil,"GET", """""", Routes.prefix + """encuesta"""))
        

// @LINE:283
private[this] lazy val controllers_EncuestaWebController_save177_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("encuesta/save"))))
private[this] lazy val controllers_EncuestaWebController_save177_invoker = createInvoker(
controllers.EncuestaWebController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "save", Nil,"POST", """""", Routes.prefix + """encuesta/save"""))
        

// @LINE:284
private[this] lazy val controllers_EncuestaWebController_recibida178_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("encuestaRecibida"))))
private[this] lazy val controllers_EncuestaWebController_recibida178_invoker = createInvoker(
controllers.EncuestaWebController.recibida(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "recibida", Nil,"GET", """""", Routes.prefix + """encuestaRecibida"""))
        

// @LINE:285
private[this] lazy val controllers_EncuestaWebController_atiendeObservaciones179_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("encuestaConObservaciones"))))
private[this] lazy val controllers_EncuestaWebController_atiendeObservaciones179_invoker = createInvoker(
controllers.EncuestaWebController.atiendeObservaciones(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "atiendeObservaciones", Nil,"GET", """""", Routes.prefix + """encuestaConObservaciones"""))
        

// @LINE:286
private[this] lazy val controllers_EncuestaWebController_update180_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("actualizaEncuesta"))))
private[this] lazy val controllers_EncuestaWebController_update180_invoker = createInvoker(
controllers.EncuestaWebController.update(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "update", Nil,"GET", """""", Routes.prefix + """actualizaEncuesta"""))
        

// @LINE:287
private[this] lazy val controllers_EncuestaWebController_desdeLiga181_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("desdeLiga/"),DynamicPart("nc", """[^/]+""",true))))
private[this] lazy val controllers_EncuestaWebController_desdeLiga181_invoker = createInvoker(
controllers.EncuestaWebController.desdeLiga(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "desdeLiga", Seq(classOf[String]),"GET", """""", Routes.prefix + """desdeLiga/$nc<[^/]+>"""))
        

// @LINE:289
private[this] lazy val controllers_EncuestaController_encuestasPorRevisar182_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("encuestasPorRevisarAdmin"))))
private[this] lazy val controllers_EncuestaController_encuestasPorRevisar182_invoker = createInvoker(
controllers.EncuestaController.encuestasPorRevisar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "encuestasPorRevisar", Nil,"GET", """""", Routes.prefix + """encuestasPorRevisarAdmin"""))
        

// @LINE:290
private[this] lazy val controllers_EncuestaController_encuestaPorRevisar183_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("encuestaPorRevisarAdmin"))))
private[this] lazy val controllers_EncuestaController_encuestaPorRevisar183_invoker = createInvoker(
controllers.EncuestaController.encuestaPorRevisar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "encuestaPorRevisar", Seq(classOf[Long]),"GET", """""", Routes.prefix + """encuestaPorRevisarAdmin"""))
        

// @LINE:291
private[this] lazy val controllers_EncuestaController_agregarObservaciones184_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("encuestaAgregarObservaciones"))))
private[this] lazy val controllers_EncuestaController_agregarObservaciones184_invoker = createInvoker(
controllers.EncuestaController.agregarObservaciones(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "agregarObservaciones", Seq(classOf[Long]),"POST", """""", Routes.prefix + """encuestaAgregarObservaciones"""))
        

// @LINE:292
private[this] lazy val controllers_EncuestaController_conObservacionesList185_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("conObservacionesList"))))
private[this] lazy val controllers_EncuestaController_conObservacionesList185_invoker = createInvoker(
controllers.EncuestaController.conObservacionesList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "conObservacionesList", Nil,"GET", """""", Routes.prefix + """conObservacionesList"""))
        

// @LINE:293
private[this] lazy val controllers_EncuestaController_terminadasList186_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminadasList"))))
private[this] lazy val controllers_EncuestaController_terminadasList186_invoker = createInvoker(
controllers.EncuestaController.terminadasList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "terminadasList", Nil,"GET", """""", Routes.prefix + """terminadasList"""))
        

// @LINE:294
private[this] lazy val controllers_EncuestaController_conObservaciones187_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("encConObservaciones"))))
private[this] lazy val controllers_EncuestaController_conObservaciones187_invoker = createInvoker(
controllers.EncuestaController.conObservaciones(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "conObservaciones", Seq(classOf[Long]),"GET", """""", Routes.prefix + """encConObservaciones"""))
        

// @LINE:301
private[this] lazy val controllers_HistorialController_ajaxActualizaLog188_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajaxActualizaLog/"),DynamicPart("nitems", """[^/]+""",true))))
private[this] lazy val controllers_HistorialController_ajaxActualizaLog188_invoker = createInvoker(
controllers.HistorialController.ajaxActualizaLog(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.HistorialController", "ajaxActualizaLog", Seq(classOf[Int]),"GET", """GET		/actualizaLog							controllers.HistorialController.actualizaLog()""", Routes.prefix + """ajaxActualizaLog/$nitems<[^/]+>"""))
        

// @LINE:302
private[this] lazy val controllers_RecursoWebController_conObservacionesAn189_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("conObservacionesAn"))))
private[this] lazy val controllers_RecursoWebController_conObservacionesAn189_invoker = createInvoker(
controllers.RecursoWebController.conObservacionesAn(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "conObservacionesAn", Nil,"GET", """""", Routes.prefix + """conObservacionesAn"""))
        

// @LINE:304
private[this] lazy val controllers_Application_javascriptRoutes190_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("javascriptRoutes"))))
private[this] lazy val controllers_Application_javascriptRoutes190_invoker = createInvoker(
controllers.Application.javascriptRoutes,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "javascriptRoutes", Nil,"GET", """""", Routes.prefix + """javascriptRoutes"""))
        

// @LINE:308
private[this] lazy val controllers_RecursoWebController_reporteEvaluacion191_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reporteEvaluacion"))))
private[this] lazy val controllers_RecursoWebController_reporteEvaluacion191_invoker = createInvoker(
controllers.RecursoWebController.reporteEvaluacion(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "reporteEvaluacion", Nil,"GET", """""", Routes.prefix + """reporteEvaluacion"""))
        

// @LINE:312
private[this] lazy val controllers_RecursoevaluadorController_reporteEvaluacion192_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/reporteEvaluacion/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_reporteEvaluacion192_invoker = createInvoker(
controllers.RecursoevaluadorController.reporteEvaluacion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "reporteEvaluacion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """admin/reporteEvaluacion/$id<[^/]+>"""))
        

// @LINE:314
private[this] lazy val controllers_DirigidoaController_list193_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dirigidoa"))))
private[this] lazy val controllers_DirigidoaController_list193_invoker = createInvoker(
controllers.DirigidoaController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "list", Nil,"GET", """""", Routes.prefix + """dirigidoa"""))
        

// @LINE:315
private[this] lazy val controllers_DirigidoaController_create194_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dirigidoa/create"))))
private[this] lazy val controllers_DirigidoaController_create194_invoker = createInvoker(
controllers.DirigidoaController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "create", Nil,"GET", """""", Routes.prefix + """dirigidoa/create"""))
        

// @LINE:316
private[this] lazy val controllers_DirigidoaController_save195_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dirigidoa/save"))))
private[this] lazy val controllers_DirigidoaController_save195_invoker = createInvoker(
controllers.DirigidoaController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "save", Nil,"GET", """""", Routes.prefix + """dirigidoa/save"""))
        

// @LINE:317
private[this] lazy val controllers_DirigidoaController_edit196_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dirigidoa/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_DirigidoaController_edit196_invoker = createInvoker(
controllers.DirigidoaController.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """dirigidoa/$id<[^/]+>/edit"""))
        

// @LINE:318
private[this] lazy val controllers_DirigidoaController_update197_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dirigidoa/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
private[this] lazy val controllers_DirigidoaController_update197_invoker = createInvoker(
controllers.DirigidoaController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "update", Seq(classOf[Long]),"GET", """""", Routes.prefix + """dirigidoa/$id<[^/]+>/update"""))
        

// @LINE:319
private[this] lazy val controllers_DirigidoaController_delete198_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dirigidoa/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_DirigidoaController_delete198_invoker = createInvoker(
controllers.DirigidoaController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """dirigidoa/$id<[^/]+>/delete"""))
        

// @LINE:323
private[this] lazy val controllers_RecursoevaluadorController_pruebaCorreo199_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pruebaCorreo2"))))
private[this] lazy val controllers_RecursoevaluadorController_pruebaCorreo199_invoker = createInvoker(
controllers.RecursoevaluadorController.pruebaCorreo(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "pruebaCorreo", Nil,"GET", """""", Routes.prefix + """pruebaCorreo2"""))
        

// @LINE:326
private[this] lazy val controllers_Application_leerXL4200_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leerXL4"))))
private[this] lazy val controllers_Application_leerXL4200_invoker = createInvoker(
controllers.Application.leerXL4(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "leerXL4", Nil,"GET", """""", Routes.prefix + """leerXL4"""))
        

// @LINE:327
private[this] lazy val controllers_EvaluadorController_existeMail201_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validarExistenciaEmail"))))
private[this] lazy val controllers_EvaluadorController_existeMail201_invoker = createInvoker(
controllers.EvaluadorController.existeMail(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "existeMail", Seq(classOf[String]),"GET", """""", Routes.prefix + """validarExistenciaEmail"""))
        

// @LINE:328
private[this] lazy val controllers_EvaluadorController_existeUserPass202_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validarExistenciaUserPass/"),DynamicPart("user", """[^/]+""",true),StaticPart("/"),DynamicPart("pass", """[^/]+""",true))))
private[this] lazy val controllers_EvaluadorController_existeUserPass202_invoker = createInvoker(
controllers.EvaluadorController.existeUserPass(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "existeUserPass", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """validarExistenciaUserPass/$user<[^/]+>/$pass<[^/]+>"""))
        

// @LINE:330
private[this] lazy val controllers_OficioValoracionController_create203_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crearOficioValoracion/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_OficioValoracionController_create203_invoker = createInvoker(
controllers.OficioValoracionController.create(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioValoracionController", "create", Seq(classOf[Long]),"GET", """""", Routes.prefix + """crearOficioValoracion/$id<[^/]+>"""))
        

// @LINE:331
private[this] lazy val controllers_OficioValoracionController_list204_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listarOficioValoracion"))))
private[this] lazy val controllers_OficioValoracionController_list204_invoker = createInvoker(
controllers.OficioValoracionController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioValoracionController", "list", Nil,"GET", """""", Routes.prefix + """listarOficioValoracion"""))
        

// @LINE:332
private[this] lazy val controllers_OficioValoracionController_save205_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("OficioValoracionSave/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_OficioValoracionController_save205_invoker = createInvoker(
controllers.OficioValoracionController.save(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioValoracionController", "save", Seq(classOf[Long]),"POST", """""", Routes.prefix + """OficioValoracionSave/$id<[^/]+>"""))
        

// @LINE:334
private[this] lazy val controllers_Application_Acerca206_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Acerca"))))
private[this] lazy val controllers_Application_Acerca206_invoker = createInvoker(
controllers.Application.Acerca(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Acerca", Nil,"GET", """""", Routes.prefix + """Acerca"""))
        

// @LINE:336
private[this] lazy val controllers_RecursoevaluadorController_evaluada207_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluada/"),DynamicPart("idRe", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_evaluada207_invoker = createInvoker(
controllers.RecursoevaluadorController.evaluada(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "evaluada", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """evaluada/$idRe<[^/]+>"""))
        

// @LINE:337
private[this] lazy val controllers_RecursoevaluadorController_evaluadas208_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluadas/"),DynamicPart("idRecurso", """[^/]+""",true))))
private[this] lazy val controllers_RecursoevaluadorController_evaluadas208_invoker = createInvoker(
controllers.RecursoevaluadorController.evaluadas(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "evaluadas", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """evaluadas/$idRecurso<[^/]+>"""))
        

// @LINE:339
private[this] lazy val controllers_EncuestaController_conEncuestasAceptadas209_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("conEncuestasAceptadas"))))
private[this] lazy val controllers_EncuestaController_conEncuestasAceptadas209_invoker = createInvoker(
controllers.EncuestaController.conEncuestasAceptadas(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "conEncuestasAceptadas", Nil,"GET", """""", Routes.prefix + """conEncuestasAceptadas"""))
        

// @LINE:341
private[this] lazy val controllers_AutorController_list210_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autores"))))
private[this] lazy val controllers_AutorController_list210_invoker = createInvoker(
controllers.AutorController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorController", "list", Nil,"GET", """""", Routes.prefix + """autores"""))
        

// @LINE:342
private[this] lazy val controllers_AutorController_editEmail211_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editarEmail/"),DynamicPart("idAutor", """[^/]+""",true))))
private[this] lazy val controllers_AutorController_editEmail211_invoker = createInvoker(
controllers.AutorController.editEmail(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorController", "editEmail", Seq(classOf[Long]),"GET", """""", Routes.prefix + """editarEmail/$idAutor<[^/]+>"""))
        

// @LINE:343
private[this] lazy val controllers_AutorController_updateEmail212_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateEmail/"),DynamicPart("idAutor", """[^/]+""",true))))
private[this] lazy val controllers_AutorController_updateEmail212_invoker = createInvoker(
controllers.AutorController.updateEmail(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorController", "updateEmail", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateEmail/$idAutor<[^/]+>"""))
        

// @LINE:346
private[this] lazy val controllers_RecursoWebController_ajaxUnidadAcademicaFiltrada213_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajaxUnidadAcademicaFiltrada/"),DynamicPart("nivel", """[^/]+""",true))))
private[this] lazy val controllers_RecursoWebController_ajaxUnidadAcademicaFiltrada213_invoker = createInvoker(
controllers.RecursoWebController.ajaxUnidadAcademicaFiltrada(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "ajaxUnidadAcademicaFiltrada", Seq(classOf[Long]),"GET", """GET     /ajaxUnidadAcademicaFiltrada/:nivel/:area             controllers.RecursoWebController.ajaxUnidadAcademicaFiltrada(nivel:Long, area:Long)""", Routes.prefix + """ajaxUnidadAcademicaFiltrada/$nivel<[^/]+>"""))
        

// @LINE:347
private[this] lazy val controllers_UnidadacademicaController_ajaxListaDTSS214_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajaxListaDTSS"))))
private[this] lazy val controllers_UnidadacademicaController_ajaxListaDTSS214_invoker = createInvoker(
controllers.UnidadacademicaController.ajaxListaDTSS(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "ajaxListaDTSS", Nil,"GET", """""", Routes.prefix + """ajaxListaDTSS"""))
        

// @LINE:349
private[this] lazy val controllers_Application_errorInicioSesion215_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("errorInicioSesion"))))
private[this] lazy val controllers_Application_errorInicioSesion215_invoker = createInvoker(
controllers.Application.errorInicioSesion(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "errorInicioSesion", Nil,"GET", """""", Routes.prefix + """errorInicioSesion"""))
        

// @LINE:351
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionAspecto216_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajaxEditTablaEvaluacionAspecto"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionAspecto216_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionAspecto(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxEditTablaEvaluacionAspecto", Nil,"POST", """""", Routes.prefix + """ajaxEditTablaEvaluacionAspecto"""))
        

// @LINE:352
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionCriterio217_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajaxEditTablaEvaluacionCriterio"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionCriterio217_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionCriterio(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxEditTablaEvaluacionCriterio", Nil,"POST", """""", Routes.prefix + """ajaxEditTablaEvaluacionCriterio"""))
        

// @LINE:353
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionTipoRecurso218_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajaxEditTablaEvaluacionTipoRecurso"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionTipoRecurso218_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionTipoRecurso(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxEditTablaEvaluacionTipoRecurso", Nil,"POST", """""", Routes.prefix + """ajaxEditTablaEvaluacionTipoRecurso"""))
        

// @LINE:355
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxEliminaReactivoTablaEvaluacion219_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajaxEliminaReactivoTablaEvaluacion"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxEliminaReactivoTablaEvaluacion219_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.ajaxEliminaReactivoTablaEvaluacion(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxEliminaReactivoTablaEvaluacion", Nil,"POST", """""", Routes.prefix + """ajaxEliminaReactivoTablaEvaluacion"""))
        

// @LINE:356
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxAgregarReactivoTablaEvaluacion220_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajaxAgregarReactivoTablaEvaluacion"))))
private[this] lazy val controllers_AdminEvaluacionTablaController_ajaxAgregarReactivoTablaEvaluacion220_invoker = createInvoker(
controllers.AdminEvaluacionTablaController.ajaxAgregarReactivoTablaEvaluacion(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxAgregarReactivoTablaEvaluacion", Nil,"POST", """""", Routes.prefix + """ajaxAgregarReactivoTablaEvaluacion"""))
        

// @LINE:359
private[this] lazy val controllers_CoordinadorController_index221_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("evaluadoresnadorAdmin"))))
private[this] lazy val controllers_CoordinadorController_index221_invoker = createInvoker(
controllers.CoordinadorController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CoordinadorController", "index", Nil,"GET", """""", Routes.prefix + """evaluadoresnadorAdmin"""))
        

// @LINE:361
private[this] lazy val controllers_RecursoWebController_WSBuscarNC2222_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("WSBuscarNC2"))))
private[this] lazy val controllers_RecursoWebController_WSBuscarNC2222_invoker = createInvoker(
controllers.RecursoWebController.WSBuscarNC2(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "WSBuscarNC2", Seq(classOf[String]),"GET", """""", Routes.prefix + """WSBuscarNC2"""))
        

// @LINE:362
private[this] lazy val controllers_RecursoWebController_WSAjaxImprimirSolicitudAceptada223_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("WSImprimirSolicitudAceptada/"),DynamicPart("idRecurso", """[^/]+""",true))))
private[this] lazy val controllers_RecursoWebController_WSAjaxImprimirSolicitudAceptada223_invoker = createInvoker(
controllers.RecursoWebController.WSAjaxImprimirSolicitudAceptada(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "WSAjaxImprimirSolicitudAceptada", Seq(classOf[Long]),"GET", """""", Routes.prefix + """WSImprimirSolicitudAceptada/$idRecurso<[^/]+>"""))
        

// @LINE:363
private[this] lazy val controllers_RecursoWebController_WSAjaxImprimirReporteETP224_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("WSAjaxImprimirReporteETP/"),DynamicPart("idRecurso", """[^/]+""",true))))
private[this] lazy val controllers_RecursoWebController_WSAjaxImprimirReporteETP224_invoker = createInvoker(
controllers.RecursoWebController.WSAjaxImprimirReporteETP(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "WSAjaxImprimirReporteETP", Seq(classOf[Long]),"GET", """""", Routes.prefix + """WSAjaxImprimirReporteETP/$idRecurso<[^/]+>"""))
        

// @LINE:368
private[this] lazy val controllers_RecursoWebController_index2225_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index2"))))
private[this] lazy val controllers_RecursoWebController_index2225_invoker = createInvoker(
controllers.RecursoWebController.index2(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "index2", Nil,"GET", """""", Routes.prefix + """index2"""))
        

// @LINE:369
private[this] lazy val controllers_RecursoWebController_pingWs226_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pingWs"))))
private[this] lazy val controllers_RecursoWebController_pingWs226_invoker = createInvoker(
controllers.RecursoWebController.pingWs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "pingWs", Nil,"GET", """""", Routes.prefix + """pingWs"""))
        

// @LINE:371
private[this] lazy val controllers_RecursoWebController_socket227_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("socket"))))
private[this] lazy val controllers_RecursoWebController_socket227_invoker = createInvoker(
controllers.RecursoWebController.socket(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "socket", Nil,"GET", """""", Routes.prefix + """socket"""))
        

// @LINE:372
private[this] lazy val controllers_RecursoWebController_enviarSocket228_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("enviarSocket"))))
private[this] lazy val controllers_RecursoWebController_enviarSocket228_invoker = createInvoker(
controllers.RecursoWebController.enviarSocket(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "enviarSocket", Nil,"GET", """""", Routes.prefix + """enviarSocket"""))
        
def documentation = List(("""GET""", prefix,"""controllers.RecursoWebController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solRecibida/$nc<[^/]+>""","""controllers.RecursoWebController.recibido(nc:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autentica""","""controllers.Application.autentica()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timeOut""","""controllers.Application.timeOut()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.AdminController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coord""","""controllers.CoordinadorController.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cambiarPassword""","""controllers.Application.cambiarPassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cambiarEmail""","""controllers.Application.cambiarEmail()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ev""","""controllers.EvaluacionEvaluadorController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evResumen""","""controllers.EvaluacionEvaluadorController.resumen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """porEvaluar""","""controllers.EvaluacionEvaluadorController.porEvaluar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """enProceso""","""controllers.EvaluacionEvaluadorController.enProceso()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evList""","""controllers.EvaluacionEvaluadorController.listado(p:Int ?= 0, s:String ?= "auditinsert", o:String ?= "desc", f:String ?= "", c:String ?= "auditinsert", sol:Int ?= -1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evCreate""","""controllers.EvaluacionEvaluadorController.create(id:Long, idAspecto:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evEdit""","""controllers.EvaluacionEvaluadorController.edit(id:Long, idAspecto:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evVerDetalle/$id<[^/]+>""","""controllers.EvaluacionEvaluadorController.verDetalle(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evSave/$id<[^/]+>/$idAspecto<[^/]+>""","""controllers.EvaluacionEvaluadorController.save(id:Long, idAspecto:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evPorAtenderAdmin""","""controllers.EvaluacionEvaluadorController.porAtenderAdmin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evPorObservar""","""controllers.EvaluacionEvaluadorController.porObservar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evConcluidas""","""controllers.EvaluacionEvaluadorController.concluidas()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evSolicitudesCancelacion""","""controllers.EvaluacionEvaluadorController.solicitudesCancelacion()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evAtenderObservaciones/$id<[^/]+>/$aspecto<[^/]+>""","""controllers.EvaluacionEvaluadorController.atenderObservaciones(id:Long, aspecto:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evSaveObservaciones/$id<[^/]+>/$aspecto<[^/]+>""","""controllers.EvaluacionEvaluadorController.saveObservaciones(id:Long, aspecto:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evSolicitudCancelacion/$id<[^/]+>""","""controllers.CancelacionController.solicitudCancelacion(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evCanceladasEvaluacion""","""controllers.EvaluacionEvaluadorController.canceladasEvaluacion()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evCanceladaEvaluacion""","""controllers.EvaluacionEvaluadorController.canceladaEvaluacion(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evSaveObservaciones/$id<[^/]+>/$aspecto<[^/]+>""","""controllers.AdminEvaluacionController.saveObservaciones(id:Long, aspecto:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursoweb/new""","""controllers.RecursoWebController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursoweb""","""controllers.RecursoWebController.mastersave()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursoweb/$id<[^/]+>""","""controllers.RecursoWebController.masteredit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursowebAn""","""controllers.RecursoWebController.mastereditAn()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursoweb/$id<[^/]+>""","""controllers.RecursoWebController.masterupdate(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aceptada""","""controllers.RecursoWebController.imprimirSolicitudAceptada()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """verDatosEnviados""","""controllers.RecursoWebController.verDatosEnviados()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursos/observarList""","""controllers.RecursoController.porObservarList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursos/reObservarList""","""controllers.RecursoController.porReObservarList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursos/completoList""","""controllers.RecursoController.completoList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursos/observar/$id<[^/]+>""","""controllers.RecursoController.observar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """observaciones""","""controllers.RecursoController.observacionessave()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """revisar/$id<[^/]+>/$aspecto<[^/]+>""","""controllers.RecursoController.revisar(id:Long, aspecto:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursos""","""controllers.RecursoController.list(p:Int ?= 0, s:String ?= "auditinsert", o:String ?= "desc", f:String ?= "", c:String ?= "auditinsert")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursos/$id<[^/]+>""","""controllers.RecursoController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursos/$id<[^/]+>/delete""","""controllers.RecursoController.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursos/$id<[^/]+>""","""controllers.RecursoController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajaxListTabla""","""controllers.RecursoController.ajaxListTabla(p:Int ?= 0, s:String ?= "auditinsert", o:String ?= "desc", f:String ?= "", c:String ?= "auditinsert")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recursos/$id<[^/]+>/ajaxDelete""","""controllers.RecursoController.ajaxDelete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """oficios""","""controllers.OficioController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """oficios/$id<[^/]+>/asignarOficio""","""controllers.OficioController.create(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """oficios/$id<[^/]+>/oficioSave""","""controllers.OficioController.save(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """oficios/$id<[^/]+>/edit""","""controllers.OficioController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """oficios/$id<[^/]+>/update""","""controllers.OficioController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """verOficio/$id<[^/]+>""","""controllers.OficioController.verOficio(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """actualizacionesList""","""controllers.VersionanteriorController.listaActualizaciones()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """actualizaciones/$id<[^/]+>/delete""","""controllers.VersionanteriorController.eliminarActualizaciones(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """actualizacionesCreate""","""controllers.VersionanteriorController.create(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """actualizacionesSave/$id<[^/]+>""","""controllers.VersionanteriorController.save(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autorfuncion""","""controllers.AutorfuncionController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autorfuncion/new""","""controllers.AutorfuncionController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autorfuncion""","""controllers.AutorfuncionController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autorfuncion/$id<[^/]+>""","""controllers.AutorfuncionController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autorfuncion/$id<[^/]+>/delete""","""controllers.AutorfuncionController.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autorfuncion/new""","""controllers.AutorfuncionController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nivelList""","""controllers.NiveleducativoController.listDT()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nivel/new""","""controllers.NiveleducativoController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nivel""","""controllers.NiveleducativoController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nivel/$id<[^/]+>""","""controllers.NiveleducativoController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nivel/$id<[^/]+>/delete""","""controllers.NiveleducativoController.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nivel/$id<[^/]+>""","""controllers.NiveleducativoController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areaconocimientos""","""controllers.AreaconocimientoController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areaconocimientos/new""","""controllers.AreaconocimientoController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areaconocimientos""","""controllers.AreaconocimientoController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areaconocimientos/$id<[^/]+>""","""controllers.AreaconocimientoController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areaconocimientos/$id<[^/]+>/delete""","""controllers.AreaconocimientoController.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areaconocimientos/$id<[^/]+>""","""controllers.AreaconocimientoController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadacademica""","""controllers.UnidadacademicaController.list(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadacademica/new""","""controllers.UnidadacademicaController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadacademica""","""controllers.UnidadacademicaController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadacademica/$id<[^/]+>""","""controllers.UnidadacademicaController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadacademica/$id<[^/]+>/delete""","""controllers.UnidadacademicaController.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadacademica/$id<[^/]+>""","""controllers.UnidadacademicaController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """master""","""controllers.RecursoController.masterlist(p:Int ?= 0, s:String ?= "auditinsert", o:String ?= "desc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buscarNC/$nc<[^/]+>""","""controllers.RecursoWebController.buscarNC(nc:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """documento""","""controllers.DocumentoController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """documento/upload""","""controllers.DocumentoController.upload()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """documento/verAn/$id<[^/]+>""","""controllers.RecursoWebController.verAn(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """documento/ver/$id<[^/]+>""","""controllers.RecursoController.ver(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """documento/verOficioValoracion/$id<[^/]+>""","""controllers.RecursoController.verOficioValoracion(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reporte/cesoe/$id<[^/]+>""","""controllers.ReporteController.cesoe(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reporte/solicitudFirma/$id<[^/]+>""","""controllers.ReporteController.solicitudFirma(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluadores""","""controllers.EvaluadorController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluador/new""","""controllers.EvaluadorController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluador""","""controllers.EvaluadorController.save()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluador/$id<[^/]+>/delete""","""controllers.EvaluadorController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluador/$id<[^/]+>/edit""","""controllers.EvaluadorController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluador/$id<[^/]+>/update""","""controllers.EvaluadorController.update2(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ctaCorreo""","""controllers.CtacorreoController.edit(id:Long ?= 1)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ctaCorreo/$id<[^/]+>/update""","""controllers.CtacorreoController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ctaAdminEdit""","""controllers.PersonalController.AdminEdit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ctaAdminEdit/update""","""controllers.PersonalController.AdminUpdate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ctaCoordEdit""","""controllers.PersonalController.CoordEdit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ctaCoordEdit/update""","""controllers.PersonalController.CoordUpdate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aspectos""","""controllers.AspectoController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aspecto/new""","""controllers.AspectoController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aspecto/$id<[^/]+>/delete""","""controllers.AspectoController.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aspecto/""","""controllers.AspectoController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aspecto/$id<[^/]+>/edit""","""controllers.AspectoController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aspecto/$id<[^/]+>/update""","""controllers.AspectoController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """formatosentrega""","""controllers.FormatoentregaController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """formatoentrega/new""","""controllers.FormatoentregaController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """formatoentrega/$id<[^/]+>/delete""","""controllers.FormatoentregaController.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """formatoentrega/""","""controllers.FormatoentregaController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """formatoentrega/$id<[^/]+>/edit""","""controllers.FormatoentregaController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """formatoentrega/$id<[^/]+>/update""","""controllers.FormatoentregaController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tiposdocumentos""","""controllers.TipodocumentoController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tipodocumento/new""","""controllers.TipodocumentoController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tipodocumento/$id<[^/]+>/delete""","""controllers.TipodocumentoController.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tipodocumento/""","""controllers.TipodocumentoController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tipodocumento/$id<[^/]+>/edit""","""controllers.TipodocumentoController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tipodocumento/$id<[^/]+>/update""","""controllers.TipodocumentoController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pruebaCorreo""","""controllers.RecursoWebController.Correo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """asignarEvaluadores""","""controllers.RecursoevaluadorController.asignarEvaluadoresList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """asignarEvaluadores/$id<[^/]+>""","""controllers.RecursoevaluadorController.asignarEvaluadoresCreate(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """asignarEvaluadoresSave/$id<[^/]+>/$tipo<[^/]+>""","""controllers.RecursoevaluadorController.asignarEvaluadoresSave(id:Long, tipo:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mostrarEvaluadores/$id<[^/]+>""","""controllers.RecursoevaluadorController.mostrarEvaluadores(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mostrarEvaluacionesSinAtender/$tipo<[^/]+>""","""controllers.RecursoevaluadorController.mostrarEvaluacionesSinAtender(tipo:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mostrarEvaluacionesEnProceso/$tipo<[^/]+>""","""controllers.RecursoevaluadorController.mostrarEvaluacionesEnProceso(tipo:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mostrarEvaluacionesPorRevisar/$tipo<[^/]+>""","""controllers.RecursoevaluadorController.mostrarEvaluacionesPorRevisar(tipo:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mostrarEvaluacionesConObservaciones/$tipo<[^/]+>""","""controllers.RecursoevaluadorController.mostrarEvaluacionesConObservaciones(tipo:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mostrarEvaluacionesConcluidas/$tipo<[^/]+>/$device<[^/]+>""","""controllers.RecursoevaluadorController.mostrarEvaluacionesConcluidas(tipo:Int, device:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clasificacionList""","""controllers.ClasificacionController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clasificacionCreate""","""controllers.ClasificacionController.create(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clasificacionSave""","""controllers.ClasificacionController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clasificacionEdit""","""controllers.ClasificacionController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clasificacionUpdate""","""controllers.ClasificacionController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ejemplosClasificador""","""controllers.ClasificacionController.ejemplos(c1:Long, c2:Long, c3:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clasificacionRestricciones""","""controllers.ClasificacionController.clasificacionRestricciones()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """descripcionCriterio""","""controllers.ClasificacionController.descripcionCriterio"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """canceladoList""","""controllers.RecursoController.canceladosList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solicitudCanceladoList""","""controllers.RecursoController.solicitudCanceladoList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solicitudCancelado/$id<[^/]+>""","""controllers.RecursoController.solicitudCancelado(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cancelarRecursoEvaluacion""","""controllers.RecursoController.cancelarRecursoEvaluacion(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reactivarRecursoEvaluacion""","""controllers.RecursoController.reactivarRecursoEvaluacion(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """canceladosEvaluacion""","""controllers.RecursoController.canceladosEvaluacionList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """canceladosClasificacion""","""controllers.RecursoController.canceladosClasificacionList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """calendario""","""controllers.CalendarioController.inicio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """agregarFechaCalendario""","""controllers.CalendarioController.agregarFechaCalendario(desde:String, hasta:String, titulo:String, id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """eliminarFechaCalendario""","""controllers.CalendarioController.eliminarFechaCalendario(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """hoyMasDias""","""controllers.CalendarioController.hoyMasDias(nd:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fechaMasDias""","""controllers.CalendarioController.fechaMasDias(nd:Int, fechainicio:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cambio""","""controllers.RecursoController.cambio(id:Long, observacion:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cargaEvaluacionTabla""","""controllers.auxCargaDatosController.cargaEvaluacionTabla()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionReactivosList""","""controllers.AdminEvaluacionTablaController.listarReactivos(p:Int ?= 0, s:String ?= "auditinsert", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionTablaEvaluacionCreate""","""controllers.AdminEvaluacionTablaController.createReactivo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionTablaEvaluacionEdit""","""controllers.AdminEvaluacionTablaController.editReactivo(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionTablaEvaluacionSave""","""controllers.AdminEvaluacionTablaController.saveReactivo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionTablaEvaluacionUpdate""","""controllers.AdminEvaluacionTablaController.updateReactivo(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionTablaEvaluacionDelete""","""controllers.AdminEvaluacionTablaController.deleteReactivo(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionTablaRemove""","""controllers.AdminEvaluacionTablaController.removeTablaEvaluacion(idVersion:Long, idReactivo:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionTablaEvaluacionList""","""controllers.AdminEvaluacionTablaController.listarTabla(v:Long ?= 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionTablaEvaluacionListDTSS""","""controllers.AdminEvaluacionTablaController.listarTablaDTSS()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listarReactivosInstrumento""","""controllers.AdminEvaluacionTablaController.listarReactivosInstrumento()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tablaEvaluacionEdit""","""controllers.AdminEvaluacionTablaController.editTablaEvaluacion(idVersion:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listaReactivos/$version<[^/]+>""","""controllers.AdminEvaluacionTablaController.listaReactivos(version:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listaEvaluacionTablaAjax/$version<[^/]+>/$desde<[^/]+>/$hasta<[^/]+>""","""controllers.AdminEvaluacionTablaController.listaEvaluacionTablaAjax(version:Long, desde:Long, hasta:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nuevaVersion""","""controllers.TablaEvaluacionVersionController.versionCreate()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """toggle/$idVersion<[^/]+>""","""controllers.TablaEvaluacionVersionController.toggle(idVersion:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluacionTablaAgregarReactivo""","""controllers.AdminEvaluacionTablaController.agregarReactivo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prorrogaList""","""controllers.ProrrogaController.list(p:Int ?= 0, s:String ?= "auditinsert", o:String ?= "desc", f:String ?= "", c:String ?= "auditinsert", rdioSolicitud:Int ?= -1)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prorrogaSave/$idRecEv<[^/]+>""","""controllers.ProrrogaController.save(idRecEv:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prorrogaEdit/$idRecEv<[^/]+>/$ndias<[^/]+>""","""controllers.ProrrogaController.edit(idRecEv:Long, ndias:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prorrogaDelete/$idPro<[^/]+>""","""controllers.ProrrogaController.delete(idPro:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """prorrogaSolicitar/$id<[^/]+>/$idAspecto<[^/]+>/$ndias<[^/]+>""","""controllers.EvaluacionEvaluadorController.solicitarProrroga(id:Long, idAspecto:Long, ndias:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """encuesta""","""controllers.EncuestaWebController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """encuesta/save""","""controllers.EncuestaWebController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """encuestaRecibida""","""controllers.EncuestaWebController.recibida()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """encuestaConObservaciones""","""controllers.EncuestaWebController.atiendeObservaciones()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """actualizaEncuesta""","""controllers.EncuestaWebController.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """desdeLiga/$nc<[^/]+>""","""controllers.EncuestaWebController.desdeLiga(nc:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """encuestasPorRevisarAdmin""","""controllers.EncuestaController.encuestasPorRevisar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """encuestaPorRevisarAdmin""","""controllers.EncuestaController.encuestaPorRevisar(idEnc:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """encuestaAgregarObservaciones""","""controllers.EncuestaController.agregarObservaciones(idEnc:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """conObservacionesList""","""controllers.EncuestaController.conObservacionesList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminadasList""","""controllers.EncuestaController.terminadasList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """encConObservaciones""","""controllers.EncuestaController.conObservaciones(idEnc:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajaxActualizaLog/$nitems<[^/]+>""","""controllers.HistorialController.ajaxActualizaLog(nitems:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """conObservacionesAn""","""controllers.RecursoWebController.conObservacionesAn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """javascriptRoutes""","""controllers.Application.javascriptRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reporteEvaluacion""","""controllers.RecursoWebController.reporteEvaluacion()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/reporteEvaluacion/$id<[^/]+>""","""controllers.RecursoevaluadorController.reporteEvaluacion(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dirigidoa""","""controllers.DirigidoaController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dirigidoa/create""","""controllers.DirigidoaController.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dirigidoa/save""","""controllers.DirigidoaController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dirigidoa/$id<[^/]+>/edit""","""controllers.DirigidoaController.edit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dirigidoa/$id<[^/]+>/update""","""controllers.DirigidoaController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dirigidoa/$id<[^/]+>/delete""","""controllers.DirigidoaController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pruebaCorreo2""","""controllers.RecursoevaluadorController.pruebaCorreo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leerXL4""","""controllers.Application.leerXL4()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validarExistenciaEmail""","""controllers.EvaluadorController.existeMail(correo:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validarExistenciaUserPass/$user<[^/]+>/$pass<[^/]+>""","""controllers.EvaluadorController.existeUserPass(user:String, pass:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crearOficioValoracion/$id<[^/]+>""","""controllers.OficioValoracionController.create(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listarOficioValoracion""","""controllers.OficioValoracionController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """OficioValoracionSave/$id<[^/]+>""","""controllers.OficioValoracionController.save(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Acerca""","""controllers.Application.Acerca()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluada/$idRe<[^/]+>""","""controllers.RecursoevaluadorController.evaluada(idRe:Long, tipo:String ?= "0" )"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluadas/$idRecurso<[^/]+>""","""controllers.RecursoevaluadorController.evaluadas(idRecurso:Long, tipo:String ?= "0")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """conEncuestasAceptadas""","""controllers.EncuestaController.conEncuestasAceptadas()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autores""","""controllers.AutorController.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editarEmail/$idAutor<[^/]+>""","""controllers.AutorController.editEmail(idAutor:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateEmail/$idAutor<[^/]+>""","""controllers.AutorController.updateEmail(idAutor:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajaxUnidadAcademicaFiltrada/$nivel<[^/]+>""","""controllers.RecursoWebController.ajaxUnidadAcademicaFiltrada(nivel:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajaxListaDTSS""","""controllers.UnidadacademicaController.ajaxListaDTSS()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """errorInicioSesion""","""controllers.Application.errorInicioSesion()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajaxEditTablaEvaluacionAspecto""","""controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionAspecto()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajaxEditTablaEvaluacionCriterio""","""controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionCriterio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajaxEditTablaEvaluacionTipoRecurso""","""controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionTipoRecurso()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajaxEliminaReactivoTablaEvaluacion""","""controllers.AdminEvaluacionTablaController.ajaxEliminaReactivoTablaEvaluacion()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajaxAgregarReactivoTablaEvaluacion""","""controllers.AdminEvaluacionTablaController.ajaxAgregarReactivoTablaEvaluacion()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """evaluadoresnadorAdmin""","""controllers.CoordinadorController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """WSBuscarNC2""","""controllers.RecursoWebController.WSBuscarNC2(nc:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """WSImprimirSolicitudAceptada/$idRecurso<[^/]+>""","""controllers.RecursoWebController.WSAjaxImprimirSolicitudAceptada(idRecurso:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """WSAjaxImprimirReporteETP/$idRecurso<[^/]+>""","""controllers.RecursoWebController.WSAjaxImprimirReporteETP(idRecurso:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index2""","""controllers.RecursoWebController.index2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pingWs""","""controllers.RecursoWebController.pingWs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """socket""","""controllers.RecursoWebController.socket()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """enviarSocket""","""controllers.RecursoWebController.enviarSocket()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_RecursoWebController_index0_route(params) => {
   call { 
        controllers_RecursoWebController_index0_invoker.call(controllers.RecursoWebController.index())
   }
}
        

// @LINE:7
case controllers_RecursoWebController_recibido1_route(params) => {
   call(params.fromPath[String]("nc", None)) { (nc) =>
        controllers_RecursoWebController_recibido1_invoker.call(controllers.RecursoWebController.recibido(nc))
   }
}
        

// @LINE:9
case controllers_Application_login2_route(params) => {
   call { 
        controllers_Application_login2_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:10
case controllers_Application_logout3_route(params) => {
   call { 
        controllers_Application_logout3_invoker.call(controllers.Application.logout())
   }
}
        

// @LINE:11
case controllers_Application_autentica4_route(params) => {
   call { 
        controllers_Application_autentica4_invoker.call(controllers.Application.autentica())
   }
}
        

// @LINE:12
case controllers_Application_timeOut5_route(params) => {
   call { 
        controllers_Application_timeOut5_invoker.call(controllers.Application.timeOut())
   }
}
        

// @LINE:13
case controllers_AdminController_index6_route(params) => {
   call { 
        controllers_AdminController_index6_invoker.call(controllers.AdminController.index())
   }
}
        

// @LINE:14
case controllers_CoordinadorController_index7_route(params) => {
   call { 
        controllers_CoordinadorController_index7_invoker.call(controllers.CoordinadorController.index())
   }
}
        

// @LINE:15
case controllers_Application_cambiarPassword8_route(params) => {
   call { 
        controllers_Application_cambiarPassword8_invoker.call(controllers.Application.cambiarPassword())
   }
}
        

// @LINE:16
case controllers_Application_cambiarEmail9_route(params) => {
   call { 
        controllers_Application_cambiarEmail9_invoker.call(controllers.Application.cambiarEmail())
   }
}
        

// @LINE:18
case controllers_EvaluacionEvaluadorController_index10_route(params) => {
   call { 
        controllers_EvaluacionEvaluadorController_index10_invoker.call(controllers.EvaluacionEvaluadorController.index())
   }
}
        

// @LINE:19
case controllers_EvaluacionEvaluadorController_resumen11_route(params) => {
   call { 
        controllers_EvaluacionEvaluadorController_resumen11_invoker.call(controllers.EvaluacionEvaluadorController.resumen())
   }
}
        

// @LINE:20
case controllers_EvaluacionEvaluadorController_porEvaluar12_route(params) => {
   call { 
        controllers_EvaluacionEvaluadorController_porEvaluar12_invoker.call(controllers.EvaluacionEvaluadorController.porEvaluar())
   }
}
        

// @LINE:21
case controllers_EvaluacionEvaluadorController_enProceso13_route(params) => {
   call { 
        controllers_EvaluacionEvaluadorController_enProceso13_invoker.call(controllers.EvaluacionEvaluadorController.enProceso())
   }
}
        

// @LINE:22
case controllers_EvaluacionEvaluadorController_listado14_route(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("auditinsert")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("c", Some("auditinsert")), params.fromQuery[Int]("sol", Some(-1))) { (p, s, o, f, c, sol) =>
        controllers_EvaluacionEvaluadorController_listado14_invoker.call(controllers.EvaluacionEvaluadorController.listado(p, s, o, f, c, sol))
   }
}
        

// @LINE:26
case controllers_EvaluacionEvaluadorController_create15_route(params) => {
   call(params.fromQuery[Long]("id", None), params.fromQuery[Long]("idAspecto", None)) { (id, idAspecto) =>
        controllers_EvaluacionEvaluadorController_create15_invoker.call(controllers.EvaluacionEvaluadorController.create(id, idAspecto))
   }
}
        

// @LINE:32
case controllers_EvaluacionEvaluadorController_edit16_route(params) => {
   call(params.fromQuery[Long]("id", None), params.fromQuery[Long]("idAspecto", None)) { (id, idAspecto) =>
        controllers_EvaluacionEvaluadorController_edit16_invoker.call(controllers.EvaluacionEvaluadorController.edit(id, idAspecto))
   }
}
        

// @LINE:33
case controllers_EvaluacionEvaluadorController_verDetalle17_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EvaluacionEvaluadorController_verDetalle17_invoker.call(controllers.EvaluacionEvaluadorController.verDetalle(id))
   }
}
        

// @LINE:34
case controllers_EvaluacionEvaluadorController_save18_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("idAspecto", None)) { (id, idAspecto) =>
        controllers_EvaluacionEvaluadorController_save18_invoker.call(controllers.EvaluacionEvaluadorController.save(id, idAspecto))
   }
}
        

// @LINE:35
case controllers_EvaluacionEvaluadorController_porAtenderAdmin19_route(params) => {
   call { 
        controllers_EvaluacionEvaluadorController_porAtenderAdmin19_invoker.call(controllers.EvaluacionEvaluadorController.porAtenderAdmin())
   }
}
        

// @LINE:36
case controllers_EvaluacionEvaluadorController_porObservar20_route(params) => {
   call { 
        controllers_EvaluacionEvaluadorController_porObservar20_invoker.call(controllers.EvaluacionEvaluadorController.porObservar())
   }
}
        

// @LINE:37
case controllers_EvaluacionEvaluadorController_concluidas21_route(params) => {
   call { 
        controllers_EvaluacionEvaluadorController_concluidas21_invoker.call(controllers.EvaluacionEvaluadorController.concluidas())
   }
}
        

// @LINE:38
case controllers_EvaluacionEvaluadorController_solicitudesCancelacion22_route(params) => {
   call { 
        controllers_EvaluacionEvaluadorController_solicitudesCancelacion22_invoker.call(controllers.EvaluacionEvaluadorController.solicitudesCancelacion())
   }
}
        

// @LINE:39
case controllers_EvaluacionEvaluadorController_atenderObservaciones23_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("aspecto", None)) { (id, aspecto) =>
        controllers_EvaluacionEvaluadorController_atenderObservaciones23_invoker.call(controllers.EvaluacionEvaluadorController.atenderObservaciones(id, aspecto))
   }
}
        

// @LINE:41
case controllers_EvaluacionEvaluadorController_saveObservaciones24_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("aspecto", None)) { (id, aspecto) =>
        controllers_EvaluacionEvaluadorController_saveObservaciones24_invoker.call(controllers.EvaluacionEvaluadorController.saveObservaciones(id, aspecto))
   }
}
        

// @LINE:43
case controllers_CancelacionController_solicitudCancelacion25_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CancelacionController_solicitudCancelacion25_invoker.call(controllers.CancelacionController.solicitudCancelacion(id))
   }
}
        

// @LINE:44
case controllers_EvaluacionEvaluadorController_canceladasEvaluacion26_route(params) => {
   call { 
        controllers_EvaluacionEvaluadorController_canceladasEvaluacion26_invoker.call(controllers.EvaluacionEvaluadorController.canceladasEvaluacion())
   }
}
        

// @LINE:45
case controllers_EvaluacionEvaluadorController_canceladaEvaluacion27_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_EvaluacionEvaluadorController_canceladaEvaluacion27_invoker.call(controllers.EvaluacionEvaluadorController.canceladaEvaluacion(id))
   }
}
        

// @LINE:48
case controllers_AdminEvaluacionController_saveObservaciones28_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("aspecto", None)) { (id, aspecto) =>
        controllers_AdminEvaluacionController_saveObservaciones28_invoker.call(controllers.AdminEvaluacionController.saveObservaciones(id, aspecto))
   }
}
        

// @LINE:50
case controllers_RecursoWebController_create29_route(params) => {
   call { 
        controllers_RecursoWebController_create29_invoker.call(controllers.RecursoWebController.create())
   }
}
        

// @LINE:51
case controllers_RecursoWebController_mastersave30_route(params) => {
   call { 
        controllers_RecursoWebController_mastersave30_invoker.call(controllers.RecursoWebController.mastersave())
   }
}
        

// @LINE:52
case controllers_RecursoWebController_masteredit31_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoWebController_masteredit31_invoker.call(controllers.RecursoWebController.masteredit(id))
   }
}
        

// @LINE:53
case controllers_RecursoWebController_mastereditAn32_route(params) => {
   call { 
        controllers_RecursoWebController_mastereditAn32_invoker.call(controllers.RecursoWebController.mastereditAn())
   }
}
        

// @LINE:54
case controllers_RecursoWebController_masterupdate33_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoWebController_masterupdate33_invoker.call(controllers.RecursoWebController.masterupdate(id))
   }
}
        

// @LINE:55
case controllers_RecursoWebController_imprimirSolicitudAceptada34_route(params) => {
   call { 
        controllers_RecursoWebController_imprimirSolicitudAceptada34_invoker.call(controllers.RecursoWebController.imprimirSolicitudAceptada())
   }
}
        

// @LINE:56
case controllers_RecursoWebController_verDatosEnviados35_route(params) => {
   call { 
        controllers_RecursoWebController_verDatosEnviados35_invoker.call(controllers.RecursoWebController.verDatosEnviados())
   }
}
        

// @LINE:59
case controllers_Application_javascriptRoutes36_route(params) => {
   call { 
        controllers_Application_javascriptRoutes36_invoker.call(controllers.Application.javascriptRoutes())
   }
}
        

// @LINE:60
case controllers_Assets_at37_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at37_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:65
case controllers_RecursoController_porObservarList38_route(params) => {
   call { 
        controllers_RecursoController_porObservarList38_invoker.call(controllers.RecursoController.porObservarList())
   }
}
        

// @LINE:66
case controllers_RecursoController_porReObservarList39_route(params) => {
   call { 
        controllers_RecursoController_porReObservarList39_invoker.call(controllers.RecursoController.porReObservarList())
   }
}
        

// @LINE:67
case controllers_RecursoController_completoList40_route(params) => {
   call { 
        controllers_RecursoController_completoList40_invoker.call(controllers.RecursoController.completoList())
   }
}
        

// @LINE:68
case controllers_RecursoController_observar41_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoController_observar41_invoker.call(controllers.RecursoController.observar(id))
   }
}
        

// @LINE:69
case controllers_RecursoController_observacionessave42_route(params) => {
   call { 
        controllers_RecursoController_observacionessave42_invoker.call(controllers.RecursoController.observacionessave())
   }
}
        

// @LINE:71
case controllers_RecursoController_revisar43_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("aspecto", None)) { (id, aspecto) =>
        controllers_RecursoController_revisar43_invoker.call(controllers.RecursoController.revisar(id, aspecto))
   }
}
        

// @LINE:76
case controllers_RecursoController_list44_route(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("auditinsert")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("c", Some("auditinsert"))) { (p, s, o, f, c) =>
        controllers_RecursoController_list44_invoker.call(controllers.RecursoController.list(p, s, o, f, c))
   }
}
        

// @LINE:79
case controllers_RecursoController_edit45_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoController_edit45_invoker.call(controllers.RecursoController.edit(id))
   }
}
        

// @LINE:80
case controllers_RecursoController_delete46_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoController_delete46_invoker.call(controllers.RecursoController.delete(id))
   }
}
        

// @LINE:81
case controllers_RecursoController_update47_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoController_update47_invoker.call(controllers.RecursoController.update(id))
   }
}
        

// @LINE:82
case controllers_RecursoController_ajaxListTabla48_route(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("auditinsert")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("c", Some("auditinsert"))) { (p, s, o, f, c) =>
        controllers_RecursoController_ajaxListTabla48_invoker.call(controllers.RecursoController.ajaxListTabla(p, s, o, f, c))
   }
}
        

// @LINE:83
case controllers_RecursoController_ajaxDelete49_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoController_ajaxDelete49_invoker.call(controllers.RecursoController.ajaxDelete(id))
   }
}
        

// @LINE:86
case controllers_OficioController_list50_route(params) => {
   call { 
        controllers_OficioController_list50_invoker.call(controllers.OficioController.list())
   }
}
        

// @LINE:87
case controllers_OficioController_create51_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OficioController_create51_invoker.call(controllers.OficioController.create(id))
   }
}
        

// @LINE:88
case controllers_OficioController_save52_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OficioController_save52_invoker.call(controllers.OficioController.save(id))
   }
}
        

// @LINE:89
case controllers_OficioController_edit53_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OficioController_edit53_invoker.call(controllers.OficioController.edit(id))
   }
}
        

// @LINE:90
case controllers_OficioController_update54_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OficioController_update54_invoker.call(controllers.OficioController.update(id))
   }
}
        

// @LINE:91
case controllers_OficioController_verOficio55_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OficioController_verOficio55_invoker.call(controllers.OficioController.verOficio(id))
   }
}
        

// @LINE:93
case controllers_VersionanteriorController_listaActualizaciones56_route(params) => {
   call { 
        controllers_VersionanteriorController_listaActualizaciones56_invoker.call(controllers.VersionanteriorController.listaActualizaciones())
   }
}
        

// @LINE:94
case controllers_VersionanteriorController_eliminarActualizaciones57_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VersionanteriorController_eliminarActualizaciones57_invoker.call(controllers.VersionanteriorController.eliminarActualizaciones(id))
   }
}
        

// @LINE:95
case controllers_VersionanteriorController_create58_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_VersionanteriorController_create58_invoker.call(controllers.VersionanteriorController.create(id))
   }
}
        

// @LINE:96
case controllers_VersionanteriorController_save59_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VersionanteriorController_save59_invoker.call(controllers.VersionanteriorController.save(id))
   }
}
        

// @LINE:100
case controllers_AutorfuncionController_list60_route(params) => {
   call { 
        controllers_AutorfuncionController_list60_invoker.call(controllers.AutorfuncionController.list())
   }
}
        

// @LINE:101
case controllers_AutorfuncionController_create61_route(params) => {
   call { 
        controllers_AutorfuncionController_create61_invoker.call(controllers.AutorfuncionController.create())
   }
}
        

// @LINE:102
case controllers_AutorfuncionController_save62_route(params) => {
   call { 
        controllers_AutorfuncionController_save62_invoker.call(controllers.AutorfuncionController.save())
   }
}
        

// @LINE:103
case controllers_AutorfuncionController_edit63_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AutorfuncionController_edit63_invoker.call(controllers.AutorfuncionController.edit(id))
   }
}
        

// @LINE:104
case controllers_AutorfuncionController_delete64_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AutorfuncionController_delete64_invoker.call(controllers.AutorfuncionController.delete(id))
   }
}
        

// @LINE:105
case controllers_AutorfuncionController_update65_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AutorfuncionController_update65_invoker.call(controllers.AutorfuncionController.update(id))
   }
}
        

// @LINE:113
case controllers_NiveleducativoController_listDT66_route(params) => {
   call { 
        controllers_NiveleducativoController_listDT66_invoker.call(controllers.NiveleducativoController.listDT())
   }
}
        

// @LINE:114
case controllers_NiveleducativoController_create67_route(params) => {
   call { 
        controllers_NiveleducativoController_create67_invoker.call(controllers.NiveleducativoController.create())
   }
}
        

// @LINE:115
case controllers_NiveleducativoController_save68_route(params) => {
   call { 
        controllers_NiveleducativoController_save68_invoker.call(controllers.NiveleducativoController.save())
   }
}
        

// @LINE:116
case controllers_NiveleducativoController_edit69_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NiveleducativoController_edit69_invoker.call(controllers.NiveleducativoController.edit(id))
   }
}
        

// @LINE:117
case controllers_NiveleducativoController_delete70_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NiveleducativoController_delete70_invoker.call(controllers.NiveleducativoController.delete(id))
   }
}
        

// @LINE:118
case controllers_NiveleducativoController_update71_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NiveleducativoController_update71_invoker.call(controllers.NiveleducativoController.update(id))
   }
}
        

// @LINE:120
case controllers_AreaconocimientoController_list72_route(params) => {
   call { 
        controllers_AreaconocimientoController_list72_invoker.call(controllers.AreaconocimientoController.list())
   }
}
        

// @LINE:121
case controllers_AreaconocimientoController_create73_route(params) => {
   call { 
        controllers_AreaconocimientoController_create73_invoker.call(controllers.AreaconocimientoController.create())
   }
}
        

// @LINE:122
case controllers_AreaconocimientoController_save74_route(params) => {
   call { 
        controllers_AreaconocimientoController_save74_invoker.call(controllers.AreaconocimientoController.save())
   }
}
        

// @LINE:123
case controllers_AreaconocimientoController_edit75_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AreaconocimientoController_edit75_invoker.call(controllers.AreaconocimientoController.edit(id))
   }
}
        

// @LINE:124
case controllers_AreaconocimientoController_delete76_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AreaconocimientoController_delete76_invoker.call(controllers.AreaconocimientoController.delete(id))
   }
}
        

// @LINE:125
case controllers_AreaconocimientoController_update77_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AreaconocimientoController_update77_invoker.call(controllers.AreaconocimientoController.update(id))
   }
}
        

// @LINE:129
case controllers_UnidadacademicaController_list78_route(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_UnidadacademicaController_list78_invoker.call(controllers.UnidadacademicaController.list(p, s, o, f))
   }
}
        

// @LINE:131
case controllers_UnidadacademicaController_create79_route(params) => {
   call { 
        controllers_UnidadacademicaController_create79_invoker.call(controllers.UnidadacademicaController.create())
   }
}
        

// @LINE:132
case controllers_UnidadacademicaController_save80_route(params) => {
   call { 
        controllers_UnidadacademicaController_save80_invoker.call(controllers.UnidadacademicaController.save())
   }
}
        

// @LINE:133
case controllers_UnidadacademicaController_edit81_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UnidadacademicaController_edit81_invoker.call(controllers.UnidadacademicaController.edit(id))
   }
}
        

// @LINE:134
case controllers_UnidadacademicaController_delete82_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UnidadacademicaController_delete82_invoker.call(controllers.UnidadacademicaController.delete(id))
   }
}
        

// @LINE:135
case controllers_UnidadacademicaController_update83_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UnidadacademicaController_update83_invoker.call(controllers.UnidadacademicaController.update(id))
   }
}
        

// @LINE:139
case controllers_RecursoController_masterlist84_route(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("auditinsert")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_RecursoController_masterlist84_invoker.call(controllers.RecursoController.masterlist(p, s, o, f))
   }
}
        

// @LINE:143
case controllers_RecursoWebController_buscarNC85_route(params) => {
   call(params.fromPath[String]("nc", None)) { (nc) =>
        controllers_RecursoWebController_buscarNC85_invoker.call(controllers.RecursoWebController.buscarNC(nc))
   }
}
        

// @LINE:146
case controllers_DocumentoController_create86_route(params) => {
   call { 
        controllers_DocumentoController_create86_invoker.call(controllers.DocumentoController.create())
   }
}
        

// @LINE:147
case controllers_DocumentoController_upload87_route(params) => {
   call { 
        controllers_DocumentoController_upload87_invoker.call(controllers.DocumentoController.upload())
   }
}
        

// @LINE:148
case controllers_RecursoWebController_verAn88_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoWebController_verAn88_invoker.call(controllers.RecursoWebController.verAn(id))
   }
}
        

// @LINE:149
case controllers_RecursoController_ver89_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoController_ver89_invoker.call(controllers.RecursoController.ver(id))
   }
}
        

// @LINE:150
case controllers_RecursoController_verOficioValoracion90_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoController_verOficioValoracion90_invoker.call(controllers.RecursoController.verOficioValoracion(id))
   }
}
        

// @LINE:152
case controllers_ReporteController_cesoe91_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ReporteController_cesoe91_invoker.call(controllers.ReporteController.cesoe(id))
   }
}
        

// @LINE:153
case controllers_ReporteController_solicitudFirma92_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ReporteController_solicitudFirma92_invoker.call(controllers.ReporteController.solicitudFirma(id))
   }
}
        

// @LINE:155
case controllers_EvaluadorController_list93_route(params) => {
   call { 
        controllers_EvaluadorController_list93_invoker.call(controllers.EvaluadorController.list())
   }
}
        

// @LINE:156
case controllers_EvaluadorController_create94_route(params) => {
   call { 
        controllers_EvaluadorController_create94_invoker.call(controllers.EvaluadorController.create())
   }
}
        

// @LINE:157
case controllers_EvaluadorController_save95_route(params) => {
   call { 
        controllers_EvaluadorController_save95_invoker.call(controllers.EvaluadorController.save())
   }
}
        

// @LINE:158
case controllers_EvaluadorController_delete96_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EvaluadorController_delete96_invoker.call(controllers.EvaluadorController.delete(id))
   }
}
        

// @LINE:159
case controllers_EvaluadorController_edit97_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EvaluadorController_edit97_invoker.call(controllers.EvaluadorController.edit(id))
   }
}
        

// @LINE:160
case controllers_EvaluadorController_update298_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EvaluadorController_update298_invoker.call(controllers.EvaluadorController.update2(id))
   }
}
        

// @LINE:162
case controllers_CtacorreoController_edit99_route(params) => {
   call(params.fromQuery[Long]("id", Some(1))) { (id) =>
        controllers_CtacorreoController_edit99_invoker.call(controllers.CtacorreoController.edit(id))
   }
}
        

// @LINE:163
case controllers_CtacorreoController_update100_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CtacorreoController_update100_invoker.call(controllers.CtacorreoController.update(id))
   }
}
        

// @LINE:165
case controllers_PersonalController_AdminEdit101_route(params) => {
   call { 
        controllers_PersonalController_AdminEdit101_invoker.call(controllers.PersonalController.AdminEdit())
   }
}
        

// @LINE:166
case controllers_PersonalController_AdminUpdate102_route(params) => {
   call { 
        controllers_PersonalController_AdminUpdate102_invoker.call(controllers.PersonalController.AdminUpdate())
   }
}
        

// @LINE:168
case controllers_PersonalController_CoordEdit103_route(params) => {
   call { 
        controllers_PersonalController_CoordEdit103_invoker.call(controllers.PersonalController.CoordEdit())
   }
}
        

// @LINE:169
case controllers_PersonalController_CoordUpdate104_route(params) => {
   call { 
        controllers_PersonalController_CoordUpdate104_invoker.call(controllers.PersonalController.CoordUpdate())
   }
}
        

// @LINE:172
case controllers_AspectoController_list105_route(params) => {
   call { 
        controllers_AspectoController_list105_invoker.call(controllers.AspectoController.list())
   }
}
        

// @LINE:173
case controllers_AspectoController_create106_route(params) => {
   call { 
        controllers_AspectoController_create106_invoker.call(controllers.AspectoController.create())
   }
}
        

// @LINE:174
case controllers_AspectoController_delete107_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AspectoController_delete107_invoker.call(controllers.AspectoController.delete(id))
   }
}
        

// @LINE:175
case controllers_AspectoController_save108_route(params) => {
   call { 
        controllers_AspectoController_save108_invoker.call(controllers.AspectoController.save())
   }
}
        

// @LINE:176
case controllers_AspectoController_edit109_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AspectoController_edit109_invoker.call(controllers.AspectoController.edit(id))
   }
}
        

// @LINE:177
case controllers_AspectoController_update110_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AspectoController_update110_invoker.call(controllers.AspectoController.update(id))
   }
}
        

// @LINE:179
case controllers_FormatoentregaController_list111_route(params) => {
   call { 
        controllers_FormatoentregaController_list111_invoker.call(controllers.FormatoentregaController.list())
   }
}
        

// @LINE:180
case controllers_FormatoentregaController_create112_route(params) => {
   call { 
        controllers_FormatoentregaController_create112_invoker.call(controllers.FormatoentregaController.create())
   }
}
        

// @LINE:181
case controllers_FormatoentregaController_delete113_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormatoentregaController_delete113_invoker.call(controllers.FormatoentregaController.delete(id))
   }
}
        

// @LINE:182
case controllers_FormatoentregaController_save114_route(params) => {
   call { 
        controllers_FormatoentregaController_save114_invoker.call(controllers.FormatoentregaController.save())
   }
}
        

// @LINE:183
case controllers_FormatoentregaController_edit115_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormatoentregaController_edit115_invoker.call(controllers.FormatoentregaController.edit(id))
   }
}
        

// @LINE:184
case controllers_FormatoentregaController_update116_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FormatoentregaController_update116_invoker.call(controllers.FormatoentregaController.update(id))
   }
}
        

// @LINE:186
case controllers_TipodocumentoController_list117_route(params) => {
   call { 
        controllers_TipodocumentoController_list117_invoker.call(controllers.TipodocumentoController.list())
   }
}
        

// @LINE:187
case controllers_TipodocumentoController_create118_route(params) => {
   call { 
        controllers_TipodocumentoController_create118_invoker.call(controllers.TipodocumentoController.create())
   }
}
        

// @LINE:188
case controllers_TipodocumentoController_delete119_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipodocumentoController_delete119_invoker.call(controllers.TipodocumentoController.delete(id))
   }
}
        

// @LINE:189
case controllers_TipodocumentoController_save120_route(params) => {
   call { 
        controllers_TipodocumentoController_save120_invoker.call(controllers.TipodocumentoController.save())
   }
}
        

// @LINE:190
case controllers_TipodocumentoController_edit121_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipodocumentoController_edit121_invoker.call(controllers.TipodocumentoController.edit(id))
   }
}
        

// @LINE:191
case controllers_TipodocumentoController_update122_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TipodocumentoController_update122_invoker.call(controllers.TipodocumentoController.update(id))
   }
}
        

// @LINE:194
case controllers_RecursoWebController_Correo123_route(params) => {
   call { 
        controllers_RecursoWebController_Correo123_invoker.call(controllers.RecursoWebController.Correo())
   }
}
        

// @LINE:196
case controllers_RecursoevaluadorController_asignarEvaluadoresList124_route(params) => {
   call { 
        controllers_RecursoevaluadorController_asignarEvaluadoresList124_invoker.call(controllers.RecursoevaluadorController.asignarEvaluadoresList())
   }
}
        

// @LINE:197
case controllers_RecursoevaluadorController_asignarEvaluadoresCreate125_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoevaluadorController_asignarEvaluadoresCreate125_invoker.call(controllers.RecursoevaluadorController.asignarEvaluadoresCreate(id))
   }
}
        

// @LINE:198
case controllers_RecursoevaluadorController_asignarEvaluadoresSave126_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("tipo", None)) { (id, tipo) =>
        controllers_RecursoevaluadorController_asignarEvaluadoresSave126_invoker.call(controllers.RecursoevaluadorController.asignarEvaluadoresSave(id, tipo))
   }
}
        

// @LINE:199
case controllers_RecursoevaluadorController_mostrarEvaluadores127_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoevaluadorController_mostrarEvaluadores127_invoker.call(controllers.RecursoevaluadorController.mostrarEvaluadores(id))
   }
}
        

// @LINE:200
case controllers_RecursoevaluadorController_mostrarEvaluacionesSinAtender128_route(params) => {
   call(params.fromPath[Int]("tipo", None)) { (tipo) =>
        controllers_RecursoevaluadorController_mostrarEvaluacionesSinAtender128_invoker.call(controllers.RecursoevaluadorController.mostrarEvaluacionesSinAtender(tipo))
   }
}
        

// @LINE:201
case controllers_RecursoevaluadorController_mostrarEvaluacionesEnProceso129_route(params) => {
   call(params.fromPath[Int]("tipo", None)) { (tipo) =>
        controllers_RecursoevaluadorController_mostrarEvaluacionesEnProceso129_invoker.call(controllers.RecursoevaluadorController.mostrarEvaluacionesEnProceso(tipo))
   }
}
        

// @LINE:202
case controllers_RecursoevaluadorController_mostrarEvaluacionesPorRevisar130_route(params) => {
   call(params.fromPath[Int]("tipo", None)) { (tipo) =>
        controllers_RecursoevaluadorController_mostrarEvaluacionesPorRevisar130_invoker.call(controllers.RecursoevaluadorController.mostrarEvaluacionesPorRevisar(tipo))
   }
}
        

// @LINE:203
case controllers_RecursoevaluadorController_mostrarEvaluacionesConObservaciones131_route(params) => {
   call(params.fromPath[Int]("tipo", None)) { (tipo) =>
        controllers_RecursoevaluadorController_mostrarEvaluacionesConObservaciones131_invoker.call(controllers.RecursoevaluadorController.mostrarEvaluacionesConObservaciones(tipo))
   }
}
        

// @LINE:204
case controllers_RecursoevaluadorController_mostrarEvaluacionesConcluidas132_route(params) => {
   call(params.fromPath[Int]("tipo", None), params.fromPath[String]("device", None)) { (tipo, device) =>
        controllers_RecursoevaluadorController_mostrarEvaluacionesConcluidas132_invoker.call(controllers.RecursoevaluadorController.mostrarEvaluacionesConcluidas(tipo, device))
   }
}
        

// @LINE:211
case controllers_ClasificacionController_list133_route(params) => {
   call { 
        controllers_ClasificacionController_list133_invoker.call(controllers.ClasificacionController.list())
   }
}
        

// @LINE:212
case controllers_ClasificacionController_create134_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClasificacionController_create134_invoker.call(controllers.ClasificacionController.create(id))
   }
}
        

// @LINE:213
case controllers_ClasificacionController_save135_route(params) => {
   call { 
        controllers_ClasificacionController_save135_invoker.call(controllers.ClasificacionController.save())
   }
}
        

// @LINE:214
case controllers_ClasificacionController_edit136_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClasificacionController_edit136_invoker.call(controllers.ClasificacionController.edit(id))
   }
}
        

// @LINE:215
case controllers_ClasificacionController_update137_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClasificacionController_update137_invoker.call(controllers.ClasificacionController.update(id))
   }
}
        

// @LINE:216
case controllers_ClasificacionController_ejemplos138_route(params) => {
   call(params.fromQuery[Long]("c1", None), params.fromQuery[Long]("c2", None), params.fromQuery[Long]("c3", None)) { (c1, c2, c3) =>
        controllers_ClasificacionController_ejemplos138_invoker.call(controllers.ClasificacionController.ejemplos(c1, c2, c3))
   }
}
        

// @LINE:217
case controllers_ClasificacionController_clasificacionRestricciones139_route(params) => {
   call { 
        controllers_ClasificacionController_clasificacionRestricciones139_invoker.call(controllers.ClasificacionController.clasificacionRestricciones())
   }
}
        

// @LINE:218
case controllers_ClasificacionController_descripcionCriterio140_route(params) => {
   call { 
        controllers_ClasificacionController_descripcionCriterio140_invoker.call(controllers.ClasificacionController.descripcionCriterio)
   }
}
        

// @LINE:220
case controllers_RecursoController_canceladosList141_route(params) => {
   call { 
        controllers_RecursoController_canceladosList141_invoker.call(controllers.RecursoController.canceladosList())
   }
}
        

// @LINE:221
case controllers_RecursoController_solicitudCanceladoList142_route(params) => {
   call { 
        controllers_RecursoController_solicitudCanceladoList142_invoker.call(controllers.RecursoController.solicitudCanceladoList())
   }
}
        

// @LINE:222
case controllers_RecursoController_solicitudCancelado143_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoController_solicitudCancelado143_invoker.call(controllers.RecursoController.solicitudCancelado(id))
   }
}
        

// @LINE:223
case controllers_RecursoController_cancelarRecursoEvaluacion144_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_RecursoController_cancelarRecursoEvaluacion144_invoker.call(controllers.RecursoController.cancelarRecursoEvaluacion(id))
   }
}
        

// @LINE:224
case controllers_RecursoController_reactivarRecursoEvaluacion145_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_RecursoController_reactivarRecursoEvaluacion145_invoker.call(controllers.RecursoController.reactivarRecursoEvaluacion(id))
   }
}
        

// @LINE:226
case controllers_RecursoController_canceladosEvaluacionList146_route(params) => {
   call { 
        controllers_RecursoController_canceladosEvaluacionList146_invoker.call(controllers.RecursoController.canceladosEvaluacionList())
   }
}
        

// @LINE:229
case controllers_RecursoController_canceladosClasificacionList147_route(params) => {
   call { 
        controllers_RecursoController_canceladosClasificacionList147_invoker.call(controllers.RecursoController.canceladosClasificacionList())
   }
}
        

// @LINE:232
case controllers_CalendarioController_inicio148_route(params) => {
   call { 
        controllers_CalendarioController_inicio148_invoker.call(controllers.CalendarioController.inicio())
   }
}
        

// @LINE:233
case controllers_CalendarioController_agregarFechaCalendario149_route(params) => {
   call(params.fromQuery[String]("desde", None), params.fromQuery[String]("hasta", None), params.fromQuery[String]("titulo", None), params.fromQuery[String]("id", None)) { (desde, hasta, titulo, id) =>
        controllers_CalendarioController_agregarFechaCalendario149_invoker.call(controllers.CalendarioController.agregarFechaCalendario(desde, hasta, titulo, id))
   }
}
        

// @LINE:234
case controllers_CalendarioController_eliminarFechaCalendario150_route(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_CalendarioController_eliminarFechaCalendario150_invoker.call(controllers.CalendarioController.eliminarFechaCalendario(id))
   }
}
        

// @LINE:235
case controllers_CalendarioController_hoyMasDias151_route(params) => {
   call(params.fromQuery[Int]("nd", None)) { (nd) =>
        controllers_CalendarioController_hoyMasDias151_invoker.call(controllers.CalendarioController.hoyMasDias(nd))
   }
}
        

// @LINE:236
case controllers_CalendarioController_fechaMasDias152_route(params) => {
   call(params.fromQuery[Int]("nd", None), params.fromQuery[String]("fechainicio", None)) { (nd, fechainicio) =>
        controllers_CalendarioController_fechaMasDias152_invoker.call(controllers.CalendarioController.fechaMasDias(nd, fechainicio))
   }
}
        

// @LINE:239
case controllers_RecursoController_cambio153_route(params) => {
   call(params.fromQuery[Long]("id", None), params.fromQuery[String]("observacion", None)) { (id, observacion) =>
        controllers_RecursoController_cambio153_invoker.call(controllers.RecursoController.cambio(id, observacion))
   }
}
        

// @LINE:244
case controllers_auxCargaDatosController_cargaEvaluacionTabla154_route(params) => {
   call { 
        controllers_auxCargaDatosController_cargaEvaluacionTabla154_invoker.call(controllers.auxCargaDatosController.cargaEvaluacionTabla())
   }
}
        

// @LINE:248
case controllers_AdminEvaluacionTablaController_listarReactivos155_route(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("auditinsert")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_AdminEvaluacionTablaController_listarReactivos155_invoker.call(controllers.AdminEvaluacionTablaController.listarReactivos(p, s, o, f))
   }
}
        

// @LINE:249
case controllers_AdminEvaluacionTablaController_createReactivo156_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_createReactivo156_invoker.call(controllers.AdminEvaluacionTablaController.createReactivo())
   }
}
        

// @LINE:250
case controllers_AdminEvaluacionTablaController_editReactivo157_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AdminEvaluacionTablaController_editReactivo157_invoker.call(controllers.AdminEvaluacionTablaController.editReactivo(id))
   }
}
        

// @LINE:251
case controllers_AdminEvaluacionTablaController_saveReactivo158_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_saveReactivo158_invoker.call(controllers.AdminEvaluacionTablaController.saveReactivo())
   }
}
        

// @LINE:252
case controllers_AdminEvaluacionTablaController_updateReactivo159_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AdminEvaluacionTablaController_updateReactivo159_invoker.call(controllers.AdminEvaluacionTablaController.updateReactivo(id))
   }
}
        

// @LINE:253
case controllers_AdminEvaluacionTablaController_deleteReactivo160_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AdminEvaluacionTablaController_deleteReactivo160_invoker.call(controllers.AdminEvaluacionTablaController.deleteReactivo(id))
   }
}
        

// @LINE:255
case controllers_AdminEvaluacionTablaController_removeTablaEvaluacion161_route(params) => {
   call(params.fromQuery[Long]("idVersion", None), params.fromQuery[Long]("idReactivo", None)) { (idVersion, idReactivo) =>
        controllers_AdminEvaluacionTablaController_removeTablaEvaluacion161_invoker.call(controllers.AdminEvaluacionTablaController.removeTablaEvaluacion(idVersion, idReactivo))
   }
}
        

// @LINE:256
case controllers_AdminEvaluacionTablaController_listarTabla162_route(params) => {
   call(params.fromQuery[Long]("v", Some(1))) { (v) =>
        controllers_AdminEvaluacionTablaController_listarTabla162_invoker.call(controllers.AdminEvaluacionTablaController.listarTabla(v))
   }
}
        

// @LINE:260
case controllers_AdminEvaluacionTablaController_listarTablaDTSS163_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_listarTablaDTSS163_invoker.call(controllers.AdminEvaluacionTablaController.listarTablaDTSS())
   }
}
        

// @LINE:262
case controllers_AdminEvaluacionTablaController_listarReactivosInstrumento164_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_listarReactivosInstrumento164_invoker.call(controllers.AdminEvaluacionTablaController.listarReactivosInstrumento())
   }
}
        

// @LINE:264
case controllers_AdminEvaluacionTablaController_editTablaEvaluacion165_route(params) => {
   call(params.fromQuery[Long]("idVersion", None)) { (idVersion) =>
        controllers_AdminEvaluacionTablaController_editTablaEvaluacion165_invoker.call(controllers.AdminEvaluacionTablaController.editTablaEvaluacion(idVersion))
   }
}
        

// @LINE:265
case controllers_AdminEvaluacionTablaController_listaReactivos166_route(params) => {
   call(params.fromPath[Long]("version", None)) { (version) =>
        controllers_AdminEvaluacionTablaController_listaReactivos166_invoker.call(controllers.AdminEvaluacionTablaController.listaReactivos(version))
   }
}
        

// @LINE:266
case controllers_AdminEvaluacionTablaController_listaEvaluacionTablaAjax167_route(params) => {
   call(params.fromPath[Long]("version", None), params.fromPath[Long]("desde", None), params.fromPath[Long]("hasta", None)) { (version, desde, hasta) =>
        controllers_AdminEvaluacionTablaController_listaEvaluacionTablaAjax167_invoker.call(controllers.AdminEvaluacionTablaController.listaEvaluacionTablaAjax(version, desde, hasta))
   }
}
        

// @LINE:270
case controllers_TablaEvaluacionVersionController_versionCreate168_route(params) => {
   call { 
        controllers_TablaEvaluacionVersionController_versionCreate168_invoker.call(controllers.TablaEvaluacionVersionController.versionCreate())
   }
}
        

// @LINE:271
case controllers_TablaEvaluacionVersionController_toggle169_route(params) => {
   call(params.fromPath[Long]("idVersion", None)) { (idVersion) =>
        controllers_TablaEvaluacionVersionController_toggle169_invoker.call(controllers.TablaEvaluacionVersionController.toggle(idVersion))
   }
}
        

// @LINE:272
case controllers_AdminEvaluacionTablaController_agregarReactivo170_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_agregarReactivo170_invoker.call(controllers.AdminEvaluacionTablaController.agregarReactivo())
   }
}
        

// @LINE:274
case controllers_ProrrogaController_list171_route(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("auditinsert")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("c", Some("auditinsert")), params.fromQuery[Int]("rdioSolicitud", Some(-1))) { (p, s, o, f, c, rdioSolicitud) =>
        controllers_ProrrogaController_list171_invoker.call(controllers.ProrrogaController.list(p, s, o, f, c, rdioSolicitud))
   }
}
        

// @LINE:276
case controllers_ProrrogaController_save172_route(params) => {
   call(params.fromPath[Long]("idRecEv", None)) { (idRecEv) =>
        controllers_ProrrogaController_save172_invoker.call(controllers.ProrrogaController.save(idRecEv))
   }
}
        

// @LINE:277
case controllers_ProrrogaController_edit173_route(params) => {
   call(params.fromPath[Long]("idRecEv", None), params.fromPath[Int]("ndias", None)) { (idRecEv, ndias) =>
        controllers_ProrrogaController_edit173_invoker.call(controllers.ProrrogaController.edit(idRecEv, ndias))
   }
}
        

// @LINE:278
case controllers_ProrrogaController_delete174_route(params) => {
   call(params.fromPath[Long]("idPro", None)) { (idPro) =>
        controllers_ProrrogaController_delete174_invoker.call(controllers.ProrrogaController.delete(idPro))
   }
}
        

// @LINE:279
case controllers_EvaluacionEvaluadorController_solicitarProrroga175_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("idAspecto", None), params.fromPath[Int]("ndias", None)) { (id, idAspecto, ndias) =>
        controllers_EvaluacionEvaluadorController_solicitarProrroga175_invoker.call(controllers.EvaluacionEvaluadorController.solicitarProrroga(id, idAspecto, ndias))
   }
}
        

// @LINE:282
case controllers_EncuestaWebController_create176_route(params) => {
   call { 
        controllers_EncuestaWebController_create176_invoker.call(controllers.EncuestaWebController.create())
   }
}
        

// @LINE:283
case controllers_EncuestaWebController_save177_route(params) => {
   call { 
        controllers_EncuestaWebController_save177_invoker.call(controllers.EncuestaWebController.save())
   }
}
        

// @LINE:284
case controllers_EncuestaWebController_recibida178_route(params) => {
   call { 
        controllers_EncuestaWebController_recibida178_invoker.call(controllers.EncuestaWebController.recibida())
   }
}
        

// @LINE:285
case controllers_EncuestaWebController_atiendeObservaciones179_route(params) => {
   call { 
        controllers_EncuestaWebController_atiendeObservaciones179_invoker.call(controllers.EncuestaWebController.atiendeObservaciones())
   }
}
        

// @LINE:286
case controllers_EncuestaWebController_update180_route(params) => {
   call { 
        controllers_EncuestaWebController_update180_invoker.call(controllers.EncuestaWebController.update())
   }
}
        

// @LINE:287
case controllers_EncuestaWebController_desdeLiga181_route(params) => {
   call(params.fromPath[String]("nc", None)) { (nc) =>
        controllers_EncuestaWebController_desdeLiga181_invoker.call(controllers.EncuestaWebController.desdeLiga(nc))
   }
}
        

// @LINE:289
case controllers_EncuestaController_encuestasPorRevisar182_route(params) => {
   call { 
        controllers_EncuestaController_encuestasPorRevisar182_invoker.call(controllers.EncuestaController.encuestasPorRevisar())
   }
}
        

// @LINE:290
case controllers_EncuestaController_encuestaPorRevisar183_route(params) => {
   call(params.fromQuery[Long]("idEnc", None)) { (idEnc) =>
        controllers_EncuestaController_encuestaPorRevisar183_invoker.call(controllers.EncuestaController.encuestaPorRevisar(idEnc))
   }
}
        

// @LINE:291
case controllers_EncuestaController_agregarObservaciones184_route(params) => {
   call(params.fromQuery[Long]("idEnc", None)) { (idEnc) =>
        controllers_EncuestaController_agregarObservaciones184_invoker.call(controllers.EncuestaController.agregarObservaciones(idEnc))
   }
}
        

// @LINE:292
case controllers_EncuestaController_conObservacionesList185_route(params) => {
   call { 
        controllers_EncuestaController_conObservacionesList185_invoker.call(controllers.EncuestaController.conObservacionesList())
   }
}
        

// @LINE:293
case controllers_EncuestaController_terminadasList186_route(params) => {
   call { 
        controllers_EncuestaController_terminadasList186_invoker.call(controllers.EncuestaController.terminadasList())
   }
}
        

// @LINE:294
case controllers_EncuestaController_conObservaciones187_route(params) => {
   call(params.fromQuery[Long]("idEnc", None)) { (idEnc) =>
        controllers_EncuestaController_conObservaciones187_invoker.call(controllers.EncuestaController.conObservaciones(idEnc))
   }
}
        

// @LINE:301
case controllers_HistorialController_ajaxActualizaLog188_route(params) => {
   call(params.fromPath[Int]("nitems", None)) { (nitems) =>
        controllers_HistorialController_ajaxActualizaLog188_invoker.call(controllers.HistorialController.ajaxActualizaLog(nitems))
   }
}
        

// @LINE:302
case controllers_RecursoWebController_conObservacionesAn189_route(params) => {
   call { 
        controllers_RecursoWebController_conObservacionesAn189_invoker.call(controllers.RecursoWebController.conObservacionesAn())
   }
}
        

// @LINE:304
case controllers_Application_javascriptRoutes190_route(params) => {
   call { 
        controllers_Application_javascriptRoutes190_invoker.call(controllers.Application.javascriptRoutes)
   }
}
        

// @LINE:308
case controllers_RecursoWebController_reporteEvaluacion191_route(params) => {
   call { 
        controllers_RecursoWebController_reporteEvaluacion191_invoker.call(controllers.RecursoWebController.reporteEvaluacion())
   }
}
        

// @LINE:312
case controllers_RecursoevaluadorController_reporteEvaluacion192_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecursoevaluadorController_reporteEvaluacion192_invoker.call(controllers.RecursoevaluadorController.reporteEvaluacion(id))
   }
}
        

// @LINE:314
case controllers_DirigidoaController_list193_route(params) => {
   call { 
        controllers_DirigidoaController_list193_invoker.call(controllers.DirigidoaController.list())
   }
}
        

// @LINE:315
case controllers_DirigidoaController_create194_route(params) => {
   call { 
        controllers_DirigidoaController_create194_invoker.call(controllers.DirigidoaController.create())
   }
}
        

// @LINE:316
case controllers_DirigidoaController_save195_route(params) => {
   call { 
        controllers_DirigidoaController_save195_invoker.call(controllers.DirigidoaController.save())
   }
}
        

// @LINE:317
case controllers_DirigidoaController_edit196_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DirigidoaController_edit196_invoker.call(controllers.DirigidoaController.edit(id))
   }
}
        

// @LINE:318
case controllers_DirigidoaController_update197_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DirigidoaController_update197_invoker.call(controllers.DirigidoaController.update(id))
   }
}
        

// @LINE:319
case controllers_DirigidoaController_delete198_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DirigidoaController_delete198_invoker.call(controllers.DirigidoaController.delete(id))
   }
}
        

// @LINE:323
case controllers_RecursoevaluadorController_pruebaCorreo199_route(params) => {
   call { 
        controllers_RecursoevaluadorController_pruebaCorreo199_invoker.call(controllers.RecursoevaluadorController.pruebaCorreo())
   }
}
        

// @LINE:326
case controllers_Application_leerXL4200_route(params) => {
   call { 
        controllers_Application_leerXL4200_invoker.call(controllers.Application.leerXL4())
   }
}
        

// @LINE:327
case controllers_EvaluadorController_existeMail201_route(params) => {
   call(params.fromQuery[String]("correo", Some(""))) { (correo) =>
        controllers_EvaluadorController_existeMail201_invoker.call(controllers.EvaluadorController.existeMail(correo))
   }
}
        

// @LINE:328
case controllers_EvaluadorController_existeUserPass202_route(params) => {
   call(params.fromPath[String]("user", None), params.fromPath[String]("pass", None)) { (user, pass) =>
        controllers_EvaluadorController_existeUserPass202_invoker.call(controllers.EvaluadorController.existeUserPass(user, pass))
   }
}
        

// @LINE:330
case controllers_OficioValoracionController_create203_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OficioValoracionController_create203_invoker.call(controllers.OficioValoracionController.create(id))
   }
}
        

// @LINE:331
case controllers_OficioValoracionController_list204_route(params) => {
   call { 
        controllers_OficioValoracionController_list204_invoker.call(controllers.OficioValoracionController.list())
   }
}
        

// @LINE:332
case controllers_OficioValoracionController_save205_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OficioValoracionController_save205_invoker.call(controllers.OficioValoracionController.save(id))
   }
}
        

// @LINE:334
case controllers_Application_Acerca206_route(params) => {
   call { 
        controllers_Application_Acerca206_invoker.call(controllers.Application.Acerca())
   }
}
        

// @LINE:336
case controllers_RecursoevaluadorController_evaluada207_route(params) => {
   call(params.fromPath[Long]("idRe", None), params.fromQuery[String]("tipo", Some("0" ))) { (idRe, tipo) =>
        controllers_RecursoevaluadorController_evaluada207_invoker.call(controllers.RecursoevaluadorController.evaluada(idRe, tipo))
   }
}
        

// @LINE:337
case controllers_RecursoevaluadorController_evaluadas208_route(params) => {
   call(params.fromPath[Long]("idRecurso", None), params.fromQuery[String]("tipo", Some("0"))) { (idRecurso, tipo) =>
        controllers_RecursoevaluadorController_evaluadas208_invoker.call(controllers.RecursoevaluadorController.evaluadas(idRecurso, tipo))
   }
}
        

// @LINE:339
case controllers_EncuestaController_conEncuestasAceptadas209_route(params) => {
   call { 
        controllers_EncuestaController_conEncuestasAceptadas209_invoker.call(controllers.EncuestaController.conEncuestasAceptadas())
   }
}
        

// @LINE:341
case controllers_AutorController_list210_route(params) => {
   call { 
        controllers_AutorController_list210_invoker.call(controllers.AutorController.list())
   }
}
        

// @LINE:342
case controllers_AutorController_editEmail211_route(params) => {
   call(params.fromPath[Long]("idAutor", None)) { (idAutor) =>
        controllers_AutorController_editEmail211_invoker.call(controllers.AutorController.editEmail(idAutor))
   }
}
        

// @LINE:343
case controllers_AutorController_updateEmail212_route(params) => {
   call(params.fromPath[Long]("idAutor", None)) { (idAutor) =>
        controllers_AutorController_updateEmail212_invoker.call(controllers.AutorController.updateEmail(idAutor))
   }
}
        

// @LINE:346
case controllers_RecursoWebController_ajaxUnidadAcademicaFiltrada213_route(params) => {
   call(params.fromPath[Long]("nivel", None)) { (nivel) =>
        controllers_RecursoWebController_ajaxUnidadAcademicaFiltrada213_invoker.call(controllers.RecursoWebController.ajaxUnidadAcademicaFiltrada(nivel))
   }
}
        

// @LINE:347
case controllers_UnidadacademicaController_ajaxListaDTSS214_route(params) => {
   call { 
        controllers_UnidadacademicaController_ajaxListaDTSS214_invoker.call(controllers.UnidadacademicaController.ajaxListaDTSS())
   }
}
        

// @LINE:349
case controllers_Application_errorInicioSesion215_route(params) => {
   call { 
        controllers_Application_errorInicioSesion215_invoker.call(controllers.Application.errorInicioSesion())
   }
}
        

// @LINE:351
case controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionAspecto216_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionAspecto216_invoker.call(controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionAspecto())
   }
}
        

// @LINE:352
case controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionCriterio217_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionCriterio217_invoker.call(controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionCriterio())
   }
}
        

// @LINE:353
case controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionTipoRecurso218_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_ajaxEditTablaEvaluacionTipoRecurso218_invoker.call(controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionTipoRecurso())
   }
}
        

// @LINE:355
case controllers_AdminEvaluacionTablaController_ajaxEliminaReactivoTablaEvaluacion219_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_ajaxEliminaReactivoTablaEvaluacion219_invoker.call(controllers.AdminEvaluacionTablaController.ajaxEliminaReactivoTablaEvaluacion())
   }
}
        

// @LINE:356
case controllers_AdminEvaluacionTablaController_ajaxAgregarReactivoTablaEvaluacion220_route(params) => {
   call { 
        controllers_AdminEvaluacionTablaController_ajaxAgregarReactivoTablaEvaluacion220_invoker.call(controllers.AdminEvaluacionTablaController.ajaxAgregarReactivoTablaEvaluacion())
   }
}
        

// @LINE:359
case controllers_CoordinadorController_index221_route(params) => {
   call { 
        controllers_CoordinadorController_index221_invoker.call(controllers.CoordinadorController.index())
   }
}
        

// @LINE:361
case controllers_RecursoWebController_WSBuscarNC2222_route(params) => {
   call(params.fromQuery[String]("nc", None)) { (nc) =>
        controllers_RecursoWebController_WSBuscarNC2222_invoker.call(controllers.RecursoWebController.WSBuscarNC2(nc))
   }
}
        

// @LINE:362
case controllers_RecursoWebController_WSAjaxImprimirSolicitudAceptada223_route(params) => {
   call(params.fromPath[Long]("idRecurso", None)) { (idRecurso) =>
        controllers_RecursoWebController_WSAjaxImprimirSolicitudAceptada223_invoker.call(controllers.RecursoWebController.WSAjaxImprimirSolicitudAceptada(idRecurso))
   }
}
        

// @LINE:363
case controllers_RecursoWebController_WSAjaxImprimirReporteETP224_route(params) => {
   call(params.fromPath[Long]("idRecurso", None)) { (idRecurso) =>
        controllers_RecursoWebController_WSAjaxImprimirReporteETP224_invoker.call(controllers.RecursoWebController.WSAjaxImprimirReporteETP(idRecurso))
   }
}
        

// @LINE:368
case controllers_RecursoWebController_index2225_route(params) => {
   call { 
        controllers_RecursoWebController_index2225_invoker.call(controllers.RecursoWebController.index2())
   }
}
        

// @LINE:369
case controllers_RecursoWebController_pingWs226_route(params) => {
   call { 
        controllers_RecursoWebController_pingWs226_invoker.call(controllers.RecursoWebController.pingWs())
   }
}
        

// @LINE:371
case controllers_RecursoWebController_socket227_route(params) => {
   call { 
        controllers_RecursoWebController_socket227_invoker.call(controllers.RecursoWebController.socket())
   }
}
        

// @LINE:372
case controllers_RecursoWebController_enviarSocket228_route(params) => {
   call { 
        controllers_RecursoWebController_enviarSocket228_invoker.call(controllers.RecursoWebController.enviarSocket())
   }
}
        
}

}
     