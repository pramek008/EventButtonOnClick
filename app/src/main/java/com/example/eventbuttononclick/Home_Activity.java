package com.example.eventbuttononclick;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener, SearchView.OnQueryTextListener {
//
//    private ListView list;
//    private ListViewAdapter adapter;
//    private SearchView searchView;
//
//    String[] listNama;
//
//    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();
//
//    Bundle bundle = new Bundle();
//
//    Intent intent;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home_);
//        searchView = findViewById(R.id.searchBar);
//
//        listNama = new String[]{"Eka","Ilham","Indro","Nova","Meka","Fikri","Setyo","Vina","Jati"};
//
//        list = findViewById(R.id.listKontak);
//
//        classNamaArrayList = new ArrayList<>();
//
//        for(int i = 0;i<listNama.length;i++){
//            ClassNama classNama = new ClassNama(listNama[i]);
//            classNamaArrayList.add(classNama);
//        }
//
//        adapter = new ListViewAdapter(this, android.R.layout.simple_list_item_1, classNamaArrayList);
//        list.setAdapter(adapter);
//        list.setTextFilterEnabled(true);
//
////        setupSearchView();
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String nama = classNamaArrayList.get(position).getName();
//
//                bundle.putString("a",nama.trim());
//
//                PopupMenu pm = new PopupMenu(getApplicationContext(),view);
//
//                pm.setOnMenuItemClickListener(Home_Activity.this);
//
//                pm.inflate(R.menu.popup_menu);
//
//                pm.show();
//            }
//        });
//    }
//
////    private void setupSearchView(){
////        searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) this);
////        searchView.setQueryHint("Search Here");
////    }
//
//    @Override
//    public boolean onMenuItemClick(MenuItem menuItem) {
//        switch (menuItem.getItemId()){
//            case R.id.mnview:
//                intent = new Intent(getApplicationContext(), ActivityLihatData.class);
//                intent.putExtras(bundle);
//                startActivity(intent);
//                break;
//            case R.id.mnedit:
//                Toast.makeText(getApplicationContext(), "Ini untuk edit Kontak", Toast.LENGTH_LONG).show();
//                break;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean onQueryTextSubmit(String query) {
//        if (TextUtils.isEmpty(query)) {
//            list.clearTextFilter();
//        }else {
//            list.setFilterText(query);
//        }
//        return true;
//    }
//
//    @Override
//    public boolean onQueryTextChange(String newText) {
//        return false;
//    }
//}

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    SearchView searchView;
    ListView listView;

    Bundle bundle = new Bundle();

    Intent intent;

    String[] nameList = {"Eka","Ilham","Indro","Nova","Meka","Fikri","Setyo","Vina","Jati","Aland"};

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        searchView = findViewById(R.id.searchBar);
        listView = findViewById(R.id.listKontak);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nameList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Home_Activity.this.arrayAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Home_Activity.this.arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnview:
                intent = new Intent(getApplicationContext(), ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(), "Ini untuk edit Kontak", Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}