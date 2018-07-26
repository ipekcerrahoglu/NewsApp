package com.example.lenovo.newsappstage1;


public class News {
    private String mTitle;
    private String mDate;
    private String mUrl;
    private String mSection;
    private String mAuthor;

    public News(String title, String date, String url, String section, String author) {
        mTitle = title;
        mDate = date;
        mUrl = url;
        mAuthor=author;

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

    public String getmAuthor() {
        return mAuthor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}