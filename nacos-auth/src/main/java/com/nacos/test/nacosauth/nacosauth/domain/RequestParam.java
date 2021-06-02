package com.nacos.test.nacosauth.nacosauth.domain;

import java.io.Serializable;
import java.util.Map;

/**
 * @Author: Mr.liu
 * @Date: 2021/5/16 21:12
 * @Version: 1.0.0
 * @Desc: api请求参数封装
 */
public class RequestParam implements Serializable {

    private static final long serialVersionUID = 415546143397326057L;

    private Header header;

    private Map<String, String> param;

    public class Header {

        /**
         * iOS 14.5, Android 6.0
         */
        private String systemVersion;
        /**
         * iOS, Android
         */
        private Long deviceType;
        /**
         * 内部版本号 用数字代替
         */
        private String appVersion;
        /**
         *  外部版本号， 2.01.20210215
         */
        private String version;
        /**
         *  iPhone 12 Pro, Xiaomi 2
         */
        private String deviceModel;
        /**
         * 用户ID
         */
        private Long userId;
        /**
         * 终端标识ID
         */
        private String uuid;
        /**
         * 语言标识
         */
        private String lang;

        public String getSystemVersion() {
            return systemVersion;
        }

        public void setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
        }

        public Long getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(Long deviceType) {
            this.deviceType = deviceType;
        }

        public String getAppVersion() {
            return appVersion;
        }

        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getDeviceModel() {
            return deviceModel;
        }

        public void setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }

    public RequestParam() {
    }
}
