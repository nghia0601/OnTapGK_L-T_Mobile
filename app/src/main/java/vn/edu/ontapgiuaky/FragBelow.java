package vn.edu.ontapgiuaky;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragBelow extends Fragment {
    TextView tv_HienThi;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_below,container,false);
         tv_HienThi = view.findViewById(R.id.txtFragBelow);
        return view;
    }
    public void UpdateData(String data)
    {
        tv_HienThi.setText(data);
    }
}
