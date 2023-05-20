package com.manulife.genpresenter.services.consume;

import com.manulife.genpresenter.model.consume.*;
import com.manulife.genpresenter.model.serve.VideoServeRequest;
import com.manulife.genpresenter.services.library.Wording;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VideoConsumeService {

  private String serverUrl = "http://localhost:8000/d-id";
  private String apiAuth = "Basic c2F0eWEuY2hhbmRyYS5hbDNAb3V0bG9vay5jb20:PesLQAqM02T5EnWqt84t4";
  private HttpHeaders httpHeaders = new HttpHeaders();
  private RestTemplate restTemplate = new RestTemplate();

  @Autowired
  private Wording wording;


  public VideoConsumeService() {
    this.httpHeaders.set(HttpHeaders.AUTHORIZATION, "Basic c2F0eWEuY2hhbmRyYS5hbDJAb3V0bG9vay5jb20:EAPs5migc-UKAFy7MGyGW");
  }

  public TalksConsumeResponse PostTalk(VideoServeRequest videoServeRequest, String urlUploadImage) {
    ResponseEntity<TalksConsumeResponse> responseEntity = null;
    String url = this.serverUrl + "/talks";
    TalksConsumeResponse talksConsumeResponse = new TalksConsumeResponse();
    TalksConsumeRequest talksConsumeRequest = new TalksConsumeRequest();

    TalksScriptConsumeRequest talksScriptConsumeRequest = new TalksScriptConsumeRequest();
    talksScriptConsumeRequest.setType("text");
    talksScriptConsumeRequest.setInput(wording.getStandardWording(videoServeRequest));

    TalksProviderConsumeRequest talksProviderConsumeRequest = new TalksProviderConsumeRequest();
    talksProviderConsumeRequest.setType("microsoft");
    talksProviderConsumeRequest.setVoice_id("id-ID-ArdiNeural");

    TalksVoiceConfigConsumeRequest talksVoiceConfigConsumeRequest = new TalksVoiceConfigConsumeRequest();
    talksVoiceConfigConsumeRequest.setStyle("Cheerful");

    talksProviderConsumeRequest.setVoice_config(talksVoiceConfigConsumeRequest);
    talksScriptConsumeRequest.setProvider(talksProviderConsumeRequest);

    talksConsumeRequest.setScript(talksScriptConsumeRequest);
//    talksConsumeRequest.setSource_url("s3://d-id-images-prod/auth0|645b9c1d0743716e603ff716/img_qzyvbPIIpxez7NcPddKc1/WIN_20230224_10_56_35_Pro.jpg");
    talksConsumeRequest.setSource_url(urlUploadImage);

    HttpEntity<TalksConsumeRequest> requestEntity = new HttpEntity<>(talksConsumeRequest, this.httpHeaders);

    responseEntity = this.restTemplate.exchange(url, HttpMethod.POST, requestEntity, TalksConsumeResponse.class);

    talksConsumeResponse = responseEntity.getBody();

    return talksConsumeResponse;
  }

  public TalksConsumeResponse GetTalk(String videoId) {
    TalksConsumeResponse talksConsumeResponse = new TalksConsumeResponse();
    ResponseEntity<TalksConsumeResponse> responseEntity = null;
    String url = this.serverUrl + "/talks/" + videoId;
    HttpEntity<TalksConsumeRequest> requestEntity = new HttpEntity<>(this.httpHeaders);
    responseEntity = this.restTemplate.exchange(url, HttpMethod.GET, requestEntity, TalksConsumeResponse.class);

    talksConsumeResponse = responseEntity.getBody();
    return talksConsumeResponse;
  }

}
