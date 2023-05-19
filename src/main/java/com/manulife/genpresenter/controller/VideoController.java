package com.manulife.genpresenter.controller;

import com.manulife.genpresenter.controller.library.BaseController;
import com.manulife.genpresenter.model.consume.ImageConsumeResponse;
import com.manulife.genpresenter.model.library.DefaultResponse;
import com.manulife.genpresenter.model.serve.VideoServeRequest;
import com.manulife.genpresenter.model.serve.VideoServeResponse;
import com.manulife.genpresenter.services.VideoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VideoController extends BaseController {

    @Autowired
    private VideoServices videoServices;

    @GetMapping("/generate-video")
    public DefaultResponse GenerateVideo(@RequestBody VideoServeRequest baseImage) {
        DefaultResponse defaultResponse;
        VideoServeResponse videoServeResponse;
        ImageConsumeResponse imageConsumeResponse;
        String result;
        try {
//            videoServeResponse = videoServices.UploadImage(baseImage);
//            imageConsumeResponse = videoServices.SubmitImage(baseImage.getBase64Image());

            System.out.println("controller");
            result = videoServices.GetResult();
            return this.getSuccessResponse(result);
        } catch (Exception ex) {
            return this.getFailedResponse(ex.getMessage(), null);
        }
    }
}
