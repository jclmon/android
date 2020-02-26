package com.example.helloworld;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class AveriaRecyclerViewAdapter extends RecyclerView.Adapter<AveriaRecyclerViewAdapter.ViewHolder> {

    private final List<Averia> mValues;
    private final OnClickAveriaListener mListener;
    private final Context context;

    public AveriaRecyclerViewAdapter(Context context, List<Averia> items, OnClickAveriaListener listener) {
        this.context = context;
        this.mValues = items;
        this.mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.averia_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        // HAcer un set de la info del elemento Actual en los elementos de la IU
        holder.textViewTitulo.setText(holder.mItem.getTitulo());
        holder.textViewModeloCoche.setText(holder.mItem.getModelo());
        holder.textViewPresupuestos.setText(holder.mItem.getNumeroPresupuestos()+ " Presupuestos");

        if(!holder.mItem.getUrlImagen().isEmpty()) {
            Glide.with(context)
                    .load(holder.mItem.getUrlImagen())
                    .into(holder.imageViewFoto);
        }

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onAveriaClick(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView textViewTitulo;
        public final TextView textViewModeloCoche;
        public final TextView textViewPresupuestos;
        public final ImageView imageViewFoto;

        public Averia mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            // Rescatar los elementos de la IU de la template
            textViewTitulo = view.findViewById(R.id.textViewTitulo);
            textViewModeloCoche = view.findViewById(R.id.textViewModeloCoche);
            textViewPresupuestos = view.findViewById(R.id.textViewNumeroPresupuestos);
            imageViewFoto = view.findViewById(R.id.imageViewFoto);
       }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewTitulo.getText() + "'";
        }
    }
}
