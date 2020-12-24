package net.android.parler.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import net.android.parler.databinding.MainFragmentBinding
import net.android.parler.model.JsonData

class MainFragment : Fragment() {

    lateinit var mainFragmentBinding: MainFragmentBinding

    companion object {
        var jsonData: List<JsonData> = mutableListOf()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainFragmentBinding = MainFragmentBinding.inflate(inflater, container, false)
        return mainFragmentBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        for (json in jsonData) {
            mainFragmentBinding.main = json.main
            Glide.with(this)
                .load(json.main.background)
                .into(mainFragmentBinding.backgroundMain)
            Glide.with(this)
                .load(json.main.subtitlebg2)
                .into(mainFragmentBinding.subtitlebg2Main)
            Glide.with(this)
                .load(json.main.subtitlebg3)
                .into(mainFragmentBinding.subtitlebg3Main)
            Glide.with(this)
                .load(json.main.subtitlebg4)
                .into(mainFragmentBinding.subtitlebg4Main)
            Glide.with(this)
                .load(json.main.subtitlebg5)
                .into(mainFragmentBinding.subtitlebg5Main)
            Glide.with(this)
                .load(json.main.subtitleb61)
                .into(mainFragmentBinding.subtitlebg6Main)
            Glide.with(this)
                .load(json.main.subtitlebg7)
                .into(mainFragmentBinding.subtitlebg7Main)
        }
    }


}