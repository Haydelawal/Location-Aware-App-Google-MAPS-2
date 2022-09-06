package com.psdemo.outdoorexplorer.ui.workouts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.psdemo.outdoorexplorer.R
import kotlinx.android.synthetic.main.fragment_workouts.*

class WorkoutsFragment : Fragment() {
    private lateinit var adapter: WorkoutsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fragment_workouts, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val workoutsViewModel = ViewModelProvider(this)
            .get(WorkoutsViewModel::class.java)

        adapter = WorkoutsAdapter()
        listWorkouts.adapter = adapter

        workoutsViewModel.allWorkouts.observe(viewLifecycleOwner, Observer {
            adapter.setWorkouts(it)
        })

        fab.setOnClickListener {
            val action = WorkoutsFragmentDirections.actionNavigationWorkoutsToNavigationWorkout()
            val navController = Navigation.findNavController(requireView())
            navController.navigate(action)
        }
    }
}
