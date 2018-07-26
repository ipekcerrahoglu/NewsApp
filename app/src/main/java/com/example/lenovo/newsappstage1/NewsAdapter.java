package com.example.lenovo.newsappstage1;

import android.content.Context;
import android.preference.ListPreference;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    List<News> mNewsList;

    public NewsAdapter(@NonNull Context context, List<News> newsList) {
        super(context, 0, newsList);
        mNewsList = newsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        News currentNews = mNewsList.get(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.news_item, parent, false);
        }

        String trimedDate = currentNews.getDate().substring(0, 10);

        TextView title = (TextView) view.findViewById(R.id.title_text_view);
        title.setText(currentNews.getTitle());

        TextView date = (TextView) view.findViewById(R.id.date_text_view);
        date.setText(trimedDate);

        TextView type = (TextView) view.findViewById(R.id.type_text_view);
        type.setText(currentNews.getSection());

        TextView author = (TextView) view.findViewById(R.id.author_text_view);
        author.setText(currentNews.getmAuthor());

        return view;
    }
}
