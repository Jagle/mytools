file=$1

echo $file

rm -r ./tmp/*
unzip $file -d ./tmp

../dex2jar/dex2jar.sh ./tmp/classes.dex 

java -jar ../jd-gui-osx-1.3.0/JD-GUI.app/Contents/Resources/Java/jd-gui-1.3.0.jar  ./tmp/classes_dex2jar.jar