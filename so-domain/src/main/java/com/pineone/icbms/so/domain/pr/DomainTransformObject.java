package com.pineone.icbms.so.domain.pr;

/**
 * Created by melvin on 2016. 8. 22..
 * NOTE: 외부에 노출될 Domain Data - Presentation, Controller 에서 사용
 */
public class DomainTransformObject {

    private String id;
    private String name;
    private String uri;
    private String createTime;
    private String modifiedTime;

    public DomainTransformObject() {
    }

    public DomainTransformObject(String id, String name, String uri) {
        this.id = id;
        this.name = name;
        this.uri = uri;
    }

    public DomainTransformObject(String id, String name, String uri, String createTime, String modifiedTime) {
        this.id = id;
        this.name = name;
        this.uri = uri;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
