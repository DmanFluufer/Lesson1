package com.example.dmitry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MonosActivity extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.monos_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView textView1 = (TextView) getView().findViewById(R.id.monos_chem1);
        String monosChem = "Являясь двуфункциональным соединением, глюкоза проявляет свойства многоатомного спирта и альдегида (в растворе) - качественная реакция.\n" +
                "\n" +
                "Горение (а также полное окисление в живом организме): C6H12O6 + 6O2 → 6CO2 +6H2O\n" +
                "\n" +
                "а) Как многоатомный спирт при комнатной температуре реагирует с Cu(OH)2, образуя раствор синего цвета.\n" +
                "\n" +
                "б) Как альдегид окисляется аммиачным раствором оксида серебра (реакция серебряного зеркала) или гидроксидом меди(II) (качественные реакции):\n" +
                "HOCH2—(CHOH)4—CHO\t+ Ag2O → \tHOCH2—(CHOH)4—COOH\t+ 2Ag\n" +
                "глюкоза\t\tглюконовая кислота\t\n" +
                "\n" +
                "HOCH2—(CHOH)4—CHO + Cu(OH)2 → HOCH2—(CHOH)4—COOH + Cu2O + 2H2O\n" +
                "\n" +
                "в) Как альдегид вступает в реакции присоединения (восстанавливается):\n" +
                "HOCH2—(CHOH)4—CHO\t+ H2 → \tHOCH2—(CHOH)4—CH2OH\n" +
                "глюкоза\t\tсорбит (гексангексаол-1,2,3,4,5,6)\n" +
                "\n" +
                "Спиртовое брожение: C6H12O6 → 2C2H5OH + 2CO2\n" +
                "\n" +
                "Молочнокислое брожение: C6H12O6 → 2CH3—CH(OH)—COOH";
        textView1.setText(monosChem);
    }
}
