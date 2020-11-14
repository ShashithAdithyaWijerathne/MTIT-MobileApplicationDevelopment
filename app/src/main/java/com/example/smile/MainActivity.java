package com.example.smile;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    RequestQueue queue;
    String url ="https://official-joke-api.appspot.com/random_joke";
    TextView txtJokes,txtID,txtType,txtSetup,txtPunchLine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue = Volley.newRequestQueue(this);
        txtJokes  = findViewById(R.id.txtJokes);
        txtID = findViewById(R.id.button);
        txtType = findViewById(R.id.txtType);
        txtSetup = findViewById(R.id.txtSetup);
        txtPunchLine = findViewById(R.id.txtPunchline);
    }

    public void getJokes(View view) {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() { //Anonymous inner class
            @Override
            public void onResponse(JSONObject response) { //onResponse method
                int ID = 0;
                String type,setup,punchline;
                try {
                    ID = response.getInt("id");
                    type = response.getString("type");
                    setup = response.getString("setup");
                    punchline = response.getString("punchline");
                    txtID.setText(ID+"");
                    txtID.setVisibility(View.VISIBLE);
                    txtType.setText(type+"");
                    txtType.setVisibility(View.VISIBLE);
                    txtSetup.setText(setup+"");
                    txtSetup.setVisibility(View.VISIBLE);
                    txtPunchLine.setText(punchline+"");
                    txtPunchLine.setVisibility(View.VISIBLE);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                txtJokes.setText("Response: " + ID);
            }
        }, new Response.ErrorListener() { //ErrorListener method

            @Override
            public void onErrorResponse(VolleyError error) {
                String err = error.toString();
                txtJokes.setText("Can not Get Data " +error .toString());
            }
        });
        queue.add(jsonObjectRequest);

    }


}