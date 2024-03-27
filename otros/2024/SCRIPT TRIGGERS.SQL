DELIMITER ;;
CREATE TRIGGER `recurso_BEFORE_INSERT` BEFORE INSERT ON `recurso` FOR EACH ROW BEGIN
	declare auxNC varchar(255);
    declare existe boolean;
    ciclo:
		repeat
			set auxNC = conv(floor(rand() * 99999999999999), 20, 36);
			select count(numcontrol) into existe from recurso where numcontrol = auxNC;
		until existe = 0
		end repeat ciclo;
	set new.numcontrol = auxNC;
    if new.auditinsert is null then
		set new.auditinsert = current_timestamp();
    end if;
END;;
CREATE TRIGGER `recurso_AFTER_INSERT` AFTER INSERT ON `recurso` FOR EACH ROW BEGIN
	insert into historialestado values (null, new.id, new.estado_id, null,now());
END;;
CREATE TRIGGER `recurso_AFTER_UPDATE` AFTER UPDATE ON `recurso` FOR EACH ROW BEGIN
	insert into historialestado values (null, new.id, new.estado_id, null,now());
END;;
DELIMITER ;


// El siguiente query genera los comandos a ejecutar en consola para crear los triggers
SELECT
	'DELIMITER ;;'
UNION
SELECT
		concat('CREATE TRIGGER `',table_name,'_BEFORE_INSERT`',' BEFORE INSERT ON `',table_name,'` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END;;')
FROM information_schema.tables
where table_schema = 'erdd_dev' and table_name!='recurso'
UNION
SELECT
		concat('CREATE TRIGGER `',table_name,'_BEFORE_UPDATE`',' BEFORE UPDATE ON `',table_name,'` FOR EACH ROW BEGIN  set new.auditlastupdate = current_timestamp(); END;;')
FROM information_schema.tables
where table_schema = 'erdd_dev'
UNION
SELECT
	'DELIMITER ;';




