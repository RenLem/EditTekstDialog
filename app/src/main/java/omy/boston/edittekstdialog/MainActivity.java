package omy.boston.edittekstdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import omy.boston.edittekstdialog.EditTeksDialog.EditTekstDialog;

public class MainActivity extends AppCompatActivity {

    private TextView ovdjeTekst;
    private Button pokreniUnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ovdjeTekst = (TextView) findViewById(R.id.textView);
        pokreniUnos = (Button) findViewById(R.id.button);

        pokreniUnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditTekstDialog opDialog = new EditTekstDialog();
                opDialog.show(getFragmentManager(), "Ajd piši...");
            }
        });
    }

    public void setTextField(String unos){
        ovdjeTekst.setText(unos);
    }

    public String getTextField(){
        return ovdjeTekst.getText().toString();
    }
}
