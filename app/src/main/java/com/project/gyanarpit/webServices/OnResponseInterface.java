package com.project.gyanarpit.webServices;

public interface OnResponseInterface {
    void onApiResponse(Object response);
    void onApiFailure(String message);
}
