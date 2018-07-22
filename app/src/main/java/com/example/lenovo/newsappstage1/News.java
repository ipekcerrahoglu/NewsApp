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

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getSection() {
        return mSection;
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