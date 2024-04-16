select ('SET FOREIGN_KEY_CHECKS=0;') AS statement
union
SELECT CONCAT('ALTER TABLE ', table_name, ' DISABLE KEYS;') AS statement
FROM information_schema.tables
WHERE table_schema = 'erdd_dev'
union
SELECT CONCAT('DROP TABLE IF EXISTS ', table_name, ';') AS statement
FROM information_schema.tables
WHERE table_schema = 'erdd_dev'
UNION
select ('SET FOREIGN_KEY_CHECKS=1;') AS statement;