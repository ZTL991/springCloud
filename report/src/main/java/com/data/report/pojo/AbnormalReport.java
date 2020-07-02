package com.data.report.pojo;

import java.util.Date;
import javax.persistence.*;

public class AbnormalReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String id;

    @Column(name = "urlAddr")
    private String urladdr;

    @Column(name = "loadPage")
    private String loadpage;

    @Column(name = "domReady")
    private String domready;

    private String redirect;

    @Column(name = "lookupDomain")
    private String lookupdomain;

    private String ttfb;

    private String request;

    @Column(name = "loadEvent")
    private String loadevent;

    private String appcache;

    @Column(name = "unloadEvent")
    private String unloadevent;

    private Date contime;

    @Column(name = "statCode")
    private String statcode;

    @Column(name = "errType")
    private String errtype;

    private Date reporttime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return urlAddr
     */
    public String getUrladdr() {
        return urladdr;
    }

    /**
     * @param urladdr
     */
    public void setUrladdr(String urladdr) {
        this.urladdr = urladdr;
    }

    /**
     * @return loadPage
     */
    public String getLoadpage() {
        return loadpage;
    }

    /**
     * @param loadpage
     */
    public void setLoadpage(String loadpage) {
        this.loadpage = loadpage;
    }

    /**
     * @return domReady
     */
    public String getDomready() {
        return domready;
    }

    /**
     * @param domready
     */
    public void setDomready(String domready) {
        this.domready = domready;
    }

    /**
     * @return redirect
     */
    public String getRedirect() {
        return redirect;
    }

    /**
     * @param redirect
     */
    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    /**
     * @return lookupDomain
     */
    public String getLookupdomain() {
        return lookupdomain;
    }

    /**
     * @param lookupdomain
     */
    public void setLookupdomain(String lookupdomain) {
        this.lookupdomain = lookupdomain;
    }

    /**
     * @return ttfb
     */
    public String getTtfb() {
        return ttfb;
    }

    /**
     * @param ttfb
     */
    public void setTtfb(String ttfb) {
        this.ttfb = ttfb;
    }

    /**
     * @return request
     */
    public String getRequest() {
        return request;
    }

    /**
     * @param request
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /**
     * @return loadEvent
     */
    public String getLoadevent() {
        return loadevent;
    }

    /**
     * @param loadevent
     */
    public void setLoadevent(String loadevent) {
        this.loadevent = loadevent;
    }

    /**
     * @return appcache
     */
    public String getAppcache() {
        return appcache;
    }

    /**
     * @param appcache
     */
    public void setAppcache(String appcache) {
        this.appcache = appcache;
    }

    /**
     * @return unloadEvent
     */
    public String getUnloadevent() {
        return unloadevent;
    }

    /**
     * @param unloadevent
     */
    public void setUnloadevent(String unloadevent) {
        this.unloadevent = unloadevent;
    }

    /**
     * @return contime
     */
    public Date getContime() {
        return contime;
    }

    /**
     * @param contime
     */
    public void setContime(Date contime) {
        this.contime = contime;
    }

    /**
     * @return statCode
     */
    public String getStatcode() {
        return statcode;
    }

    /**
     * @param statcode
     */
    public void setStatcode(String statcode) {
        this.statcode = statcode;
    }

    /**
     * @return errType
     */
    public String getErrtype() {
        return errtype;
    }

    /**
     * @param errtype
     */
    public void setErrtype(String errtype) {
        this.errtype = errtype;
    }

    /**
     * @return reporttime
     */
    public Date getReporttime() {
        return reporttime;
    }

    /**
     * @param reporttime
     */
    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }
}