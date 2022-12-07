#!/bin/bash

mvn clean install
mvn clean install -Pobfuscated -f obfuscated-module/pom.xml
mvn test -f test-module/pom.xml
