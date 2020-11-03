package vn.edu.ontapgiuaky;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SendData {
    Fragment_RecycleView fragment_recycleView;
    TextView tvActivity;
    FragBelow fragBelow;
    Button bt_TruyenDuLieu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvActivity = findViewById(R.id.txtActivity);

        fragment_recycleView = new Fragment_RecycleView();
        //getSupportFragmentManager().beginTransaction().add(R.id.fragment,fragment_recycleView).commit();
        fragment_recycleView =(Fragment_RecycleView)getSupportFragmentManager().findFragmentById(R.id.fragment);
        fragBelow = new FragBelow();
        fragBelow = (FragBelow)getSupportFragmentManager().findFragmentById(R.id.fragment2);

        bt_TruyenDuLieu = findViewById(R.id.btnTruyenDuLieu);
        bt_TruyenDuLieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragBelow fragBelow = (FragBelow)fragmentManager.findFragmentById(R.id.fragment2);
                fragBelow.tv_HienThi.setText("Nghia Dep Trai");
            }
        });
    }

    @Override
    public void send(String TenSP) {
        tvActivity.setText(TenSP);
        fragBelow.UpdateData(TenSP);
    }
}