package com.memeitizer.memeitizershorts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity2 : AppCompatActivity() {

    lateinit var vertical_view_pager : ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.hide()


        vertical_view_pager = findViewById(R.id.vertical_view_pager)

        val pagerAdapter = PagerAdapter(this,getLinks())
        vertical_view_pager.adapter = pagerAdapter
    }

    fun getLinks() : ArrayList<String>{
        val youtube_link = ArrayList<String>()

        youtube_link.add("Wy7TChAZ1k0")
        youtube_link.add("kLhJzpT3mAc")
        youtube_link.add("zCWpDlFFF5k")
        youtube_link.add("VHuQhy3x9b8")
        youtube_link.add("kLhJzpT3mAc")
        youtube_link.add("zCWpDlFFF5k")
        youtube_link.add("VHuQhy3x9b8")


        return youtube_link
    }

}
