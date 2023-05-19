package com.manulife.genpresenter.controller.library;

import com.manulife.genpresenter.model.library.DefaultResponse;

public class BaseController {

    public DefaultResponse getSuccessResponse(Object tData) {
        DefaultResponse defaultResponse = new DefaultResponse();
        defaultResponse.setStatusCode("00");
        defaultResponse.setStatusDescription("success");
        defaultResponse.setResponseBody(tData);
        return defaultResponse;
    }

    public DefaultResponse getFailedResponse(String tErrMessage, Object tData) {
        DefaultResponse defaultResponse = new DefaultResponse();
        defaultResponse.setStatusCode("99");
        defaultResponse.setStatusDescription(tErrMessage);
        defaultResponse.setResponseBody(tData);
        return defaultResponse;
    }
}
