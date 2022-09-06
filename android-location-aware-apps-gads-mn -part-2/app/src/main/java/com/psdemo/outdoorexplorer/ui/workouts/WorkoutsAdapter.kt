package com.psdemo.outdoorexplorer.ui.workouts

import android.annotation.SuppressLint
import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.psdemo.outdoorexplorer.R
import com.psdemo.outdoorexplorer.data.Workout
import com.psdemo.outdoorexplorer.util.toMiles
import com.psdemo.outdoorexplorer.util.toTimeDisplay
import kotlinx.android.synthetic.main.workout_item.view.*
import java.util.*
import kotlin.collections.ArrayList

class WorkoutsAdapter() :
    RecyclerView.Adapter<WorkoutsAdapter.WorkoutHolder>() {
    private var allWorkouts: List<Workout> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.workout_item, parent, false)
        return WorkoutHolder(itemView)
    }

    override fun getItemCount(): Int {
        return allWorkouts.size
    }

    fun setWorkouts(workouts: List<Workout>) {
        allWorkouts = workouts
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: WorkoutHolder, position: Int) {
        holder.bind(allWorkouts[position])
    }

    inner class WorkoutHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bind(workout: Workout) {
            with(itemView) {
                val calendar = Calendar.getInstance()
                val dateFormat = DateFormat.getDateFormat(itemView.context)
                calendar.timeInMillis = workout.timestamp
                date.text = dateFormat.format(calendar.time)

                time.text = workout.duration.toTimeDisplay()
                distance.text = context.getString(
                    R.string.distance_value,
                    workout.distance.toMiles()
                )
            }
        }
    }
}