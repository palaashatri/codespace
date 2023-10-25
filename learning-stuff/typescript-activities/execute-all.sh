#!/bin/bash

set -ex

# for all .ts files in current directory,
# run tsc <filename>.ts && node <filename>.js

for file in *.ts; do
    tsc $file && node ${file%.*}.js
done
