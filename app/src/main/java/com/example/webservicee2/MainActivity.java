package com.example.webservicee2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.webservicee2.model.get.GetResponse;
import com.example.webservicee2.presenter.MainPresenter;
import com.example.webservicee2.presenter.MainView;

public class MainActivity extends AppCompatActivity implements MainView {
    private MainPresenter presenter;
    EditText name,desc;
    Button insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.nama);
        desc = (EditText)findViewById(R.id.deskripsi);
        insert= (Button)findViewById(R.id.tambah);
        presenter = new MainPresenter(this);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.createItems(name.getText().toString(),desc.getText().toString());
            }
        });
    }

    @Override
    public void getSuccess(GetResponse List) {

    }

    @Override
    public void setToast(String message) {

    }

    @Override
    public void onError(String errorMessage) {

    }

    @Override
    public void onFailure(String failurMessage) {

    }
}
