package com.google.zxing.qrcode.encoder;

public class QRCodeVersion {
    public int versionNumber;
    public QRCodeVersion(int version) {
        this.versionNumber = version;
    }
    public int getVersion() {
        if(versionNumber < 1 || versionNumber > 40) return -1;
        return versionNumber;
    }
}
