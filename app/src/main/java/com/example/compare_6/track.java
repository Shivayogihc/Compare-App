package com.example.compare_6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class track extends AppCompatDialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("Your Opinion Matters")
                .setMessage("Choose below the Service Which helped You" +
                        " 'The Results will be Helpful to Respective Companies to improve their service'\n" +
                        "\nI know you were Going Some where,Have a Good Day :)")
                .setPositiveButton("Are Bhai maro muje maro", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return builder.create();
    }
}
