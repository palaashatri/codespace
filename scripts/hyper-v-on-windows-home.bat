@REM Simple batch script to download and install Hyper-V manager on devices running Windows 10/11 Home, 
@REM so that you can run both Docker and a full-fledged, hardware-accelerated, virtualized OS alongwith Windows on this Type-0 hypervisor

@REM How to run?
@REM Open a conhost as administrator (in PowerShell, use "Start-Process cmd.exe -Verb runAs"), and then 
@REM execute this script, simply by calling "hyper-v-on-windows-home.bat"


pushd "%~dp0"
dir /b %SystemRoot%\servicing\Packages\*Hyper-V*.mum >hyper-v.txt
for /f %%i in ('findstr /i . hyper-v.txt 2^>nul') do dism /online /norestart /add-package:"%SystemRoot%\servicing\Packages\%%i"
del hyper-v.txt
Dism /online /enable-feature /featurename:Microsoft-Hyper-V -All /LimitAccess /ALL
pause
