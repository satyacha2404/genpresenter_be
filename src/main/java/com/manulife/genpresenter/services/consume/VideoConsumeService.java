package com.manulife.genpresenter.services.consume;

import com.manulife.genpresenter.model.consume.*;
import com.manulife.genpresenter.model.serve.VideoServeRequest;
import com.manulife.genpresenter.model.serve.VideoServeResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VideoConsumeService {

//  private String serverUrl = "https://api.d-id.com";
  private String serverUrl = "http://localhost:8000/d-id";
  private String apiAuth = "Basic c2F0eWEuY2hhbmRyYS5hbDFAb3V0bG9vay5jb20:Q4Wf7d8C8drR2Ou8CVkgP";
  private HttpHeaders httpHeaders = new HttpHeaders();
  private RestTemplate restTemplate = new RestTemplate();

  public VideoConsumeService() {
    this.httpHeaders.set(HttpHeaders.AUTHORIZATION, "Basic c2F0eWEuY2hhbmRyYS5hbDJAb3V0bG9vay5jb20:EAPs5migc-UKAFy7MGyGW");
  }

  public TalksConsumeResponse PostTalk(VideoServeRequest videoServeRequest) {
    ResponseEntity<TalksConsumeResponse> responseEntity = null;
    String url = this.serverUrl + "/talks";
    TalksConsumeResponse talksConsumeResponse = new TalksConsumeResponse();
    TalksConsumeRequest talksConsumeRequest = new TalksConsumeRequest();

    TalksScriptConsumeRequest talksScriptConsumeRequest = new TalksScriptConsumeRequest();
    talksScriptConsumeRequest.setType("text");
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
