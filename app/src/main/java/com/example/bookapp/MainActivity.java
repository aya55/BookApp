package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView BookRecycler1,BookRecycler2;
RecyclerView.Adapter adapter,adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        BookRecycler1=findViewById(R.id.recycle1);
        BookRecycler1();
        BookRecycler2=findViewById(R.id.recycle2);
BookRecycler2();
    }
private void BookRecycler1(){
        BookRecycler1.setHasFixedSize(true);
        BookRecycler1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    ArrayList<BookItems>item=new ArrayList<>();
    item.add(new BookItems(R.drawable.ic_launcher_background,"Aya","android"));
    item.add(new BookItems(R.drawable.ic_launcher_foreground,"reem","android"));
    item.add(new BookItems(R.drawable.ic_launcher_background,"mohammed","android"));
    item.add(new BookItems(R.drawable.ic_launcher_background,"diva","android"));
    item.add(new BookItems(R.drawable.ic_launcher_background,"anyway","android"));
    item.add(new BookItems(R.drawable.ic_launcher_background,"Aya","android"));
adapter=new BookAdapter(item);
BookRecycler1.setAdapter(adapter);

}
private  void  BookRecycler2(){
    BookRecycler2.setHasFixedSize(true);
    BookRecycler2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    ArrayList<recentlyBookItems>recentbook=new ArrayList<>();
    recentbook.add(new recentlyBookItems(R.drawable.ic_launcher_background,"koky","web"));
    recentbook.add(new recentlyBookItems(R.drawable.ic_launcher_background,"diva","web"));
    recentbook.add(new recentlyBookItems(R.drawable.ic_launcher_background,"asmaa","web"));
    recentbook.add(new recentlyBookItems(R.drawable.ic_launcher_background,"yoy","web"));
    recentbook.add(new recentlyBookItems(R.drawable.ic_launcher_background,"do","web"));;
     adapter1=new recentlyBookAdapter(recentbook);
     BookRecycler2.setAdapter(adapter1);

}
}