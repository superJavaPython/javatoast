package ggon.sun.white.javatoast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ToastJava extends AppCompatActivity {

    public static void s(Context c,String m){
        Toast.makeText(c,m,Toast.LENGTH_SHORT).show();
    }
}
