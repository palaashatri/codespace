# This script downloads and installs Hyper-V manager on devices running Windows 10/11 Home, 
# so that you can run both Docker and a full-fledged, hardware-accelerated, virtualized OS along with Windows on this Type-0 hypervisor. 
# To run this script, open a PowerShell console as administrator and execute this script by calling “hyper-v-on-windows-home.ps1”.

pushd $PSScriptRoot
Get-ChildItem -Path "$env:SystemRoot\servicing\Packages\*Hyper-V*.mum" | ForEach-Object {dism.exe /online /norestart /add-package:"$($_.FullName)"}
Dism.exe /online /enable-feature /featurename:Microsoft-Hyper-V -All /LimitAccess /ALL
