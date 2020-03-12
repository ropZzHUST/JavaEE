package model;

import java.util.Date;

public class Student {
  private long id;

  private String name;

  private Date createTime;

  private Date updateTime;

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
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

  public void setName(String name) {
    this.name = name;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}
