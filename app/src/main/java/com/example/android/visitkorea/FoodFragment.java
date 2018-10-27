package com.example.android.visitkorea;


import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // empty constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_item_detail, container, false);

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_food, container, false);

        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getString(R.string.food_gogung_name),
                getString(R.string.food_gogung_description),
                getString(R.string.food_gogung_address),
                getString(R.string.food_gogung_hours),
                getString(R.string.food_gogung_phone),
                R.drawable.gogung_myeongdong_branch));

        items.add(new Item(getString(R.string.food_kim_name),
                getString(R.string.food_kim_description),
                getString(R.string.food_kim_address),
                getString(R.string.food_kim_hours),
                getString(R.string.food_kim_phone),
                R.drawable.sam_kim));

        items.add(new Item(getString(R.string.food_jin_name),
                getString(R.string.food_jin_description),
                getString(R.string.food_jin_address),
                getString(R.string.food_jin_hours),
                getString(R.string.food_jin_phone),
                R.drawable.the_jin_cook));

        items.add(new Item(getString(R.string.food_sam_name),
                getString(R.string.food_sam_description),
                getString(R.string.food_sam_address),
                getString(R.string.food_sam_hours),
                getString(R.string.food_sam_phone),
                R.drawable.korea_samgyetang));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return rootView;
    }
}
