package com.itskills.android.materialdesign.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itskills.android.materialdesign.R;
import com.itskills.android.materialdesign.adapter.TitleContentAdapter;

/**
 * Created by adnen on 4/5/16.
 */
public class TitleContentFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private TitleContentAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.item_list, null);
    }

    private void initView(View view) {

        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
    }

    private void initRecyclerView() {

        mAdapter = new TitleContentAdapter();

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());

        // Set padding for Tiles (not needed for Cards/Lists!)
        int tilePadding = getResources().getDimensionPixelSize(R.dimen.tile_padding);
        mRecyclerView.setPadding(tilePadding, tilePadding, tilePadding, tilePadding);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }
}
