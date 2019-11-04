package model;

public class WebSite {
    /**
     * the unique ID of website
     */
    private long webId;
    /**
     * the name of website
     * this column just for easy to distinct the website in front end
     */
    private String webName;
    /**
     * the URL of website's home page
     * this column temperately no use
     */
    private String indexUrl;

    /**
     * the work directory of website,
     * if the directory no exists, the program can't success to startup
     * the program promise that when this value is got from database, it's end with /
     */
    private String workFile;


    /**
     * this column temperately no use
     */
    private String runningMode;


    /**
     * 0:url based
     * 1:api based
     */
    private int base;
    private int driver;
    private int usable;

    /**
     * the createtime of this row
     */
    private String createtime;
    private String creator;

    public long getWebId() {
        return this.webId;
    }

    public void setWebId(long webId) {
        this.webId = webId;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public String getIndexUrl() {
        return indexUrl;
    }

    public void setIndexUrl(String indexUrl) {
        this.indexUrl = indexUrl;
    }

    public String getRunningMode() {
        return runningMode;
    }

    public void setRunningMode(String runningMode) {
        this.runningMode = runningMode;
    }

    public String getWorkFile() {
        return workFile+"/estimate_structed";
    }

    public void setWorkFile(String workFile) {
        this.workFile = workFile;
    }

    public int getDriver() {
        return driver;
    }

    public void setDriver(int driver) {
        this.driver = driver;
    }

    public int getUsable() {
        return usable;
    }

    public void setUsable(int usable) {
        this.usable = usable;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

}
