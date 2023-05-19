package com.manulife.genpresenter.controller;

import com.manulife.genpresenter.controller.library.BaseController;
import com.manulife.genpresenter.model.consume.ImageConsumeResponse;
import com.manulife.genpresenter.model.library.DefaultResponse;
import com.manulife.genpresenter.model.serve.VideoServeRequest;
import com.manulife.genpresenter.model.serve.VideoServeResponse;
import com.manulife.genpresenter.services.VideoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class VideoController extends BaseController {

    @Autowired
    private VideoServices videoServices;

    @PostMapping("/generate-video")
    public DefaultResponse GenerateVideo(@RequestBody VideoServeRequest request) {
        System.out.println("xx");

//        DefaultResponse defaultResponse;
        VideoServeResponse videoServeResponse;
//        ImageConsumeResponse imageConsumeResponse;
//        String result;
        try {
//            videoServeResponse = videoServices.UploadImage(baseImage);
//            imageConsumeResponse = videoServices.SubmitImage(baseImage.getBase64Image());

//            System.out.println("controller");
//            result = videoServices.GetResult();
            videoServeResponse = videoServices.generateVideo(request);
            return this.getSuccessResponse(videoServeResponse);
        } catch (Exception ex) {
            return this.getFailedResponse(ex.getMessage(), null);
        }
    }
}
