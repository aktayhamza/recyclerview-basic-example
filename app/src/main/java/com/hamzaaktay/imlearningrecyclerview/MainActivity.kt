package com.hamzaaktay.imlearningrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hamzaaktay.imlearningrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        //data

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum = Landmark("Colosseum","Italy",R.drawable.colosseum)
        val eiffel = Landmark("Eiffel","France",R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge", "UK",R.drawable.londonbridge)
        val rio = Landmark("Rio","Brazil",R.drawable.rio)
        val kadikoy = Landmark("Kadikoy","Turkey",R.drawable.kadikoy)
        val buenosAires = Landmark("Buenos Aires","Argentina",R.drawable.buenosaires)
        val gizaPyramids = Landmark("Giza Pyramids","Egypt",R.drawable.gizapyramids)
        val greatWallOfChina = Landmark("Great Wall Of China","China",R.drawable.greatwallofchina)
        val statueOfLiberty = Landmark("Statue Of Liberty","USA",R.drawable.libery)


        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)
        landmarkList.add(rio)
        landmarkList.add(kadikoy)
        landmarkList.add(buenosAires)
        landmarkList.add(gizaPyramids)
        landmarkList.add(greatWallOfChina)
        landmarkList.add(statueOfLiberty)



        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter






    }


}