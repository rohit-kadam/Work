package com.work.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.work.R
import com.work.models.Work
import kotlinx.android.synthetic.main.work_row_layout.view.*

/**
 * Created by Rohit on 21/09/18.
 */
class WorkListAdapter (val workList: ArrayList<Work>) : RecyclerView.Adapter<WorkListAdapter.WorkViewHolder>() {
    class WorkViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItems(work: Work) {
            itemView.txt_work_name.text = work.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.work_row_layout, parent, false)
        return WorkViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WorkViewHolder, position: Int) {
        holder.bindItems(workList[position])
    }

    override fun getItemCount(): Int {
        return workList.size
    }
}