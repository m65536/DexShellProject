* mac apktool : https://blog.csdn.net/yanzi1225627/article/details/48215549

* apktool 使用
```
APK文件的解包
下面以解开Contacts.apk为例。首先把Contacts.apk Copy到当前工作目录下（例：Test）。在DOS下打入命令
apktool d Contacts.apk ABC
这里“d”表示要解码。Contacts.apk是要解包的APK文件。ABC是子目录名。所有解包的文件都会放在这个子目录内。

3) APK文件的打包
在DOS下打入命令
apktool b ABC New-Contacts.apk
这里“b”表示要打包
ABC是子目录名，是解包时产生的子目录，用来存放所有解包后的和修改后的文件。
New-Contacts.apk是打包后产生的新的APK文件。
```

* [Android如何修改classes.dex文件后重新放入apk中](https://pino-hd.github.io/2018/07/22/Android%E5%A6%82%E4%BD%95%E4%BF%AE%E6%94%B9classes-dex%E6%96%87%E4%BB%B6%E5%90%8E%E9%87%8D%E6%96%B0%E6%94%BE%E5%85%A5apk%E4%B8%AD/)