package com.aire.android.utils;

import android.content.Intent;

import com.aire.android.app.MainNativeActivity;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class JumpFromJsToNative extends CordovaPlugin {

    public void jump(String path) {
        Intent intent = new Intent(GlobalParamsUtil.getContext(), MainNativeActivity.class);
        GlobalParamsUtil.getContext().startActivity(intent);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("jump".equals(action)) {
            String content = args.getString(0);
            jump(content);
            callbackContext.success("success");
            return true;
        }
        return false;
    }
}
