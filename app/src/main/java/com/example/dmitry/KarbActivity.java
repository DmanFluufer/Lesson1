package com.example.dmitry;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class KarbActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.karb_layout);

        TextView textView1 = (TextView) findViewById(R.id.karb_chem);
        String karbChem = "Химические свойства карбоновых кислот обусловлены в первую очередь особенностями их строения. Так, растворимые в воде кислоты способны диссоциировать на ионы:\n" +
                "\n" +
                "R-COOH↔R-COO— + H+.\n" +
                "\n" +
                "Благодаря наличию в воде иона H+ они имеют кислый вкус, способны менять окраску индикаторов и проводить электрический ток. В водном растворе эти кислоты – слабые электролиты.\n" +
                "\n" +
                "Карбоновые кислоты обладают химическими свойствами, характерными для растворов неорганических кислот, т.е. взаимодействуют с металлами (1), их оксидами (2), гидроксидами (3) и слабыми солями (4):\n" +
                "\n" +
                "2CH3-COOh + Zn → (CH3COO)2Zn + H2↑ (1);\n" +
                "\n" +
                "2CH3-COOH + CuO→ (CH3COO)2Cu + H2O (2);\n" +
                "\n" +
                "R-COOH + KOH → R-COOK + H2O (3);\n" +
                "\n" +
                "2CH3-COOH + NaHCO3→ CH3COONa + H2O + CO2↑ (4).\n" +
                "\n" +
                "Специфическое свойство предельных, а также непредельных карбоновых кислот, проявляемое за счет функциональной группы, — взаимодействие со спиртами.\n" +
                "\n" +
                "Карбоновые кислоты взаимодействуют со спиртами при нагревании и в присутствии концентрированной серной кислоты. Например, если к уксусной кислоте прилить этиловый спирт и немного серной кислоты, то при нагревании появляется запах этилового эфира уксусной кислоты (этилацетата):\n" +
                "\n" +
                "CH3-COOH + C2H5OH ↔CH3-C(O)-O-C2H5 + H2O.";
        textView1.setText(karbChem);
    }
}