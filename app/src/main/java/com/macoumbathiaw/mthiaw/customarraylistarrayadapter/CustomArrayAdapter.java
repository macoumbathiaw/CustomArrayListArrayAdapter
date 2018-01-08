package com.macoumbathiaw.mthiaw.customarraylistarrayadapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mthiaw on 1/7/18.
 */

//Create a class called CustomArrayAdapter extending the super class ArrayAdapter
//This class uses our Custom word class

public class CustomArrayAdapter extends ArrayAdapter<CustomWords> {

    private static final String LOG_TAG = CustomArrayAdapter.class.getSimpleName();

    public CustomArrayAdapter(Activity context, ArrayList<CustomWords> customWords) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, customWords);
    }


    //Let's override the getView method of the ArrayAdapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {




        //Declare a View that takes convertView. This is the second variable in the getView method
        View wordView = convertView;

        //Let's check if the View is null, if so, let's inflate the View

        if (wordView == null) {

            //inflate the View isn't being used
            wordView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_customized, parent, false);
        }

        //The word takes the current position. This is the first variable in the getView method
        CustomWords currentWord = getItem(position);

        TextView textViewEnglishWord = (TextView) wordView.findViewById(R.id.wolof_word_id);
        textViewEnglishWord.setText(currentWord.getmEnglish());

        TextView textViewWolofWord = (TextView) wordView.findViewById(R.id.english_word_id);
        textViewWolofWord.setText(currentWord.getmWolof());

        ImageView imageViewWordMeaning = (ImageView) wordView.findViewById(R.id.image_word_meaning_id);
        imageViewWordMeaning.setImageResource(currentWord.getmImage());


        return wordView;


    }
}
