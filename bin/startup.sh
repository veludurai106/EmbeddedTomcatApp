BASEDIR=$(dirname $0)

THECLASSPATH=
THECLASSPATH=$BASEDIR/../build/classes/main/
for i in $BASEDIR/../build/libs/*.jar; do
  THECLASSPATH=${THECLASSPATH}:${i}
done

  java  -classpath $THECLASSPATH  com.sample.application.app.Main

sleep 4