@echo off

echo ***********************************
echo һ����λ������apk����(onekey decompile apk)
echo ==================================
echo v1.0.1 20121022 ��apktool����1.4.1(ԭ����1.4.3), ֻ������汾�ܽ���SmaliDebugging
echo http://d-kovalenko.blogspot.com/2012/08/debugging-smali-code-with-apk-tool-and.html

echo v1.0 20121017 by Sun https://onekey-decompile-apk.googlecode.com/svn/trunk

echo !
echo ����
echo --------
echo 1. ����apktool/dex2jar/jd-gui
echo 2. ֻ��ִ��һ�����ɷ������apk�����ļ�(��Դ�ļ���jar�ȵ�)
echo 3. ��jd-gui������jar�ļ�

echo ?
echo ʹ�÷���
echo --------
echo 1. ��apk�ļ��ŵ�onekey-decompile-apkĿ¼��
echo 2. ��apk�ļ���ק��_onekey-decompile-apk.bat��
echo 3. ִ����ɺ�
echo    ����onekey-decompile-apkĿ¼�����ɺ�apkͬ����Ŀ¼(������apktools����������Ķ���)
echo    ����onekey-decompile-apkĿ¼�����ɺ�apkͬ����jar�ļ�(dex2jar�����������class)
echo ***********************************


rem ��ק���ļ����������еĵ�һ������
set apkFile=%1
rem ��ȡ�����jar�ļ���(����apkFile�����Ƽ���jar��׺��)
set jarFile=%apkFile%.jar

rem cd���������ڵĸ�Ŀ¼
cd /d %apkFile%\..


echo .........apktool..........
java -jar "_tools\apktool\apktool_2.0.0rc3.jar" d -d -f "%apkFile%"
echo .........dex2jar..........
call _tools\dex2jar-0.0.9.15\d2j-dex2jar -f "%apkFile%" -o "%jarFile%"
echo .........jd-gui...........
call _tools\jd-gui\jd-gui "%jarFile%"
