package com.example.compare_6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("You need to login to your respective account Only 'ONCE'")
                .setMessage("\n\nHey,thanks for being one of the first to" +
                        " join our community.\n" +
                        "As this is Bet version We are still testing the app,so:\n" +
                        "* if you find some issues please inform us.\n" +
                        "\nThanks for your Support!")
                .setPositiveButton("DAMN SON", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return builder.create();
    }
}
