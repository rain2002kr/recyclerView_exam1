package com.example.recyclerview_exam1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val list = mutableListOf<ItemModel>(
        ItemModel("삼성카드","1588-5600","최지선","010-5687-4135"),
        ItemModel("국민카드","1588-8500","최지선","010-5687-4135")
          )
    val adpter = ItemViewAdapter(R.layout.item_box, list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        container.adapter = adpter
        container.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        insertBt.setOnClickListener({
            //list.add(ItemModel(etReceiveName.text.toString(),etReceiveNumber.text.toString(),etTransferName.text.toString(),etTransferNumber.text.toString()))
            list.add(ItemModel(etReceiveName.text.toString(),etReceiveNumber.text.toString(),etTransferName.text.toString(),etTransferNumber.text.toString()))
            adpter.notifyDataSetChanged()

        })
        deleteBT.setOnClickListener({
            if(list.isNotEmpty())
            list.removeAt(list.lastIndex)
            adpter.notifyDataSetChanged()
        })
    }
}
