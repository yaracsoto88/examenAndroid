package com.example.cedeosotoyaraexamen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class fr1 extends Fragment {
    ListView lista;
    public fr1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fr1, container, false);
        lista=(ListView) view.findViewById(R.id.listView);
        ArrayAdapter<CharSequence> adaptador=ArrayAdapter.createFromResource(getActivity(), R.array.arrayLista, android.R.layout.simple_list_item_1);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame1, new fr2())
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}