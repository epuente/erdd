#Detiene servicio
sudo kill -9 $(sudo fuser 8080/tcp)
#Elimina archivo generado
rm RUNNING_PID

#Genera JKS
sudo openssl pkcs12 -export -passout pass:Le4MtTwo3W -in /etc/letsencrypt/live/evaluardd.upev.ipn.mx/fullchain.pem -inkey /etc/letsencrypt/live/evaluardd.upev.ipn.mx/privkey.pem -CAfile /etc/letsencrypt/live/evaluardd.upev.ipn.mx/chain.pem -out conf/fullchain_and_key.p12 -name play

keytool -importkeystore -deststorepass Le4MtTwo3W -destkeypass Le4MtTwo3W -destkeystore conf/erdd.jks -srckeystore conf/fullchain_and_key.p12 -srcstoretype PKCS12 -srcstorepass  Le4MtTwo3W -alias play

#Ejecuta
nohup bin/erdd -Dhttp.port=disabled -Dhttps.port=8080 -Dhttps.keyStore=conf/erdd.jks -Dhttps.keyStoreType=JKS -Dhttps.keyStorePassword=Le4MtTwo3W >> salida.log &

