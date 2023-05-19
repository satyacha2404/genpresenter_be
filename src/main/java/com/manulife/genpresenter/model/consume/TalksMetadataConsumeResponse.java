package com.manulife.genpresenter.model.consume;

import java.util.ArrayList;

public class TalksMetadataConsumeResponse {
  private String driver_url;
  private boolean mouth_open;
  private float num_faces;
  private float num_frames;
  private float processing_fps;
  ArrayList<Object> resolution = new ArrayList <Object> ();
  private float size_kib;

  public TalksMetadataConsumeResponse() {
  }

  public String getDriver_url() {
    return driver_url;
  }

  public void setDriver_url(String driver_url) {
    this.driver_url = driver_url;
  }

  public boolean isMouth_open() {
    return mouth_open;
  }

  public void setMouth_open(boolean mouth_open) {
    this.mouth_open = mouth_open;
  }

  public float getNum_faces() {
    return num_faces;
  }

  public void setNum_faces(float num_faces) {
    this.num_faces = num_faces;
  }

  public float getNum_frames() {
    return num_frames;
  }

  public void setNum_frames(float num_frames) {
    this.num_frames = num_frames;
  }

  public float getProcessing_fps() {
    return processing_fps;
  }

  public void setProcessing_fps(float processing_fps) {
    this.processing_fps = processing_fps;
  }

  public ArrayList<Object> getResolution() {
    return resolution;
  }

  public void setResolution(ArrayList<Object> resolution) {
    this.resolution = resolution;
  }

  public float getSize_kib() {
    return size_kib;
  }

  public void setSize_kib(float size_kib) {
    this.size_kib = size_kib;
  }
}
