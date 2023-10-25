@echo off
for /d %%G in (*) do (
    cd %%G
    go run *.go
    cd ..
)
