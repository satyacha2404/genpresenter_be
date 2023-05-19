package com.manulife.genpresenter.model.consume;

import java.util.ArrayList;

public class TalksUserConsumeResponse {
  ArrayList<Object> features = new ArrayList <Object> ();
  private String id;
  private String plan;
  private String authorizer;
  private String email;
  private String owner_id;

  public TalksUserConsumeResponse() {
  }

  public ArrayList<Object> getFeatures() {
    return features;
  }

  public void setFeatures(ArrayList<Object> features) {
    this.features = features;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public String getAuthorizer() {
    return authorizer;
  }

  public void setAuthorizer(String authorizer) {
    this.authorizer = authorizer;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getOwner_id() {
    return owner_id;
  }

  public void setOwner_id(String owner_id) {
    this.owner_id = owner_id;
  }

}
