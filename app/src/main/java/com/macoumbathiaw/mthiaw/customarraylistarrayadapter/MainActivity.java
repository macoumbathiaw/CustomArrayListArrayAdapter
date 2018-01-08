package com.macoumbathiaw.mthiaw.customarraylistarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Create an ArrayList of the CustomWords class
        ArrayList<CustomWords> customWords = new ArrayList<CustomWords>();



        //Create the rest of the words in one line
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));


        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("kanara","duck",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("kanara","duck",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));
        customWords.add(new CustomWords("guinar","chicken",R.drawable.ic_launcher_background));




        //Use CustomArrayAdapter to display the words
       // ArrayAdapter<CustomWords> wordsArrayAdapter= new ArrayAdapter<CustomWords>(this,R.layout.list_item_customized,customWords);

        CustomArrayAdapter wordsArrayAdapter = new CustomArrayAdapter(this,customWords);
        //This is the Main Activity View we are finiding,a place it to the adapter. The words and images are being shown on the Main activity page
        ListView listView = (ListView) findViewById(R.id.custom_list_view_id);

        listView.setAdapter(wordsArrayAdapter);

    }
}
