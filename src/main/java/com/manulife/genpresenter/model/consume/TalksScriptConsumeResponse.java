package com.manulife.genpresenter.model.consume;

public class TalksScriptConsumeResponse {
  private String type;
  private boolean ssml;
  private boolean subtitles;

  public TalksScriptConsumeResponse() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isSsml() {
    return ssml;
  }

  public void setSsml(boolean ssml) {
    this.ssml = ssml;
  }

  public boolean isSubtitles() {
    return subtitles;
  }

  public void setSubtitles(boolean subtitles) {
    this.subtitles = subtitles;
  }
}
