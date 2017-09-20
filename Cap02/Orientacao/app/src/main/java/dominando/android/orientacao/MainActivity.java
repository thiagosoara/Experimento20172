package dominando.android.orientacao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    ArrayList<String> nomes;
    ArrayAdapter<String> adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            nomes = savedInstanceState.getStringArrayList("nomes");
        } else {
            nomes = new ArrayList<String>();
        }
        edt = (EditText) findViewById(R.id.editText1);
        ListView listView = (ListView) findViewById(R.id.listView1);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, nomes);
        listView.setAdapter(adapter);
    }

    public void meuBotaoClick(View v) {
        nomes.add(edt.getText().toString());
        edt.setText("");
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArrayList("nomes", nomes);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TDSA", "ONSTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TDSA", "ONRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TDSA", "ONPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TDSA", "ONSTOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TDSA", "ONDESTROY");
    }
}
