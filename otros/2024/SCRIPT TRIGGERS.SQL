// El siguiente query genera los comandos a ejecutar en consola para crear los triggers de TODAS LAS TABLAS DEL ESQUEMA
// Se crean los triggers que actualizan los campos auditInsert y auditinsert y auditlastupdate de cada tabla en los eventos before_insert y before_update.
// El resultado del siguiente query debe corrense de preferencia desde la consola de mysql (dbeaver da problemas)
SELECT
	'DELIMITER ;;'
UNION
SELECT
		concat('CREATE TRIGGER ',table_name
			,'_BEFORE_INSERT'
			,' BEFORE INSERT ON ',table_name,' FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END;;')
FROM information_schema.tables
where table_schema = 'erdd_test' and table_name!='recurso'
UNION
SELECT
		concat('CREATE TRIGGER ',table_name
		,'_BEFORE_UPDATE',' BEFORE UPDATE ON ',table_name,' FOR EACH ROW BEGIN  set new.auditlastupdate = current_timestamp(); END;;')
FROM information_schema.tables
where table_schema = 'erdd_test'
UNION
SELECT
	'DELIMITER ;';


Los siguientes 3 triggers son de la tabla recurso que ademas de actualizar los campos de auditoria, agregan registreos a la tabla historialestado y el trigger 'recurso_BEFORE_INSERT' genera el numero de control cada que se agrega un registro a la tabla 'recurso'

DELIMITER ;;
CREATE TRIGGER recurso_BEFORE_INSERT BEFORE INSERT ON recurso
FOR EACH ROW
BEGIN
    DECLARE auxNC VARCHAR(255);
    DECLARE existe BOOLEAN;
    ciclo:
        REPEAT
            SET auxNC = CONV(FLOOR(RAND() * 99999999999999), 20, 36);
            SELECT COUNT(numcontrol) INTO existe FROM recurso WHERE numcontrol = auxNC;
        UNTIL existe = 0
        END REPEAT ciclo;
    SET new.numcontrol = auxNC;
    IF new.auditinsert IS NULL THEN
        SET new.auditinsert = CURRENT_TIMESTAMP();
    END IF;
END;;
DELIMITER ;


DELIMITER ;;
CREATE TRIGGER recurso_AFTER_INSERT AFTER INSERT ON recurso FOR EACH ROW BEGIN
	insert into historialestado values (null, new.id, new.estado_id, null,now());
END;;
DELIMITER ;


DELIMITER ;;
CREATE TRIGGER recurso_AFTER_UPDATE AFTER UPDATE ON recurso FOR EACH ROW BEGIN
	insert into historialestado values (null, new.id, new.estado_id, null,now());
END;;
DELIMITER ;



