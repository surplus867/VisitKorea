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
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_item_detail, container, false);

        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getString(R.string.hotel_hotelette_name),
                getString(R.string.hotel_hotelette_description),
                getString(R.string.hotel_hotelette_address),
                getString(R.string.hotel_hotelette_hours),
                getString(R.string.hotel_hotelette_phone),
                R.drawable.hotelette_seoul_station));

        items.add(new Item(getString(R.string.hotel_guesthouse_name),
                getString(R.string.hotel_guesthouse_description),
                getString(R.string.hotel_guesthouse_address),
                getString(R.string.hotel_guesthouse_hours),
                getString(R.string.hotel_guesthouse_phone),
                R.drawable.myeongdong_guesthouse));

        items.add(new Item(getString(R.string.hotel_lotte_name),
                getString(R.string.hotel_lotte_description),
                getString(R.string.hotel_lotte_address),
                getString(R.string.hotel_lotte_hours),
                getString(R.string.hotel_lotte_phone),
                R.drawable.lotte_hotel));

        items.add(new Item(getString(R.string.hotel_ibis_name),
                getString(R.string.hotel_ibis_description),
                getString(R.string.hotel_ibis_address),
                getString(R.string.hotel_ibis_hours),
                getString(R.string.hotel_ibis_phone),
                R.drawable.ibis_ambassador));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return rootView;
    }

}
