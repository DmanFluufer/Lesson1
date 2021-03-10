package com.example.dmitry;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EfirActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.efir_layout);

        TextView textView1 = (TextView) findViewById(R.id.efir_phys);
        String efirPhys = "Сложные эфиры низших карбоновых кислот и простейших спиртов – это летучие жидкости, плохо растворяющиеся в воде, обычно имеющие приятный запах, легче воды (например, плотность изоамилацетата – 0,876 г/см3).\n" +
                "\n" +
                "Сложные эфиры высших спиртов и карбоновых кислот – твердые, воскоподобные, напримерпальмитиновоцетиловый эфир (содержится в спермацете – одной из нуклеиновых кислот, участвующих в передаче наследственных признаков) и пальмитиновомирициловый эфир (содержится в пчелином воске).\n" +
                "\n";
        textView1.setText(efirPhys);

        TextView textView2 = (TextView) findViewById(R.id.efir_chem);
        String efirChem = "Химические свойства сложных эфиров обусловлены наличием функциональной группы. Наиболее важной является реакция гидролиза:\n" +
                "\n" +
                "— кислотный гидролиз\n" +
                "\n" +
                "CH3-C(O)-O-CH3 + H2O↔CH3COOH + CH3OH (t0, H+);\n" +
                "\n" +
                "— щелочной гидролиз\n" +
                "\n" +
                "CH3-C(O)-O-C2H5 + NaOH→CH3COONa + C2H5OH (t0).\n" +
                "\n" +
                "Сложные эфиры вступают в реакции взаимодействия со следующими веществами:\n" +
                "\n" +
                "— спиртами (реакция переэтерификации)\n" +
                "\n" +
                "CH3-C(O)-O-C2H5 + CH3OH↔CH3-C(O)-O-CH3 + C2H5OH (t0, H+);\n" +
                "\n" +
                "— с аммиаком\n" +
                "\n" +
                "CH3-C(O)-O-C2H5 + NH3→CH3-C(O)-NH2 + C2H5OH (t0);\n" +
                "\n" +
                "— галогенирования, если в составе углеводородного радикала имеются кратные связи\n" +
                "\n" +
                "CH2=CH-C(O)-O-CH3 + Br2→ Br-CH2-C(Br)H-C(O)-O-CH3.";
        textView2.setText(efirChem);

        TextView textView3 = (TextView) findViewById(R.id.efir_pol);
        String efirPol = "Основные способы получения сложных эфиров – это:\n" +
                "\n" +
                "— взаимодействие кислот со спиртами\n" +
                "\n" +
                "CH3-CH2-C(O)-H + C2H5OH↔CH3-C(O)-O-C2H5 + H2O (t0, H+);\n" +
                "\n" +
                "— взаимодействие ангидридов карбоновых кислот со спиртами\n" +
                "\n" +
                "CH3-C(O)-O-C(O)-CH3 + C2H5OH → CH3-C(O)-O-C2H5 + CH3COOH;\n" +
                "\n" +
                "— взаимодействиегалогенангидридовкислотсоспиртами\n" +
                "\n" +
                "CH3-C(O)-Cl + CH3-CH2-CH2-OH → CH3-C(O)-O-CH2-CH2-CH3 + HCl.";
        textView3.setText(efirPol);
    }
}