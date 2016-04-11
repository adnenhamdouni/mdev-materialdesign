package com.itskills.android.materialdesign.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.itskills.android.materialdesign.R;

/**
 * Created by adnen on 4/5/16.
 */
public class ListContentAdapter extends RecyclerView.Adapter<ListContentAdapter.ViewHolder> {

    // Set numbers of List in RecyclerView.
    private static final int LENGTH = 18;

    public ListContentAdapter() {
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // no-op
    }

    @Override
    public int getItemCount() {
        return LENGTH;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.item_list, parent, false));
        }
    }
}
