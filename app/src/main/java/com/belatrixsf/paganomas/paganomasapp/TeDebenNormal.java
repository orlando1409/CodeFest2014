package com.belatrixsf.paganomas.paganomasapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView;

public class TeDebenNormal extends Activity {

    ListView list;
    String[] Cuentas = {
            "Almuerzo Mamá Raquel",
            "Cilindrada",
            "Mega Desayuno",
            "Cebichelas",
            "Chelas en el Hungry Horse",
            "After Office en Beer Company",
            "Chelas en cañas y tapas",
            "Almuerzo cumple Maestro Yoda",
            "Cebichelas",
            "After office",
            "Almuerzo Pizza Hut",
            "Caldo de gallina",
    } ;
    String[] Fechas = {
            "12/04/2014",
            "13/05/2014",
            "14/05/2014",
            "15/06/2014",
            "16/07/2014",
            "17/07/2014",
            "01/08/2014",
            "04/09/2014",
            "17/09/2014",
            "5/10/2014",
            "10/11/2014",
            "17/11/2014"
    };

    Integer[] Imagenes = {
            R.drawable.tagpendiente,
            R.drawable.tagpendiente,
            R.drawable.tagpendiente,
            R.drawable.tagcerrada,
            R.drawable.tagcerrada,
            R.drawable.tagcerrada,
            R.drawable.tagpendiente,
            R.drawable.tagcerrada,
            R.drawable.tagcerrada,
            R.drawable.tagcerrada,
            R.drawable.tagpendiente,
            R.drawable.tagpendiente,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_te_deben_normal);




        TedebenCustomList adapter = new
                TedebenCustomList(TeDebenNormal.this, Cuentas, Fechas, Imagenes);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(TeDebenNormal.this, "You Clicked at " +Cuentas[+ position], Toast.LENGTH_SHORT).show();
            }
        });





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_te_deben_normal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
