package net.android.parler.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.container_fragment.view.*
import net.android.parler.R
import net.android.parler.ui.adapters.ViewPagerAdapter
import net.android.parler.ui.fragments.MainFragment
import net.android.parler.viewmodel.MyViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class ContainerFragment : Fragment() {

    val myViewModel: MyViewModel by viewModel()

    companion object {
        lateinit var rootView: View
        fun itemLayout(item: Int) {
            rootView.tabLayout.selectTab(rootView.tabLayout.getTabAt(item))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.container_fragment, container, false)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        myViewModel.jsonLiveData.observe(viewLifecycleOwner, Observer {
            MainFragment.jsonData = listOf(it)
            val viewPagerAdapter = ViewPagerAdapter(childFragmentManager, lifecycle)
            rootView.viewPager.adapter = viewPagerAdapter
        })
    }

}