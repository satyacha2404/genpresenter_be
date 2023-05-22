package com.manulife.genpresenter.services;

import com.manulife.genpresenter.model.consume.*;
import com.manulife.genpresenter.model.serve.VideoServeRequest;
import com.manulife.genpresenter.model.serve.VideoServeResponse;
import com.manulife.genpresenter.services.consume.ImageConsumeService;
import com.manulife.genpresenter.services.consume.VideoConsumeService;
import com.manulife.genpresenter.services.library.ImageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServices {

    @Autowired
    private ImageHandler imageHandler;

    @Autowired
    private VideoConsumeService videoConsumeService;

    @Autowired
    private ImageConsumeService imageConsumeService;

    public VideoServeResponse generateVideo(VideoServeRequest videoServeRequest) throws InterruptedException {
        ImageConsumeResponse imageConsumeResponse = new ImageConsumeResponse();
        TalksConsumeResponse talksConsumeResponseGenerate = new TalksConsumeResponse();
        TalksConsumeResponse talksConsumeResponse = new TalksConsumeResponse();
        VideoServeResponse videoServeResponse = new VideoServeResponse();
        boolean completedFlag = false;

        imageConsumeResponse = imageConsumeService.UploadImage(videoServeRequest.getPicture());

        talksConsumeResponseGenerate = videoConsumeService.PostTalk(videoServeRequest, imageConsumeResponse.getUrl());

        if (talksConsumeResponseGenerate.getStatus().equals("created")) {
            while (!completedFlag) {
                Thread.sleep(3000);
                talksConsumeResponse = videoConsumeService.GetTalk(talksConsumeResponseGenerate.getId());
                if (talksConsumeResponse.getStatus().equals("done")) {
                    completedFlag = true;
                }
            }
            videoServeResponse.setId(talksConsumeResponse.getId());
            videoServeResponse.setUrlVideo(talksConsumeResponse.getResult_url());
        }

        return videoServeResponse;
    }
}
