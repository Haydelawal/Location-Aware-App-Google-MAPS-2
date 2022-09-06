package com.psdemo.outdoorexplorer.ui.map

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.RecyclerView
import com.psdemo.outdoorexplorer.R
import com.psdemo.outdoorexplorer.data.Region
import kotlinx.android.synthetic.main.region_item.view.*

class RegionsAdapter(private val onClickListener: OnClickListener) :
    RecyclerView.Adapter<RegionsAdapter.RegionHolder>() {
    private var allRegions: List<Pair<Region, Boolean>> = arrayListOf<Pair<Region, Boolean>>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegionHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.region_item, parent, false)
        return RegionHolder(itemView)
    }

    override fun getItemCount(): Int {
        return allRegions.size
    }

    fun setRegions(regions: List<Pair<Region, Boolean>>) {
        allRegions = regions
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: RegionHolder, position: Int) {
        holder.bind(allRegions[position], onClickListener)
    }

    inner class RegionHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(pair: Pair<Region, Boolean>, clickListener: OnClickListener) {
            with(itemView) {
                item.setOnClickListener { clickListener.onClick(pair.first.id) }
                title.text = pair.first.title
                colorBlock.setBackgroundColor(pair.first.color.toColorInt())
                title.isChecked = pair.second
            }
        }
    }

    interface OnClickListener {
        fun onClick(id: Int)
    }
}