package com.kairos;

/**
 * Created by eric on 2/19/15.
 */


public interface KairosListener {

    public void onSuccess(String response);

    public void onFail(String response);

}
