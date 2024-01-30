#mysqldump -u erdd --password=erdd --routines --triggers  --set-charset --add-drop-database -B erdd --skip-create-options | 7z a -si -mx=9 /home/epuente/dumps/erdd_$(date +'%Y%m%d_%H%M').7z
echo 'Se restaura en erdd_dev lo contenido en erdd'



#mysqldump -u erdd --password=erdd --routines --triggers  --set-charset -B  erdd  | 7z a -si -mx=9 /home/epuente/dumps/erdd_$(date +'%Y%m%d_%H%M').7z



#mysqldump -u erdd --password=erdd --no-create-info --skip-triggers --set-charset erdd  | 7z a -si -mx=9 /home/epuente/dumps/erdd_SoloDatos$(date +'%Y%m%d_%H%M').7z



mysqldump -u erdd --password=erdd --no-create-info --skip-triggers --set-charset --skip-create-options --ignore-table=erdd.play_evolutions   erdd | mysql -p -u erdd erdd_dev 



