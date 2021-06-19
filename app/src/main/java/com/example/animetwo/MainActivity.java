package com.example.animetwo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String[] names = {"one punch man", "DeathNote", "Attack on titan", "Demon Slayer", "My hero\nacademia", "Full metal\nAlcheimist", "Naruto", "goku"};
    int[] images = {R.drawable.saitama, R.drawable.dnote, R.drawable.titan, R.drawable.demon, R.drawable.herotwo, R.drawable.alchemist, R.drawable.naruto, R.drawable.gooku};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);

        CustomAdapter ca = new CustomAdapter(names, images, this);
        gridView.setAdapter(ca);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(MainActivity.this, opmclicked.class));
                }
                if (position == 1) {
                    startActivity(new Intent(MainActivity.this, deathnoteclicked.class));
                }
                if (position == 2) {
                    startActivity(new Intent(MainActivity.this, titanclicked.class));
                }
                if (position == 3) {
                    startActivity(new Intent(MainActivity.this, demonslayerclicked.class));
                }
                if (position == 4) {
                    startActivity(new Intent(MainActivity.this, myheroclicked.class));
                }
                if (position == 5) {
                    startActivity(new Intent(MainActivity.this, fullmetalclicked.class));
                }
                if (position == 6) {
                    startActivity(new Intent(MainActivity.this, narutoclicked.class));
                }
                if (position == 7) {
                    startActivity(new Intent(MainActivity.this, gokuclicked.class));
                }
            }
        });

    }

    public void clicked(View view) {
        Toast.makeText(MainActivity.this, "not implemented", Toast.LENGTH_SHORT).show();
    }


    public class CustomAdapter extends BaseAdapter {
        private final Context mContext;
        private final String[] imagesName;
        private final int[] imagesPhoto;
        private final LayoutInflater layoutInflater;


        public CustomAdapter(String[] names, int[] images, Context context) {
            this.imagesPhoto = images;
            this.imagesName = names;
            this.mContext = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);


        }

        @Override
        public int getCount() {
            return imagesPhoto.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }


        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (view == null) {
                view = layoutInflater.inflate(R.layout.tile, viewGroup, false);
            }

            TextView tv = view.findViewById(R.id.matter);
            ImageView iv = view.findViewById(R.id.pic);


            tv.setText(imagesName[i]);
            iv.setImageResource(imagesPhoto[i]);

            return view;
        }
    }
}