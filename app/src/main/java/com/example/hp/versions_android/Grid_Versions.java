package com.example.hp.versions_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Hp on 17-08-2017.
 */
// BaseAdapter is common base class of common implementation for an Adapter
public class Grid_Versions extends BaseAdapter { //Creating a class and extend it with BaseAdapter
    private int images[]; //Declaring variables
    private Context context;


    public Grid_Versions(Context context, int images[]){ // Creating method
        this.context=context; //Gives reference to the objects
        this.images=images;

    }
    // Creating BaseAdapter methods
    @Override
    public int getCount() {
        return images.length ;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    // This method will creates new View for every image that is added to our adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView = convertView ;

        if (convertView==null){ //If statement
            //LayoutInflator is use to manipulate XML file into its corresponding View objects
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_versions,null);
        }
        // Creating and initializing image view object by id
        ImageView imageView =(ImageView) gridView.findViewById(R.id.images);
        // It displays the images at specified position in data set.
        imageView.setImageResource(images[position]);

        return gridView; //Return statement
    }
}
