# Video ➡️ Audio Conversion Service

> freeCodeCamp tutorial : [Microservice Architecture and System Design with Python & Kubernetes](https://www.youtube.com/watch?v=hmkF77F9TLw)
> Video to Audio conversion microservice
> Built using Python 3, RabbitMQ, MongoDB, MySQL, Docker and Kubernetes

## Setting up the Environment for Local Deployments

### Windows

1. Set up a Linux backend using WSL2:

    ```sh
    wsl --install
    ```

    Reboot if it asks you to reboot to set up the Linux subsystem.

2. Easiest way to install all the dependencies and setting up the build environment is through using `winget` package manager, found inside latest releases of Windows 10 and 11. Just run the following command and watch magic happen:

    ```sh
    winget install -e --id Oracle.MySQL;winget install -e --id Kubernetes.kubectl;winget install -e --id Docker.DockerDesktop;winget install -e --id Microsoft.VisualStudioCode;winget install -e --id Python.Python.3.9;winget install -e --id Kubernetes.minikube;winget install -e --id Git.Git
    ```

### Linux

> ToDo : Add Linux steps for environment setup

## Deployment Steps [LOCAL]

1. Start minikube cluster on your local machine using `minikube start`
2. Apply **authentication service** manifests using `kubectl apply -f ./auth/manifests`.
3. Add line `127.0.0.1 mp3converter.com` in local `/etc/hosts` so that Ingress works for `mp3converter.com` on localhost
4. Apply manifests for **gateway service** using `kubectl apply -f ./gateway/manifests`
5. Add line `127.0.0.1 rabbitmq-manager.com` in local `etc/hosts` so that Ingress works for `rabbitmq-manager.com` on localhost
6. Apply manifests for **rabbitmq** service using `kubectl apply -f ./rabbit/manifests`

## Python Dependencies

> ToDo : add documentation links

1. Flask : used to create and server web requests. [Documentation]()
2. MySQL : MySQL connector. [Documentation]()
3. flask-mysqldb : used to connect with MySQL database. [Documentation]()
4. PyMongo : MongoDB connector. [Documentation]()
5. flask-pymongo :  used to connect Flask with MongoDB. [Documentation]()
6. GridFS : file storage for MongoDB. [Documentation]()
7. Pika : used for implementation of RabbitMQ queue. [Documentation]()
8. Requests : used to create HTTP Requests. [Documentation]()
9. Moviepy : used to convert video to mp3. [Documentation]()

## Other notes

You can read Windows `/etc/hosts` file using : `gc C:\Windows\System32\Drivers\etc\hosts`. Edut using VSCode or whatever.

Since I am using docker-desktop provided Kubernetes cluster, I will be using HOST as `kubernetes.docker.internal` instead of `host.minikube.internal` inside `auth/manifests/configmap.yaml`.

> No longer using docker-desktop k8s cluster. Read Below.

Looks like Persistent Volume Claims don't seem to work with Docker Desktop K8s, and is a [known bug](https://github.com/docker/for-win/issues/7023).
  
```yml
PS C:\Users\palaa\codespace\basicdemos\python-k8s-microservice\src> kubectl get pvc
NAME           STATUS    VOLUME   CAPACITY   ACCESS MODES   STORAGECLASS   AGE
rabbitmq-pvc   Pending                                      standard       44s
PS C:\Users\palaa\codespace\basicdemos\python-k8s-microservice\src> kubectl describe pvc rabbitmq-pvc
Name:          rabbitmq-pvc
Namespace:     default
StorageClass:  standard
Status:        Pending
Volume:
Labels:        <none>
Annotations:   <none>
Finalizers:    [kubernetes.io/pvc-protection]
Capacity:
Access Modes:
VolumeMode:    Filesystem
Used By:       rabbitmq-0
Events:
  Type     Reason              Age                From                         Message
  ----     ------              ----               ----                         -------
  Warning  ProvisioningFailed  38s (x2 over 61s)  persistentvolume-controller  storageclass.storage.k8s.io "standard" not found

```

Stay on Minikube.
