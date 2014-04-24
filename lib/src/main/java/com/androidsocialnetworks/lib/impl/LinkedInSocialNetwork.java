package com.androidsocialnetworks.lib.impl;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;

import com.androidsocialnetworks.lib.SocialNetwork;

import java.util.UUID;

public class LinkedInSocialNetwork extends SocialNetwork {
    public static final int ID = UUID.randomUUID().hashCode();
    private static final String TAG = LinkedInSocialNetwork.class.getSimpleName();
    private final String fConsumerKey;
    private final String fConsumerSecret;
    private final String fPermissions;

    public LinkedInSocialNetwork(Fragment fragment, String consumerKey, String consumerSecret, String permissions) {
        super(fragment);
        Log.d(TAG, "new LinkedInSocialNetwork: " + consumerKey + " : " + consumerSecret + " : " + permissions);

        fConsumerKey = consumerKey;
        fConsumerSecret = consumerSecret;
        fPermissions = permissions;

        if (TextUtils.isEmpty(fConsumerKey) || TextUtils.isEmpty(fConsumerSecret) || TextUtils.isEmpty(fPermissions)) {
            throw new IllegalArgumentException("TextUtils.isEmpty(fConsumerKey) || TextUtils.isEmpty(fConsumerSecret) || TextUtils.isEmpty(fPermissions)");
        }
    }

    @Override
    public boolean isConnected() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void login() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void logout() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void requestPerson() {
        throw new RuntimeException("Not implemented");
    }
}
