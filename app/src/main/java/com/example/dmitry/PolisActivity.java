package com.example.dmitry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PolisActivity extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.polis_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView textView1 = (TextView) getView().findViewById(R.id.polis_chem);
        String polishChem = "Горение (практическое значение имеет для целлюлозы):\n" +
                "(C6H10O5)n + 6O2 → 6nCO2 + 5nH2O\n" +
                "\n" +
                "\n" +
                "Гидролиз:\n" +
                "(C6H10O5)n + nH2O  nC6H12O6\n" +
                "\n" +
                "\n" +
                "При гидролизе крахмала образуется -глюкоза, а при гидролизе целлюлозы - -глюкоза.\n" +
                "\n" +
                "Качественная реакция на крахмал: с йодом возникает синее окрашивание.\n" +
                "\n" +
                "Термическое разложение целлюлозы без доступа воздуха приводит к образованию метанола, уксусной кислоты, ацетона и др. продуктов.\n" +
                "\n" +
                "С уксусной и азотной кислотой целлюлоза образует сложные эфиры [C6H7O2(ONO2)3]n и [C6H7O2(OCOCH3)3]n.";
        textView1.setText(polishChem);
    }
}