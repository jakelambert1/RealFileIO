package com.example.a0lambj41.realfileio;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    // telling it to load in menu
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflates menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String dir_path = Environment.getExternalStorageDirectory().getAbsolutePath();

        if (item.getItemId() == R.id.save) {
            // where the file is stored

            try {
                FileWriter fw = new FileWriter(dir_path + "/notes.txt");
                PrintWriter pw = new PrintWriter(fw);

                pw.println("Hello");

                pw.flush();
                pw.close();
            } catch (IOException e){
                System.out.println("ERROR! " + e.getMessage());
            }

            // react to the menu item being selected...
            return true;
        } else if (item.getItemId() == R.id.load) {
            // react to the menu item being selected...
            return true;
        }

        return false;
    }
}
