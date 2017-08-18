


package com.example.hp.versions_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {  //Main activity


    //Initializing values or images in the array
    int images[]={ R.drawable.gingerbread , R.drawable.honeycomb,R.drawable.icecream,
            R.drawable.jellybean,
            R.drawable.kitkat,R.drawable.lollipop

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Creating and initializing grid view object by id
       GridView gridView =(GridView) findViewById(R.id.grid_view);

        /* setAdapter () method sets a custom adapter as the source for all items that is to be
        displayed in the GridView.
         */
        gridView.setAdapter(new Grid_Versions(this,images));


    }
}
