package com.example.cedeosotoyaraexamen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fr2 extends Fragment {
    public fr2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fr2, container, false);

        // Obtén el mensaje del argumento
        Bundle args = getArguments();
        if (args != null) {
            String selectedMessage = args.getString("selectedMessage");

            // Muestra el mensaje en tu TextView
            TextView textView = view.findViewById(R.id.textView2);
            textView.setText(selectedMessage);
        }

        return view;
    }

}