#!/bin/bash
cd ./cah-client &&
npm run build &&
cp -rv dist/* ../cardsagainsthumanity/src/main/resources/static/ &&
cd ../cardsagainsthumanity &&
./gradlew bootRepackage &&
cp build/libs/*.jar ../ 
