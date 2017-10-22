package com.xterstar.www.placeholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xterstar.www.placeholder.SubjectActivities.artClass;
import com.xterstar.www.placeholder.SubjectActivities.chemClass;
import com.xterstar.www.placeholder.SubjectActivities.commClass;
import com.xterstar.www.placeholder.SubjectActivities.csClass;
import com.xterstar.www.placeholder.SubjectActivities.econClass;
import com.xterstar.www.placeholder.SubjectActivities.ethClass;
import com.xterstar.www.placeholder.SubjectActivities.mathClass;
import com.xterstar.www.placeholder.SubjectActivities.otherClass;
import com.xterstar.www.placeholder.SubjectActivities.physicsClass;
import com.xterstar.www.placeholder.SubjectActivities.poliClass;
import com.xterstar.www.placeholder.SubjectActivities.psychClass;

public class Subjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final Button csbutton = (Button) findViewById(R.id.csbutton);
        csbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, csClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });



        final Button mathbutton = (Button) findViewById(R.id.mathbutton);
        mathbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, mathClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });



        final Button chembutton = (Button) findViewById(R.id.chembutton);
        chembutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, chemClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });

        final Button physicsbutton = (Button) findViewById(R.id.physicsbutton);
        physicsbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, physicsClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });

        final Button artbutton = (Button) findViewById(R.id.artbutton);
        artbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, artClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });

        final Button commbutton = (Button) findViewById(R.id.commbutton);
        commbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, commClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });

        final Button ethbutton = (Button) findViewById(R.id.ethbutton);
        ethbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, ethClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });

        final Button polibutton = (Button) findViewById(R.id.polibutton);
        polibutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, poliClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });

        final Button psychbutton = (Button) findViewById(R.id.psychbutton);
        psychbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, psychClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });

        final Button econbutton = (Button) findViewById(R.id.econbutton);
        econbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, econClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });

        final Button otherbutton = (Button) findViewById(R.id.otherbutton);
        otherbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(Subjects.this, otherClass.class);
                Subjects.this.startActivity(registerIntent);
            }
        });


    }
}
