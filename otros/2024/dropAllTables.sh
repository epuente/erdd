#!/bin/bash

# MySQL credentials
user="erdd"
password="dberdd2024"
db="erdd_test2"

# Create a variable with the command to list all tables
tables=$(mysql -u $user -p$password -Nse 'SHOW TABLES' $db)

# Loop through the tables and drop each one
for table in $tables; do
    echo "Dropping $table from $db..."
    mysql -u $user -p$password -e "SET FOREIGN_KEY_CHECKS = 0;  DROP TABLE $table CASCADE " $db
done

echo "All tables dropped from $db."