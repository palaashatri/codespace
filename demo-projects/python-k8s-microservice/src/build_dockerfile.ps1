$ErrorActionPreference = "Stop"
Set-PSDebug -Trace 1

Set-Location .\auth
docker build --tag palaasha/flask-auth:latest .
docker push palaasha/flask-auth:latest

Set-Location ..\gateway
docker build --tag palaasha/flask-gateway:latest .
docker push palaasha/flask-gateway:latest 

Set-Location ..\converter
docker build --tag palaasha/converter:latest .
docker push palaasha/converter:latest

Set-Location ..

Set-PSDebug -Trace 0