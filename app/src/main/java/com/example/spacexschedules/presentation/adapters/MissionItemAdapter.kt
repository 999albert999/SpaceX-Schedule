package com.example.spacexschedules.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.spacexschedules.databinding.ScheduleRecyclerItemBinding
import com.example.spacexschedules.presentation.model.MissionPresentationModel

class MissionItemAdapter : ListAdapter<MissionPresentationModel, MissionItemAdapter.MissionViewHolder>(DIFF) {
    inner class MissionViewHolder(private val binding: ScheduleRecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: MissionPresentationModel) {
            binding.apply {
                missionNameText.text = item.missionName
                dateText.text = item.date
                detailsText.text = item.details
                statusText.text = item.status
            }
        }
    }

    companion object {
        private val DIFF = object : DiffUtil.ItemCallback<MissionPresentationModel>() {
            override fun areItemsTheSame(oldItem: MissionPresentationModel, newItem: MissionPresentationModel): Boolean {
                return oldItem.missionName == newItem.missionName
            }

            override fun areContentsTheSame(oldItem: MissionPresentationModel, newItem: MissionPresentationModel): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MissionViewHolder {
        return MissionViewHolder(ScheduleRecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MissionViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}