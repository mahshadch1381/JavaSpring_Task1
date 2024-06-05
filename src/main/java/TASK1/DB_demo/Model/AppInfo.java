package TASK1.DB_demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AppInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int version;
    private int rownumber;
    private int appid;
    private int appplatform;
    private String appdesc;
    private String appversion;
    private String appname;
    private String appcompany;
    private String appdate;
    private String appjdate;
    private String appcallcenter;
    private String appemail;
    private String applogo;
    private String appslogan;
    private String applicationName;
    private String applicationCompany;
    private String applicationCallCenter;
    private String applicationEmail;
    private String applicationSlogan;
    private String website;
    private String apiurl;
    private String ipgurl;
    private String currencyname;
    private String showcountry;
    private String versiondesc;
    private String directdownloadurl;
    private String storedownloadurl;
    private String uploadFileUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getRownumber() {
        return rownumber;
    }

    public void setRownumber(int rownumber) {
        this.rownumber = rownumber;
    }

    public int getAppid() {
        return appid;
    }

    public void setAppid(int appid) {
        this.appid = appid;
    }

    public int getAppplatform() {
        return appplatform;
    }

    public void setAppplatform(int appplatform) {
        this.appplatform = appplatform;
    }

    public String getAppdesc() {
        return appdesc;
    }

    public void setAppdesc(String appdesc) {
        this.appdesc = appdesc;
    }

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAppcompany() {
        return appcompany;
    }

    public void setAppcompany(String appcompany) {
        this.appcompany = appcompany;
    }

    public String getAppdate() {
        return appdate;
    }

    public void setAppdate(String appdate) {
        this.appdate = appdate;
    }

    public String getAppjdate() {
        return appjdate;
    }

    public void setAppjdate(String appjdate) {
        this.appjdate = appjdate;
    }

    public String getAppcallcenter() {
        return appcallcenter;
    }

    public void setAppcallcenter(String appcallcenter) {
        this.appcallcenter = appcallcenter;
    }

    public String getAppemail() {
        return appemail;
    }

    public void setAppemail(String appemail) {
        this.appemail = appemail;
    }

    public String getApplogo() {
        return applogo;
    }

    public void setApplogo(String applogo) {
        this.applogo = applogo;
    }

    public String getAppslogan() {
        return appslogan;
    }

    public void setAppslogan(String appslogan) {
        this.appslogan = appslogan;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationCompany() {
        return applicationCompany;
    }

    public void setApplicationCompany(String applicationCompany) {
        this.applicationCompany = applicationCompany;
    }

    public String getApplicationCallCenter() {
        return applicationCallCenter;
    }

    public void setApplicationCallCenter(String applicationCallCenter) {
        this.applicationCallCenter = applicationCallCenter;
    }

    public String getApplicationEmail() {
        return applicationEmail;
    }

    public void setApplicationEmail(String applicationEmail) {
        this.applicationEmail = applicationEmail;
    }

    public String getApplicationSlogan() {
        return applicationSlogan;
    }

    public void setApplicationSlogan(String applicationSlogan) {
        this.applicationSlogan = applicationSlogan;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getApiurl() {
        return apiurl;
    }

    public void setApiurl(String apiurl) {
        this.apiurl = apiurl;
    }

    public String getIpgurl() {
        return ipgurl;
    }

    public void setIpgurl(String ipgurl) {
        this.ipgurl = ipgurl;
    }

    public String getCurrencyname() {
        return currencyname;
    }

    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname;
    }

    public String getShowcountry() {
        return showcountry;
    }

    public void setShowcountry(String showcountry) {
        this.showcountry = showcountry;
    }

    public String getVersiondesc() {
        return versiondesc;
    }

    public void setVersiondesc(String versiondesc) {
        this.versiondesc = versiondesc;
    }

    public String getDirectdownloadurl() {
        return directdownloadurl;
    }

    public void setDirectdownloadurl(String directdownloadurl) {
        this.directdownloadurl = directdownloadurl;
    }

    public String getStoredownloadurl() {
        return storedownloadurl;
    }

    public void setStoredownloadurl(String storedownloadurl) {
        this.storedownloadurl = storedownloadurl;
    }

    public String getUploadFileUrl() {
        return uploadFileUrl;
    }

    public void setUploadFileUrl(String uploadFileUrl) {
        this.uploadFileUrl = uploadFileUrl;
    }
}
