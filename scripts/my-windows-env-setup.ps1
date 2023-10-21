# echo everything
$VerbosePreference = "Continue"

# escalate to administrator and install winget

# check if running as administrator
if (-not ([Security.Principal.WindowsPrincipal][Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole] "Administrator")) {
    # relaunch as administrator
    Start-Process powershell.exe "-NoProfile -ExecutionPolicy Bypass -File `"$PSCommandPath`"" -Verb RunAs
    Exit
}

# install winget
$progressPreference = 'silentlyContinue'
$latestWingetMsixBundleUri = $(Invoke-RestMethod https://api.github.com/repos/microsoft/winget-cli/releases/latest).assets.browser_download_url | Where-Object {$_.EndsWith(".msixbundle")}
$latestWingetMsixBundle = $latestWingetMsixBundleUri.Split("/")[-1]
Write-Information "Downloading winget to artifacts directory..."
Invoke-WebRequest -Uri $latestWingetMsixBundleUri -OutFile "./$latestWingetMsixBundle"
Invoke-WebRequest -Uri https://aka.ms/Microsoft.VCLibs.x64.14.00.Desktop.appx -OutFile Microsoft.VCLibs.x64.14.00.Desktop.appx
Add-AppxPackage Microsoft.VCLibs.x64.14.00.Desktop.appx
Add-AppxPackage $latestWingetMsixBundle
Write-Information "winget installed successfully!"

# install winget packages
winget install -e --id Microsoft.WindowsTerminal
# install git
winget install -e --id Git.Git

# enable windows subsystem for linux 2 (WSL2)
dism.exe /online /enable-feature /featurename:Microsoft-Windows-Subsystem-Linux /all /norestart
dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestart

# install ubuntu 20.04 LTS
Invoke-WebRequest -Uri https://aka.ms/wslubuntu2004 -OutFile Ubuntu.appx -UseBasicParsing
Add-AppxPackage .\Ubuntu.appx

# set ubuntu 20.04 LTS as default WSL distro
wsl --set-default Ubuntu-20.04

# set up environment

# Runtimes/SDKs
winget install -e --id Microsoft.OpenJDK.17;
winget install -e --id Microsoft.DotNet.SDK.7;
winget install -e --id Microsoft.DotNet.Runtime.7;
winget install -e --id Microsoft.DotNet.AspNetCore.7;
winget install -e --id Microsoft.VCRedist.2005.x86;
winget install -e --id Microsoft.VCRedist.2008.x86;
winget install -e --id Microsoft.VCRedist.2008.x64;
winget install -e --id Microsoft.VCRedist.2005.x64;
winget install -e --id Microsoft.VCRedist.2013.x86;
winget install -e --id Microsoft.VCRedist.2013.x64;
winget install -e --id Microsoft.VCRedist.2010.x64;
winget install -e --id Microsoft.VCRedist.2012.x86;
winget install -e --id Microsoft.VCRedist.2015+.x86;
winget install -e --id Microsoft.VCRedist.2015+.x64;
winget install -e --id Microsoft.VCRedist.2012.x64;
winget install -e --id Microsoft.VCRedist.2010.x86;
winget install -e --id Microsoft.DotNet.DesktopRuntime.7;
winget install -e --id OpenJS.NodeJS;
winget install -e --id DenoLand.Deno;
winget install -e --id Python.Python.3.9;

# Tools
winget install -e --id Docker.DockerDesktop;
winget install -e --id Kubernetes.minikube;
winget install -e --id Kubernetes.kubectl;
winget install -e --id Helm.Helm;

# Databases
winget install -e --id MariaDB.Server;
winget install -e --id MongoDB.Server;
winget install -e --id MongoDB.DatabaseTools;
winget install -e --id PostgreSQL.PostgreSQL

# IDEs
winget install -e --id Microsoft.VisualStudioCode;
winget install -e --id JetBrains.IntelliJIDEA.Community;

# Browsers
winget install -e --id Microsoft.MicrosoftEdge;
winget install -e --id Google.Chrome;
winget install -e --id Mozilla.Firefox;

# Install apache maven and add to path
Invoke-WebRequest -Uri https://dlcdn.apache.org/maven/maven-3/3.9.2/binaries/apache-maven-3.9.2-bin.zip -OutFile apache-maven-3.9.2-bin.zip
Expand-Archive -Path apache-maven-3.9.2-bin.zip -DestinationPath C:\tools
$env:Path += ";C:\tools\apache-maven-3.9.2\bin"

# Extras
winget install -e --id OBSProject.OBSStudio;
winget install -e --id Microsoft.PowerToys;
winget install -e --id Valve.Steam;
winget install -e --id EpicGames.EpicGamesLauncher;
winget install -e --id GOG.Galaxy;
winget install -e --id ElectronicArts.EADesktop
