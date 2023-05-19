package com.manulife.genpresenter.model.serve;

import java.util.Date;

public class VideoServeResponse {

  private String id;
  private Date created_at;
  private String created_by;
  private String status;
  private String object;

  public VideoServeResponse() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public String getCreated_by() {
    return created_by;
  }

  public void setCreated_by(String created_by) {
    this.created_by = created_by;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }
}