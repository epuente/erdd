# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table aprueba001 (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_aprueba001 primary key (id))
;

create table alcance_curricular (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_alcance_curricular primary key (id))
;

create table areaconocimiento (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_areaconocimiento primary key (id))
;

create table aspecto (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_aspecto primary key (id))
;

create table autorfuncion (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_autorfuncion primary key (id))
;

create table calendario (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  desde                     datetime,
  hasta                     datetime,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_calendario primary key (id))
;

create table carrusel (
  id                        bigint auto_increment not null,
  nombre_archivo            varchar(255),
  liga                      varchar(255),
  posicion                  integer,
  inicio                    datetime,
  fin                       datetime,
  titulo                    varchar(100),
  contenttype               varchar(255),
  contenido                 longblob,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_carrusel primary key (id))
;

create table clasificacion (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  criterio1_id              bigint,
  criterio2_id              bigint,
  criterio3_id              bigint,
  tiporecurso_id            bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificacion primary key (id))
;

create table clasificador_cancelable (
  id                        bigint auto_increment not null,
  criterio1_id              bigint,
  criterio2_id              bigint,
  criterio3_id              bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificador_cancelable primary key (id))
;

create table clasificador_catalogo_criterio3 (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  informacion               varchar(600),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificador_catalogo_criterio3 primary key (id))
;

create table clasificador_criterio1 (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificador_criterio1 primary key (id))
;

create table clasificador_criterio2 (
  id                        bigint auto_increment not null,
  criterio1_id              bigint,
  descripcion               varchar(255),
  informacion               varchar(600),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificador_criterio2 primary key (id))
;

create table clasificador_criterio3 (
  id                        bigint auto_increment not null,
  criterio1_id              bigint,
  criterio2_id              bigint,
  catalogo_id               bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificador_criterio3 primary key (id))
;

create table clasificador_criterio3ejemplo (
  id                        bigint auto_increment not null,
  criterio3_id              bigint,
  tiporecurso_id            bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificador_criterio3ejemplo primary key (id))
;

create table clasificador_ejemplo (
  id                        bigint auto_increment not null,
  criterio1_id              bigint,
  criterio2_id              bigint,
  criterio3_id              bigint,
  tiporecurso_id            bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificador_ejemplo primary key (id))
;

create table clasificador_noevaluable (
  id                        bigint auto_increment not null,
  criterio1_id              bigint,
  criterio2_id              bigint,
  criterio3_id              bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificador_noevaluable primary key (id))
;

create table clasificador_tiporecurso (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificador_tiporecurso primary key (id))
;

create table correo_autor (
  id                        bigint auto_increment not null,
  autor_id                  bigint,
  email                     varchar(50),
  telefono                  varchar(5),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_correo_autor primary key (id))
;

create table correo_salida (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  estado_id                 bigint,
  asunto                    varchar(255),
  mensaje                   varchar(900),
  host                      varchar(255),
  de                        varchar(255),
  enviado                   tinyint(1) default 0,
  mensajeoperacion          varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_correo_salida primary key (id))
;

create table correo_salida_para (
  id                        bigint auto_increment not null,
  correosalida_id           bigint,
  para                      varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_correo_salida_para primary key (id))
;

create table ctacorreo (
  id                        bigint auto_increment not null,
  hostname                  varchar(255) not null,
  puerto                    varchar(255) not null,
  cuenta                    varchar(255),
  contrasenia               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_ctacorreo primary key (id))
;

create table dirigidoa (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_dirigidoa primary key (id))
;

create table documento (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  tipodocumento_id          bigint,
  nombrearchivo             varchar(255),
  contenttype               varchar(255),
  contenido                 longblob,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_documento primary key (id))
;

create table encuesta_observacion (
  id                        bigint auto_increment not null,
  encuesta_id               bigint,
  respuesta                 varchar(255) not null,
  descripcion               varchar(600) not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_encuesta_observacion primary key (id))
;

create table encuesta_reactivo (
  id                        bigint auto_increment not null,
  numreactivo               bigint,
  reactivo                  varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_encuesta_reactivo primary key (id))
;

create table encuesta_respuesta (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  respuesta1                varchar(255),
  respuesta1txt             varchar(600),
  respuesta2                varchar(255),
  respuesta2txt             varchar(600),
  respuesta3                varchar(255),
  respuesta3txt             varchar(600),
  respuesta4                varchar(255),
  respuesta4txt             varchar(600),
  respuesta5txt             varchar(600),
  estado_id                 bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_encuesta_respuesta primary key (id))
;

create table estado (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_estado primary key (id))
;

create table estado_activo (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_estado_activo primary key (id))
;

create table estado_encuesta (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_estado_encuesta primary key (id))
;

create table estado_evaluacion (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_estado_evaluacion primary key (id))
;

create table evaluacion (
  id                        bigint auto_increment not null,
  recursoevaluador_id       bigint,
  evaluaciontabla_id        bigint not null,
  respuesta                 integer not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion primary key (id))
;

create table evaluacion_fecha (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  fechainicio               datetime,
  ndias                     integer,
  fechalimite               datetime,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion_fecha primary key (id))
;

create table evaluacion_observacion (
  id                        bigint auto_increment not null,
  respuesta_id              bigint,
  observacion               varchar(600) not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion_observacion primary key (id))
;

create table evaluacion_observacion_gral (
  id                        bigint auto_increment not null,
  recursoevaluador_id       bigint,
  observacion               varchar(900),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion_observacion_gral primary key (id))
;

create table evaluacion_observacion_observacion_gral (
  id                        bigint auto_increment not null,
  evaluacionobservaciongral_id bigint,
  observacion               varchar(900),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion_observacion_observacion_gral primary key (id))
;

create table evaluacion_prorroga (
  id                        bigint auto_increment not null,
  recursoevaluador_id       bigint,
  ndias                     integer not null,
  fecha                     datetime not null,
  autorizado                tinyint(1) default 0,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion_prorroga primary key (id))
;

create table evaluacion_tabla (
  id                        bigint auto_increment not null,
  version_id                bigint,
  reactivo_id               bigint,
  aspecto_id                bigint,
  criterio1_id              bigint,
  criterio2_id              bigint,
  criterio3_id              bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion_tabla primary key (id))
;

create table evaluacion_tabla_reactivo (
  id                        bigint auto_increment not null,
  descripcion               varchar(600),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion_tabla_reactivo primary key (id))
;

create table evaluacion_tabla_tipo_recurso (
  id                        bigint auto_increment not null,
  evaluaciontabla_id        bigint,
  tiporecurso_id            bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion_tabla_tipo_recurso primary key (id))
;

create table evaluacion_tabla_version (
  id                        bigint auto_increment not null,
  version                   bigint not null,
  terminado                 varchar(1),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluacion_tabla_version primary key (id))
;

create table evaluador (
  id                        bigint auto_increment not null,
  personal_id               bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluador primary key (id))
;

create table evaluador_aspecto (
  id                        bigint auto_increment not null,
  evaluador_id              bigint not null,
  aspecto_id                bigint not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_evaluador_aspecto primary key (id))
;

create table formatoentrega (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_formatoentrega primary key (id))
;

create table historialestado (
  id                        bigint auto_increment not null,
  recurso_id                bigint not null,
  estado_id                 bigint not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_historialestado primary key (id))
;

create table historialestado_encuesta (
  id                        bigint auto_increment not null,
  recurso_id                bigint not null,
  estado_id                 bigint not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_historialestado_encuesta primary key (id))
;

create table historialestado_evaluacion (
  id                        bigint auto_increment not null,
  recurso_id                bigint not null,
  recursoevaluador_id       bigint not null,
  estado_id                 bigint not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_historialestado_evaluacion primary key (id))
;

create table modalidad (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_modalidad primary key (id))
;

create table niveleducativo (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_niveleducativo primary key (id))
;

create table observacion (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  campo                     varchar(255),
  observacion               varchar(600) not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_observacion primary key (id))
;

create table observacion_cancelacion (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  observacion               varchar(600) not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_observacion_cancelacion primary key (id))
;

create table oficio (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  numero                    varchar(255) not null,
  folio                     varchar(255) not null,
  contenttype               varchar(255),
  contenido                 longblob,
  nombrearchivo             varchar(255),
  fechaoficio               datetime,
  fecharecepcion            datetime,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_oficio primary key (id))
;

create table oficio_valoracion (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  numero                    varchar(255) not null,
  contenttype               varchar(255),
  contenido                 longblob,
  nombrearchivo             varchar(255),
  fechaoficio               datetime,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_oficio_valoracion primary key (id))
;

create table palabraclave (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  descripcion               varchar(35),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_palabraclave primary key (id))
;

create table personal (
  id                        bigint auto_increment not null,
  nombre                    varchar(255),
  paterno                   varchar(255),
  materno                   varchar(255),
  correo                    varchar(255),
  activo_id                 bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_personal primary key (id))
;

create table polimedia (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_polimedia primary key (id))
;

create table polimedia_carrusel (
  id                        bigint auto_increment not null,
  polimedia_id              bigint,
  nombre_archivo            varchar(255),
  liga                      varchar(255),
  posicion                  integer,
  inicio                    datetime,
  fin                       datetime,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_polimedia_carrusel primary key (id))
;

create table polimedia_carrusel_imagen (
  id                        bigint auto_increment not null,
  polimediacarrusel_id      bigint,
  contenttype               varchar(255),
  contenido                 longblob,
  constraint pk_polimedia_carrusel_imagen primary key (id))
;

create table recurso (
  id                        bigint auto_increment not null,
  titulo                    varchar(150) not null,
  areaconocimiento_id       bigint not null,
  niveleducativo_id         bigint not null,
  unidadmedida_id           bigint,
  duracion                  varchar(5),
  unidadacademica_id        bigint not null,
  alcancecurricular_id      bigint,
  alcancecurricularotro     varchar(120),
  elaboracion               datetime not null,
  programaacad              varchar(80) not null,
  modalidad_id              bigint not null,
  version_id                bigint not null,
  sinopsis                  varchar(250),
  formatoentrega_id         bigint not null,
  formatoentregaotro        varchar(100),
  url                       varchar(80),
  estado_id                 bigint,
  numcontrol                varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint uq_recurso_numcontrol unique (numcontrol),
  constraint pk_recurso primary key (id))
;

create table recurso_autor (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  autorfuncion_id           bigint,
  otrafuncion               varchar(255),
  paterno                   varchar(35),
  materno                   varchar(35),
  nombre                    varchar(40),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_recurso_autor primary key (id))
;

create table recurso_calificacion (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  calificacion              float not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_recurso_calificacion primary key (id))
;

create table recurso_calificacion_aspecto (
  id                        bigint auto_increment not null,
  recursocalificacion_id    bigint,
  aspecto_id                bigint,
  calificacion              float not null,
  constraint pk_recurso_calificacion_aspecto primary key (id))
;

create table recursoenweb (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  usuario                   varchar(20),
  password                  varchar(50),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_recursoenweb primary key (id))
;

create table recursoevaluador (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  aspecto_id                bigint,
  evaluador_id              bigint,
  estadoevaluacion_id       bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_recursoevaluador primary key (id))
;

create table registro_acceso (
  id                        bigint auto_increment not null,
  usuario_id                bigint,
  autor_id                  bigint,
  ruta                      varchar(255),
  ip                        varchar(255),
  fecha                     datetime,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_registro_acceso primary key (id))
;

create table rol (
  id                        bigint auto_increment not null,
  descripcion               varchar(255) not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_rol primary key (id))
;

create table solicitud_cancelacion (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  evaluador_id              bigint,
  recursoestadoanterior_id  bigint,
  motivo_cancelacion        varchar(255),
  observacion               varchar(255),
  fecha_solicitud           datetime not null,
  aceptada                  tinyint(1) default 0,
  fecha_aceptacion          datetime,
  fecha_reactivacion        datetime,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_solicitud_cancelacion primary key (id))
;

create table tipodocumento (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  estado_id                 bigint,
  obligatorio               integer,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_tipodocumento primary key (id))
;

create table unidad_medida (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_unidad_medida primary key (id))
;

create table unidadacademica (
  id                        bigint auto_increment not null,
  nombre                    varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_unidadacademica primary key (id))
;

create table unidadacademica_areaconocimiento (
  id                        bigint auto_increment not null,
  unidadacademica_id        bigint,
  area_id                   bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_unidadacademica_areaconocimiento primary key (id))
;

create table unidadacademica_niveleducativo (
  id                        bigint auto_increment not null,
  unidadacademica_id        bigint,
  nivel_id                  bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_unidadacademica_niveleducativo primary key (id))
;

create table usuario (
  id                        bigint auto_increment not null,
  personal_id               bigint,
  usuario                   varchar(255) not null,
  password                  varchar(255) not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_usuario primary key (id))
;

create table usuario_rol (
  id                        bigint auto_increment not null,
  usuario_id                bigint,
  rol_id                    bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_usuario_rol primary key (id))
;

create table version (
  id                        bigint auto_increment not null,
  descripcion               varchar(255),
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_version primary key (id))
;

create table versionanterior (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  recursoanterior_id        bigint not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_versionanterior primary key (id))
;

create table clasificacion_observacion (
  id                        bigint auto_increment not null,
  clasificacion_id          bigint,
  observacion               varchar(255) not null,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_clasificacion_observacion primary key (id))
;

create table recurso_dirigidoa (
  id                        bigint auto_increment not null,
  recurso_id                bigint,
  dirigidoa_id              bigint,
  auditinsert               datetime not null,
  auditlastupdate           datetime not null,
  constraint pk_recurso_dirigidoa primary key (id))
;

alter table clasificacion add constraint fk_clasificacion_recurso_1 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_clasificacion_recurso_1 on clasificacion (recurso_id);
alter table clasificacion add constraint fk_clasificacion_criterio1_2 foreign key (criterio1_id) references clasificador_criterio1 (id) on delete restrict on update restrict;
create index ix_clasificacion_criterio1_2 on clasificacion (criterio1_id);
alter table clasificacion add constraint fk_clasificacion_criterio2_3 foreign key (criterio2_id) references clasificador_criterio2 (id) on delete restrict on update restrict;
create index ix_clasificacion_criterio2_3 on clasificacion (criterio2_id);
alter table clasificacion add constraint fk_clasificacion_criterio3_4 foreign key (criterio3_id) references clasificador_criterio3 (id) on delete restrict on update restrict;
create index ix_clasificacion_criterio3_4 on clasificacion (criterio3_id);
alter table clasificacion add constraint fk_clasificacion_tiporecurso_5 foreign key (tiporecurso_id) references clasificador_tiporecurso (id) on delete restrict on update restrict;
create index ix_clasificacion_tiporecurso_5 on clasificacion (tiporecurso_id);
alter table clasificador_cancelable add constraint fk_clasificador_cancelable_criterio1_6 foreign key (criterio1_id) references clasificador_criterio1 (id) on delete restrict on update restrict;
create index ix_clasificador_cancelable_criterio1_6 on clasificador_cancelable (criterio1_id);
alter table clasificador_cancelable add constraint fk_clasificador_cancelable_criterio2_7 foreign key (criterio2_id) references clasificador_criterio2 (id) on delete restrict on update restrict;
create index ix_clasificador_cancelable_criterio2_7 on clasificador_cancelable (criterio2_id);
alter table clasificador_cancelable add constraint fk_clasificador_cancelable_criterio3_8 foreign key (criterio3_id) references clasificador_criterio3 (id) on delete restrict on update restrict;
create index ix_clasificador_cancelable_criterio3_8 on clasificador_cancelable (criterio3_id);
alter table clasificador_criterio2 add constraint fk_clasificador_criterio2_criterio1_9 foreign key (criterio1_id) references clasificador_criterio1 (id) on delete restrict on update restrict;
create index ix_clasificador_criterio2_criterio1_9 on clasificador_criterio2 (criterio1_id);
alter table clasificador_criterio3 add constraint fk_clasificador_criterio3_criterio1_10 foreign key (criterio1_id) references clasificador_criterio1 (id) on delete restrict on update restrict;
create index ix_clasificador_criterio3_criterio1_10 on clasificador_criterio3 (criterio1_id);
alter table clasificador_criterio3 add constraint fk_clasificador_criterio3_criterio2_11 foreign key (criterio2_id) references clasificador_criterio2 (id) on delete restrict on update restrict;
create index ix_clasificador_criterio3_criterio2_11 on clasificador_criterio3 (criterio2_id);
alter table clasificador_criterio3 add constraint fk_clasificador_criterio3_catalogo_12 foreign key (catalogo_id) references clasificador_catalogo_criterio3 (id) on delete restrict on update restrict;
create index ix_clasificador_criterio3_catalogo_12 on clasificador_criterio3 (catalogo_id);
alter table clasificador_criterio3ejemplo add constraint fk_clasificador_criterio3ejemplo_criterio3_13 foreign key (criterio3_id) references clasificador_criterio3 (id) on delete restrict on update restrict;
create index ix_clasificador_criterio3ejemplo_criterio3_13 on clasificador_criterio3ejemplo (criterio3_id);
alter table clasificador_criterio3ejemplo add constraint fk_clasificador_criterio3ejemplo_tiporecurso_14 foreign key (tiporecurso_id) references clasificador_tiporecurso (id) on delete restrict on update restrict;
create index ix_clasificador_criterio3ejemplo_tiporecurso_14 on clasificador_criterio3ejemplo (tiporecurso_id);
alter table clasificador_ejemplo add constraint fk_clasificador_ejemplo_criterio1_15 foreign key (criterio1_id) references clasificador_criterio1 (id) on delete restrict on update restrict;
create index ix_clasificador_ejemplo_criterio1_15 on clasificador_ejemplo (criterio1_id);
alter table clasificador_ejemplo add constraint fk_clasificador_ejemplo_criterio2_16 foreign key (criterio2_id) references clasificador_criterio2 (id) on delete restrict on update restrict;
create index ix_clasificador_ejemplo_criterio2_16 on clasificador_ejemplo (criterio2_id);
alter table clasificador_ejemplo add constraint fk_clasificador_ejemplo_criterio3_17 foreign key (criterio3_id) references clasificador_criterio3 (id) on delete restrict on update restrict;
create index ix_clasificador_ejemplo_criterio3_17 on clasificador_ejemplo (criterio3_id);
alter table clasificador_ejemplo add constraint fk_clasificador_ejemplo_tiporecurso_18 foreign key (tiporecurso_id) references clasificador_tiporecurso (id) on delete restrict on update restrict;
create index ix_clasificador_ejemplo_tiporecurso_18 on clasificador_ejemplo (tiporecurso_id);
alter table clasificador_noevaluable add constraint fk_clasificador_noevaluable_criterio1_19 foreign key (criterio1_id) references clasificador_criterio1 (id) on delete restrict on update restrict;
create index ix_clasificador_noevaluable_criterio1_19 on clasificador_noevaluable (criterio1_id);
alter table clasificador_noevaluable add constraint fk_clasificador_noevaluable_criterio2_20 foreign key (criterio2_id) references clasificador_criterio2 (id) on delete restrict on update restrict;
create index ix_clasificador_noevaluable_criterio2_20 on clasificador_noevaluable (criterio2_id);
alter table clasificador_noevaluable add constraint fk_clasificador_noevaluable_criterio3_21 foreign key (criterio3_id) references clasificador_criterio3 (id) on delete restrict on update restrict;
create index ix_clasificador_noevaluable_criterio3_21 on clasificador_noevaluable (criterio3_id);
alter table correo_autor add constraint fk_correo_autor_autor_22 foreign key (autor_id) references recurso_autor (id) on delete restrict on update restrict;
create index ix_correo_autor_autor_22 on correo_autor (autor_id);
alter table correo_salida add constraint fk_correo_salida_recurso_23 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_correo_salida_recurso_23 on correo_salida (recurso_id);
alter table correo_salida add constraint fk_correo_salida_estado_24 foreign key (estado_id) references estado (id) on delete restrict on update restrict;
create index ix_correo_salida_estado_24 on correo_salida (estado_id);
alter table correo_salida_para add constraint fk_correo_salida_para_correosalida_25 foreign key (correosalida_id) references correo_salida (id) on delete restrict on update restrict;
create index ix_correo_salida_para_correosalida_25 on correo_salida_para (correosalida_id);
alter table documento add constraint fk_documento_recurso_26 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_documento_recurso_26 on documento (recurso_id);
alter table documento add constraint fk_documento_tipodocumento_27 foreign key (tipodocumento_id) references tipodocumento (id) on delete restrict on update restrict;
create index ix_documento_tipodocumento_27 on documento (tipodocumento_id);
alter table encuesta_observacion add constraint fk_encuesta_observacion_encuesta_28 foreign key (encuesta_id) references encuesta_respuesta (id) on delete restrict on update restrict;
create index ix_encuesta_observacion_encuesta_28 on encuesta_observacion (encuesta_id);
alter table encuesta_respuesta add constraint fk_encuesta_respuesta_recurso_29 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_encuesta_respuesta_recurso_29 on encuesta_respuesta (recurso_id);
alter table encuesta_respuesta add constraint fk_encuesta_respuesta_estado_30 foreign key (estado_id) references estado_encuesta (id) on delete restrict on update restrict;
create index ix_encuesta_respuesta_estado_30 on encuesta_respuesta (estado_id);
alter table evaluacion add constraint fk_evaluacion_recursoevaluador_31 foreign key (recursoevaluador_id) references recursoevaluador (id) on delete restrict on update restrict;
create index ix_evaluacion_recursoevaluador_31 on evaluacion (recursoevaluador_id);
alter table evaluacion add constraint fk_evaluacion_evaluaciontabla_32 foreign key (evaluaciontabla_id) references evaluacion_tabla (id) on delete restrict on update restrict;
create index ix_evaluacion_evaluaciontabla_32 on evaluacion (evaluaciontabla_id);
alter table evaluacion_fecha add constraint fk_evaluacion_fecha_recurso_33 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_evaluacion_fecha_recurso_33 on evaluacion_fecha (recurso_id);
alter table evaluacion_observacion add constraint fk_evaluacion_observacion_respuesta_34 foreign key (respuesta_id) references evaluacion (id) on delete restrict on update restrict;
create index ix_evaluacion_observacion_respuesta_34 on evaluacion_observacion (respuesta_id);
alter table evaluacion_observacion_gral add constraint fk_evaluacion_observacion_gral_recursoevaluador_35 foreign key (recursoevaluador_id) references recursoevaluador (id) on delete restrict on update restrict;
create index ix_evaluacion_observacion_gral_recursoevaluador_35 on evaluacion_observacion_gral (recursoevaluador_id);
alter table evaluacion_observacion_observacion_gral add constraint fk_evaluacion_observacion_observacion_gral_evaluacionobservac_36 foreign key (evaluacionobservaciongral_id) references evaluacion_observacion_gral (id) on delete restrict on update restrict;
create index ix_evaluacion_observacion_observacion_gral_evaluacionobservac_36 on evaluacion_observacion_observacion_gral (evaluacionobservaciongral_id);
alter table evaluacion_prorroga add constraint fk_evaluacion_prorroga_recursoevaluador_37 foreign key (recursoevaluador_id) references recursoevaluador (id) on delete restrict on update restrict;
create index ix_evaluacion_prorroga_recursoevaluador_37 on evaluacion_prorroga (recursoevaluador_id);
alter table evaluacion_tabla add constraint fk_evaluacion_tabla_version_38 foreign key (version_id) references evaluacion_tabla_version (id) on delete restrict on update restrict;
create index ix_evaluacion_tabla_version_38 on evaluacion_tabla (version_id);
alter table evaluacion_tabla add constraint fk_evaluacion_tabla_reactivo_39 foreign key (reactivo_id) references evaluacion_tabla_reactivo (id) on delete restrict on update restrict;
create index ix_evaluacion_tabla_reactivo_39 on evaluacion_tabla (reactivo_id);
alter table evaluacion_tabla add constraint fk_evaluacion_tabla_aspecto_40 foreign key (aspecto_id) references aspecto (id) on delete restrict on update restrict;
create index ix_evaluacion_tabla_aspecto_40 on evaluacion_tabla (aspecto_id);
alter table evaluacion_tabla add constraint fk_evaluacion_tabla_criterio1_41 foreign key (criterio1_id) references clasificador_criterio1 (id) on delete restrict on update restrict;
create index ix_evaluacion_tabla_criterio1_41 on evaluacion_tabla (criterio1_id);
alter table evaluacion_tabla add constraint fk_evaluacion_tabla_criterio2_42 foreign key (criterio2_id) references clasificador_criterio2 (id) on delete restrict on update restrict;
create index ix_evaluacion_tabla_criterio2_42 on evaluacion_tabla (criterio2_id);
alter table evaluacion_tabla add constraint fk_evaluacion_tabla_criterio3_43 foreign key (criterio3_id) references clasificador_criterio3 (id) on delete restrict on update restrict;
create index ix_evaluacion_tabla_criterio3_43 on evaluacion_tabla (criterio3_id);
alter table evaluacion_tabla_tipo_recurso add constraint fk_evaluacion_tabla_tipo_recurso_evaluaciontabla_44 foreign key (evaluaciontabla_id) references evaluacion_tabla (id) on delete restrict on update restrict;
create index ix_evaluacion_tabla_tipo_recurso_evaluaciontabla_44 on evaluacion_tabla_tipo_recurso (evaluaciontabla_id);
alter table evaluacion_tabla_tipo_recurso add constraint fk_evaluacion_tabla_tipo_recurso_tiporecurso_45 foreign key (tiporecurso_id) references clasificador_tiporecurso (id) on delete restrict on update restrict;
create index ix_evaluacion_tabla_tipo_recurso_tiporecurso_45 on evaluacion_tabla_tipo_recurso (tiporecurso_id);
alter table evaluador add constraint fk_evaluador_personal_46 foreign key (personal_id) references personal (id) on delete restrict on update restrict;
create index ix_evaluador_personal_46 on evaluador (personal_id);
alter table evaluador_aspecto add constraint fk_evaluador_aspecto_evaluador_47 foreign key (evaluador_id) references evaluador (id) on delete restrict on update restrict;
create index ix_evaluador_aspecto_evaluador_47 on evaluador_aspecto (evaluador_id);
alter table evaluador_aspecto add constraint fk_evaluador_aspecto_aspecto_48 foreign key (aspecto_id) references aspecto (id) on delete restrict on update restrict;
create index ix_evaluador_aspecto_aspecto_48 on evaluador_aspecto (aspecto_id);
alter table historialestado add constraint fk_historialestado_recurso_49 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_historialestado_recurso_49 on historialestado (recurso_id);
alter table historialestado add constraint fk_historialestado_estado_50 foreign key (estado_id) references estado (id) on delete restrict on update restrict;
create index ix_historialestado_estado_50 on historialestado (estado_id);
alter table historialestado_encuesta add constraint fk_historialestado_encuesta_recurso_51 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_historialestado_encuesta_recurso_51 on historialestado_encuesta (recurso_id);
alter table historialestado_encuesta add constraint fk_historialestado_encuesta_estado_52 foreign key (estado_id) references estado_encuesta (id) on delete restrict on update restrict;
create index ix_historialestado_encuesta_estado_52 on historialestado_encuesta (estado_id);
alter table historialestado_evaluacion add constraint fk_historialestado_evaluacion_recurso_53 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_historialestado_evaluacion_recurso_53 on historialestado_evaluacion (recurso_id);
alter table historialestado_evaluacion add constraint fk_historialestado_evaluacion_recursoevaluador_54 foreign key (recursoevaluador_id) references recursoevaluador (id) on delete restrict on update restrict;
create index ix_historialestado_evaluacion_recursoevaluador_54 on historialestado_evaluacion (recursoevaluador_id);
alter table historialestado_evaluacion add constraint fk_historialestado_evaluacion_estado_55 foreign key (estado_id) references estado_evaluacion (id) on delete restrict on update restrict;
create index ix_historialestado_evaluacion_estado_55 on historialestado_evaluacion (estado_id);
alter table observacion add constraint fk_observacion_recurso_56 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_observacion_recurso_56 on observacion (recurso_id);
alter table observacion_cancelacion add constraint fk_observacion_cancelacion_recurso_57 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_observacion_cancelacion_recurso_57 on observacion_cancelacion (recurso_id);
alter table oficio add constraint fk_oficio_recurso_58 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_oficio_recurso_58 on oficio (recurso_id);
alter table oficio_valoracion add constraint fk_oficio_valoracion_recurso_59 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_oficio_valoracion_recurso_59 on oficio_valoracion (recurso_id);
alter table palabraclave add constraint fk_palabraclave_recurso_60 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_palabraclave_recurso_60 on palabraclave (recurso_id);
alter table personal add constraint fk_personal_activo_61 foreign key (activo_id) references estado_activo (id) on delete restrict on update restrict;
create index ix_personal_activo_61 on personal (activo_id);
alter table polimedia add constraint fk_polimedia_recurso_62 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_polimedia_recurso_62 on polimedia (recurso_id);
alter table polimedia_carrusel add constraint fk_polimedia_carrusel_polimedia_63 foreign key (polimedia_id) references polimedia (id) on delete restrict on update restrict;
create index ix_polimedia_carrusel_polimedia_63 on polimedia_carrusel (polimedia_id);
alter table polimedia_carrusel_imagen add constraint fk_polimedia_carrusel_imagen_polimediacarrusel_64 foreign key (polimediacarrusel_id) references polimedia_carrusel (id) on delete restrict on update restrict;
create index ix_polimedia_carrusel_imagen_polimediacarrusel_64 on polimedia_carrusel_imagen (polimediacarrusel_id);
alter table recurso add constraint fk_recurso_areaconocimiento_65 foreign key (areaconocimiento_id) references areaconocimiento (id) on delete restrict on update restrict;
create index ix_recurso_areaconocimiento_65 on recurso (areaconocimiento_id);
alter table recurso add constraint fk_recurso_niveleducativo_66 foreign key (niveleducativo_id) references niveleducativo (id) on delete restrict on update restrict;
create index ix_recurso_niveleducativo_66 on recurso (niveleducativo_id);
alter table recurso add constraint fk_recurso_unidadmedida_67 foreign key (unidadmedida_id) references unidad_medida (id) on delete restrict on update restrict;
create index ix_recurso_unidadmedida_67 on recurso (unidadmedida_id);
alter table recurso add constraint fk_recurso_unidadacademica_68 foreign key (unidadacademica_id) references unidadacademica (id) on delete restrict on update restrict;
create index ix_recurso_unidadacademica_68 on recurso (unidadacademica_id);
alter table recurso add constraint fk_recurso_alcancecurricular_69 foreign key (alcancecurricular_id) references alcance_curricular (id) on delete restrict on update restrict;
create index ix_recurso_alcancecurricular_69 on recurso (alcancecurricular_id);
alter table recurso add constraint fk_recurso_modalidad_70 foreign key (modalidad_id) references modalidad (id) on delete restrict on update restrict;
create index ix_recurso_modalidad_70 on recurso (modalidad_id);
alter table recurso add constraint fk_recurso_version_71 foreign key (version_id) references version (id) on delete restrict on update restrict;
create index ix_recurso_version_71 on recurso (version_id);
alter table recurso add constraint fk_recurso_formatoentrega_72 foreign key (formatoentrega_id) references formatoentrega (id) on delete restrict on update restrict;
create index ix_recurso_formatoentrega_72 on recurso (formatoentrega_id);
alter table recurso add constraint fk_recurso_estado_73 foreign key (estado_id) references estado (id) on delete restrict on update restrict;
create index ix_recurso_estado_73 on recurso (estado_id);
alter table recurso_autor add constraint fk_recurso_autor_recurso_74 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_recurso_autor_recurso_74 on recurso_autor (recurso_id);
alter table recurso_autor add constraint fk_recurso_autor_autorfuncion_75 foreign key (autorfuncion_id) references autorfuncion (id) on delete restrict on update restrict;
create index ix_recurso_autor_autorfuncion_75 on recurso_autor (autorfuncion_id);
alter table recurso_calificacion add constraint fk_recurso_calificacion_recurso_76 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_recurso_calificacion_recurso_76 on recurso_calificacion (recurso_id);
alter table recurso_calificacion_aspecto add constraint fk_recurso_calificacion_aspecto_recursocalificacion_77 foreign key (recursocalificacion_id) references recurso_calificacion (id) on delete restrict on update restrict;
create index ix_recurso_calificacion_aspecto_recursocalificacion_77 on recurso_calificacion_aspecto (recursocalificacion_id);
alter table recurso_calificacion_aspecto add constraint fk_recurso_calificacion_aspecto_aspecto_78 foreign key (aspecto_id) references aspecto (id) on delete restrict on update restrict;
create index ix_recurso_calificacion_aspecto_aspecto_78 on recurso_calificacion_aspecto (aspecto_id);
alter table recursoenweb add constraint fk_recursoenweb_recurso_79 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_recursoenweb_recurso_79 on recursoenweb (recurso_id);
alter table recursoevaluador add constraint fk_recursoevaluador_recurso_80 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_recursoevaluador_recurso_80 on recursoevaluador (recurso_id);
alter table recursoevaluador add constraint fk_recursoevaluador_aspecto_81 foreign key (aspecto_id) references aspecto (id) on delete restrict on update restrict;
create index ix_recursoevaluador_aspecto_81 on recursoevaluador (aspecto_id);
alter table recursoevaluador add constraint fk_recursoevaluador_evaluador_82 foreign key (evaluador_id) references evaluador (id) on delete restrict on update restrict;
create index ix_recursoevaluador_evaluador_82 on recursoevaluador (evaluador_id);
alter table recursoevaluador add constraint fk_recursoevaluador_estadoevaluacion_83 foreign key (estadoevaluacion_id) references estado_evaluacion (id) on delete restrict on update restrict;
create index ix_recursoevaluador_estadoevaluacion_83 on recursoevaluador (estadoevaluacion_id);
alter table registro_acceso add constraint fk_registro_acceso_usuario_84 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_registro_acceso_usuario_84 on registro_acceso (usuario_id);
alter table registro_acceso add constraint fk_registro_acceso_autor_85 foreign key (autor_id) references recurso_autor (id) on delete restrict on update restrict;
create index ix_registro_acceso_autor_85 on registro_acceso (autor_id);
alter table solicitud_cancelacion add constraint fk_solicitud_cancelacion_recurso_86 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_solicitud_cancelacion_recurso_86 on solicitud_cancelacion (recurso_id);
alter table solicitud_cancelacion add constraint fk_solicitud_cancelacion_evaluador_87 foreign key (evaluador_id) references evaluador (id) on delete restrict on update restrict;
create index ix_solicitud_cancelacion_evaluador_87 on solicitud_cancelacion (evaluador_id);
alter table solicitud_cancelacion add constraint fk_solicitud_cancelacion_recursoestadoanterior_88 foreign key (recursoestadoanterior_id) references estado (id) on delete restrict on update restrict;
create index ix_solicitud_cancelacion_recursoestadoanterior_88 on solicitud_cancelacion (recursoestadoanterior_id);
alter table tipodocumento add constraint fk_tipodocumento_estado_89 foreign key (estado_id) references estado_activo (id) on delete restrict on update restrict;
create index ix_tipodocumento_estado_89 on tipodocumento (estado_id);
alter table unidadacademica_areaconocimiento add constraint fk_unidadacademica_areaconocimiento_unidadacademica_90 foreign key (unidadacademica_id) references unidadacademica (id) on delete restrict on update restrict;
create index ix_unidadacademica_areaconocimiento_unidadacademica_90 on unidadacademica_areaconocimiento (unidadacademica_id);
alter table unidadacademica_areaconocimiento add constraint fk_unidadacademica_areaconocimiento_area_91 foreign key (area_id) references areaconocimiento (id) on delete restrict on update restrict;
create index ix_unidadacademica_areaconocimiento_area_91 on unidadacademica_areaconocimiento (area_id);
alter table unidadacademica_niveleducativo add constraint fk_unidadacademica_niveleducativo_unidadacademica_92 foreign key (unidadacademica_id) references unidadacademica (id) on delete restrict on update restrict;
create index ix_unidadacademica_niveleducativo_unidadacademica_92 on unidadacademica_niveleducativo (unidadacademica_id);
alter table unidadacademica_niveleducativo add constraint fk_unidadacademica_niveleducativo_nivel_93 foreign key (nivel_id) references niveleducativo (id) on delete restrict on update restrict;
create index ix_unidadacademica_niveleducativo_nivel_93 on unidadacademica_niveleducativo (nivel_id);
alter table usuario add constraint fk_usuario_personal_94 foreign key (personal_id) references personal (id) on delete restrict on update restrict;
create index ix_usuario_personal_94 on usuario (personal_id);
alter table usuario_rol add constraint fk_usuario_rol_usuario_95 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_usuario_rol_usuario_95 on usuario_rol (usuario_id);
alter table usuario_rol add constraint fk_usuario_rol_rol_96 foreign key (rol_id) references rol (id) on delete restrict on update restrict;
create index ix_usuario_rol_rol_96 on usuario_rol (rol_id);
alter table versionanterior add constraint fk_versionanterior_recurso_97 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_versionanterior_recurso_97 on versionanterior (recurso_id);
alter table versionanterior add constraint fk_versionanterior_recursoanterior_98 foreign key (recursoanterior_id) references recurso (id) on delete restrict on update restrict;
create index ix_versionanterior_recursoanterior_98 on versionanterior (recursoanterior_id);
alter table clasificacion_observacion add constraint fk_clasificacion_observacion_clasificacion_99 foreign key (clasificacion_id) references clasificacion (id) on delete restrict on update restrict;
create index ix_clasificacion_observacion_clasificacion_99 on clasificacion_observacion (clasificacion_id);
alter table recurso_dirigidoa add constraint fk_recurso_dirigidoa_recurso_100 foreign key (recurso_id) references recurso (id) on delete restrict on update restrict;
create index ix_recurso_dirigidoa_recurso_100 on recurso_dirigidoa (recurso_id);
alter table recurso_dirigidoa add constraint fk_recurso_dirigidoa_dirigidoa_101 foreign key (dirigidoa_id) references dirigidoa (id) on delete restrict on update restrict;
create index ix_recurso_dirigidoa_dirigidoa_101 on recurso_dirigidoa (dirigidoa_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table aprueba001;

drop table alcance_curricular;

drop table areaconocimiento;

drop table aspecto;

drop table autorfuncion;

drop table calendario;

drop table carrusel;

drop table clasificacion;

drop table clasificador_cancelable;

drop table clasificador_catalogo_criterio3;

drop table clasificador_criterio1;

drop table clasificador_criterio2;

drop table clasificador_criterio3;

drop table clasificador_criterio3ejemplo;

drop table clasificador_ejemplo;

drop table clasificador_noevaluable;

drop table clasificador_tiporecurso;

drop table correo_autor;

drop table correo_salida;

drop table correo_salida_para;

drop table ctacorreo;

drop table dirigidoa;

drop table documento;

drop table encuesta_observacion;

drop table encuesta_reactivo;

drop table encuesta_respuesta;

drop table estado;

drop table estado_activo;

drop table estado_encuesta;

drop table estado_evaluacion;

drop table evaluacion;

drop table evaluacion_fecha;

drop table evaluacion_observacion;

drop table evaluacion_observacion_gral;

drop table evaluacion_observacion_observacion_gral;

drop table evaluacion_prorroga;

drop table evaluacion_tabla;

drop table evaluacion_tabla_reactivo;

drop table evaluacion_tabla_tipo_recurso;

drop table evaluacion_tabla_version;

drop table evaluador;

drop table evaluador_aspecto;

drop table formatoentrega;

drop table historialestado;

drop table historialestado_encuesta;

drop table historialestado_evaluacion;

drop table modalidad;

drop table niveleducativo;

drop table observacion;

drop table observacion_cancelacion;

drop table oficio;

drop table oficio_valoracion;

drop table palabraclave;

drop table personal;

drop table polimedia;

drop table polimedia_carrusel;

drop table polimedia_carrusel_imagen;

drop table recurso;

drop table recurso_autor;

drop table recurso_calificacion;

drop table recurso_calificacion_aspecto;

drop table recursoenweb;

drop table recursoevaluador;

drop table registro_acceso;

drop table rol;

drop table solicitud_cancelacion;

drop table tipodocumento;

drop table unidad_medida;

drop table unidadacademica;

drop table unidadacademica_areaconocimiento;

drop table unidadacademica_niveleducativo;

drop table usuario;

drop table usuario_rol;

drop table version;

drop table versionanterior;

drop table clasificacion_observacion;

drop table recurso_dirigidoa;

SET FOREIGN_KEY_CHECKS=1;

