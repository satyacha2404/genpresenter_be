package com.manulife.genpresenter.model.consume;

public class TalksConsumeResponse {
  private TalksUserConsumeResponse user;
  private TalksScriptConsumeResponse script;
  private TalksMetadataConsumeResponse metadata;
  private String audio_url;
  private String created_at;
  private TalksFaceConsumeResponse face;
  private TalksConfigConsumeResponse config;
  private String source_url;
  private String created_by;
  private String status;
  private String driver_url;
  private String modified_at;
  private String user_id;
  private boolean subtitles;
  private String id;
  private float duration;
  private String started_at;
  private String result_url;

  public TalksConsumeResponse() {
  }

  public TalksUserConsumeResponse getUser() {
    return user;
  }

  public void setUser(TalksUserConsumeResponse user) {
    this.user = user;
  }

  public TalksScriptConsumeResponse getScript() {
    return script;
  }

  public void setScript(TalksScriptConsumeResponse script) {
    this.script = script;
  }

  public TalksMetadataConsumeResponse getMetadata() {
    return metadata;
  }

  public void setMetadata(TalksMetadataConsumeResponse metadata) {
    this.metadata = metadata;
  }

  public String getAudio_url() {
    return audio_url;
  }

  public void setAudio_url(String audio_url) {
    this.audio_url = audio_url;
  }

  public String getCreated_at() {
    return created_at;
  }

  public void setCreated_at(String created_at) {
    this.created_at = created_at;
  }

  public TalksFaceConsumeResponse getFace() {
    return face;
  }

  public void setFace(TalksFaceConsumeResponse face) {
    this.face = face;
  }

  public TalksConfigConsumeResponse getConfig() {
    return config;
  }

  public void setConfig(TalksConfigConsumeResponse config) {
    this.config = config;
  }

  public String getSource_url() {
    return source_url;
  }

  public void setSource_url(String source_url) {
    this.source_url = source_url;
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

  public String getDriver_url() {
    return driver_url;
  }

  public void setDriver_url(String driver_url) {
    this.driver_url = driver_url;
  }

  public String getModified_at() {
    return modified_at;
  }

  public void setModified_at(String modified_at) {
    this.modified_at = modified_at;
  }

  public String getUser_id() {
    return user_id;
  }

  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  public boolean isSubtitles() {
    return subtitles;
  }

  public void setSubtitles(boolean subtitles) {
    this.subtitles = subtitles;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public float getDuration() {
    return duration;
  }

  public void setDuration(float duration) {
    this.duration = duration;
  }

  public String getStarted_at() {
    return started_at;
  }

  public void setStarted_at(String started_at) {
    this.started_at = started_at;
  }

  public String getResult_url() {
    return result_url;
  }

  public void setResult_url(String result_url) {
    this.result_url = result_url;
  }
}
