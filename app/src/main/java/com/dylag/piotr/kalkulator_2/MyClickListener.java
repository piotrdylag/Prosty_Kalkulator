package com.dylag.piotr.kalkulator_2;

import android.util.Log;
import android.view.View;

/**
 * Created by PitPlay on 1/14/2017.
 */

public class MyClickListener implements View.OnClickListener {

    @Override
    public void onClick(View clickedView) {
        Log.d("MyClickListener", "Kliknięto "+ clickedView.toString());

    }

    public void publicMethod() {
        Log.d("MyClickListener", "Wywolano Metode Publiczna");
    }

    private void privateMethod() {
        Log.d("MyClickListener", "Wywolano Metode Prywatna");
    }

    public int dodaj(int x, int y){
        return x + y;
    }

}
