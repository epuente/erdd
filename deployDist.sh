rm salida.log
rm -rf target
sbt clean
sbt reload
sbt dist
rm -rf ~/playFrameworkDist/*.*
cp target/universal/erdd-0.0.1-SNAPSHOT.zip ~/playFrameworkDist/
cd ~/playFrameworkDist/
unzip erdd-0.0.1-SNAPSHOT.zip
cd erdd-0.0.1-SNAPSHOT/
scp -r * eduardo@148.204.111.26:/home/eduardo/erddProd
ssh eduardo@148.204.111.26 'cd erddProd; sh actualiza.sh'

