package com.macoumbathiaw.mthiaw.customarraylistarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create an object of the CustomWords class
        CustomWords customWords1 = new CustomWords("Gaide","Lion");

        //Create an ArrayList of the CustomWords class
        ArrayList<CustomWords> customWords = new ArrayList<>();

        //Place the objet into the ArrayList
        customWords.add(customWords1);

        //Create another object of the CustomWords class
        CustomWords customWords2 = new CustomWords("Fass","horse");
        customWords.add(customWords2);

        //Create the rest of the words in one line
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("kanara","duck"));
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
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));
        customWords.add(new CustomWords("guinar","chicken"));




        //Use CustomArrayAdapter to display the words
        ArrayAdapter<CustomWords> wordsArrayAdapter= new ArrayAdapter<CustomWords>(this,R.layout.list_item_customized,customWords);

        //find the new customized list view
        ListView listView = (ListView)findViewById(R.id.custom_list_view_id);

        listView.setAdapter(wordsArrayAdapter);

    }
}
