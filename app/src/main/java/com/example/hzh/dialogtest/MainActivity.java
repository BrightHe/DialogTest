package com.example.hzh.dialogtest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        btn_add = (Button) findViewById( R.id.btn_add );
        btn_add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddDialog();
            }
        } );

    }

    private void showAddDialog() {
        LayoutInflater factory = LayoutInflater.from(this);
        final View textEntryView = factory.inflate(R.layout.add_contact_dialog, null);
        final EditText editTextName = (EditText) textEntryView.findViewById(R.id.name_input);
        final EditText editTextNumEditText = (EditText)textEntryView.findViewById(R.id.phone_input);
        AlertDialog.Builder ad1 = new AlertDialog.Builder(this);
        ad1.setTitle("增加联系人:");
        ad1.setIcon(android.R.drawable.ic_dialog_info);
        ad1.setView(textEntryView);
        ad1.setPositiveButton("是", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {

                Log.i("111111", editTextName.getText().toString());
                Contact person = new Contact(editTextName.getText().toString(),editTextNumEditText.getText().toString());
                Log.i( "TAG", "onClick: " +person.getName()+" phone is "+person.getPhone());
            }
        });
        ad1.setNegativeButton("否", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {

            }
        });
        ad1.show();// 显示对话框
    }
}
