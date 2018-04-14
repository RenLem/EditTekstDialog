package omy.boston.edittekstdialog.EditTeksDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import omy.boston.edittekstdialog.MainActivity;
import omy.boston.edittekstdialog.R;

/**
 * Created by LosFrancisco on 13-Jan-17.
 */

public class EditTekstDialog extends DialogFragment {

    private EditText edTekst;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder edTekstDialog = new AlertDialog.Builder(getActivity());
        edTekstDialog.setTitle("Unos teksta (ovo ide u string!)");
        edTekstDialog.setIcon(android.R.drawable.ic_dialog_alert);

        LayoutInflater lyInf = getActivity().getLayoutInflater();
        View izEdDialoga = lyInf.inflate(R.layout.edit_dialog, null);
        edTekstDialog.setView(izEdDialoga);

        edTekst = (EditText) izEdDialoga.findViewById(R.id.editText);
        edTekstDialog.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity ma = (MainActivity) getActivity();
                ma.setTextField(edTekst.getText().toString());
                dismiss();
            }
        });

        edTekstDialog.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dismiss();
            }
        });

        AlertDialog stvoriGa = edTekstDialog.create();
        return stvoriGa;                          /**Dvije zatvorene vitičaste zagrade**/
    }
}
