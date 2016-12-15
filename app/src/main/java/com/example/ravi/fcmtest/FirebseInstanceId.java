package com.example.ravi.fcmtest;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;



public class FirebseInstanceId extends FirebaseInstanceIdService
{
    private static final String REQ_TOKEN="REQ_TOKEN";
    @Override
    public void onTokenRefresh() {

        String recent_token= FirebaseInstanceId.getInstance().getToken();
        Log.d(REQ_TOKEN, recent_token);



    }
}
