package com.areyouhealthy.aymen.areyouhealthy2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class OtherTests extends Activity implements View.OnClickListener {


    ImageButton cvomit, cdiah, cAnsomnia,cdizzy;
    Button valider, annuler;
    RadioGroup vomit;
    RadioGroup dia;
    CheckBox back_Aches;
    CheckBox head_Aches;
    CheckBox chest_Aches;
    RadioGroup dizziness;
    RadioGroup insomia;
    RadioGroup tired;
    GlobalVariables a;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //To change body of generated methods, choose Tools | Templates.
        setContentView(R.layout.othertests);
        a = ((GlobalVariables)getApplicationContext());
        cdizzy = (ImageButton) findViewById(R.id.cdizzy);
        cvomit = (ImageButton) findViewById(R.id.cvomit);
        cdiah = (ImageButton) findViewById(R.id.cdiah);
        valider = (Button) findViewById(R.id.valider);
        annuler = (Button) findViewById(R.id.annuler);
        cAnsomnia = (ImageButton) findViewById(R.id.cAnsomnia);
        vomit = (RadioGroup) findViewById(R.id.radioGroup1);
        dia = (RadioGroup) findViewById(R.id.radioGroup2);
        back_Aches = (CheckBox) findViewById(R.id.ache1);
        head_Aches = (CheckBox) findViewById(R.id.ache2);
        chest_Aches = (CheckBox) findViewById(R.id.ache3);
        dizziness = (RadioGroup) findViewById(R.id.radioGroup3);
        insomia = (RadioGroup) findViewById(R.id.radioGroup4);
        tired = (RadioGroup) findViewById(R.id.radioGroup5);


        cvomit.setOnClickListener(this);
        cdiah.setOnClickListener(this);
        cAnsomnia.setOnClickListener(this);
        valider.setOnClickListener(this);
        annuler.setOnClickListener(this);
        cdizzy.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        int i = v.getId();
        if (i == R.id.cvomit) {
            AlertDialog alert = new AlertDialog.Builder(OtherTests.this).create();
            alert.setTitle("Vomit");
            alert.setMessage("Vomit : Vomiting (known medically with the Greek term emesis and informally as throwing up " +
                    "and numerous other terms) is the involuntary, forceful expulsion of the contents of one's stomach through the mouth and sometimes the nose.\n" +
                    " Vomiting can be caused by a wide variety of conditions;");
            alert.setButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(OtherTests.this, "I get the info.", Toast.LENGTH_SHORT).show();

                }
            });


            //  alert.setCancelable(false);
            alert.show();

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        } else if (i == R.id.cdiah) {
            AlertDialog alert = new AlertDialog.Builder(OtherTests.this).create();
            alert.setTitle("Diarrhea Constipation");
            alert.setMessage("Diarrhea is the condition of having at least three loose or liquid bowel movements each day.\n" +
                    " It often lasts for a few days and can result in dehydration due to fluid loss. \n" +
                    " Constipation  refers to bowel movements that are infrequent or hard to pass.\n" +
                    " Constipation is a common cause of painful defecation. Severe constipation includes obstipation (failure to pass stools or gas)\n" +
                    " and fecal impaction, which can progress to bowel obstruction and become life-threatening ");
            alert.setButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(OtherTests.this, "I get the info.", Toast.LENGTH_SHORT).show();

                }
            });


            //  alert.setCancelable(false);
            alert.show();

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        } else if (i == R.id.cAnsomnia) {
            AlertDialog alert = new AlertDialog.Builder(OtherTests.this).create();
            alert.setTitle("Insomnia");
            alert.setMessage("Insomnia, or sleeplessness, is a sleep disorder in which there is an inability to fall asleep \n " +
                    " or to stay asleep as long as desired. While the term is sometimes used to describe a disorder demonstrated by polysomnographic \n " +
                    " or actigraphic evidence of disturbed sleep \n");
            alert.setButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(OtherTests.this, "I get the info.", Toast.LENGTH_SHORT).show();

                }
            });


            //  alert.setCancelable(false);
            alert.show();

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        } else if (i == R.id.valider) {
            Intent intent = new Intent(this, Treatment.class);
            a.setVomit(vomit.getCheckedRadioButtonId());
            a.setBack_ache(back_Aches.isChecked());
            a.setChest_ache(chest_Aches.isChecked());
            a.setHead_ache(head_Aches.isChecked());
            a.setDizyyness(dizziness.getCheckedRadioButtonId());
            a.setIsonomia(insomia.getCheckedRadioButtonId());
            a.setTired(tired.getCheckedRadioButtonId());
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();

        } else if (i == R.id.annuler) {
            Intent intent = new Intent(this, EnregistrementEtat.class);
            intent.putExtra("EnregistrementEtat", "bonjour aymoun");
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }
        else  if (i == R.id.cdizzy) {

            AlertDialog alert = new AlertDialog.Builder(OtherTests.this).create();
            alert.setTitle("Dizziness");
            alert.setMessage("Dizziness is an impairment in spatial perception and stability. Because the term dizziness is imprecise, \n" +
                    " it can refer to vertigo, presyncope, disequilibrium, or a non-specific feeling such as giddiness or foolishness. \n");



            alert.setButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(OtherTests.this, "I get the info.", Toast.LENGTH_SHORT).show();

                }
            });


            //  alert.setCancelable(false);
            alert.show();

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        }


    }
}
