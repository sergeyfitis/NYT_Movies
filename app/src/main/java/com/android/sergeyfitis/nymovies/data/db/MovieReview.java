package com.android.sergeyfitis.nymovies.data.db;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Serhii Yaremych on 28.02.2016.
 */
public class MovieReview extends RealmObject {

    @PrimaryKey
    private int nytMovieId;
    private String displayTitle;
    private String sortName;
    private String mpaaRating;
    private int criticsPick;
    private String byline;
    private String headline;
    private String summaryShort;
    private Date publicationDate;
    private Date openingDate;
    private Date dvdReleaseDate;
    private Date dateUpdated;
    private String seoName;
    private MovieLink link;
    private RealmList<MovieLink> relatedUrls;
    private MovieMultimedia multimedia;

    public int getNytMovieId() {
        return nytMovieId;
    }

    public void setNytMovieId(int nytMovieId) {
        this.nytMovieId = nytMovieId;
    }

    public String getDisplayTitle() {
        return displayTitle;
    }

    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public int getCriticsPick() {
        return criticsPick;
    }

    public void setCriticsPick(int criticsPick) {
        this.criticsPick = criticsPick;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSummaryShort() {
        return summaryShort;
    }

    public void setSummaryShort(String summaryShort) {
        this.summaryShort = summaryShort;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getDvdReleaseDate() {
        return dvdReleaseDate;
    }

    public void setDvdReleaseDate(Date dvdReleaseDate) {
        this.dvdReleaseDate = dvdReleaseDate;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getSeoName() {
        return seoName;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
    }

    public MovieLink getLink() {
        return link;
    }

    public void setLink(MovieLink link) {
        this.link = link;
    }

    public RealmList<MovieLink> getRelatedUrls() {
        return relatedUrls;
    }

    public void setRelatedUrls(RealmList<MovieLink> relatedUrls) {
        this.relatedUrls = relatedUrls;
    }

    public MovieMultimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(MovieMultimedia multimedia) {
        this.multimedia = multimedia;
    }
}
