package com.example.lenovo.newsappstage1;


public class News {
    private String mTitle;
    private String mDate;
    private String mUrl;
    private String mAuthor;
    private String mSection;

    public News(String title, String date, String url, String section) {
        mTitle = title;
        mDate = date;
        mUrl = url;

        mSection = section;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }


    public String getSection() {
        return mSection;
    }

    public void setSection(String section) {
        mSection = section;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + mTitle + '\'' +
                ", url='" + mUrl + '\'' +
                ", date='" + mDate + '\'' +
                ", section='" + mSection + '\'' +
                '}';
    }
}