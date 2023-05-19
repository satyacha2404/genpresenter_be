package com.manulife.genpresenter.model.serve;

public class VideoServeRequest {
  private String name;
  private String gender;
  private String birthDate;
  private String domisili;
  private String picture;
  private String video;
  private String language;


  // Getter Methods

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public String getDomisili() {
    return domisili;
  }

  public String getPicture() {
    return picture;
  }

  public String getVideo() {
    return video;
  }

  public String getLanguage() {
    return language;
  }

  // Setter Methods

  public void setName(String name) {
    this.name = name;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public void setDomisili(String domisili) {
    this.domisili = domisili;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}