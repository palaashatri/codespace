#!/bin/bash

echo """

This Script installs Docker on Ubuntu and adds the current user to the docker group. Its been tested with Ubuntu 18.04 LTS.
You will be asked for your password during the installation process. 

"""

set -ex

sudo apt-get update
sudo apt-get install git -y
sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    gnupg-agent \
    software-properties-common -y
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo apt-key fingerprint 0EBFCD88
sudo add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
   $(lsb_release -cs) \
   stable"
sudo apt-get update
sudo apt-get install docker-ce docker-ce-cli containerd.io -y
sudo groupadd docker
sudo usermod -aG docker $USER

echo "Reboot system to apply changes ..."