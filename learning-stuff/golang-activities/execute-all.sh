#!/bin/bash

set -ex

# for all subdirectories in this current folder
# run "go run <filename>.go"
for d in */; do
    (cd "$d" && go run *.go)
done
