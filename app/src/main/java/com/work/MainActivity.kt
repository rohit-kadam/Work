package com.work

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.work.adapters.WorkListAdapter
import com.work.models.Work
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun addWorks(): ArrayList<Work> {
        val works = ArrayList<Work>()

        works.add(Work("Activity"))
        works.add(Work("Add Fragment"))
        works.add(Work("Replace Fragment"))

        works.add(Work("Google Login"))
        works.add(Work("Facebook Login"))
        works.add(Work("Twitter Login"))
        works.add(Work("AccountKit"))

        works.add(Work("Dialog"))
        works.add(Work("Custom Dialog"))
        works.add(Work("AlertDialog"))
        works.add(Work("Custom AlertDialog"))

        works.add(Work("Progress"))
        works.add(Work("Copy Text to Clipboard"))

        works.add(Work("Tabs"))
        works.add(Work("BottomNavigationView"))
        works.add(Work("SmackBar"))
        works.add(Work("Toast Message"))

        works.add(Work("WebView"))
        works.add(Work("Chrome CustomTabs"))

        works.add(Work("ListView"))
        works.add(Work("RecyclerView Vertical"))
        works.add(Work("RecyclerView Horizontal"))
        works.add(Work("RecyclerView Grid"))
        works.add(Work("RecyclerView StaggeredGrid"))

        works.add(Work("Activity Transition"))
        works.add(Work("Shared Element Activity Transition"))
        works.add(Work("Activity Animation"))

        works.add(Work("ConstraintLayout"))
        works.add(Work("CollapsingToolbarLayout"))

        works.add(Work("Map"))

        works.add(Work("FCM"))
        works.add(Work("Local Notification"))

        works.add(Work("Service"))
        works.add(Work("Intent Service"))
        works.add(Work("Foreground Service"))
        works.add(Work("Bound Service"))

        works.add(Work("Broadcast Receiver"))
        works.add(Work("Local Broadcast Receiver"))

        works.add(Work("Dagger 2"))

        works.add(Work("Picasso"))
        works.add(Work("Glide"))
        works.add(Work("Fresco"))
        works.add(Work("Universal Image Loader"))

        works.add(Work("Alarm Manager"))
        works.add(Work("Job Scheduler"))
        works.add(Work("Job WorkManager"))

        works.add(Work("AsyncTask"))
        works.add(Work("RxJava 2"))

        works.add(Work("Content Provider"))
        works.add(Work("Room DB"))
        works.add(Work("Firebase Realtime Database"))
        works.add(Work("Realm DB"))

        works.add(Work("Instabug"))
        works.add(Work("Crashlytics"))

        works.add(Work("MVP"))
        works.add(Work("Android Architecture Components"))
        works.add(Work("Android Jetpack"))

        return works
    }

    private fun init() {
        rv_works.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val  adapter = WorkListAdapter(addWorks())
        rv_works.adapter = adapter
    }
}
