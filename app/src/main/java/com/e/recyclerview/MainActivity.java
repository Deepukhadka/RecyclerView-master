package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
private RecyclerView recycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.recycleView);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla", "908011122", R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal", "908092212", R.drawable.rajesh));
        contactsList.add(new Contacts("Dayahang Rai", "908092110", R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC", "908092211", R.drawable.bhuwan));


        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recycleView.setAdapter(contactsAdapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
    }

}
