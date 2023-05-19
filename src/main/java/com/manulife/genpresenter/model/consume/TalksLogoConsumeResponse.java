package com.manulife.genpresenter.model.consume;

import java.util.ArrayList;

public class TalksLogoConsumeResponse {
  private String url;
  ArrayList <Object> position = new ArrayList<Object>();

  public TalksLogoConsumeResponse() {
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ArrayList<Object> getPosition() {
    return position;
  }

  public void setPosition(ArrayList<Object> position) {
    this.position = position;
  }
}
