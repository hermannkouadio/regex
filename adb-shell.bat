@echo on
cd %USERPROFILE%\AppData\Local\Android\Sdk\platform-tools

:: Restart server
adb kill-server
adb start-server

:: Display all connected devices
:: add output into temporary file
adb shell ifconfig
:: > tmp.txt
:: for /f "token=* delimis=" %%c in ('tmp.txt') do (
::echo %%c
::)
:: delete temporary file
del tmp.txt
echo "deletion success !"

adb tcpip 5555

SET /p ip="@IP du mobile: "
adb connect %ip%:5555

pause