@echo off

echo ***********************************
echo ���Լ�д��class���(ע��)����Ҫ�������apk(mix/inject classes2apk)
echo ==================================
echo v1.0 20121024 by Sun https://onekey-decompile-apk.googlecode.com/svn/trunk

echo !
echo ����
echo --------
echo 1. ���Լ�д��class�ļ����android��dex��ʽ
echo 2. ��dex��ʽ������Ϊsmali����
echo 3. �ϲ���Щsmali���뵽apk�������smaliĿ¼

echo ?
echo ʹ�÷���
echo --------
echo _inject_classes {classĿ¼} {apk�������smaliĿ¼}
echo ����: _inject_classes D:\TestSmaliInject\build\classes D:\TestSmali\smali
echo ***********************************


rem classesĿ¼
set injectClassesDir=%1
set injectApk=%injectClassesDir%\..\inject.apk
set injectOutput=%injectClassesDir%\..\injectSmali
set injectSmaliDir=%injectOutput%\smali
rem apk�������smaliĿ¼
set smaliDir=%2


echo .........class2dex(apk)..........
call dx --dex --output="%injectApk%" "%injectClassesDir%"
echo .........apk2smali...............
java -jar "_tools\apktool\apktool-1.4.1.jar" d -d -f "%injectApk%" "%injectOutput%"
echo .........copy smali..............
XCOPY "%injectSmaliDir%" "%smaliDir%" /E/Y
