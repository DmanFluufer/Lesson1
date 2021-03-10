package com.example.dmitry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class disahActivity extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.disah_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView textView1 = (TextView) getView().findViewById(R.id.disah_chem);
        String disahChem = "В растворе сахарозы не происходит раскрытие циклов, поэтому она не обладает свойствами альдегидов.\n" +
                "\n" +
                "Гидролиз (в кислотной среде):\n" +
                "C12H22O11\t+ H2O → \tC6H12O6\t+\tC6H12O6\n" +
                "сахароза\t\tглюкоза\t\tфруктоза\n" +
                "\n" +
                "Являясь многоатомным спиртом, сахароза дает синее окрашивание раствора при реакции с Cu(OH)2.";
        textView1.setText(disahChem);
    }
}