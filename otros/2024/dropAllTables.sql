DROP TABLE IF EXISTS (
  SELECT table_name
  FROM information_schema.tables
  WHERE table_schema = 'erdd_dev'
);