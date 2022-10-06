package com.mht.stud_e.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.mht.stud_e.Models.CreateTeamProfile
import com.mht.stud_e.R
import kotlinx.android.synthetic.main.activity_createteam2.*
import kotlinx.android.synthetic.main.createteamprofile_ticket.view.*
//creating team activity
class CreateteamActivity2 : AppCompatActivity() {
    var listOfTeamMembers =ArrayList<CreateTeamProfile>()
    var adapter: ProfileAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createteam2)
        supportActionBar?.hide()
        listOfTeamMembers.add(CreateTeamProfile("Menaouar Hamou", "Team Lead"))
        listOfTeamMembers.add(CreateTeamProfile("Abdelhakim Azzouz", "Member"))
        listOfTeamMembers.add(CreateTeamProfile("Menaouar Hamou", "Team Lead"))
        listOfTeamMembers.add(CreateTeamProfile("Abdelhakim Azzouz", "Member"))


        adapter = ProfileAdapter(this, listOfTeamMembers)
        gridViewOfTeamMembers.adapter =adapter
    }

    inner class ProfileAdapter: BaseAdapter {
        var profile = ArrayList<CreateTeamProfile>()
        var context: Context?=null


        constructor(context: Context, profile: ArrayList<CreateTeamProfile>):super(){
            this.profile=profile
            this.context=context
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val userInst = this.profile[position]
            val inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val userView = inflater.inflate(R.layout.createteamprofile_ticket, null)

            userView.tvRole.text = userInst.role
            userView.tvUsername.text = userInst.name


            return userView

        }

        override fun getItem(p0: Int): Any {
            return profile[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {

            return profile.size
        }

    }



}