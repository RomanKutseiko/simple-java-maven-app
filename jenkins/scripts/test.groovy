#!/usr/bin/env groovy

import Config

if (args.length < 2) {
    println "Please, set CLIENT_NAME, ENVIRONMENT_TYPE and VERSION(Optional)"
    println "Example: ./old.groovy 1 2 3"
    return 1
}

CLIENT_NAME = args[0].toUpperCase()
ENVIRONMENT_TYPE = args[1].toLowerCase()
VERSION = args.length > 2 ? args[2] : ""

println CLIENT_NAME
println ENVIRONMENT_TYPE
println VERSION

println 'ls -a'.execute()

new Config("a", "b")

//set -x
//NAME=('mvn help:evaluate -Dexpression=project.name').execute()
//set +x

//set -x
VERSION=$POM_VERSION//('mvn help:evaluate -Dexpression=project.version').execute()
//set +x

println NAME

println VERSION
