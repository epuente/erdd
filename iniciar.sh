#!/bin/bash
#APP_HOME=/home/eduardo/pruebasServer/erdd/dist/erdd-1.0.8-SNAPSHOT
APP_HOME=/home/eduardo/pruebasServer/erdd/dist/erdd-1.2.2-SNAPSHOT
APP_EXEC=$APP_HOME/bin/erdd


# Detiene el servicio que esta usando el puerto 80
fuser -k 80/tcp

# Elimina el archivo de control RUNNING_PID, si existe
if [ -f $APP_HOME/RUNNING_PID ]; then
	rm $APP_HOME/RUNNING_PID
fi

JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre
export JAVA_HOME
PATH=$JAVA_HOME/bin:$PATH
export PATH

# Iniciar el servicio/daemon
$APP_EXEC -Dhttp.port=80 \
-Dplay.crypto.secret=`yED;8wVLx[z^x5pWdxyXie8u`dKSm:YK2c9KX3Fv7glnHNk?P0SS4pX^xT^;7p< \
>> $APP_HOME/salida.log



