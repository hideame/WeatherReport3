package com.example.weatherreport3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ImagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
//        Log.d("hoge", "テスト");

        // サンプルのデータを作成
        List<Upload> uploads = new ArrayList<>();
        uploads.add(new Upload("mNameSample", "mImageUrlSample", "mPlaceSample", "mYourNameSample"));
        // サンプルのデータをAdapterに設定
        ImageAdapter adapter = new ImageAdapter(this, uploads);

        RecyclerView recyclerView = this.findViewById(R.id.recycler_view);
        // recyclerView に Adapterを設定
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
