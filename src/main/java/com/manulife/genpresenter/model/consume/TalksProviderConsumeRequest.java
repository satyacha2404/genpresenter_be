package com.manulife.genpresenter.model.consume;

public class TalksProviderConsumeRequest {
  public String type;
  public String voice_id;
  public TalksVoiceConfigConsumeRequest voice_config;

  public TalksProviderConsumeRequest() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getVoice_id() {
    return voice_id;
  }

  public void setVoice_id(String voice_id) {
    this.voice_id = voice_id;
  }

  public TalksVoiceConfigConsumeRequest getVoice_config() {
    return voice_config;
  }

  public void setVoice_config(TalksVoiceConfigConsumeRequest voice_config) {
    this.voice_config = voice_config;
  }
}
