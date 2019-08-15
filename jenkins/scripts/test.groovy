#!/usr/bin/env groovy


if (args.length < 2) {
    println "Please, set CLIENT_NAME, ENVIRONMENT_TYPE and BATCH_VERSION(Optional)"
    println "Example: ./old.install_release_for_client.groovy DRW DEV .1.0"
    return 1
}

CLIENT_NAME = args[0].toUpperCase()
ENVIRONMENT_TYPE = args[1].toLowerCase()
BATCH_VERSION = args.length > 2 ? args[2] : ""

new PrepareScript(CLIENT_NAME, ENVIRONMENT_TYPE, BATCH_VERSION).installClient()

