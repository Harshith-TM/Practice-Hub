package com.example.practice;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class fragment_demo extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Fragment Life Cycle", "Fragment Created");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("Fragment Life Cycle", "Fragment View Created");
        return inflater.inflate(R.layout.fragment_demo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("Fragment Life Cycle", "onViewCreated Method");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Fragment Life Cycle", "Fragment View Destroyed");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Fragment Life Cycle", "Fragment Started");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Fragment Life Cycle", "Fragment Resumed");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Fragment Life Cycle", "Fragment Paused");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Fragment Life Cycle", "Fragment Stopped");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Fragment Life Cycle", "Fragment Destroyed");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Fragment Life Cycle", "Fragment Detached from Activity");
    }

}