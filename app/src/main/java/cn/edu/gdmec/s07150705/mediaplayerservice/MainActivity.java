package cn.edu.gdmec.s07150705.mediaplayerservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,1,0,"开始");
        menu.add(0,2,0,"停止");
        return  super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent =new Intent(this,PlayService.class);
        switch (item.getItemId()){
            case 1: startService(intent);break;
            case 2: stopService(intent);break;
        }
        return  super.onOptionsItemSelected(item);
    }
}
