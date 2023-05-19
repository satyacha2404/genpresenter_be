package com.manulife.genpresenter.model.serve;

import java.util.Date;

public class VideoServeResponse {

  private String id;
  private String UrlVideo;

  public VideoServeResponse() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUrlVideo() {
    return UrlVideo;
  }

  public void setUrlVideo(String urlVideo) {
    UrlVideo = urlVideo;
  }
}