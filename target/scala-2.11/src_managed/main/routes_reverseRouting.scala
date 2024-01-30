// @SOURCE:/home/epuente/playFramework/erdd2024/conf/routes
// @HASH:b1a641008ce39e036bdf8d6f8de96dc61cc447bb
// @DATE:Tue Jan 30 11:54:32 CST 2024

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:372
// @LINE:371
// @LINE:369
// @LINE:368
// @LINE:363
// @LINE:362
// @LINE:361
// @LINE:359
// @LINE:356
// @LINE:355
// @LINE:353
// @LINE:352
// @LINE:351
// @LINE:349
// @LINE:347
// @LINE:346
// @LINE:343
// @LINE:342
// @LINE:341
// @LINE:339
// @LINE:337
// @LINE:336
// @LINE:334
// @LINE:332
// @LINE:331
// @LINE:330
// @LINE:328
// @LINE:327
// @LINE:326
// @LINE:323
// @LINE:319
// @LINE:318
// @LINE:317
// @LINE:316
// @LINE:315
// @LINE:314
// @LINE:312
// @LINE:308
// @LINE:304
// @LINE:302
// @LINE:301
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
// @LINE:282
// @LINE:279
// @LINE:278
// @LINE:277
// @LINE:276
// @LINE:274
// @LINE:272
// @LINE:271
// @LINE:270
// @LINE:266
// @LINE:265
// @LINE:264
// @LINE:262
// @LINE:260
// @LINE:256
// @LINE:255
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
// @LINE:244
// @LINE:239
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
// @LINE:229
// @LINE:226
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:218
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:200
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
// @LINE:194
// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
// @LINE:184
// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
// @LINE:173
// @LINE:172
// @LINE:169
// @LINE:168
// @LINE:166
// @LINE:165
// @LINE:163
// @LINE:162
// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:153
// @LINE:152
// @LINE:150
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:143
// @LINE:139
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:129
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:76
// @LINE:71
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:5
package controllers {

// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
class ReverseOficioController {


// @LINE:89
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "oficios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                        

// @LINE:90
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "oficios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                        

// @LINE:86
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "oficios")
}
                        

// @LINE:88
def save(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "oficios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/oficioSave")
}
                        

// @LINE:91
def verOficio(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "verOficio/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:87
def create(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "oficios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/asignarOficio")
}
                        

}
                          

// @LINE:60
class ReverseAssets {


// @LINE:60
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:43
class ReverseCancelacionController {


// @LINE:43
def solicitudCancelacion(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "evSolicitudCancelacion/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:13
class ReverseAdminController {


// @LINE:13
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                        

}
                          

// @LINE:339
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
class ReverseEncuestaController {


// @LINE:291
def agregarObservaciones(idEnc:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "encuestaAgregarObservaciones" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("idEnc", idEnc)))))
}
                        

// @LINE:289
def encuestasPorRevisar(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "encuestasPorRevisarAdmin")
}
                        

// @LINE:292
def conObservacionesList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "conObservacionesList")
}
                        

// @LINE:293
def terminadasList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "terminadasList")
}
                        

// @LINE:339
def conEncuestasAceptadas(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "conEncuestasAceptadas")
}
                        

// @LINE:290
def encuestaPorRevisar(idEnc:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "encuestaPorRevisarAdmin" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("idEnc", idEnc)))))
}
                        

// @LINE:294
def conObservaciones(idEnc:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "encConObservaciones" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("idEnc", idEnc)))))
}
                        

}
                          

// @LINE:343
// @LINE:342
// @LINE:341
class ReverseAutorController {


// @LINE:341
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "autores")
}
                        

// @LINE:343
def updateEmail(idAutor:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "updateEmail/" + implicitly[PathBindable[Long]].unbind("idAutor", idAutor))
}
                        

// @LINE:342
def editEmail(idAutor:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "editarEmail/" + implicitly[PathBindable[Long]].unbind("idAutor", idAutor))
}
                        

}
                          

// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
// @LINE:282
class ReverseEncuestaWebController {


// @LINE:282
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "encuesta")
}
                        

// @LINE:284
def recibida(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "encuestaRecibida")
}
                        

// @LINE:283
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "encuesta/save")
}
                        

// @LINE:285
def atiendeObservaciones(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "encuestaConObservaciones")
}
                        

// @LINE:286
def update(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "actualizaEncuesta")
}
                        

// @LINE:287
def desdeLiga(nc:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "desdeLiga/" + implicitly[PathBindable[String]].unbind("nc", dynamicString(nc)))
}
                        

}
                          

// @LINE:356
// @LINE:355
// @LINE:353
// @LINE:352
// @LINE:351
// @LINE:272
// @LINE:266
// @LINE:265
// @LINE:264
// @LINE:262
// @LINE:260
// @LINE:256
// @LINE:255
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
class ReverseAdminEvaluacionTablaController {


// @LINE:250
def editReactivo(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluacionTablaEvaluacionEdit" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:265
def listaReactivos(version:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "listaReactivos/" + implicitly[PathBindable[Long]].unbind("version", version))
}
                        

// @LINE:253
def deleteReactivo(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "evaluacionTablaEvaluacionDelete" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:248
def listarReactivos(p:Int = 0, s:String = "auditinsert", o:String = "asc", f:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluacionReactivosList" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                        

// @LINE:256
def listarTabla(v:Long = 1): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluacionTablaEvaluacionList" + queryString(List(if(v == 1) None else Some(implicitly[QueryStringBindable[Long]].unbind("v", v)))))
}
                        

// @LINE:356
def ajaxAgregarReactivoTablaEvaluacion(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ajaxAgregarReactivoTablaEvaluacion")
}
                        

// @LINE:355
def ajaxEliminaReactivoTablaEvaluacion(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ajaxEliminaReactivoTablaEvaluacion")
}
                        

// @LINE:272
def agregarReactivo(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluacionTablaAgregarReactivo")
}
                        

// @LINE:262
def listarReactivosInstrumento(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "listarReactivosInstrumento")
}
                        

// @LINE:264
def editTablaEvaluacion(idVersion:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tablaEvaluacionEdit" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("idVersion", idVersion)))))
}
                        

// @LINE:255
def removeTablaEvaluacion(idVersion:Long, idReactivo:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluacionTablaRemove" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("idVersion", idVersion)), Some(implicitly[QueryStringBindable[Long]].unbind("idReactivo", idReactivo)))))
}
                        

// @LINE:252
def updateReactivo(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "evaluacionTablaEvaluacionUpdate" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:260
def listarTablaDTSS(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluacionTablaEvaluacionListDTSS")
}
                        

// @LINE:353
def ajaxEditTablaEvaluacionTipoRecurso(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ajaxEditTablaEvaluacionTipoRecurso")
}
                        

// @LINE:352
def ajaxEditTablaEvaluacionCriterio(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ajaxEditTablaEvaluacionCriterio")
}
                        

// @LINE:266
def listaEvaluacionTablaAjax(version:Long, desde:Long, hasta:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "listaEvaluacionTablaAjax/" + implicitly[PathBindable[Long]].unbind("version", version) + "/" + implicitly[PathBindable[Long]].unbind("desde", desde) + "/" + implicitly[PathBindable[Long]].unbind("hasta", hasta))
}
                        

// @LINE:351
def ajaxEditTablaEvaluacionAspecto(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ajaxEditTablaEvaluacionAspecto")
}
                        

// @LINE:249
def createReactivo(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluacionTablaEvaluacionCreate")
}
                        

// @LINE:251
def saveReactivo(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "evaluacionTablaEvaluacionSave")
}
                        

}
                          

// @LINE:169
// @LINE:168
// @LINE:166
// @LINE:165
class ReversePersonalController {


// @LINE:166
def AdminUpdate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ctaAdminEdit/update")
}
                        

// @LINE:168
def CoordEdit(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ctaCoordEdit")
}
                        

// @LINE:165
def AdminEdit(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ctaAdminEdit")
}
                        

// @LINE:169
def CoordUpdate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ctaCoordEdit/update")
}
                        

}
                          

// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
class ReverseTipodocumentoController {


// @LINE:188
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tipodocumento/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:187
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tipodocumento/new")
}
                        

// @LINE:190
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tipodocumento/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                        

// @LINE:191
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tipodocumento/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                        

// @LINE:186
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tiposdocumentos")
}
                        

// @LINE:189
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tipodocumento/")
}
                        

}
                          

// @LINE:239
// @LINE:229
// @LINE:226
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:150
// @LINE:149
// @LINE:139
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:76
// @LINE:71
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
class ReverseRecursoController {


// @LINE:226
def canceladosEvaluacionList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "canceladosEvaluacion")
}
                        

// @LINE:80
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "recursos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:76
def list(p:Int = 0, s:String = "auditinsert", o:String = "desc", f:String = "", c:String = "auditinsert"): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "recursos" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(c == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("c", c)))))
}
                        

// @LINE:83
def ajaxDelete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "recursos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/ajaxDelete")
}
                        

// @LINE:79
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "recursos/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:224
def reactivarRecursoEvaluacion(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "reactivarRecursoEvaluacion" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:82
def ajaxListTabla(p:Int = 0, s:String = "auditinsert", o:String = "desc", f:String = "", c:String = "auditinsert"): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ajaxListTabla" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(c == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("c", c)))))
}
                        

// @LINE:239
def cambio(id:Long, observacion:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "cambio" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)), Some(implicitly[QueryStringBindable[String]].unbind("observacion", observacion)))))
}
                        

// @LINE:223
def cancelarRecursoEvaluacion(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "cancelarRecursoEvaluacion" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:149
def ver(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "documento/ver/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:81
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "recursos/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:229
def canceladosClasificacionList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "canceladosClasificacion")
}
                        

// @LINE:69
def observacionessave(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "observaciones")
}
                        

// @LINE:139
def masterlist(p:Int = 0, s:String = "auditinsert", o:String = "desc", f:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "master" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                        

// @LINE:67
def completoList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "recursos/completoList")
}
                        

// @LINE:221
def solicitudCanceladoList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "solicitudCanceladoList")
}
                        

// @LINE:68
def observar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "recursos/observar/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:150
def verOficioValoracion(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "documento/verOficioValoracion/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:71
def revisar(id:Long, aspecto:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "revisar/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("aspecto", aspecto))
}
                        

// @LINE:65
def porObservarList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "recursos/observarList")
}
                        

// @LINE:222
def solicitudCancelado(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "solicitudCancelado/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:220
def canceladosList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "canceladoList")
}
                        

// @LINE:66
def porReObservarList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "recursos/reObservarList")
}
                        

}
                          

// @LINE:347
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:129
class ReverseUnidadacademicaController {


// @LINE:134
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "unidadacademica/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:347
def ajaxListaDTSS(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ajaxListaDTSS")
}
                        

// @LINE:131
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadacademica/new")
}
                        

// @LINE:133
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadacademica/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:135
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "unidadacademica/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:129
def list(p:Int = 0, s:String = "nombre", o:String = "asc", f:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadacademica" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "nombre") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                        

// @LINE:132
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "unidadacademica")
}
                        

}
                          

// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
class ReverseAutorfuncionController {


// @LINE:104
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "autorfuncion/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:101
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "autorfuncion/new")
}
                        

// @LINE:103
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "autorfuncion/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:105
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "autorfuncion/new" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:100
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "autorfuncion")
}
                        

// @LINE:102
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "autorfuncion")
}
                        

}
                          

// @LINE:147
// @LINE:146
class ReverseDocumentoController {


// @LINE:147
def upload(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "documento/upload")
}
                        

// @LINE:146
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "documento")
}
                        

}
                          

// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
// @LINE:173
// @LINE:172
class ReverseAspectoController {


// @LINE:174
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "aspecto/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:173
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aspecto/new")
}
                        

// @LINE:176
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aspecto/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                        

// @LINE:177
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "aspecto/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                        

// @LINE:172
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aspectos")
}
                        

// @LINE:175
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "aspecto/")
}
                        

}
                          

// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
class ReverseVersionanteriorController {


// @LINE:96
def save(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "actualizacionesSave/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:95
def create(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "actualizacionesCreate" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:93
def listaActualizaciones(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "actualizacionesList")
}
                        

// @LINE:94
def eliminarActualizaciones(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "actualizaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

}
                          

// @LINE:278
// @LINE:277
// @LINE:276
// @LINE:274
class ReverseProrrogaController {


// @LINE:276
def save(idRecEv:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "prorrogaSave/" + implicitly[PathBindable[Long]].unbind("idRecEv", idRecEv))
}
                        

// @LINE:274
def list(p:Int = 0, s:String = "auditinsert", o:String = "desc", f:String = "", c:String = "auditinsert", rdioSolicitud:Int = -1): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "prorrogaList" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(c == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("c", c)), if(rdioSolicitud == -1) None else Some(implicitly[QueryStringBindable[Int]].unbind("rdioSolicitud", rdioSolicitud)))))
}
                        

// @LINE:278
def delete(idPro:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "prorrogaDelete/" + implicitly[PathBindable[Long]].unbind("idPro", idPro))
}
                        

// @LINE:277
def edit(idRecEv:Long, ndias:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "prorrogaEdit/" + implicitly[PathBindable[Long]].unbind("idRecEv", idRecEv) + "/" + implicitly[PathBindable[Int]].unbind("ndias", ndias))
}
                        

}
                          

// @LINE:271
// @LINE:270
class ReverseTablaEvaluacionVersionController {


// @LINE:271
def toggle(idVersion:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "toggle/" + implicitly[PathBindable[Long]].unbind("idVersion", idVersion))
}
                        

// @LINE:270
def versionCreate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "nuevaVersion")
}
                        

}
                          

// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
class ReverseNiveleducativoController {


// @LINE:117
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "nivel/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:114
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "nivel/new")
}
                        

// @LINE:116
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "nivel/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:118
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "nivel/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:115
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "nivel")
}
                        

// @LINE:113
def listDT(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "nivelList")
}
                        

}
                          

// @LINE:163
// @LINE:162
class ReverseCtacorreoController {


// @LINE:163
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ctaCorreo/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                        

// @LINE:162
def edit(id:Long = 1): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ctaCorreo" + queryString(List(if(id == 1) None else Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

}
                          

// @LINE:332
// @LINE:331
// @LINE:330
class ReverseOficioValoracionController {


// @LINE:332
def save(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "OficioValoracionSave/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:330
def create(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "crearOficioValoracion/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:331
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "listarOficioValoracion")
}
                        

}
                          

// @LINE:349
// @LINE:334
// @LINE:326
// @LINE:304
// @LINE:59
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {


// @LINE:15
def cambiarPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "cambiarPassword")
}
                        

// @LINE:16
def cambiarEmail(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "cambiarEmail")
}
                        

// @LINE:349
def errorInicioSesion(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "errorInicioSesion")
}
                        

// @LINE:326
def leerXL4(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "leerXL4")
}
                        

// @LINE:10
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:334
def Acerca(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Acerca")
}
                        

// @LINE:11
def autentica(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "autentica")
}
                        

// @LINE:12
def timeOut(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "timeOut")
}
                        

// @LINE:304
// @LINE:59
def javascriptRoutes(): Call = {
   () match {
// @LINE:59
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
                                         
   }
}
                                                

// @LINE:9
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
class ReverseAreaconocimientoController {


// @LINE:124
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "areaconocimientos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:121
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "areaconocimientos/new")
}
                        

// @LINE:123
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "areaconocimientos/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:125
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "areaconocimientos/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:120
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "areaconocimientos")
}
                        

// @LINE:122
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "areaconocimientos")
}
                        

}
                          

// @LINE:337
// @LINE:336
// @LINE:323
// @LINE:312
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:200
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
class ReverseRecursoevaluadorController {


// @LINE:199
def mostrarEvaluadores(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mostrarEvaluadores/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:198
def asignarEvaluadoresSave(id:Long, tipo:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "asignarEvaluadoresSave/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("tipo", dynamicString(tipo)))
}
                        

// @LINE:203
def mostrarEvaluacionesConObservaciones(tipo:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mostrarEvaluacionesConObservaciones/" + implicitly[PathBindable[Int]].unbind("tipo", tipo))
}
                        

// @LINE:312
def reporteEvaluacion(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/reporteEvaluacion/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:196
def asignarEvaluadoresList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "asignarEvaluadores")
}
                        

// @LINE:197
def asignarEvaluadoresCreate(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "asignarEvaluadores/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:201
def mostrarEvaluacionesEnProceso(tipo:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mostrarEvaluacionesEnProceso/" + implicitly[PathBindable[Int]].unbind("tipo", tipo))
}
                        

// @LINE:204
def mostrarEvaluacionesConcluidas(tipo:Int, device:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mostrarEvaluacionesConcluidas/" + implicitly[PathBindable[Int]].unbind("tipo", tipo) + "/" + implicitly[PathBindable[String]].unbind("device", dynamicString(device)))
}
                        

// @LINE:323
def pruebaCorreo(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "pruebaCorreo2")
}
                        

// @LINE:336
def evaluada(idRe:Long, tipo:String = "0" ): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluada/" + implicitly[PathBindable[Long]].unbind("idRe", idRe) + queryString(List(if(tipo == "0" ) None else Some(implicitly[QueryStringBindable[String]].unbind("tipo", tipo)))))
}
                        

// @LINE:337
def evaluadas(idRecurso:Long, tipo:String = "0"): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluadas/" + implicitly[PathBindable[Long]].unbind("idRecurso", idRecurso) + queryString(List(if(tipo == "0") None else Some(implicitly[QueryStringBindable[String]].unbind("tipo", tipo)))))
}
                        

// @LINE:200
def mostrarEvaluacionesSinAtender(tipo:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mostrarEvaluacionesSinAtender/" + implicitly[PathBindable[Int]].unbind("tipo", tipo))
}
                        

// @LINE:202
def mostrarEvaluacionesPorRevisar(tipo:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mostrarEvaluacionesPorRevisar/" + implicitly[PathBindable[Int]].unbind("tipo", tipo))
}
                        

}
                          

// @LINE:301
class ReverseHistorialController {


// @LINE:301
def ajaxActualizaLog(nitems:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ajaxActualizaLog/" + implicitly[PathBindable[Int]].unbind("nitems", nitems))
}
                        

}
                          

// @LINE:153
// @LINE:152
class ReverseReporteController {


// @LINE:153
def solicitudFirma(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reporte/solicitudFirma/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:152
def cesoe(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reporte/cesoe/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:218
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
class ReverseClasificacionController {


// @LINE:214
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clasificacionEdit" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:215
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "clasificacionUpdate" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:217
def clasificacionRestricciones(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "clasificacionRestricciones")
}
                        

// @LINE:211
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clasificacionList")
}
                        

// @LINE:213
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "clasificacionSave")
}
                        

// @LINE:218
def descripcionCriterio(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "descripcionCriterio")
}
                        

// @LINE:216
def ejemplos(c1:Long, c2:Long, c3:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ejemplosClasificador" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("c1", c1)), Some(implicitly[QueryStringBindable[Long]].unbind("c2", c2)), Some(implicitly[QueryStringBindable[Long]].unbind("c3", c3)))))
}
                        

// @LINE:212
def create(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clasificacionCreate" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

}
                          

// @LINE:319
// @LINE:318
// @LINE:317
// @LINE:316
// @LINE:315
// @LINE:314
class ReverseDirigidoaController {


// @LINE:319
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dirigidoa/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:315
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dirigidoa/create")
}
                        

// @LINE:317
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dirigidoa/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                        

// @LINE:318
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dirigidoa/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                        

// @LINE:314
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dirigidoa")
}
                        

// @LINE:316
def save(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dirigidoa/save")
}
                        

}
                          

// @LINE:359
// @LINE:14
class ReverseCoordinadorController {


// @LINE:359
// @LINE:14
def index(): Call = {
   () match {
// @LINE:14
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "coord")
                                         
   }
}
                                                

}
                          

// @LINE:184
// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
class ReverseFormatoentregaController {


// @LINE:181
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "formatoentrega/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:180
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "formatoentrega/new")
}
                        

// @LINE:183
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "formatoentrega/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                        

// @LINE:184
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "formatoentrega/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                        

// @LINE:179
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "formatosentrega")
}
                        

// @LINE:182
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "formatoentrega/")
}
                        

}
                          

// @LINE:244
class ReverseauxCargaDatosController {


// @LINE:244
def cargaEvaluacionTabla(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cargaEvaluacionTabla")
}
                        

}
                          

// @LINE:372
// @LINE:371
// @LINE:369
// @LINE:368
// @LINE:363
// @LINE:362
// @LINE:361
// @LINE:346
// @LINE:308
// @LINE:302
// @LINE:194
// @LINE:148
// @LINE:143
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:7
// @LINE:5
class ReverseRecursoWebController {


// @LINE:361
def WSBuscarNC2(nc:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "WSBuscarNC2" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("nc", nc)))))
}
                        

// @LINE:55
def imprimirSolicitudAceptada(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aceptada")
}
                        

// @LINE:51
def mastersave(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "recursoweb")
}
                        

// @LINE:7
def recibido(nc:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "solRecibida/" + implicitly[PathBindable[String]].unbind("nc", dynamicString(nc)))
}
                        

// @LINE:52
def masteredit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "recursoweb/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:346
def ajaxUnidadAcademicaFiltrada(nivel:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ajaxUnidadAcademicaFiltrada/" + implicitly[PathBindable[Long]].unbind("nivel", nivel))
}
                        

// @LINE:50
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "recursoweb/new")
}
                        

// @LINE:372
def enviarSocket(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "enviarSocket")
}
                        

// @LINE:54
def masterupdate(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "recursoweb/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:368
def index2(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "index2")
}
                        

// @LINE:194
def Correo(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "pruebaCorreo")
}
                        

// @LINE:363
def WSAjaxImprimirReporteETP(idRecurso:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "WSAjaxImprimirReporteETP/" + implicitly[PathBindable[Long]].unbind("idRecurso", idRecurso))
}
                        

// @LINE:371
def socket(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "socket")
}
                        

// @LINE:143
def buscarNC(nc:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "buscarNC/" + implicitly[PathBindable[String]].unbind("nc", dynamicString(nc)))
}
                        

// @LINE:148
def verAn(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "documento/verAn/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:302
def conObservacionesAn(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "conObservacionesAn")
}
                        

// @LINE:308
def reporteEvaluacion(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reporteEvaluacion")
}
                        

// @LINE:53
def mastereditAn(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "recursowebAn")
}
                        

// @LINE:362
def WSAjaxImprimirSolicitudAceptada(idRecurso:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "WSImprimirSolicitudAceptada/" + implicitly[PathBindable[Long]].unbind("idRecurso", idRecurso))
}
                        

// @LINE:369
def pingWs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "pingWs")
}
                        

// @LINE:5
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:56
def verDatosEnviados(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "verDatosEnviados")
}
                        

}
                          

// @LINE:48
class ReverseAdminEvaluacionController {


// @LINE:48
def saveObservaciones(id:Long, aspecto:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "evSaveObservaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("aspecto", aspecto))
}
                        

}
                          

// @LINE:279
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseEvaluacionEvaluadorController {


// @LINE:35
def porAtenderAdmin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evPorAtenderAdmin")
}
                        

// @LINE:32
def edit(id:Long, idAspecto:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evEdit" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)), Some(implicitly[QueryStringBindable[Long]].unbind("idAspecto", idAspecto)))))
}
                        

// @LINE:279
def solicitarProrroga(id:Long, idAspecto:Long, ndias:Int): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "prorrogaSolicitar/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("idAspecto", idAspecto) + "/" + implicitly[PathBindable[Int]].unbind("ndias", ndias))
}
                        

// @LINE:36
def porObservar(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evPorObservar")
}
                        

// @LINE:41
def saveObservaciones(id:Long, aspecto:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evSaveObservaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("aspecto", aspecto))
}
                        

// @LINE:19
def resumen(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evResumen")
}
                        

// @LINE:38
def solicitudesCancelacion(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evSolicitudesCancelacion")
}
                        

// @LINE:26
def create(id:Long, idAspecto:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evCreate" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)), Some(implicitly[QueryStringBindable[Long]].unbind("idAspecto", idAspecto)))))
}
                        

// @LINE:22
def listado(p:Int = 0, s:String = "auditinsert", o:String = "desc", f:String = "", c:String = "auditinsert", sol:Int = -1): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evList" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(c == "auditinsert") None else Some(implicitly[QueryStringBindable[String]].unbind("c", c)), if(sol == -1) None else Some(implicitly[QueryStringBindable[Int]].unbind("sol", sol)))))
}
                        

// @LINE:37
def concluidas(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evConcluidas")
}
                        

// @LINE:21
def enProceso(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "enProceso")
}
                        

// @LINE:20
def porEvaluar(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "porEvaluar")
}
                        

// @LINE:45
def canceladaEvaluacion(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evCanceladaEvaluacion" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:44
def canceladasEvaluacion(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evCanceladasEvaluacion")
}
                        

// @LINE:39
def atenderObservaciones(id:Long, aspecto:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evAtenderObservaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("aspecto", aspecto))
}
                        

// @LINE:34
def save(id:Long, idAspecto:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "evSave/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("idAspecto", idAspecto))
}
                        

// @LINE:33
def verDetalle(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evVerDetalle/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:18
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ev")
}
                        

}
                          

// @LINE:328
// @LINE:327
// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
class ReverseEvaluadorController {


// @LINE:158
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "evaluador/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:156
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluador/new")
}
                        

// @LINE:327
def existeMail(correo:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "validarExistenciaEmail" + queryString(List(if(correo == "") None else Some(implicitly[QueryStringBindable[String]].unbind("correo", correo)))))
}
                        

// @LINE:159
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluador/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                        

// @LINE:160
def update2(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "evaluador/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                        

// @LINE:328
def existeUserPass(user:String, pass:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "validarExistenciaUserPass/" + implicitly[PathBindable[String]].unbind("user", dynamicString(user)) + "/" + implicitly[PathBindable[String]].unbind("pass", dynamicString(pass)))
}
                        

// @LINE:155
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "evaluadores")
}
                        

// @LINE:157
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "evaluador")
}
                        

}
                          

// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
class ReverseCalendarioController {


// @LINE:235
def hoyMasDias(nd:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "hoyMasDias" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("nd", nd)))))
}
                        

// @LINE:236
def fechaMasDias(nd:Int, fechainicio:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fechaMasDias" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("nd", nd)), Some(implicitly[QueryStringBindable[String]].unbind("fechainicio", fechainicio)))))
}
                        

// @LINE:234
def eliminarFechaCalendario(id:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "eliminarFechaCalendario" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                        

// @LINE:232
def inicio(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "calendario")
}
                        

// @LINE:233
def agregarFechaCalendario(desde:String, hasta:String, titulo:String, id:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "agregarFechaCalendario" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("desde", desde)), Some(implicitly[QueryStringBindable[String]].unbind("hasta", hasta)), Some(implicitly[QueryStringBindable[String]].unbind("titulo", titulo)), Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                        

}
                          
}
                  


// @LINE:372
// @LINE:371
// @LINE:369
// @LINE:368
// @LINE:363
// @LINE:362
// @LINE:361
// @LINE:359
// @LINE:356
// @LINE:355
// @LINE:353
// @LINE:352
// @LINE:351
// @LINE:349
// @LINE:347
// @LINE:346
// @LINE:343
// @LINE:342
// @LINE:341
// @LINE:339
// @LINE:337
// @LINE:336
// @LINE:334
// @LINE:332
// @LINE:331
// @LINE:330
// @LINE:328
// @LINE:327
// @LINE:326
// @LINE:323
// @LINE:319
// @LINE:318
// @LINE:317
// @LINE:316
// @LINE:315
// @LINE:314
// @LINE:312
// @LINE:308
// @LINE:304
// @LINE:302
// @LINE:301
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
// @LINE:282
// @LINE:279
// @LINE:278
// @LINE:277
// @LINE:276
// @LINE:274
// @LINE:272
// @LINE:271
// @LINE:270
// @LINE:266
// @LINE:265
// @LINE:264
// @LINE:262
// @LINE:260
// @LINE:256
// @LINE:255
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
// @LINE:244
// @LINE:239
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
// @LINE:229
// @LINE:226
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:218
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:200
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
// @LINE:194
// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
// @LINE:184
// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
// @LINE:173
// @LINE:172
// @LINE:169
// @LINE:168
// @LINE:166
// @LINE:165
// @LINE:163
// @LINE:162
// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:153
// @LINE:152
// @LINE:150
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:143
// @LINE:139
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:129
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:76
// @LINE:71
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:5
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
class ReverseOficioController {


// @LINE:89
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OficioController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "oficios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:90
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OficioController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "oficios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:86
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OficioController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "oficios"})
      }
   """
)
                        

// @LINE:88
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OficioController.save",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "oficios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/oficioSave"})
      }
   """
)
                        

// @LINE:91
def verOficio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OficioController.verOficio",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "verOficio/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:87
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OficioController.create",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "oficios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/asignarOficio"})
      }
   """
)
                        

}
              

// @LINE:60
class ReverseAssets {


// @LINE:60
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:43
class ReverseCancelacionController {


// @LINE:43
def solicitudCancelacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CancelacionController.solicitudCancelacion",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evSolicitudCancelacion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:13
class ReverseAdminController {


// @LINE:13
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

}
              

// @LINE:339
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
class ReverseEncuestaController {


// @LINE:291
def agregarObservaciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaController.agregarObservaciones",
   """
      function(idEnc) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "encuestaAgregarObservaciones" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("idEnc", idEnc)])})
      }
   """
)
                        

// @LINE:289
def encuestasPorRevisar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaController.encuestasPorRevisar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "encuestasPorRevisarAdmin"})
      }
   """
)
                        

// @LINE:292
def conObservacionesList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaController.conObservacionesList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "conObservacionesList"})
      }
   """
)
                        

// @LINE:293
def terminadasList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaController.terminadasList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "terminadasList"})
      }
   """
)
                        

// @LINE:339
def conEncuestasAceptadas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaController.conEncuestasAceptadas",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "conEncuestasAceptadas"})
      }
   """
)
                        

// @LINE:290
def encuestaPorRevisar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaController.encuestaPorRevisar",
   """
      function(idEnc) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "encuestaPorRevisarAdmin" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("idEnc", idEnc)])})
      }
   """
)
                        

// @LINE:294
def conObservaciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaController.conObservaciones",
   """
      function(idEnc) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "encConObservaciones" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("idEnc", idEnc)])})
      }
   """
)
                        

}
              

// @LINE:343
// @LINE:342
// @LINE:341
class ReverseAutorController {


// @LINE:341
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutorController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autores"})
      }
   """
)
                        

// @LINE:343
def updateEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutorController.updateEmail",
   """
      function(idAutor) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateEmail/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idAutor", idAutor)})
      }
   """
)
                        

// @LINE:342
def editEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutorController.editEmail",
   """
      function(idAutor) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editarEmail/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idAutor", idAutor)})
      }
   """
)
                        

}
              

// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
// @LINE:282
class ReverseEncuestaWebController {


// @LINE:282
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaWebController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "encuesta"})
      }
   """
)
                        

// @LINE:284
def recibida : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaWebController.recibida",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "encuestaRecibida"})
      }
   """
)
                        

// @LINE:283
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaWebController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "encuesta/save"})
      }
   """
)
                        

// @LINE:285
def atiendeObservaciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaWebController.atiendeObservaciones",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "encuestaConObservaciones"})
      }
   """
)
                        

// @LINE:286
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaWebController.update",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "actualizaEncuesta"})
      }
   """
)
                        

// @LINE:287
def desdeLiga : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EncuestaWebController.desdeLiga",
   """
      function(nc) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "desdeLiga/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nc", encodeURIComponent(nc))})
      }
   """
)
                        

}
              

// @LINE:356
// @LINE:355
// @LINE:353
// @LINE:352
// @LINE:351
// @LINE:272
// @LINE:266
// @LINE:265
// @LINE:264
// @LINE:262
// @LINE:260
// @LINE:256
// @LINE:255
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
class ReverseAdminEvaluacionTablaController {


// @LINE:250
def editReactivo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.editReactivo",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionTablaEvaluacionEdit" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:265
def listaReactivos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.listaReactivos",
   """
      function(version) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listaReactivos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("version", version)})
      }
   """
)
                        

// @LINE:253
def deleteReactivo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.deleteReactivo",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionTablaEvaluacionDelete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:248
def listarReactivos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.listarReactivos",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionReactivosList" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:256
def listarTabla : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.listarTabla",
   """
      function(v) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionTablaEvaluacionList" + _qS([(v == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("v", v))])})
      }
   """
)
                        

// @LINE:356
def ajaxAgregarReactivoTablaEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.ajaxAgregarReactivoTablaEvaluacion",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ajaxAgregarReactivoTablaEvaluacion"})
      }
   """
)
                        

// @LINE:355
def ajaxEliminaReactivoTablaEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.ajaxEliminaReactivoTablaEvaluacion",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ajaxEliminaReactivoTablaEvaluacion"})
      }
   """
)
                        

// @LINE:272
def agregarReactivo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.agregarReactivo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionTablaAgregarReactivo"})
      }
   """
)
                        

// @LINE:262
def listarReactivosInstrumento : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.listarReactivosInstrumento",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listarReactivosInstrumento"})
      }
   """
)
                        

// @LINE:264
def editTablaEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.editTablaEvaluacion",
   """
      function(idVersion) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tablaEvaluacionEdit" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("idVersion", idVersion)])})
      }
   """
)
                        

// @LINE:255
def removeTablaEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.removeTablaEvaluacion",
   """
      function(idVersion,idReactivo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionTablaRemove" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("idVersion", idVersion), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("idReactivo", idReactivo)])})
      }
   """
)
                        

// @LINE:252
def updateReactivo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.updateReactivo",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionTablaEvaluacionUpdate" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:260
def listarTablaDTSS : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.listarTablaDTSS",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionTablaEvaluacionListDTSS"})
      }
   """
)
                        

// @LINE:353
def ajaxEditTablaEvaluacionTipoRecurso : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionTipoRecurso",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ajaxEditTablaEvaluacionTipoRecurso"})
      }
   """
)
                        

// @LINE:352
def ajaxEditTablaEvaluacionCriterio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionCriterio",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ajaxEditTablaEvaluacionCriterio"})
      }
   """
)
                        

// @LINE:266
def listaEvaluacionTablaAjax : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.listaEvaluacionTablaAjax",
   """
      function(version,desde,hasta) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listaEvaluacionTablaAjax/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("version", version) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("desde", desde) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("hasta", hasta)})
      }
   """
)
                        

// @LINE:351
def ajaxEditTablaEvaluacionAspecto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionAspecto",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ajaxEditTablaEvaluacionAspecto"})
      }
   """
)
                        

// @LINE:249
def createReactivo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.createReactivo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionTablaEvaluacionCreate"})
      }
   """
)
                        

// @LINE:251
def saveReactivo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionTablaController.saveReactivo",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluacionTablaEvaluacionSave"})
      }
   """
)
                        

}
              

// @LINE:169
// @LINE:168
// @LINE:166
// @LINE:165
class ReversePersonalController {


// @LINE:166
def AdminUpdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonalController.AdminUpdate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ctaAdminEdit/update"})
      }
   """
)
                        

// @LINE:168
def CoordEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonalController.CoordEdit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ctaCoordEdit"})
      }
   """
)
                        

// @LINE:165
def AdminEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonalController.AdminEdit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ctaAdminEdit"})
      }
   """
)
                        

// @LINE:169
def CoordUpdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonalController.CoordUpdate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ctaCoordEdit/update"})
      }
   """
)
                        

}
              

// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
class ReverseTipodocumentoController {


// @LINE:188
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TipodocumentoController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tipodocumento/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:187
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TipodocumentoController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tipodocumento/new"})
      }
   """
)
                        

// @LINE:190
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TipodocumentoController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tipodocumento/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:191
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TipodocumentoController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tipodocumento/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:186
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TipodocumentoController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tiposdocumentos"})
      }
   """
)
                        

// @LINE:189
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TipodocumentoController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tipodocumento/"})
      }
   """
)
                        

}
              

// @LINE:239
// @LINE:229
// @LINE:226
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:150
// @LINE:149
// @LINE:139
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:76
// @LINE:71
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
class ReverseRecursoController {


// @LINE:226
def canceladosEvaluacionList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.canceladosEvaluacionList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "canceladosEvaluacion"})
      }
   """
)
                        

// @LINE:80
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recursos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:76
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.list",
   """
      function(p,s,o,f,c) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recursos" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (c == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("c", c))])})
      }
   """
)
                        

// @LINE:83
def ajaxDelete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.ajaxDelete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recursos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/ajaxDelete"})
      }
   """
)
                        

// @LINE:79
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recursos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:224
def reactivarRecursoEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.reactivarRecursoEvaluacion",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reactivarRecursoEvaluacion" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:82
def ajaxListTabla : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.ajaxListTabla",
   """
      function(p,s,o,f,c) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajaxListTabla" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (c == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("c", c))])})
      }
   """
)
                        

// @LINE:239
def cambio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.cambio",
   """
      function(id,observacion) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cambio" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("observacion", observacion)])})
      }
   """
)
                        

// @LINE:223
def cancelarRecursoEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.cancelarRecursoEvaluacion",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cancelarRecursoEvaluacion" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:149
def ver : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.ver",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "documento/ver/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:81
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recursos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:229
def canceladosClasificacionList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.canceladosClasificacionList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "canceladosClasificacion"})
      }
   """
)
                        

// @LINE:69
def observacionessave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.observacionessave",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "observaciones"})
      }
   """
)
                        

// @LINE:139
def masterlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.masterlist",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "master" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:67
def completoList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.completoList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recursos/completoList"})
      }
   """
)
                        

// @LINE:221
def solicitudCanceladoList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.solicitudCanceladoList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudCanceladoList"})
      }
   """
)
                        

// @LINE:68
def observar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.observar",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recursos/observar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:150
def verOficioValoracion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.verOficioValoracion",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "documento/verOficioValoracion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:71
def revisar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.revisar",
   """
      function(id,aspecto) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "revisar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("aspecto", aspecto)})
      }
   """
)
                        

// @LINE:65
def porObservarList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.porObservarList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recursos/observarList"})
      }
   """
)
                        

// @LINE:222
def solicitudCancelado : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.solicitudCancelado",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitudCancelado/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:220
def canceladosList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.canceladosList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "canceladoList"})
      }
   """
)
                        

// @LINE:66
def porReObservarList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoController.porReObservarList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recursos/reObservarList"})
      }
   """
)
                        

}
              

// @LINE:347
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:129
class ReverseUnidadacademicaController {


// @LINE:134
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadacademicaController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadacademica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:347
def ajaxListaDTSS : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadacademicaController.ajaxListaDTSS",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajaxListaDTSS"})
      }
   """
)
                        

// @LINE:131
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadacademicaController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadacademica/new"})
      }
   """
)
                        

// @LINE:133
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadacademicaController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadacademica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:135
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadacademicaController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadacademica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:129
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadacademicaController.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadacademica" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:132
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadacademicaController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadacademica"})
      }
   """
)
                        

}
              

// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
class ReverseAutorfuncionController {


// @LINE:104
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutorfuncionController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "autorfuncion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:101
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutorfuncionController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autorfuncion/new"})
      }
   """
)
                        

// @LINE:103
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutorfuncionController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autorfuncion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:105
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutorfuncionController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "autorfuncion/new" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:100
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutorfuncionController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autorfuncion"})
      }
   """
)
                        

// @LINE:102
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AutorfuncionController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "autorfuncion"})
      }
   """
)
                        

}
              

// @LINE:147
// @LINE:146
class ReverseDocumentoController {


// @LINE:147
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentoController.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "documento/upload"})
      }
   """
)
                        

// @LINE:146
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentoController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "documento"})
      }
   """
)
                        

}
              

// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
// @LINE:173
// @LINE:172
class ReverseAspectoController {


// @LINE:174
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AspectoController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aspecto/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:173
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AspectoController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aspecto/new"})
      }
   """
)
                        

// @LINE:176
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AspectoController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aspecto/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:177
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AspectoController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aspecto/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:172
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AspectoController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aspectos"})
      }
   """
)
                        

// @LINE:175
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AspectoController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aspecto/"})
      }
   """
)
                        

}
              

// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
class ReverseVersionanteriorController {


// @LINE:96
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VersionanteriorController.save",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "actualizacionesSave/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:95
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VersionanteriorController.create",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "actualizacionesCreate" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:93
def listaActualizaciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VersionanteriorController.listaActualizaciones",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "actualizacionesList"})
      }
   """
)
                        

// @LINE:94
def eliminarActualizaciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VersionanteriorController.eliminarActualizaciones",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "actualizaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

}
              

// @LINE:278
// @LINE:277
// @LINE:276
// @LINE:274
class ReverseProrrogaController {


// @LINE:276
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProrrogaController.save",
   """
      function(idRecEv) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "prorrogaSave/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idRecEv", idRecEv)})
      }
   """
)
                        

// @LINE:274
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProrrogaController.list",
   """
      function(p,s,o,f,c,rdioSolicitud) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "prorrogaList" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (c == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("c", c)), (rdioSolicitud == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("rdioSolicitud", rdioSolicitud))])})
      }
   """
)
                        

// @LINE:278
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProrrogaController.delete",
   """
      function(idPro) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "prorrogaDelete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idPro", idPro)})
      }
   """
)
                        

// @LINE:277
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProrrogaController.edit",
   """
      function(idRecEv,ndias) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "prorrogaEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idRecEv", idRecEv) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("ndias", ndias)})
      }
   """
)
                        

}
              

// @LINE:271
// @LINE:270
class ReverseTablaEvaluacionVersionController {


// @LINE:271
def toggle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TablaEvaluacionVersionController.toggle",
   """
      function(idVersion) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "toggle/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idVersion", idVersion)})
      }
   """
)
                        

// @LINE:270
def versionCreate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TablaEvaluacionVersionController.versionCreate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "nuevaVersion"})
      }
   """
)
                        

}
              

// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
class ReverseNiveleducativoController {


// @LINE:117
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NiveleducativoController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "nivel/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:114
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NiveleducativoController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "nivel/new"})
      }
   """
)
                        

// @LINE:116
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NiveleducativoController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "nivel/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:118
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NiveleducativoController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "nivel/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:115
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NiveleducativoController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "nivel"})
      }
   """
)
                        

// @LINE:113
def listDT : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NiveleducativoController.listDT",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "nivelList"})
      }
   """
)
                        

}
              

// @LINE:163
// @LINE:162
class ReverseCtacorreoController {


// @LINE:163
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtacorreoController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ctaCorreo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:162
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CtacorreoController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ctaCorreo" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id))])})
      }
   """
)
                        

}
              

// @LINE:332
// @LINE:331
// @LINE:330
class ReverseOficioValoracionController {


// @LINE:332
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OficioValoracionController.save",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "OficioValoracionSave/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:330
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OficioValoracionController.create",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crearOficioValoracion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:331
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OficioValoracionController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listarOficioValoracion"})
      }
   """
)
                        

}
              

// @LINE:349
// @LINE:334
// @LINE:326
// @LINE:304
// @LINE:59
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {


// @LINE:15
def cambiarPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cambiarPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cambiarPassword"})
      }
   """
)
                        

// @LINE:16
def cambiarEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cambiarEmail",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cambiarEmail"})
      }
   """
)
                        

// @LINE:349
def errorInicioSesion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.errorInicioSesion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "errorInicioSesion"})
      }
   """
)
                        

// @LINE:326
def leerXL4 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.leerXL4",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leerXL4"})
      }
   """
)
                        

// @LINE:10
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:334
def Acerca : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Acerca",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Acerca"})
      }
   """
)
                        

// @LINE:11
def autentica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.autentica",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "autentica"})
      }
   """
)
                        

// @LINE:12
def timeOut : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.timeOut",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timeOut"})
      }
   """
)
                        

// @LINE:304
// @LINE:59
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
      }
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
class ReverseAreaconocimientoController {


// @LINE:124
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AreaconocimientoController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "areaconocimientos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:121
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AreaconocimientoController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areaconocimientos/new"})
      }
   """
)
                        

// @LINE:123
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AreaconocimientoController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areaconocimientos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:125
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AreaconocimientoController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "areaconocimientos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:120
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AreaconocimientoController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areaconocimientos"})
      }
   """
)
                        

// @LINE:122
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AreaconocimientoController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "areaconocimientos"})
      }
   """
)
                        

}
              

// @LINE:337
// @LINE:336
// @LINE:323
// @LINE:312
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:200
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
class ReverseRecursoevaluadorController {


// @LINE:199
def mostrarEvaluadores : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.mostrarEvaluadores",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mostrarEvaluadores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:198
def asignarEvaluadoresSave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.asignarEvaluadoresSave",
   """
      function(id,tipo) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "asignarEvaluadoresSave/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tipo", encodeURIComponent(tipo))})
      }
   """
)
                        

// @LINE:203
def mostrarEvaluacionesConObservaciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.mostrarEvaluacionesConObservaciones",
   """
      function(tipo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mostrarEvaluacionesConObservaciones/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("tipo", tipo)})
      }
   """
)
                        

// @LINE:312
def reporteEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.reporteEvaluacion",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/reporteEvaluacion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:196
def asignarEvaluadoresList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.asignarEvaluadoresList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "asignarEvaluadores"})
      }
   """
)
                        

// @LINE:197
def asignarEvaluadoresCreate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.asignarEvaluadoresCreate",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "asignarEvaluadores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:201
def mostrarEvaluacionesEnProceso : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.mostrarEvaluacionesEnProceso",
   """
      function(tipo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mostrarEvaluacionesEnProceso/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("tipo", tipo)})
      }
   """
)
                        

// @LINE:204
def mostrarEvaluacionesConcluidas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.mostrarEvaluacionesConcluidas",
   """
      function(tipo,device) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mostrarEvaluacionesConcluidas/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("tipo", tipo) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("device", encodeURIComponent(device))})
      }
   """
)
                        

// @LINE:323
def pruebaCorreo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.pruebaCorreo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pruebaCorreo2"})
      }
   """
)
                        

// @LINE:336
def evaluada : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.evaluada",
   """
      function(idRe,tipo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluada/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idRe", idRe) + _qS([(tipo == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("tipo", tipo))])})
      }
   """
)
                        

// @LINE:337
def evaluadas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.evaluadas",
   """
      function(idRecurso,tipo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluadas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idRecurso", idRecurso) + _qS([(tipo == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("tipo", tipo))])})
      }
   """
)
                        

// @LINE:200
def mostrarEvaluacionesSinAtender : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.mostrarEvaluacionesSinAtender",
   """
      function(tipo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mostrarEvaluacionesSinAtender/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("tipo", tipo)})
      }
   """
)
                        

// @LINE:202
def mostrarEvaluacionesPorRevisar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoevaluadorController.mostrarEvaluacionesPorRevisar",
   """
      function(tipo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mostrarEvaluacionesPorRevisar/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("tipo", tipo)})
      }
   """
)
                        

}
              

// @LINE:301
class ReverseHistorialController {


// @LINE:301
def ajaxActualizaLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HistorialController.ajaxActualizaLog",
   """
      function(nitems) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajaxActualizaLog/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("nitems", nitems)})
      }
   """
)
                        

}
              

// @LINE:153
// @LINE:152
class ReverseReporteController {


// @LINE:153
def solicitudFirma : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReporteController.solicitudFirma",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reporte/solicitudFirma/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:152
def cesoe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReporteController.cesoe",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reporte/cesoe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:218
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
class ReverseClasificacionController {


// @LINE:214
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClasificacionController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clasificacionEdit" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:215
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClasificacionController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clasificacionUpdate" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:217
def clasificacionRestricciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClasificacionController.clasificacionRestricciones",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clasificacionRestricciones"})
      }
   """
)
                        

// @LINE:211
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClasificacionController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clasificacionList"})
      }
   """
)
                        

// @LINE:213
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClasificacionController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clasificacionSave"})
      }
   """
)
                        

// @LINE:218
def descripcionCriterio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClasificacionController.descripcionCriterio",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "descripcionCriterio"})
      }
   """
)
                        

// @LINE:216
def ejemplos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClasificacionController.ejemplos",
   """
      function(c1,c2,c3) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ejemplosClasificador" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("c1", c1), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("c2", c2), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("c3", c3)])})
      }
   """
)
                        

// @LINE:212
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClasificacionController.create",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clasificacionCreate" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

}
              

// @LINE:319
// @LINE:318
// @LINE:317
// @LINE:316
// @LINE:315
// @LINE:314
class ReverseDirigidoaController {


// @LINE:319
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DirigidoaController.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dirigidoa/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:315
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DirigidoaController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dirigidoa/create"})
      }
   """
)
                        

// @LINE:317
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DirigidoaController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dirigidoa/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:318
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DirigidoaController.update",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dirigidoa/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:314
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DirigidoaController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dirigidoa"})
      }
   """
)
                        

// @LINE:316
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DirigidoaController.save",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dirigidoa/save"})
      }
   """
)
                        

}
              

// @LINE:359
// @LINE:14
class ReverseCoordinadorController {


// @LINE:359
// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CoordinadorController.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coord"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluadoresnadorAdmin"})
      }
      }
   """
)
                        

}
              

// @LINE:184
// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
class ReverseFormatoentregaController {


// @LINE:181
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FormatoentregaController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "formatoentrega/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:180
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FormatoentregaController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "formatoentrega/new"})
      }
   """
)
                        

// @LINE:183
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FormatoentregaController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "formatoentrega/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:184
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FormatoentregaController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "formatoentrega/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:179
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FormatoentregaController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "formatosentrega"})
      }
   """
)
                        

// @LINE:182
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FormatoentregaController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "formatoentrega/"})
      }
   """
)
                        

}
              

// @LINE:244
class ReverseauxCargaDatosController {


// @LINE:244
def cargaEvaluacionTabla : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.auxCargaDatosController.cargaEvaluacionTabla",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cargaEvaluacionTabla"})
      }
   """
)
                        

}
              

// @LINE:372
// @LINE:371
// @LINE:369
// @LINE:368
// @LINE:363
// @LINE:362
// @LINE:361
// @LINE:346
// @LINE:308
// @LINE:302
// @LINE:194
// @LINE:148
// @LINE:143
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:7
// @LINE:5
class ReverseRecursoWebController {


// @LINE:361
def WSBuscarNC2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.WSBuscarNC2",
   """
      function(nc) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "WSBuscarNC2" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("nc", nc)])})
      }
   """
)
                        

// @LINE:55
def imprimirSolicitudAceptada : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.imprimirSolicitudAceptada",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aceptada"})
      }
   """
)
                        

// @LINE:51
def mastersave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.mastersave",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recursoweb"})
      }
   """
)
                        

// @LINE:7
def recibido : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.recibido",
   """
      function(nc) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solRecibida/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nc", encodeURIComponent(nc))})
      }
   """
)
                        

// @LINE:52
def masteredit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.masteredit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recursoweb/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:346
def ajaxUnidadAcademicaFiltrada : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.ajaxUnidadAcademicaFiltrada",
   """
      function(nivel) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajaxUnidadAcademicaFiltrada/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("nivel", nivel)})
      }
   """
)
                        

// @LINE:50
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recursoweb/new"})
      }
   """
)
                        

// @LINE:372
def enviarSocket : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.enviarSocket",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enviarSocket"})
      }
   """
)
                        

// @LINE:54
def masterupdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.masterupdate",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recursoweb/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:368
def index2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.index2",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index2"})
      }
   """
)
                        

// @LINE:194
def Correo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.Correo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pruebaCorreo"})
      }
   """
)
                        

// @LINE:363
def WSAjaxImprimirReporteETP : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.WSAjaxImprimirReporteETP",
   """
      function(idRecurso) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "WSAjaxImprimirReporteETP/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idRecurso", idRecurso)})
      }
   """
)
                        

// @LINE:371
def socket : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.socket",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "socket"})
      }
   """
)
                        

// @LINE:143
def buscarNC : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.buscarNC",
   """
      function(nc) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buscarNC/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nc", encodeURIComponent(nc))})
      }
   """
)
                        

// @LINE:148
def verAn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.verAn",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "documento/verAn/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:302
def conObservacionesAn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.conObservacionesAn",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "conObservacionesAn"})
      }
   """
)
                        

// @LINE:308
def reporteEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.reporteEvaluacion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reporteEvaluacion"})
      }
   """
)
                        

// @LINE:53
def mastereditAn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.mastereditAn",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recursowebAn"})
      }
   """
)
                        

// @LINE:362
def WSAjaxImprimirSolicitudAceptada : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.WSAjaxImprimirSolicitudAceptada",
   """
      function(idRecurso) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "WSImprimirSolicitudAceptada/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idRecurso", idRecurso)})
      }
   """
)
                        

// @LINE:369
def pingWs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.pingWs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pingWs"})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:56
def verDatosEnviados : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RecursoWebController.verDatosEnviados",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "verDatosEnviados"})
      }
   """
)
                        

}
              

// @LINE:48
class ReverseAdminEvaluacionController {


// @LINE:48
def saveObservaciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminEvaluacionController.saveObservaciones",
   """
      function(id,aspecto) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evSaveObservaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("aspecto", aspecto)})
      }
   """
)
                        

}
              

// @LINE:279
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseEvaluacionEvaluadorController {


// @LINE:35
def porAtenderAdmin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.porAtenderAdmin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evPorAtenderAdmin"})
      }
   """
)
                        

// @LINE:32
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.edit",
   """
      function(id,idAspecto) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evEdit" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("idAspecto", idAspecto)])})
      }
   """
)
                        

// @LINE:279
def solicitarProrroga : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.solicitarProrroga",
   """
      function(id,idAspecto,ndias) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "prorrogaSolicitar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idAspecto", idAspecto) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("ndias", ndias)})
      }
   """
)
                        

// @LINE:36
def porObservar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.porObservar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evPorObservar"})
      }
   """
)
                        

// @LINE:41
def saveObservaciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.saveObservaciones",
   """
      function(id,aspecto) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evSaveObservaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("aspecto", aspecto)})
      }
   """
)
                        

// @LINE:19
def resumen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.resumen",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evResumen"})
      }
   """
)
                        

// @LINE:38
def solicitudesCancelacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.solicitudesCancelacion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evSolicitudesCancelacion"})
      }
   """
)
                        

// @LINE:26
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.create",
   """
      function(id,idAspecto) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evCreate" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("idAspecto", idAspecto)])})
      }
   """
)
                        

// @LINE:22
def listado : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.listado",
   """
      function(p,s,o,f,c,sol) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evList" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (c == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("c", c)), (sol == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("sol", sol))])})
      }
   """
)
                        

// @LINE:37
def concluidas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.concluidas",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evConcluidas"})
      }
   """
)
                        

// @LINE:21
def enProceso : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.enProceso",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enProceso"})
      }
   """
)
                        

// @LINE:20
def porEvaluar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.porEvaluar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "porEvaluar"})
      }
   """
)
                        

// @LINE:45
def canceladaEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.canceladaEvaluacion",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evCanceladaEvaluacion" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:44
def canceladasEvaluacion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.canceladasEvaluacion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evCanceladasEvaluacion"})
      }
   """
)
                        

// @LINE:39
def atenderObservaciones : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.atenderObservaciones",
   """
      function(id,aspecto) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evAtenderObservaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("aspecto", aspecto)})
      }
   """
)
                        

// @LINE:34
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.save",
   """
      function(id,idAspecto) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evSave/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idAspecto", idAspecto)})
      }
   """
)
                        

// @LINE:33
def verDetalle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.verDetalle",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evVerDetalle/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:18
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluacionEvaluadorController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ev"})
      }
   """
)
                        

}
              

// @LINE:328
// @LINE:327
// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
class ReverseEvaluadorController {


// @LINE:158
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluadorController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluador/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:156
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluadorController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluador/new"})
      }
   """
)
                        

// @LINE:327
def existeMail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluadorController.existeMail",
   """
      function(correo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validarExistenciaEmail" + _qS([(correo == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("correo", correo))])})
      }
   """
)
                        

// @LINE:159
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluadorController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluador/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:160
def update2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluadorController.update2",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluador/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:328
def existeUserPass : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluadorController.existeUserPass",
   """
      function(user,pass) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validarExistenciaUserPass/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("user", encodeURIComponent(user)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pass", encodeURIComponent(pass))})
      }
   """
)
                        

// @LINE:155
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluadorController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluadores"})
      }
   """
)
                        

// @LINE:157
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EvaluadorController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluador"})
      }
   """
)
                        

}
              

// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
class ReverseCalendarioController {


// @LINE:235
def hoyMasDias : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarioController.hoyMasDias",
   """
      function(nd) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hoyMasDias" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("nd", nd)])})
      }
   """
)
                        

// @LINE:236
def fechaMasDias : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarioController.fechaMasDias",
   """
      function(nd,fechainicio) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fechaMasDias" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("nd", nd), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("fechainicio", fechainicio)])})
      }
   """
)
                        

// @LINE:234
def eliminarFechaCalendario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarioController.eliminarFechaCalendario",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarFechaCalendario" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:232
def inicio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarioController.inicio",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendario"})
      }
   """
)
                        

// @LINE:233
def agregarFechaCalendario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarioController.agregarFechaCalendario",
   """
      function(desde,hasta,titulo,id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "agregarFechaCalendario" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("desde", desde), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("hasta", hasta), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("titulo", titulo), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

}
              
}
        


// @LINE:372
// @LINE:371
// @LINE:369
// @LINE:368
// @LINE:363
// @LINE:362
// @LINE:361
// @LINE:359
// @LINE:356
// @LINE:355
// @LINE:353
// @LINE:352
// @LINE:351
// @LINE:349
// @LINE:347
// @LINE:346
// @LINE:343
// @LINE:342
// @LINE:341
// @LINE:339
// @LINE:337
// @LINE:336
// @LINE:334
// @LINE:332
// @LINE:331
// @LINE:330
// @LINE:328
// @LINE:327
// @LINE:326
// @LINE:323
// @LINE:319
// @LINE:318
// @LINE:317
// @LINE:316
// @LINE:315
// @LINE:314
// @LINE:312
// @LINE:308
// @LINE:304
// @LINE:302
// @LINE:301
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
// @LINE:282
// @LINE:279
// @LINE:278
// @LINE:277
// @LINE:276
// @LINE:274
// @LINE:272
// @LINE:271
// @LINE:270
// @LINE:266
// @LINE:265
// @LINE:264
// @LINE:262
// @LINE:260
// @LINE:256
// @LINE:255
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
// @LINE:244
// @LINE:239
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
// @LINE:229
// @LINE:226
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:218
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:200
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
// @LINE:194
// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
// @LINE:184
// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
// @LINE:173
// @LINE:172
// @LINE:169
// @LINE:168
// @LINE:166
// @LINE:165
// @LINE:163
// @LINE:162
// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:153
// @LINE:152
// @LINE:150
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:143
// @LINE:139
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:129
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:76
// @LINE:71
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:5
package controllers.ref {


// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
class ReverseOficioController {


// @LINE:89
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OficioController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """oficios/$id<[^/]+>/edit""")
)
                      

// @LINE:90
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OficioController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """oficios/$id<[^/]+>/update""")
)
                      

// @LINE:86
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OficioController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "list", Seq(), "GET", """""", _prefix + """oficios""")
)
                      

// @LINE:88
def save(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OficioController.save(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "save", Seq(classOf[Long]), "POST", """""", _prefix + """oficios/$id<[^/]+>/oficioSave""")
)
                      

// @LINE:91
def verOficio(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OficioController.verOficio(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "verOficio", Seq(classOf[Long]), "GET", """""", _prefix + """verOficio/$id<[^/]+>""")
)
                      

// @LINE:87
def create(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OficioController.create(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioController", "create", Seq(classOf[Long]), "GET", """""", _prefix + """oficios/$id<[^/]+>/asignarOficio""")
)
                      

}
                          

// @LINE:60
class ReverseAssets {


// @LINE:60
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:43
class ReverseCancelacionController {


// @LINE:43
def solicitudCancelacion(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CancelacionController.solicitudCancelacion(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CancelacionController", "solicitudCancelacion", Seq(classOf[Long]), "POST", """""", _prefix + """evSolicitudCancelacion/$id<[^/]+>""")
)
                      

}
                          

// @LINE:13
class ReverseAdminController {


// @LINE:13
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminController", "index", Seq(), "GET", """""", _prefix + """admin""")
)
                      

}
                          

// @LINE:339
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
class ReverseEncuestaController {


// @LINE:291
def agregarObservaciones(idEnc:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaController.agregarObservaciones(idEnc), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "agregarObservaciones", Seq(classOf[Long]), "POST", """""", _prefix + """encuestaAgregarObservaciones""")
)
                      

// @LINE:289
def encuestasPorRevisar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaController.encuestasPorRevisar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "encuestasPorRevisar", Seq(), "GET", """""", _prefix + """encuestasPorRevisarAdmin""")
)
                      

// @LINE:292
def conObservacionesList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaController.conObservacionesList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "conObservacionesList", Seq(), "GET", """""", _prefix + """conObservacionesList""")
)
                      

// @LINE:293
def terminadasList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaController.terminadasList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "terminadasList", Seq(), "GET", """""", _prefix + """terminadasList""")
)
                      

// @LINE:339
def conEncuestasAceptadas(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaController.conEncuestasAceptadas(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "conEncuestasAceptadas", Seq(), "GET", """""", _prefix + """conEncuestasAceptadas""")
)
                      

// @LINE:290
def encuestaPorRevisar(idEnc:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaController.encuestaPorRevisar(idEnc), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "encuestaPorRevisar", Seq(classOf[Long]), "GET", """""", _prefix + """encuestaPorRevisarAdmin""")
)
                      

// @LINE:294
def conObservaciones(idEnc:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaController.conObservaciones(idEnc), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaController", "conObservaciones", Seq(classOf[Long]), "GET", """""", _prefix + """encConObservaciones""")
)
                      

}
                          

// @LINE:343
// @LINE:342
// @LINE:341
class ReverseAutorController {


// @LINE:341
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutorController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorController", "list", Seq(), "GET", """""", _prefix + """autores""")
)
                      

// @LINE:343
def updateEmail(idAutor:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutorController.updateEmail(idAutor), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorController", "updateEmail", Seq(classOf[Long]), "POST", """""", _prefix + """updateEmail/$idAutor<[^/]+>""")
)
                      

// @LINE:342
def editEmail(idAutor:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutorController.editEmail(idAutor), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorController", "editEmail", Seq(classOf[Long]), "GET", """""", _prefix + """editarEmail/$idAutor<[^/]+>""")
)
                      

}
                          

// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
// @LINE:282
class ReverseEncuestaWebController {


// @LINE:282
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaWebController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "create", Seq(), "GET", """""", _prefix + """encuesta""")
)
                      

// @LINE:284
def recibida(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaWebController.recibida(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "recibida", Seq(), "GET", """""", _prefix + """encuestaRecibida""")
)
                      

// @LINE:283
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaWebController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "save", Seq(), "POST", """""", _prefix + """encuesta/save""")
)
                      

// @LINE:285
def atiendeObservaciones(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaWebController.atiendeObservaciones(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "atiendeObservaciones", Seq(), "GET", """""", _prefix + """encuestaConObservaciones""")
)
                      

// @LINE:286
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaWebController.update(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "update", Seq(), "GET", """""", _prefix + """actualizaEncuesta""")
)
                      

// @LINE:287
def desdeLiga(nc:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EncuestaWebController.desdeLiga(nc), HandlerDef(this.getClass.getClassLoader, "", "controllers.EncuestaWebController", "desdeLiga", Seq(classOf[String]), "GET", """""", _prefix + """desdeLiga/$nc<[^/]+>""")
)
                      

}
                          

// @LINE:356
// @LINE:355
// @LINE:353
// @LINE:352
// @LINE:351
// @LINE:272
// @LINE:266
// @LINE:265
// @LINE:264
// @LINE:262
// @LINE:260
// @LINE:256
// @LINE:255
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
class ReverseAdminEvaluacionTablaController {


// @LINE:250
def editReactivo(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.editReactivo(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "editReactivo", Seq(classOf[Long]), "GET", """""", _prefix + """evaluacionTablaEvaluacionEdit""")
)
                      

// @LINE:265
def listaReactivos(version:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.listaReactivos(version), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listaReactivos", Seq(classOf[Long]), "GET", """""", _prefix + """listaReactivos/$version<[^/]+>""")
)
                      

// @LINE:253
def deleteReactivo(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.deleteReactivo(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "deleteReactivo", Seq(classOf[Long]), "POST", """""", _prefix + """evaluacionTablaEvaluacionDelete""")
)
                      

// @LINE:248
def listarReactivos(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.listarReactivos(p, s, o, f), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listarReactivos", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """evaluacionReactivosList""")
)
                      

// @LINE:256
def listarTabla(v:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.listarTabla(v), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listarTabla", Seq(classOf[Long]), "GET", """""", _prefix + """evaluacionTablaEvaluacionList""")
)
                      

// @LINE:356
def ajaxAgregarReactivoTablaEvaluacion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.ajaxAgregarReactivoTablaEvaluacion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxAgregarReactivoTablaEvaluacion", Seq(), "POST", """""", _prefix + """ajaxAgregarReactivoTablaEvaluacion""")
)
                      

// @LINE:355
def ajaxEliminaReactivoTablaEvaluacion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.ajaxEliminaReactivoTablaEvaluacion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxEliminaReactivoTablaEvaluacion", Seq(), "POST", """""", _prefix + """ajaxEliminaReactivoTablaEvaluacion""")
)
                      

// @LINE:272
def agregarReactivo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.agregarReactivo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "agregarReactivo", Seq(), "GET", """""", _prefix + """evaluacionTablaAgregarReactivo""")
)
                      

// @LINE:262
def listarReactivosInstrumento(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.listarReactivosInstrumento(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listarReactivosInstrumento", Seq(), "GET", """""", _prefix + """listarReactivosInstrumento""")
)
                      

// @LINE:264
def editTablaEvaluacion(idVersion:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.editTablaEvaluacion(idVersion), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "editTablaEvaluacion", Seq(classOf[Long]), "POST", """""", _prefix + """tablaEvaluacionEdit""")
)
                      

// @LINE:255
def removeTablaEvaluacion(idVersion:Long, idReactivo:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.removeTablaEvaluacion(idVersion, idReactivo), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "removeTablaEvaluacion", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """evaluacionTablaRemove""")
)
                      

// @LINE:252
def updateReactivo(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.updateReactivo(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "updateReactivo", Seq(classOf[Long]), "POST", """""", _prefix + """evaluacionTablaEvaluacionUpdate""")
)
                      

// @LINE:260
def listarTablaDTSS(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.listarTablaDTSS(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listarTablaDTSS", Seq(), "GET", """""", _prefix + """evaluacionTablaEvaluacionListDTSS""")
)
                      

// @LINE:353
def ajaxEditTablaEvaluacionTipoRecurso(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionTipoRecurso(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxEditTablaEvaluacionTipoRecurso", Seq(), "POST", """""", _prefix + """ajaxEditTablaEvaluacionTipoRecurso""")
)
                      

// @LINE:352
def ajaxEditTablaEvaluacionCriterio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionCriterio(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxEditTablaEvaluacionCriterio", Seq(), "POST", """""", _prefix + """ajaxEditTablaEvaluacionCriterio""")
)
                      

// @LINE:266
def listaEvaluacionTablaAjax(version:Long, desde:Long, hasta:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.listaEvaluacionTablaAjax(version, desde, hasta), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "listaEvaluacionTablaAjax", Seq(classOf[Long], classOf[Long], classOf[Long]), "GET", """""", _prefix + """listaEvaluacionTablaAjax/$version<[^/]+>/$desde<[^/]+>/$hasta<[^/]+>""")
)
                      

// @LINE:351
def ajaxEditTablaEvaluacionAspecto(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.ajaxEditTablaEvaluacionAspecto(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "ajaxEditTablaEvaluacionAspecto", Seq(), "POST", """""", _prefix + """ajaxEditTablaEvaluacionAspecto""")
)
                      

// @LINE:249
def createReactivo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.createReactivo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "createReactivo", Seq(), "GET", """""", _prefix + """evaluacionTablaEvaluacionCreate""")
)
                      

// @LINE:251
def saveReactivo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionTablaController.saveReactivo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionTablaController", "saveReactivo", Seq(), "POST", """""", _prefix + """evaluacionTablaEvaluacionSave""")
)
                      

}
                          

// @LINE:169
// @LINE:168
// @LINE:166
// @LINE:165
class ReversePersonalController {


// @LINE:166
def AdminUpdate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonalController.AdminUpdate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonalController", "AdminUpdate", Seq(), "POST", """""", _prefix + """ctaAdminEdit/update""")
)
                      

// @LINE:168
def CoordEdit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonalController.CoordEdit(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonalController", "CoordEdit", Seq(), "GET", """""", _prefix + """ctaCoordEdit""")
)
                      

// @LINE:165
def AdminEdit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonalController.AdminEdit(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonalController", "AdminEdit", Seq(), "GET", """""", _prefix + """ctaAdminEdit""")
)
                      

// @LINE:169
def CoordUpdate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonalController.CoordUpdate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonalController", "CoordUpdate", Seq(), "POST", """""", _prefix + """ctaCoordEdit/update""")
)
                      

}
                          

// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
class ReverseTipodocumentoController {


// @LINE:188
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TipodocumentoController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """tipodocumento/$id<[^/]+>/delete""")
)
                      

// @LINE:187
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TipodocumentoController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "create", Seq(), "GET", """""", _prefix + """tipodocumento/new""")
)
                      

// @LINE:190
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TipodocumentoController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """tipodocumento/$id<[^/]+>/edit""")
)
                      

// @LINE:191
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TipodocumentoController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """tipodocumento/$id<[^/]+>/update""")
)
                      

// @LINE:186
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TipodocumentoController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "list", Seq(), "GET", """""", _prefix + """tiposdocumentos""")
)
                      

// @LINE:189
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TipodocumentoController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TipodocumentoController", "save", Seq(), "POST", """""", _prefix + """tipodocumento/""")
)
                      

}
                          

// @LINE:239
// @LINE:229
// @LINE:226
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:150
// @LINE:149
// @LINE:139
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:76
// @LINE:71
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
class ReverseRecursoController {


// @LINE:226
def canceladosEvaluacionList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.canceladosEvaluacionList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "canceladosEvaluacionList", Seq(), "GET", """""", _prefix + """canceladosEvaluacion""")
)
                      

// @LINE:80
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """recursos/$id<[^/]+>/delete""")
)
                      

// @LINE:76
def list(p:Int, s:String, o:String, f:String, c:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.list(p, s, o, f, c), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """recursos""")
)
                      

// @LINE:83
def ajaxDelete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.ajaxDelete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "ajaxDelete", Seq(classOf[Long]), "POST", """""", _prefix + """recursos/$id<[^/]+>/ajaxDelete""")
)
                      

// @LINE:79
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "edit", Seq(classOf[Long]), "GET", """GET     /recursos/new          			controllers.RecursoController.create()
POST    /recursos             			controllers.RecursoController.save()""", _prefix + """recursos/$id<[^/]+>""")
)
                      

// @LINE:224
def reactivarRecursoEvaluacion(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.reactivarRecursoEvaluacion(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "reactivarRecursoEvaluacion", Seq(classOf[Long]), "POST", """""", _prefix + """reactivarRecursoEvaluacion""")
)
                      

// @LINE:82
def ajaxListTabla(p:Int, s:String, o:String, f:String, c:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.ajaxListTabla(p, s, o, f, c), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "ajaxListTabla", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """ajaxListTabla""")
)
                      

// @LINE:239
def cambio(id:Long, observacion:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.cambio(id, observacion), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "cambio", Seq(classOf[Long], classOf[String]), "POST", """""", _prefix + """cambio""")
)
                      

// @LINE:223
def cancelarRecursoEvaluacion(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.cancelarRecursoEvaluacion(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "cancelarRecursoEvaluacion", Seq(classOf[Long]), "POST", """""", _prefix + """cancelarRecursoEvaluacion""")
)
                      

// @LINE:149
def ver(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.ver(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "ver", Seq(classOf[Long]), "GET", """""", _prefix + """documento/ver/$id<[^/]+>""")
)
                      

// @LINE:81
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """recursos/$id<[^/]+>""")
)
                      

// @LINE:229
def canceladosClasificacionList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.canceladosClasificacionList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "canceladosClasificacionList", Seq(), "GET", """""", _prefix + """canceladosClasificacion""")
)
                      

// @LINE:69
def observacionessave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.observacionessave(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "observacionessave", Seq(), "POST", """""", _prefix + """observaciones""")
)
                      

// @LINE:139
def masterlist(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.masterlist(p, s, o, f), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "masterlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """master""")
)
                      

// @LINE:67
def completoList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.completoList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "completoList", Seq(), "GET", """""", _prefix + """recursos/completoList""")
)
                      

// @LINE:221
def solicitudCanceladoList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.solicitudCanceladoList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "solicitudCanceladoList", Seq(), "GET", """""", _prefix + """solicitudCanceladoList""")
)
                      

// @LINE:68
def observar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.observar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "observar", Seq(classOf[Long]), "GET", """""", _prefix + """recursos/observar/$id<[^/]+>""")
)
                      

// @LINE:150
def verOficioValoracion(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.verOficioValoracion(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "verOficioValoracion", Seq(classOf[Long]), "GET", """""", _prefix + """documento/verOficioValoracion/$id<[^/]+>""")
)
                      

// @LINE:71
def revisar(id:Long, aspecto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.revisar(id, aspecto), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "revisar", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """revisar/$id<[^/]+>/$aspecto<[^/]+>""")
)
                      

// @LINE:65
def porObservarList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.porObservarList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "porObservarList", Seq(), "GET", """""", _prefix + """recursos/observarList""")
)
                      

// @LINE:222
def solicitudCancelado(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.solicitudCancelado(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "solicitudCancelado", Seq(classOf[Long]), "GET", """""", _prefix + """solicitudCancelado/$id<[^/]+>""")
)
                      

// @LINE:220
def canceladosList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.canceladosList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "canceladosList", Seq(), "GET", """""", _prefix + """canceladoList""")
)
                      

// @LINE:66
def porReObservarList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoController.porReObservarList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoController", "porReObservarList", Seq(), "GET", """""", _prefix + """recursos/reObservarList""")
)
                      

}
                          

// @LINE:347
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:129
class ReverseUnidadacademicaController {


// @LINE:134
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadacademicaController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """unidadacademica/$id<[^/]+>/delete""")
)
                      

// @LINE:347
def ajaxListaDTSS(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadacademicaController.ajaxListaDTSS(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "ajaxListaDTSS", Seq(), "GET", """""", _prefix + """ajaxListaDTSS""")
)
                      

// @LINE:131
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadacademicaController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "create", Seq(), "GET", """""", _prefix + """unidadacademica/new""")
)
                      

// @LINE:133
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadacademicaController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """unidadacademica/$id<[^/]+>""")
)
                      

// @LINE:135
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadacademicaController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """unidadacademica/$id<[^/]+>""")
)
                      

// @LINE:129
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadacademicaController.list(p, s, o, f), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """unidadacademica""")
)
                      

// @LINE:132
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadacademicaController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadacademicaController", "save", Seq(), "POST", """""", _prefix + """unidadacademica""")
)
                      

}
                          

// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
class ReverseAutorfuncionController {


// @LINE:104
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutorfuncionController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """autorfuncion/$id<[^/]+>/delete""")
)
                      

// @LINE:101
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutorfuncionController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "create", Seq(), "GET", """""", _prefix + """autorfuncion/new""")
)
                      

// @LINE:103
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutorfuncionController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """autorfuncion/$id<[^/]+>""")
)
                      

// @LINE:105
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutorfuncionController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """autorfuncion/new""")
)
                      

// @LINE:100
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutorfuncionController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "list", Seq(), "GET", """""", _prefix + """autorfuncion""")
)
                      

// @LINE:102
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AutorfuncionController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AutorfuncionController", "save", Seq(), "POST", """""", _prefix + """autorfuncion""")
)
                      

}
                          

// @LINE:147
// @LINE:146
class ReverseDocumentoController {


// @LINE:147
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentoController.upload(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentoController", "upload", Seq(), "POST", """""", _prefix + """documento/upload""")
)
                      

// @LINE:146
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentoController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentoController", "create", Seq(), "GET", """""", _prefix + """documento""")
)
                      

}
                          

// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
// @LINE:173
// @LINE:172
class ReverseAspectoController {


// @LINE:174
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AspectoController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """aspecto/$id<[^/]+>/delete""")
)
                      

// @LINE:173
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AspectoController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "create", Seq(), "GET", """""", _prefix + """aspecto/new""")
)
                      

// @LINE:176
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AspectoController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """aspecto/$id<[^/]+>/edit""")
)
                      

// @LINE:177
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AspectoController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """aspecto/$id<[^/]+>/update""")
)
                      

// @LINE:172
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AspectoController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "list", Seq(), "GET", """""", _prefix + """aspectos""")
)
                      

// @LINE:175
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AspectoController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AspectoController", "save", Seq(), "POST", """""", _prefix + """aspecto/""")
)
                      

}
                          

// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
class ReverseVersionanteriorController {


// @LINE:96
def save(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VersionanteriorController.save(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.VersionanteriorController", "save", Seq(classOf[Long]), "POST", """""", _prefix + """actualizacionesSave/$id<[^/]+>""")
)
                      

// @LINE:95
def create(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VersionanteriorController.create(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.VersionanteriorController", "create", Seq(classOf[Long]), "GET", """""", _prefix + """actualizacionesCreate""")
)
                      

// @LINE:93
def listaActualizaciones(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VersionanteriorController.listaActualizaciones(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VersionanteriorController", "listaActualizaciones", Seq(), "GET", """""", _prefix + """actualizacionesList""")
)
                      

// @LINE:94
def eliminarActualizaciones(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VersionanteriorController.eliminarActualizaciones(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.VersionanteriorController", "eliminarActualizaciones", Seq(classOf[Long]), "POST", """""", _prefix + """actualizaciones/$id<[^/]+>/delete""")
)
                      

}
                          

// @LINE:278
// @LINE:277
// @LINE:276
// @LINE:274
class ReverseProrrogaController {


// @LINE:276
def save(idRecEv:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProrrogaController.save(idRecEv), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProrrogaController", "save", Seq(classOf[Long]), "POST", """GET		/prorrogaCreate/:idRecEv/:ndias				controllers.ProrrogaController.create(idRecEv:Long, ndias:Int)""", _prefix + """prorrogaSave/$idRecEv<[^/]+>""")
)
                      

// @LINE:274
def list(p:Int, s:String, o:String, f:String, c:String, rdioSolicitud:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProrrogaController.list(p, s, o, f, c, rdioSolicitud), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProrrogaController", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int]), "GET", """""", _prefix + """prorrogaList""")
)
                      

// @LINE:278
def delete(idPro:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProrrogaController.delete(idPro), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProrrogaController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """prorrogaDelete/$idPro<[^/]+>""")
)
                      

// @LINE:277
def edit(idRecEv:Long, ndias:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProrrogaController.edit(idRecEv, ndias), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProrrogaController", "edit", Seq(classOf[Long], classOf[Int]), "GET", """""", _prefix + """prorrogaEdit/$idRecEv<[^/]+>/$ndias<[^/]+>""")
)
                      

}
                          

// @LINE:271
// @LINE:270
class ReverseTablaEvaluacionVersionController {


// @LINE:271
def toggle(idVersion:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TablaEvaluacionVersionController.toggle(idVersion), HandlerDef(this.getClass.getClassLoader, "", "controllers.TablaEvaluacionVersionController", "toggle", Seq(classOf[Long]), "POST", """""", _prefix + """toggle/$idVersion<[^/]+>""")
)
                      

// @LINE:270
def versionCreate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TablaEvaluacionVersionController.versionCreate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TablaEvaluacionVersionController", "versionCreate", Seq(), "POST", """""", _prefix + """nuevaVersion""")
)
                      

}
                          

// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
class ReverseNiveleducativoController {


// @LINE:117
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NiveleducativoController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """nivel/$id<[^/]+>/delete""")
)
                      

// @LINE:114
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NiveleducativoController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "create", Seq(), "GET", """""", _prefix + """nivel/new""")
)
                      

// @LINE:116
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NiveleducativoController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """nivel/$id<[^/]+>""")
)
                      

// @LINE:118
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NiveleducativoController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """nivel/$id<[^/]+>""")
)
                      

// @LINE:115
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NiveleducativoController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "save", Seq(), "POST", """""", _prefix + """nivel""")
)
                      

// @LINE:113
def listDT(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NiveleducativoController.listDT(), HandlerDef(this.getClass.getClassLoader, "", "controllers.NiveleducativoController", "listDT", Seq(), "GET", """GET     /nivelList          controllers.NiveleducativoController.list(p:Int ?= 0, s ?= "descripcion", o ?= "asc", f ?= "")""", _prefix + """nivelList""")
)
                      

}
                          

// @LINE:163
// @LINE:162
class ReverseCtacorreoController {


// @LINE:163
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtacorreoController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CtacorreoController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """ctaCorreo/$id<[^/]+>/update""")
)
                      

// @LINE:162
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CtacorreoController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CtacorreoController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """ctaCorreo""")
)
                      

}
                          

// @LINE:332
// @LINE:331
// @LINE:330
class ReverseOficioValoracionController {


// @LINE:332
def save(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OficioValoracionController.save(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioValoracionController", "save", Seq(classOf[Long]), "POST", """""", _prefix + """OficioValoracionSave/$id<[^/]+>""")
)
                      

// @LINE:330
def create(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OficioValoracionController.create(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioValoracionController", "create", Seq(classOf[Long]), "GET", """""", _prefix + """crearOficioValoracion/$id<[^/]+>""")
)
                      

// @LINE:331
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OficioValoracionController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.OficioValoracionController", "list", Seq(), "GET", """""", _prefix + """listarOficioValoracion""")
)
                      

}
                          

// @LINE:349
// @LINE:334
// @LINE:326
// @LINE:304
// @LINE:59
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {


// @LINE:15
def cambiarPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cambiarPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "cambiarPassword", Seq(), "POST", """""", _prefix + """cambiarPassword""")
)
                      

// @LINE:16
def cambiarEmail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cambiarEmail(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "cambiarEmail", Seq(), "POST", """""", _prefix + """cambiarEmail""")
)
                      

// @LINE:349
def errorInicioSesion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.errorInicioSesion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "errorInicioSesion", Seq(), "GET", """""", _prefix + """errorInicioSesion""")
)
                      

// @LINE:326
def leerXL4(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.leerXL4(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "leerXL4", Seq(), "GET", """""", _prefix + """leerXL4""")
)
                      

// @LINE:10
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:334
def Acerca(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Acerca(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Acerca", Seq(), "GET", """""", _prefix + """Acerca""")
)
                      

// @LINE:11
def autentica(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.autentica(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "autentica", Seq(), "POST", """""", _prefix + """autentica""")
)
                      

// @LINE:12
def timeOut(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.timeOut(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "timeOut", Seq(), "GET", """""", _prefix + """timeOut""")
)
                      

// @LINE:59
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "javascriptRoutes", Seq(), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/javascripts/routes""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          

// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
class ReverseAreaconocimientoController {


// @LINE:124
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AreaconocimientoController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """areaconocimientos/$id<[^/]+>/delete""")
)
                      

// @LINE:121
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AreaconocimientoController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "create", Seq(), "GET", """""", _prefix + """areaconocimientos/new""")
)
                      

// @LINE:123
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AreaconocimientoController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """areaconocimientos/$id<[^/]+>""")
)
                      

// @LINE:125
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AreaconocimientoController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """areaconocimientos/$id<[^/]+>""")
)
                      

// @LINE:120
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AreaconocimientoController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "list", Seq(), "GET", """""", _prefix + """areaconocimientos""")
)
                      

// @LINE:122
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AreaconocimientoController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AreaconocimientoController", "save", Seq(), "POST", """""", _prefix + """areaconocimientos""")
)
                      

}
                          

// @LINE:337
// @LINE:336
// @LINE:323
// @LINE:312
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:200
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
class ReverseRecursoevaluadorController {


// @LINE:199
def mostrarEvaluadores(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.mostrarEvaluadores(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluadores", Seq(classOf[Long]), "GET", """""", _prefix + """mostrarEvaluadores/$id<[^/]+>""")
)
                      

// @LINE:198
def asignarEvaluadoresSave(id:Long, tipo:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.asignarEvaluadoresSave(id, tipo), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "asignarEvaluadoresSave", Seq(classOf[Long], classOf[String]), "POST", """""", _prefix + """asignarEvaluadoresSave/$id<[^/]+>/$tipo<[^/]+>""")
)
                      

// @LINE:203
def mostrarEvaluacionesConObservaciones(tipo:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.mostrarEvaluacionesConObservaciones(tipo), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesConObservaciones", Seq(classOf[Int]), "GET", """""", _prefix + """mostrarEvaluacionesConObservaciones/$tipo<[^/]+>""")
)
                      

// @LINE:312
def reporteEvaluacion(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.reporteEvaluacion(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "reporteEvaluacion", Seq(classOf[Long]), "GET", """""", _prefix + """admin/reporteEvaluacion/$id<[^/]+>""")
)
                      

// @LINE:196
def asignarEvaluadoresList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.asignarEvaluadoresList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "asignarEvaluadoresList", Seq(), "GET", """""", _prefix + """asignarEvaluadores""")
)
                      

// @LINE:197
def asignarEvaluadoresCreate(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.asignarEvaluadoresCreate(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "asignarEvaluadoresCreate", Seq(classOf[Long]), "GET", """""", _prefix + """asignarEvaluadores/$id<[^/]+>""")
)
                      

// @LINE:201
def mostrarEvaluacionesEnProceso(tipo:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.mostrarEvaluacionesEnProceso(tipo), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesEnProceso", Seq(classOf[Int]), "GET", """""", _prefix + """mostrarEvaluacionesEnProceso/$tipo<[^/]+>""")
)
                      

// @LINE:204
def mostrarEvaluacionesConcluidas(tipo:Int, device:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.mostrarEvaluacionesConcluidas(tipo, device), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesConcluidas", Seq(classOf[Int], classOf[String]), "GET", """""", _prefix + """mostrarEvaluacionesConcluidas/$tipo<[^/]+>/$device<[^/]+>""")
)
                      

// @LINE:323
def pruebaCorreo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.pruebaCorreo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "pruebaCorreo", Seq(), "GET", """""", _prefix + """pruebaCorreo2""")
)
                      

// @LINE:336
def evaluada(idRe:Long, tipo:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.evaluada(idRe, tipo), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "evaluada", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """evaluada/$idRe<[^/]+>""")
)
                      

// @LINE:337
def evaluadas(idRecurso:Long, tipo:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.evaluadas(idRecurso, tipo), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "evaluadas", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """evaluadas/$idRecurso<[^/]+>""")
)
                      

// @LINE:200
def mostrarEvaluacionesSinAtender(tipo:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.mostrarEvaluacionesSinAtender(tipo), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesSinAtender", Seq(classOf[Int]), "GET", """""", _prefix + """mostrarEvaluacionesSinAtender/$tipo<[^/]+>""")
)
                      

// @LINE:202
def mostrarEvaluacionesPorRevisar(tipo:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoevaluadorController.mostrarEvaluacionesPorRevisar(tipo), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoevaluadorController", "mostrarEvaluacionesPorRevisar", Seq(classOf[Int]), "GET", """""", _prefix + """mostrarEvaluacionesPorRevisar/$tipo<[^/]+>""")
)
                      

}
                          

// @LINE:301
class ReverseHistorialController {


// @LINE:301
def ajaxActualizaLog(nitems:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HistorialController.ajaxActualizaLog(nitems), HandlerDef(this.getClass.getClassLoader, "", "controllers.HistorialController", "ajaxActualizaLog", Seq(classOf[Int]), "GET", """GET		/actualizaLog							controllers.HistorialController.actualizaLog()""", _prefix + """ajaxActualizaLog/$nitems<[^/]+>""")
)
                      

}
                          

// @LINE:153
// @LINE:152
class ReverseReporteController {


// @LINE:153
def solicitudFirma(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReporteController.solicitudFirma(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ReporteController", "solicitudFirma", Seq(classOf[Long]), "GET", """""", _prefix + """reporte/solicitudFirma/$id<[^/]+>""")
)
                      

// @LINE:152
def cesoe(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReporteController.cesoe(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ReporteController", "cesoe", Seq(classOf[Long]), "GET", """""", _prefix + """reporte/cesoe/$id<[^/]+>""")
)
                      

}
                          

// @LINE:218
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
class ReverseClasificacionController {


// @LINE:214
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClasificacionController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """clasificacionEdit""")
)
                      

// @LINE:215
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClasificacionController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """clasificacionUpdate""")
)
                      

// @LINE:217
def clasificacionRestricciones(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClasificacionController.clasificacionRestricciones(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "clasificacionRestricciones", Seq(), "POST", """""", _prefix + """clasificacionRestricciones""")
)
                      

// @LINE:211
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClasificacionController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "list", Seq(), "GET", """""", _prefix + """clasificacionList""")
)
                      

// @LINE:213
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClasificacionController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "save", Seq(), "POST", """""", _prefix + """clasificacionSave""")
)
                      

// @LINE:218
def descripcionCriterio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClasificacionController.descripcionCriterio(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "descripcionCriterio", Seq(), "POST", """""", _prefix + """descripcionCriterio""")
)
                      

// @LINE:216
def ejemplos(c1:Long, c2:Long, c3:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClasificacionController.ejemplos(c1, c2, c3), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "ejemplos", Seq(classOf[Long], classOf[Long], classOf[Long]), "GET", """""", _prefix + """ejemplosClasificador""")
)
                      

// @LINE:212
def create(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClasificacionController.create(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClasificacionController", "create", Seq(classOf[Long]), "GET", """""", _prefix + """clasificacionCreate""")
)
                      

}
                          

// @LINE:319
// @LINE:318
// @LINE:317
// @LINE:316
// @LINE:315
// @LINE:314
class ReverseDirigidoaController {


// @LINE:319
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DirigidoaController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """dirigidoa/$id<[^/]+>/delete""")
)
                      

// @LINE:315
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DirigidoaController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "create", Seq(), "GET", """""", _prefix + """dirigidoa/create""")
)
                      

// @LINE:317
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DirigidoaController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """dirigidoa/$id<[^/]+>/edit""")
)
                      

// @LINE:318
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DirigidoaController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "update", Seq(classOf[Long]), "GET", """""", _prefix + """dirigidoa/$id<[^/]+>/update""")
)
                      

// @LINE:314
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DirigidoaController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "list", Seq(), "GET", """""", _prefix + """dirigidoa""")
)
                      

// @LINE:316
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DirigidoaController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DirigidoaController", "save", Seq(), "GET", """""", _prefix + """dirigidoa/save""")
)
                      

}
                          

// @LINE:359
// @LINE:14
class ReverseCoordinadorController {


// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CoordinadorController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CoordinadorController", "index", Seq(), "GET", """""", _prefix + """coord""")
)
                      

}
                          

// @LINE:184
// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
class ReverseFormatoentregaController {


// @LINE:181
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FormatoentregaController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """formatoentrega/$id<[^/]+>/delete""")
)
                      

// @LINE:180
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FormatoentregaController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "create", Seq(), "GET", """""", _prefix + """formatoentrega/new""")
)
                      

// @LINE:183
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FormatoentregaController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """formatoentrega/$id<[^/]+>/edit""")
)
                      

// @LINE:184
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FormatoentregaController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """formatoentrega/$id<[^/]+>/update""")
)
                      

// @LINE:179
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FormatoentregaController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "list", Seq(), "GET", """""", _prefix + """formatosentrega""")
)
                      

// @LINE:182
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FormatoentregaController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FormatoentregaController", "save", Seq(), "POST", """""", _prefix + """formatoentrega/""")
)
                      

}
                          

// @LINE:244
class ReverseauxCargaDatosController {


// @LINE:244
def cargaEvaluacionTabla(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.auxCargaDatosController.cargaEvaluacionTabla(), HandlerDef(this.getClass.getClassLoader, "", "controllers.auxCargaDatosController", "cargaEvaluacionTabla", Seq(), "GET", """""", _prefix + """cargaEvaluacionTabla""")
)
                      

}
                          

// @LINE:372
// @LINE:371
// @LINE:369
// @LINE:368
// @LINE:363
// @LINE:362
// @LINE:361
// @LINE:346
// @LINE:308
// @LINE:302
// @LINE:194
// @LINE:148
// @LINE:143
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:7
// @LINE:5
class ReverseRecursoWebController {


// @LINE:361
def WSBuscarNC2(nc:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.WSBuscarNC2(nc), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "WSBuscarNC2", Seq(classOf[String]), "GET", """""", _prefix + """WSBuscarNC2""")
)
                      

// @LINE:55
def imprimirSolicitudAceptada(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.imprimirSolicitudAceptada(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "imprimirSolicitudAceptada", Seq(), "GET", """""", _prefix + """aceptada""")
)
                      

// @LINE:51
def mastersave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.mastersave(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "mastersave", Seq(), "POST", """""", _prefix + """recursoweb""")
)
                      

// @LINE:7
def recibido(nc:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.recibido(nc), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "recibido", Seq(classOf[String]), "GET", """""", _prefix + """solRecibida/$nc<[^/]+>""")
)
                      

// @LINE:52
def masteredit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.masteredit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "masteredit", Seq(classOf[Long]), "GET", """""", _prefix + """recursoweb/$id<[^/]+>""")
)
                      

// @LINE:346
def ajaxUnidadAcademicaFiltrada(nivel:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.ajaxUnidadAcademicaFiltrada(nivel), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "ajaxUnidadAcademicaFiltrada", Seq(classOf[Long]), "GET", """GET     /ajaxUnidadAcademicaFiltrada/:nivel/:area             controllers.RecursoWebController.ajaxUnidadAcademicaFiltrada(nivel:Long, area:Long)""", _prefix + """ajaxUnidadAcademicaFiltrada/$nivel<[^/]+>""")
)
                      

// @LINE:50
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "create", Seq(), "GET", """""", _prefix + """recursoweb/new""")
)
                      

// @LINE:372
def enviarSocket(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.enviarSocket(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "enviarSocket", Seq(), "GET", """""", _prefix + """enviarSocket""")
)
                      

// @LINE:54
def masterupdate(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.masterupdate(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "masterupdate", Seq(classOf[Long]), "POST", """""", _prefix + """recursoweb/$id<[^/]+>""")
)
                      

// @LINE:368
def index2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.index2(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "index2", Seq(), "GET", """""", _prefix + """index2""")
)
                      

// @LINE:194
def Correo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.Correo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "Correo", Seq(), "GET", """""", _prefix + """pruebaCorreo""")
)
                      

// @LINE:363
def WSAjaxImprimirReporteETP(idRecurso:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.WSAjaxImprimirReporteETP(idRecurso), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "WSAjaxImprimirReporteETP", Seq(classOf[Long]), "GET", """""", _prefix + """WSAjaxImprimirReporteETP/$idRecurso<[^/]+>""")
)
                      

// @LINE:371
def socket(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.socket(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "socket", Seq(), "GET", """""", _prefix + """socket""")
)
                      

// @LINE:143
def buscarNC(nc:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.buscarNC(nc), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "buscarNC", Seq(classOf[String]), "GET", """""", _prefix + """buscarNC/$nc<[^/]+>""")
)
                      

// @LINE:148
def verAn(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.verAn(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "verAn", Seq(classOf[Long]), "GET", """""", _prefix + """documento/verAn/$id<[^/]+>""")
)
                      

// @LINE:302
def conObservacionesAn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.conObservacionesAn(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "conObservacionesAn", Seq(), "GET", """""", _prefix + """conObservacionesAn""")
)
                      

// @LINE:308
def reporteEvaluacion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.reporteEvaluacion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "reporteEvaluacion", Seq(), "GET", """""", _prefix + """reporteEvaluacion""")
)
                      

// @LINE:53
def mastereditAn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.mastereditAn(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "mastereditAn", Seq(), "GET", """""", _prefix + """recursowebAn""")
)
                      

// @LINE:362
def WSAjaxImprimirSolicitudAceptada(idRecurso:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.WSAjaxImprimirSolicitudAceptada(idRecurso), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "WSAjaxImprimirSolicitudAceptada", Seq(classOf[Long]), "GET", """""", _prefix + """WSImprimirSolicitudAceptada/$idRecurso<[^/]+>""")
)
                      

// @LINE:369
def pingWs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.pingWs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "pingWs", Seq(), "GET", """""", _prefix + """pingWs""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:56
def verDatosEnviados(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RecursoWebController.verDatosEnviados(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RecursoWebController", "verDatosEnviados", Seq(), "GET", """""", _prefix + """verDatosEnviados""")
)
                      

}
                          

// @LINE:48
class ReverseAdminEvaluacionController {


// @LINE:48
def saveObservaciones(id:Long, aspecto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminEvaluacionController.saveObservaciones(id, aspecto), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminEvaluacionController", "saveObservaciones", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """evSaveObservaciones/$id<[^/]+>/$aspecto<[^/]+>""")
)
                      

}
                          

// @LINE:279
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseEvaluacionEvaluadorController {


// @LINE:35
def porAtenderAdmin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.porAtenderAdmin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "porAtenderAdmin", Seq(), "GET", """""", _prefix + """evPorAtenderAdmin""")
)
                      

// @LINE:32
def edit(id:Long, idAspecto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.edit(id, idAspecto), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "edit", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """evEdit""")
)
                      

// @LINE:279
def solicitarProrroga(id:Long, idAspecto:Long, ndias:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.solicitarProrroga(id, idAspecto, ndias), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "solicitarProrroga", Seq(classOf[Long], classOf[Long], classOf[Int]), "POST", """""", _prefix + """prorrogaSolicitar/$id<[^/]+>/$idAspecto<[^/]+>/$ndias<[^/]+>""")
)
                      

// @LINE:36
def porObservar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.porObservar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "porObservar", Seq(), "GET", """""", _prefix + """evPorObservar""")
)
                      

// @LINE:41
def saveObservaciones(id:Long, aspecto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.saveObservaciones(id, aspecto), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "saveObservaciones", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """evSaveObservaciones/$id<[^/]+>/$aspecto<[^/]+>""")
)
                      

// @LINE:19
def resumen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.resumen(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "resumen", Seq(), "GET", """""", _prefix + """evResumen""")
)
                      

// @LINE:38
def solicitudesCancelacion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.solicitudesCancelacion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "solicitudesCancelacion", Seq(), "GET", """""", _prefix + """evSolicitudesCancelacion""")
)
                      

// @LINE:26
def create(id:Long, idAspecto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.create(id, idAspecto), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "create", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """evCreate""")
)
                      

// @LINE:22
def listado(p:Int, s:String, o:String, f:String, c:String, sol:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.listado(p, s, o, f, c, sol), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "listado", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int]), "GET", """""", _prefix + """evList""")
)
                      

// @LINE:37
def concluidas(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.concluidas(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "concluidas", Seq(), "GET", """""", _prefix + """evConcluidas""")
)
                      

// @LINE:21
def enProceso(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.enProceso(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "enProceso", Seq(), "GET", """""", _prefix + """enProceso""")
)
                      

// @LINE:20
def porEvaluar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.porEvaluar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "porEvaluar", Seq(), "GET", """""", _prefix + """porEvaluar""")
)
                      

// @LINE:45
def canceladaEvaluacion(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.canceladaEvaluacion(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "canceladaEvaluacion", Seq(classOf[Long]), "GET", """""", _prefix + """evCanceladaEvaluacion""")
)
                      

// @LINE:44
def canceladasEvaluacion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.canceladasEvaluacion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "canceladasEvaluacion", Seq(), "GET", """""", _prefix + """evCanceladasEvaluacion""")
)
                      

// @LINE:39
def atenderObservaciones(id:Long, aspecto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.atenderObservaciones(id, aspecto), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "atenderObservaciones", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """evAtenderObservaciones/$id<[^/]+>/$aspecto<[^/]+>""")
)
                      

// @LINE:34
def save(id:Long, idAspecto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.save(id, idAspecto), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "save", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """evSave/$id<[^/]+>/$idAspecto<[^/]+>""")
)
                      

// @LINE:33
def verDetalle(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.verDetalle(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "verDetalle", Seq(classOf[Long]), "GET", """""", _prefix + """evVerDetalle/$id<[^/]+>""")
)
                      

// @LINE:18
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluacionEvaluadorController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluacionEvaluadorController", "index", Seq(), "GET", """""", _prefix + """ev""")
)
                      

}
                          

// @LINE:328
// @LINE:327
// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
class ReverseEvaluadorController {


// @LINE:158
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluadorController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """evaluador/$id<[^/]+>/delete""")
)
                      

// @LINE:156
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluadorController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "create", Seq(), "GET", """""", _prefix + """evaluador/new""")
)
                      

// @LINE:327
def existeMail(correo:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluadorController.existeMail(correo), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "existeMail", Seq(classOf[String]), "GET", """""", _prefix + """validarExistenciaEmail""")
)
                      

// @LINE:159
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluadorController.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """evaluador/$id<[^/]+>/edit""")
)
                      

// @LINE:160
def update2(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluadorController.update2(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "update2", Seq(classOf[Long]), "POST", """""", _prefix + """evaluador/$id<[^/]+>/update""")
)
                      

// @LINE:328
def existeUserPass(user:String, pass:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluadorController.existeUserPass(user, pass), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "existeUserPass", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """validarExistenciaUserPass/$user<[^/]+>/$pass<[^/]+>""")
)
                      

// @LINE:155
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluadorController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "list", Seq(), "GET", """""", _prefix + """evaluadores""")
)
                      

// @LINE:157
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EvaluadorController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EvaluadorController", "save", Seq(), "POST", """""", _prefix + """evaluador""")
)
                      

}
                          

// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
class ReverseCalendarioController {


// @LINE:235
def hoyMasDias(nd:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarioController.hoyMasDias(nd), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "hoyMasDias", Seq(classOf[Int]), "GET", """""", _prefix + """hoyMasDias""")
)
                      

// @LINE:236
def fechaMasDias(nd:Int, fechainicio:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarioController.fechaMasDias(nd, fechainicio), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "fechaMasDias", Seq(classOf[Int], classOf[String]), "GET", """""", _prefix + """fechaMasDias""")
)
                      

// @LINE:234
def eliminarFechaCalendario(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarioController.eliminarFechaCalendario(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "eliminarFechaCalendario", Seq(classOf[String]), "POST", """""", _prefix + """eliminarFechaCalendario""")
)
                      

// @LINE:232
def inicio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarioController.inicio(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "inicio", Seq(), "GET", """""", _prefix + """calendario""")
)
                      

// @LINE:233
def agregarFechaCalendario(desde:String, hasta:String, titulo:String, id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarioController.agregarFechaCalendario(desde, hasta, titulo, id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarioController", "agregarFechaCalendario", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """agregarFechaCalendario""")
)
                      

}
                          
}
        
    