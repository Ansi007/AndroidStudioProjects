package com.ansi.final_13;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button makeToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeToast = findViewById(R.id.button);
        makeToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View view2 = inflater.inflate(R.layout.toast, null, false);
                TextView text = view2.findViewById(R.id.textView);
                text.setText("GOO!");
                Toast toast = new Toast(getApplicationContext());
                toast.setView(view2);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

                // Create the object of AlertDialog Builder class

                ShowDialogWithCustomView();

            }
        });
    }

    public void ShowDialogWithCustomView() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Custom View Dialog");
        builder.setCancelable(false);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.toast, null,false);
        TextView text = view.findViewById(R.id.textView);
        text.setText("GO GO GO !");
        builder.setView(view);
        builder.setPositiveButton("SHOW", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), text.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void ShowDialogWithMultipleChoice() {
        String[] Colors = {"Red", "Green", "Blue"};
        ArrayList<String> selectedItems = new ArrayList<>();
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("MULTIPLE CHOICE");
        builder.setMultiChoiceItems(Colors, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                if(b) {
                    selectedItems.add(i + "");
                }
                else {
                    selectedItems.remove(i + "");
                }
            }
        });
        builder.setCancelable(false);
        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String out  = "";
                for(int j = 0; j < selectedItems.size(); j++) {
                    out = out.concat(selectedItems.get(j));
                }
                Toast.makeText(getApplicationContext(), out, Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Toast.makeText(getApplicationContext(), "CANCELLED", Toast.LENGTH_SHORT).show();
                selectedItems.clear();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }


    public void ShowDialogList() {
        String[] Colors = {"Red", "Green", "Blue"};
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this );
        builder.setTitle("DIALOG LIST");
        builder.setItems(Colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), Colors[i], Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void ShowDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this );
        builder.setMessage("THIS IS MY FIRST DIALOG BOX");
        builder.setTitle("MY ALERT");
        builder.setIcon(R.drawable.ic_launcher_foreground);
        builder.setPositiveButton("YES BUTTON", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("NO BUTTON", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setNeutralButton("I AM NEUTRAL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Click Leave to close and Stay to cancel", Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}