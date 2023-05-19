package com.manulife.genpresenter.services;

import com.manulife.genpresenter.model.consume.*;
import com.manulife.genpresenter.model.serve.VideoServeRequest;
import com.manulife.genpresenter.model.serve.VideoServeResponse;
import com.manulife.genpresenter.services.consume.VideoConsumeService;
import com.manulife.genpresenter.services.library.ImageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VideoServices {

    @Autowired
    private ImageHandler imageHandler;

    @Autowired
    private VideoConsumeService videoConsumeService;

    public VideoServeResponse UploadImage(VideoServeRequest baseImage) {
        String url = "https://api.d-id.com/talks/tlk_kKUH5FIyuc51rE4XRqLeR";
        TalksConsumeRequest talksConsumeRequest = new TalksConsumeRequest();
        ResponseEntity<TalksConsumeResponse> responseEntity = null;

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.AUTHORIZATION, "Basic c2F0eWEuY2hhbmRyYS5hbDFAb3V0bG9vay5jb20:Q4Wf7d8C8drR2Ou8CVkgP");

        HttpEntity<TalksConsumeRequest> requestEntity = new HttpEntity<TalksConsumeRequest>(talksConsumeRequest, headers);

        responseEntity = new RestTemplate().exchange(url, HttpMethod.GET, requestEntity, TalksConsumeResponse.class);
        System.out.println(responseEntity.getBody().getAudio_url());

        VideoServeResponse videoServeResponse = new VideoServeResponse();
        imageHandler.stringToFile(baseImage.getBase64Image(), "test.jpg");
        videoServeResponse.setStatus("oo");
        return videoServeResponse;
    }

    public ImageConsumeResponse SubmitImage(String base64) {
        System.out.println("SubmitImage" + base64);
        imageHandler.stringToFile(base64, "src/main/resources/media/d-id.jpg");
        String url = "https://api.d-id.com/images";

        ImagesConsumeRequest imagesConsumeRequest = new ImagesConsumeRequest();
        imagesConsumeRequest.setImage("C:/Users/buansat/Documents/Github/genpresenter-be/src/main/resources/media/d-id.jpg");

        ImageConsumeResponse imageConsumeResponse = new ImageConsumeResponse();
        ResponseEntity<ImageConsumeResponse> responseEntity = null;

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.AUTHORIZATION, "Basic c2F0eWEuY2hhbmRyYS5hbDFAb3V0bG9vay5jb20:Q4Wf7d8C8drR2Ou8CVkgP");
        httpHeaders.set(HttpHeaders.CONTENT_TYPE, "multipart/form-data");

        HttpEntity<ImagesConsumeRequest> requestEntity = new HttpEntity<ImagesConsumeRequest>(imagesConsumeRequest, httpHeaders);

//        responseEntity = new RestTemplate().exchange(url, HttpMethod.POST, requestEntity, ImageConsumeResponse.class);

//        System.out.println("xxx");
//        System.out.println(responseEntity.getBody());

        return imageConsumeResponse;
    }

    public String GetResult() {
//        ResponseEntity<TalksConsumeResponse> response = null;
//        response = videoConsumeService.GetTalk();
//        System.out.println(response.getBody().getResult_url());
        videoConsumeService.PostTalk();
        return "success";
    }

}
