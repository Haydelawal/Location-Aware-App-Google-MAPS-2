package com.psdemo.outdoorexplorer.ui.workout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.psdemo.outdoorexplorer.R

class WorkoutFragment : Fragment() {
    private lateinit var workoutViewModel: WorkoutViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_workout, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        workoutViewModel = ViewModelProvider(this)
            .get(WorkoutViewModel::class.java)

    }
}