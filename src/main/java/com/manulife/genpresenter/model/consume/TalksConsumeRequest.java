package com.manulife.genpresenter.model.consume;

public class TalksConsumeRequest {
  private TalksScriptConsumeRequest script;
  private String source_url;

  public TalksConsumeRequest() {
  }

  public TalksScriptConsumeRequest getScript() {
    return script;
  }

  public void setScript(TalksScriptConsumeRequest script) {
    this.script = script;
  }

  public String getSource_url() {
    return source_url;
  }

  public void setSource_url(String source_url) {
    this.source_url = source_url;
  }
}