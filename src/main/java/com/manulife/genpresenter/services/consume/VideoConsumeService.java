package com.manulife.genpresenter.services.consume;

import com.manulife.genpresenter.model.consume.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VideoConsumeService {

//  private String serverUrl = "https://api.d-id.com";
  private String serverUrl = "http://localhost:8000";
  private String apiAuth = "Basic c2F0eWEuY2hhbmRyYS5hbDFAb3V0bG9vay5jb20:Q4Wf7d8C8drR2Ou8CVkgP";
  private HttpHeaders httpHeaders = new HttpHeaders();
  private RestTemplate restTemplate = new RestTemplate();

  public VideoConsumeService() {
    this.httpHeaders.set(HttpHeaders.AUTHORIZATION, "Basic c2F0eWEuY2hhbmRyYS5hbDFAb3V0bG9vay5jb20:Q4Wf7d8C8drR2Ou8CVkgP");
  }

  public String PostTalk() {
    ResponseEntity<String> responseEntity = null;
    String url = this.serverUrl + "/talks";
    TalksConsumeResponse talksConsumeResponse = new TalksConsumeResponse();
    TalksConsumeRequest talksConsumeRequest = new TalksConsumeRequest();

    TalksScriptConsumeRequest talksScriptConsumeRequest = new TalksScriptConsumeRequest();
    talksScriptConsumeRequest.setType("test");
    talksScriptConsumeRequest.setInput("Halo rekan - rekan manulife indonesia. Selamat Datang.");

    TalksProviderConsumeRequest talksProviderConsumeRequest = new TalksProviderConsumeRequest();
    talksProviderConsumeRequest.setType("microsoft");
    talksProviderConsumeRequest.setVoice_id("id-ID-ArdiNeural");

    TalksVoiceConfigConsumeRequest talksVoiceConfigConsumeRequest = new TalksVoiceConfigConsumeRequest();
    talksVoiceConfigConsumeRequest.setStyle("Cheerful");

    talksProviderConsumeRequest.setVoice_config(talksVoiceConfigConsumeRequest);
    talksScriptConsumeRequest.setProvider(talksProviderConsumeRequest);

    talksConsumeRequest.setScript(talksScriptConsumeRequest);
    talksConsumeRequest.setSource_url("s3://d-id-images-prod/auth0|645b9c1d0743716e603ff716/img_qzyvbPIIpxez7NcPddKc1/WIN_20230224_10_56_35_Pro.jpg");

    System.out.println("aaa");

    HttpEntity<TalksConsumeRequest> requestEntity = new HttpEntity<>(talksConsumeRequest, this.httpHeaders);

    responseEntity = this.restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

    System.out.println(responseEntity.getBody());

    return "success";
  }

  public ResponseEntity<TalksConsumeResponse> GetTalk() {
    ResponseEntity<TalksConsumeResponse> responseEntity = null;
    String url = this.serverUrl + "/talks/tlk_5gzJT0_swPezj5ZPiCaWq";
    HttpEntity<TalksConsumeRequest> requestEntity = new HttpEntity<>(this.httpHeaders);
    responseEntity = this.restTemplate.exchange(url, HttpMethod.GET, requestEntity, TalksConsumeResponse.class);

    return responseEntity;
  }


}
