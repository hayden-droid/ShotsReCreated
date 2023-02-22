package com.memeitizer.memeitizershorts

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var view_pager2: ViewPager2
    lateinit var open_next_activity: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.hide()

        recyclerView = findViewById(R.id.recycler_view)
        view_pager2 = findViewById(R.id.view_pager2)
        open_next_activity = findViewById(R.id.open_next_activity)
        recyclerView.visibility = View.GONE
        view_pager2.visibility = View.GONE

        var arrayList = ArrayList<String>()

        open_next_activity.setOnClickListener{
            startActivity(Intent(this@MainActivity,MainActivity2::class.java))
        }


        /*
        arrayList.add("p5NoAzZIj8Q")
        arrayList.add("QR1jRM4XTyc")
        arrayList.add("B0QUacAdgxU")
        arrayList.add("hShz2mM8OqM")
        arrayList.add("1lqzxLYBpqg")
        arrayList.add("Tz2j1dqp5ww")
        arrayList.add("ygXFDm23TtM")
        arrayList.add("NjjIB1mIVHQ")
*/

        arrayList = getLinks()


        view_pager2.visibility = View.VISIBLE
        view_pager2.adapter = AdapterXX(this,arrayList)

/*
        recyclerView.visibility = View.VISIBLE
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val snapHelper: SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        recyclerView.adapter = AdapterXX(this, arrayList)
*/

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
