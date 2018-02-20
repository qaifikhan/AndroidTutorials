package com.androidtut.qaifi.custombaseadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        CustomAdapter adapter = new CustomAdapter(this, getAndroiVersions());
        listView.setAdapter(adapter);

/*        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.android_versions));
        listView.setAdapter(adapter);*/
    }

    private ArrayList<AndroidVersion> getAndroiVersions() {
        AndroidVersion version = new AndroidVersion();
        version.setVersionNum(4.1);
        version.setVersionName("Ice Cream Sandwich");

        AndroidVersion version1 = new AndroidVersion();
        version1.setVersionNum(4.2);
        version1.setVersionName("Jelly Bean");

        AndroidVersion version2 = new AndroidVersion();
        version2.setVersionNum(4.4);
        version2.setVersionName("Kit Kat");

        AndroidVersion version3 = new AndroidVersion();
        version3.setVersionNum(5.0);
        version3.setVersionName("Lollipop");

        AndroidVersion version4 = new AndroidVersion();
        version4.setVersionNum(6.0);
        version4.setVersionName("Marshmallow");

        AndroidVersion version5 = new AndroidVersion();
        version5.setVersionNum(7.0);
        version5.setVersionName("Nougat");

        ArrayList<AndroidVersion> versionArrayList = new ArrayList<>();
        versionArrayList.add(version);
        versionArrayList.add(version1);
        versionArrayList.add(version2);
        versionArrayList.add(version3);
        versionArrayList.add(version4);
        versionArrayList.add(version4);
        versionArrayList.add(version);
        versionArrayList.add(version1);
        versionArrayList.add(version2);
        versionArrayList.add(version3);
        versionArrayList.add(version4);
        versionArrayList.add(version4);
        versionArrayList.add(version);
        versionArrayList.add(version1);
        versionArrayList.add(version2);
        versionArrayList.add(version3);
        versionArrayList.add(version4);
        versionArrayList.add(version4);

        return versionArrayList;
    }
}
