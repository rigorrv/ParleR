package net.android.parler.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import net.android.parler.ui.ContainerFragment
import net.android.parler.ui.fragments.MainFragment

class ViewPagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fm, lifecycle) {

    val items = 6

    override fun getItemCount(): Int {
        return items
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MainFragment()
            0 -> MainFragment()
            0 -> MainFragment()
            0 -> MainFragment()
            0 -> MainFragment()
            0 -> MainFragment()
            else -> MainFragment()
        }
    }

    override fun getItemId(position: Int): Long {
        ContainerFragment.itemLayout(position)
        return super.getItemId(position)
    }
}