package com.example.android.visitkorea;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_item_detail, container, false);


        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getString(R.string.place_world_name),
                getString(R.string.place_world_description),
                getString(R.string.place_world_address),
                getString(R.string.place_world_hours),
                getString(R.string.place_world_phone),
                R.drawable.lotte_world));

        items.add(new Item(getString(R.string.place_village_name),
                getString(R.string.place_village_description),
                getString(R.string.place_village_address),
                getString(R.string.place_village_hours),
                getString(R.string.place_village_phone),
                R.drawable.bukchon_hanok_village));

        items.add(new Item(getString(R.string.place_plaza_name),
                getString(R.string.place_plaza_description),
                getString(R.string.place_plaza_address),
                getString(R.string.place_plaza_hours),
                getString(R.string.place_plaza_phone),
                R.drawable.cheonggyecheon__stream));

        items.add(new Item(getString(R.string.place_gate_name),
                getString(R.string.place_gate_description),
                getString(R.string.place_gate_address),
                getString(R.string.place_gate_hours),
                getString(R.string.place_gate_phone),
                R.drawable.dongdaemun_gate));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return rootView;
    }

}
