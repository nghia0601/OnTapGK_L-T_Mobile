package vn.edu.ontapgiuaky;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment_RecycleView extends Fragment {
    RecycleView_Adapter recycleAdapter;
    RecyclerView recyclerView;
    ArrayList<SanPham> dsSP = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_recycleview,container,false);

        dsSP.add(new SanPham("AA",39.0,R.drawable.daucam));
        dsSP.add(new SanPham("BB",39.0,R.drawable.dauchuyendoi));
        dsSP.add(new SanPham("CC",39.0,R.drawable.giacchuyen));
        dsSP.add(new SanPham("DD",39.0,R.drawable.carbusbtops));

        recyclerView = view.findViewById(R.id.recycleViewSanPham);
        recycleAdapter= new RecycleView_Adapter(getActivity(),dsSP);
        recyclerView.setAdapter(recycleAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        return  view;
    }
}
