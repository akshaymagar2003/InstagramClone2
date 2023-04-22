package com.example.instagram5.ui.heart

import android.content.Context
import android.provider.MediaStore
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram5.databinding.EachVedioBinding
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.PlaybackException
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.source.MediaSource


class VideoAdapter(
    var context: Context,
    var videos: ArrayList<Vedio>,
    var videoPreparedListener: OnVideoPreparedListener
) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
    class VideoViewHolder ( val binding: EachVedioBinding,
                            var context: Context,
                            var videoPreparedListener: OnVideoPreparedListener): RecyclerView.ViewHolder(binding.root) {

        private lateinit var exoPlayer:ExoPlayer
        private lateinit var mediaSource:MediaSource


        fun setVedioPath(url:String){
            exoPlayer=ExoPlayer.Builder(context).build()

            exoPlayer.addListener(object : Player.Listener{

                override fun onPlayerError(error: PlaybackException) {
                    super.onPlayerError(error)
                    Toast.makeText(context, "Can't play this video", Toast.LENGTH_SHORT).show()
                }

            })
        }

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




