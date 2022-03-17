# Connect device
adb devices

# install app
Adb install setwallpaper.apk

# Start app
adb shell monkey -p com.forogh.parwiz.setwallpaperp -v 1
# Event
adb shell input keyevent 22
adb shell input keyevent 66
adb shell input keyevent 40
adb shell input keyevent KEYCODE_HOME

# Remove app
adb uninstall com.forogh.parwiz.setwallpaperp
