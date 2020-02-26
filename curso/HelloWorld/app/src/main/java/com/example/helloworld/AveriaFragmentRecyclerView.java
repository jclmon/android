package com.example.helloworld;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnClickAveriaListener}
 * interface.
 */
public class AveriaFragmentRecyclerView extends Fragment  {

    // TODO: Customize parameters
    private int mColumnCount = 1;

    private OnClickAveriaListener mListener;

    private List<Averia> averiasList;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public AveriaFragmentRecyclerView() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_averia_list_recycler_view, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;

            averiasList = new ArrayList<>();
            averiasList.add(new Averia("Espejo roto", "Renault 9", "https://thumbs.dreamstime.com/z/espejo-de-coche-quebrado-49758229.jpg", 2));
            averiasList.add(new Averia("Paragolpes delantero", "Citroen C4", "", 2));
            averiasList.add(new Averia("Embrague", "Seat ibiza", "", 0));
            averiasList.add(new Averia("Cambio aceite", "Seat toledo", "", 1));

            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new AveriaRecyclerViewAdapter(context, averiasList, mListener));
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnClickAveriaListener) {
            mListener = (OnClickAveriaListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnClickAveriaListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
