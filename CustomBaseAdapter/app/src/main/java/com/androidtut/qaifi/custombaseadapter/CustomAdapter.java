package com.androidtut.qaifi.custombaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Qaifi on 2/20/2018.
 */

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<AndroidVersion> versionArrayList;

    public CustomAdapter(Context context, ArrayList<AndroidVersion> versionArrayList) {
        this.context = context;
        this.versionArrayList = versionArrayList;
    }

    @Override
    public int getCount() {
        if (versionArrayList != null && versionArrayList.size() > 0) {
            return versionArrayList.size();
        } else {
            return 0;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return versionArrayList.get(position);
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.version_list_item, viewGroup, false);
        }

        LinearLayout mainLayout = view.findViewById(R.id.main_layout);
        TextView txtVersionNum = view.findViewById(R.id.tv_version_num);
        TextView txtVersionName = view.findViewById(R.id.tv_version_name);

        txtVersionName.setText(versionArrayList.get(i).getVersionName());
        txtVersionNum.setText("Version " + versionArrayList.get(i).getVersionNum());

        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked " + versionArrayList.get(i).getVersionName(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
