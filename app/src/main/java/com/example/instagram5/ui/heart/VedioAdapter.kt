package com.example.instagram5.ui.heart

import android.content.Context
import android.provider.MediaStore
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram5.databinding.EachVedioBinding


class VideoAdapter(
    var context: Context,
    var videos: ArrayList<Vedio>,
    var videoPreparedListener: OnVideoPreparedListener
) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
    class VideoViewHolder ( val binding: EachVedioBinding,
                            var context: Context,
                            var videoPreparedListener: OnVideoPreparedListener): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VideoAdapter.VideoViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: VideoAdapter.VideoViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
    interface OnVideoPreparedListener {
        fun onVideoPrepared(exoPlayerItem: ExoPlayerItem)
    }

}




