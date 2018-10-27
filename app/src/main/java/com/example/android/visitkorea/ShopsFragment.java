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
public class ShopsFragment extends Fragment {


    public ShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_item_detail, container, false);

        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getString(R.string.shop_market_name),
                getString(R.string.shop_market_description),
                getString(R.string.shop_market_address),
                getString(R.string.shop_market_hours),
                getString(R.string.shop_market_phone),
                R.drawable.namdaemun_market));

        items.add(new Item(getString(R.string.shop_lotte_name),
                getString(R.string.shop_lotte_description),
                getString(R.string.shop_lotte_address),
                getString(R.string.shop_lotte_hours),
                getString(R.string.shop_lotte_phone),
                R.drawable.lotte_department_store));

        items.add(new Item(getString(R.string.shop_itaweon_name),
                getString(R.string.shop_itaweon_description),
                getString(R.string.shop_itaweon_address),
                getString(R.string.shop_itaweon_hours),
                getString(R.string.shop_itaweon_phone),
                R.drawable.itaewon_shopping_street));

        items.add(new Item(getString(R.string.shop_hyundai_name),
                getString(R.string.shop_hyundai_description),
                getString(R.string.shop_itaweon_address),
                getString(R.string.shop_itaweon_hours),
                getString(R.string.shop_itaweon_phone),
                R.drawable.hyundai_department_store));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);


        return rootView;
    }

}
