#!/usr/bin/env bash

# Web Page of BASH best practices https://kvz.io/blog/2013/11/21/bash-best-practices/
#Exit when a command fails.
set -o errexit
#Exit when script tries to use undeclared variables.
set -o nounset
#The exit status of the last command that threw a non-zero exit code is returned.
set -o pipefail

#Trace what gets executed. Useful for debugging.
#set -o xtrace

# Set magic variables for current file & dir
__dir="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
__file="${__dir}/$(basename "${BASH_SOURCE[0]}")"
__base="$(basename ${__file} .sh)"
__root="$(cd "$(dirname "${__dir}")" && pwd)"

if ! type "java" &> /dev/null; then
    echo "java is not installed. Install it and then re launch"
    exit 1
fi

if ! type "curl" &> /dev/null; then
    echo "curl is not installed. Install it and then re launch"
    exit 1
fi

API_SPEC="https://ravimosharksas.gitlab.io/apis/task/documentation/openapi.json"
VERSION="1.0.0"
function usage(){
    echo "1 - swagger spec location."
    echo "2 - api version."
}

if [ $# -ge 1 ]; then
    if [ "$1" == "local" ]; then
        API_SPEC="../../documentation/dist/openapi.yaml"
        echo "Running with local spec at ${API_SPEC}"
    else
        API_SPEC="${1}"
        echo "Running with provided spec at ${API_SPEC}"
    fi
fi
FOLDER=binaries
SWAGGER_NAME=swagger-codegen-cli.jar
SWAGGER_JAR=${FOLDER}/${SWAGGER_NAME}

source ./scripts/binaries_dowloader.sh

SWAGGER_COMMAND="java -jar ${SWAGGER_JAR} generate -l java"
#Generate Android Library.

${SWAGGER_COMMAND} \
    -i ${API_SPEC} \
    --library=okhttp-gson \
	--model-package=com.ravimoshark.apis.task.model \
	--api-package=com.ravimoshark.apis.task.calls \
	--artifact-version=${VERSION} --artifact-id=task \
	--group-id=com.ravimoshark.apis \
	-DserializableModel=true,dateLibrary=legacy \
    --git-repo-id=ravimosharksas/apis/task/libs/android

mvn package
#TODO Upload the .jar file into a version system in order to be downloaded by AndroidStudio.
