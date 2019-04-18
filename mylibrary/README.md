./gradlew clean build bintrayUpload -PbintrayUser=donadoo -PbintrayKey=f244f033fcff1dec9204ba47bc041e37d9ea34e0 -PdryRun=false


curl -T mylibrary-release.aar -udonadoo:f244f033fcff1dec9204ba47bc041e37d9ea34e0 https://api.bintray.com/content/donadoo/maven/auto-deploy/1.0.2/auto-deploy-1.0.2.aar

 gradle dependencies --configuration debugCompileClasspath
