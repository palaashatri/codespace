#!/bin/bash

divider="----------------------------------"

echo $divider
echo "Getting OS information ... "
echo $divider
cat /etc/os-release

echo $divider
echo "Kernel version ... "
echo $divider
uname -r

echo $divider
echo "Version ... "
echo $divider
cat /proc/version
