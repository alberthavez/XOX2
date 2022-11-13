package com.example.xox2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button20).setVisibility(View.INVISIBLE);;

    }


    public void cryme(View view) {//XO Buttons seq
        count++;
        Button button = (Button) view;
        button.setEnabled(false);
        if (count % 2 == 0) {
            button.setText("X");
        } else button.setText("O");
        success();

    }

    public void pryme(View view) {//Reset for who wins
        reset();
    }
    public void fryme(View view) {//Who starts and reset
        reset();
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        if (x % 2 == 0) {
            go1();
        } else go2();

    }

    private void go1() {//Hides the arrow not chosen
        ImageButton b = findViewById(R.id.imageButton10);
        b.setVisibility(View.VISIBLE);
        ImageButton c = findViewById(R.id.imageButton11);
        c.setVisibility(View.INVISIBLE);

    }

    public void go2() {//Hides the arrow not chosen
        ImageButton c = findViewById(R.id.imageButton11);
        c.setVisibility(View.VISIBLE);
        ImageButton b = findViewById(R.id.imageButton10);
        b.setVisibility(View.INVISIBLE);

    }

    public void reset() {//Reset the game and restores boxes
        findViewById(R.id.imageButton10).setVisibility(View.VISIBLE);
        findViewById(R.id.imageButton11).setVisibility(View.VISIBLE);
        findViewById(R.id.button20).setVisibility(View.INVISIBLE);


        Button e = findViewById(R.id.button11);
        e.setText("CLICK");
        e.setEnabled(true);
        Button f = findViewById(R.id.button12);
        f.setText("CLICK");
        f.setEnabled(true);
        Button g = findViewById(R.id.button13);
        g.setText("CLICK");
        g.setEnabled(true);
        Button h = findViewById(R.id.button14);
        h.setText("CLICK");
        h.setEnabled(true);
        Button j = findViewById(R.id.button15);
        j.setText("CLICK");
        j.setEnabled(true);
        Button k = findViewById(R.id.button16);
        k.setText("CLICK");
        k.setEnabled(true);
        Button n = findViewById(R.id.button17);
        n.setText("CLICK");
        n.setEnabled(true);
        Button l = findViewById(R.id.button18);
        l.setText("CLICK");
        l.setEnabled(true);
        Button m = findViewById(R.id.button19);
        m.setText("CLICK");
        m.setEnabled(true);

    }

    public void success() {//Finds who won the game by checking every move
        View v = findViewById(R.id.button11);
        Button e = (Button) v;
        String b1 = (String) e.getText();
        v = findViewById(R.id.button12);
        Button f = (Button) v;
        String b2 = (String) f.getText();
        v = findViewById(R.id.button13);
        Button g = (Button) v;
        String b3 = (String) g.getText();
        v = findViewById(R.id.button14);
        Button h = (Button) v;
        String b4 = (String) h.getText();
        v = findViewById(R.id.button15);
        Button j = (Button) v;
        String b5 = (String) j.getText();
        v = findViewById(R.id.button16);
        Button k = (Button) v;
        String b6 = (String) k.getText();
        v = findViewById(R.id.button17);
        Button n = (Button) v;
        String b7 = (String) n.getText();
        v = findViewById(R.id.button18);
        Button l = (Button) v;
        String b8 = (String) l.getText();
        v = findViewById(R.id.button19);
        Button m = (Button) v;
        String b9 = (String) m.getText();
        if ((b1.equals("X") && b2.equals(b1) && b2.equals(b3)) ||
                (b4.equals("X") && b5.equals(b6) && b4.equals(b5)) ||
                (b7.equals("X") && b8.equals(b9) && b7.equals(b9)) ||
                (b1.equals("X") && b4.equals(b1) && b4.equals(b7)) ||
                (b2.equals("X") && b2.equals(b5) && b5.equals(b8)) ||
                (b3.equals("X") && b3.equals(b6) && b6.equals(b9)) ||
                (b1.equals("X") && b5.equals(b9) && b1.equals(b9)) ||
                (b3.equals("X") && b5.equals(b3) && b5.equals(b7))) {
            v = findViewById(R.id.button20);
            Button p = (Button) v;
            p.setVisibility(View.VISIBLE);
            p.setText("!!!X WINS!!!");
        }
        if ((b1.equals("O") && b2.equals(b1) && b2.equals(b3)) ||
                (b4.equals("O") && b5.equals(b6) && b4.equals(b5)) ||
                (b7.equals("O") && b8.equals(b9) && b7.equals(b9)) ||
                (b1.equals("O") && b4.equals(b1) && b4.equals(b7)) ||
                (b2.equals("O") && b2.equals(b5) && b5.equals(b8)) ||
                (b3.equals("O") && b3.equals(b6) && b6.equals(b9)) ||
                (b1.equals("O") && b5.equals(b9) && b1.equals(b9)) ||
                (b3.equals("O") && b5.equals(b3) && b5.equals(b7))) {
            v = findViewById(R.id.button20);
            Button p = (Button) v;
            p.setVisibility(View.VISIBLE);
            p.setText("!!!O WINS!!!");
        }
    }
}