package com.android.sergeyfitis.nymovies.data.network;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Serhii Yaremych on 28.02.2016.
 */
public class NetworkMovieLink {
    private String type;
    private String url;
    @SerializedName("suggested_link_text")
    private String suggestedLinkText;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSuggestedLinkText() {
        return suggestedLinkText;
    }

    public void setSuggestedLinkText(String suggestedLinkText) {
        this.suggestedLinkText = suggestedLinkText;
    }
}
