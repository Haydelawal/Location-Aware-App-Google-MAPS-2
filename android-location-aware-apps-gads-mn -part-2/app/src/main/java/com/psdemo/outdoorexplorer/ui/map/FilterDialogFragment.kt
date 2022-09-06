package com.psdemo.outdoorexplorer.ui.map

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.psdemo.outdoorexplorer.R
import kotlinx.android.synthetic.main.dialog_filter.*

class FilterDialogFragment : DialogFragment(), RegionsAdapter.OnClickListener {
    private lateinit var mapViewModel: MapViewModel
    private lateinit var adapter: RegionsAdapter
    private lateinit var customView: View

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            val inflater = requireActivity().layoutInflater
            customView = inflater.inflate(R.layout.dialog_filter, null)
            builder.setView(customView)
                .setTitle("Regions")
                .setPositiveButton(R.string.ok, { _, _ -> })
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mapViewModel = ViewModelProvider(requireActivity())
            .get(MapViewModel::class.java)

        adapter = RegionsAdapter(this)
        listRegions.adapter = adapter

        mapViewModel.selectedRegions.observe(viewLifecycleOwner, Observer {
            adapter.setRegions(it)
        })

        customButton.setOnClickListener {
            mapViewModel.setBeginCustomDraw(true)
            dismiss()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = customView

    override fun onClick(id: Int) {
        mapViewModel.toggleVisibleRegion(id)
    }
}
