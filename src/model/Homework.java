package model;

import java.util.Date;

public class Homework {
  private long id;

  private String title;

  private String content;

  private Date createTime;

  private Date updateTime;

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}
