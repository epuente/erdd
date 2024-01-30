#openssl pkcs12 -export -passout pass:Le4MtTwo3W -in fullchain.pem -inkey privkey.pem -CAfile chain.pem -out fullchain_and_key.p12 -name play

openssl pkcs12 -export -passout pass:Le4MtTwo3W -in /etc/letsencrypt/live/evaluardd.upev.ipn.mx/fullchain.pem -inkey /etc/letsencrypt/live/evaluardd.upev.ipn.mx/privkey.pem -CAfile /etc/letsencrypt/live/evaluardd.upev.ipn.mx/chain.pem -out fullchain_and_key.p12 -name play


keytool -importkeystore -deststorepass Le4MtTwo3W -destkeypass Le4MtTwo3W -destkeystore erdd.jks -srckeystore fullchain_and_key.p12 -srcstoretype PKCS12 -srcstorepass  Le4MtTwo3W -alias play


# https://evaluardd.upev.ipn.mx:8080/
# https://www.evaluardd.upev.ipn.mx:8080/

# Ejecutar com
# bin/erdd -Dhttp.port=disabled -Dhttps.port=8080 -Dhttps.keyStore=conf/certificados/evaluardd.upev.ipn.mx/erdd.jks -Dhttps.keyStoreType=JKS -Dhttps.keyStorePassword=Le4MtTwo3W

