package com.example.dmitry;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CyclealcActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cyclealc_layout);

        TextView textView1 = (TextView) findViewById(R.id.cycle_chem);
        String cycleChem = "По химическим свойствам малые и обычные циклы существенно различаются между собой. Циклопропан и циклобутан склонны к реакциям присоединения, то есть сходны в этом отношении с алкенами. Циклопентан и циклогексан по своему химическому поведению близки к алканам, так как вступают в реакции замещения." +
                "\n"+
                "\nЦиклопропан и циклобутан способны присоединять бром:"+
                "\n"+
                "\nC3H6 + Br2 → BrCH2—CH2—CH2Br"+
                "\n"+
                "\nЦиклопропан, циклобутан и циклопентан могут присоединять водород, давая соответствующие нормальные алканы. Присоединение происходит при нагревании в присутствии никелевого катализатора:"+
                "\n"+
                "\nC4H8 + H2 → CH3—CH2—CH2—CH3";
        textView1.setText(cycleChem);

        TextView textView2 = (TextView) findViewById(R.id.cycle_pol);
        String cyclePol = "Дегалогенирование дигалогенпроизводных:\n" +
                "\n"+
                "Br-CH2-CH2-CH2-Br + Mg или Zn = циклопропан + MgBr2 или ZnBr2\n" +
                "\n"+
                "Гидрирование бензола и его гомологов (образуются циклогексан или его производные):\n" +
                "\n"+
                "C6H6 +3H2 = C6H12";
        textView2.setText(cyclePol);
    }
}