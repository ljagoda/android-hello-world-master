package com.sqisland.android.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final Intent intent = new Intent(MainActivity.this, drugie.class);
    Button B_idzDalej = (Button) findViewById(R.id.B_idzDalej);

    B_idzDalej.setOnClickListener(
            new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                startActivity(intent);
              }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.activity_main, menu);
    return true;
  }





}