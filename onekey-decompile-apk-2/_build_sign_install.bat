@echo off

echo ***********************************
echo һ����λ���apk(ǩ��, ��װ)����(onekey build-sign-install apk)
echo ==================================
echo v1.0 20121022 by Sun https://onekey-decompile-apk.googlecode.com/svn/trunk

echo !
echo ����
echo --------
echo 1. ���apktool������������ļ�Ϊapk
echo 2. ͨ��d2j-apk-signǩ��apk
echo 3. adb installǩ�����apk

echo ?
echo ʹ�÷���
echo --------
echo _build_sign_install {apktool������������ļ���λ��}
echo ����: _build_sign_install myapp
echo ***********************************


rem apktool������������ļ���λ��
set apktoolOutPutDir=%1
rem ���apk�ļ�λ��
set unsignedApk=%apktoolOutPutDir%\dist\unsigned.apk
set signedApk=%apktoolOutPutDir%\dist\signed.apk

echo .........clean............
RD /S/Q "%apktoolOutPutDir%\dist"

echo .........device...........
adb devices
echo .........apktool..........
java -jar "_tools\apktool\apktool-1.4.1.jar" b -d -f "%apktoolOutPutDir%" "%unsignedApk%"
echo .........sign.............
call _tools\dex2jar\d2j-apk-sign -f "%unsignedApk%" -o "%signedApk%"
echo .........install..........
adb install -r "%signedApk%"