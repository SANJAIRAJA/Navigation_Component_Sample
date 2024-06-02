package com.example.navigation_component_sample

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.BounceInterpolator
import android.view.animation.ScaleAnimation
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.navigation_component_sample.constants.ConstantVariables
import com.example.navigation_component_sample.constants.Utils
import com.example.navigation_component_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    lateinit var navHostFragment: NavHostFragment
    lateinit var navController: NavController
    var Constant = ConstantVariables()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        monitorNavigationController()
        init()
    }

    private fun monitorNavigationController() {
        val scaleAnimation = ScaleAnimation(
            0.5f, 1.0f,
            0.5f, 1.0f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        scaleAnimation.duration = 300
        val animationSet = AnimationSet(true)
        animationSet.addAnimation(scaleAnimation)


        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_fragment_00) as NavHostFragment
        navController = navHostFragment.navController

        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.homeFragment ->{
                    selectingIvHomeIconFun(animationSet)
                    Log.d(Constant.TAG,Constant.HOME_FRAGMENT)
                }

                R.id.findFragment -> {
                    selectingIvFindingIconFun(animationSet)
                    Log.d(Constant.TAG,Constant.FIND_FRAGMENT)
                }

                R.id.liveFragment -> {
                    selectingIvLiveIconFun(animationSet)
                    Log.d(Constant.TAG,Constant.LIVE_FRAGMENT)
                }

                R.id.messageFragment -> {
                    selectingIvMsgIconFun(animationSet)
                    Log.d(Constant.TAG,Constant.MESSAGE_FRAGMENT)
                }

                R.id.profileFragment -> {
                    selectingIvProfileIconFun(animationSet)
                    Log.d(Constant.TAG,Constant.PROFILE_FRAGMENT)
                }

            }
        }

    }

    private fun init(){



        binding.ivFingDeSelect.setOnClickListener {
            preventClickFunction()
            navController.navigate(R.id.findFragment)
        }

        binding.ivHomeDeSelect.setOnClickListener {
            preventClickFunction()
            navController.navigate(R.id.homeFragment)
        }


        binding.ivLiveDeSelect.setOnClickListener {
            preventClickFunction()
            navController.navigate(R.id.liveFragment)
        }


        binding.ivProfileDeSelect.setOnClickListener {
            preventClickFunction()
            navController.navigate(R.id.profileFragment)
        }


        binding.ivMsgDeSelect.setOnClickListener {
            preventClickFunction()
            navController.navigate(R.id.messageFragment)
        }
    }




    private fun preventClickFunction() {
        Utils().preventTwoClickForAll( binding.ivFingDeSelect,binding.ivHomeDeSelect,binding.ivLiveDeSelect,binding.ivProfileDeSelect,binding.ivMsgDeSelect)
    }


    private fun selectingIvMsgIconFun(animationSet: AnimationSet) {
        binding.ivMsgDeSelect.visibility = View.GONE
        binding.crdMsgSelect.visibility = View.VISIBLE

        binding.ivHomeDeSelect.visibility = View.VISIBLE
        binding.ivLiveDeSelect.visibility = View.VISIBLE
        binding.ivProfileDeSelect.visibility = View.VISIBLE
        binding.ivFingDeSelect.visibility = View.VISIBLE

        binding.crdHomeSelect.visibility = View.GONE
        binding.crdLiveSelect.visibility = View.GONE
        binding.crdFindSelect.visibility = View.GONE
        binding.crdProfileSelect.visibility = View.GONE

        Utils().jumpView(binding.ivMsgSelect)
        binding.crdMsgSelect.startAnimation(animationSet)

    }

    private fun selectingIvProfileIconFun(animationSet: AnimationSet) {
        binding.ivProfileDeSelect.visibility = View.GONE
        binding.crdProfileSelect.visibility = View.VISIBLE

        binding.ivHomeDeSelect.visibility = View.VISIBLE
        binding.ivLiveDeSelect.visibility = View.VISIBLE
        binding.ivFingDeSelect.visibility = View.VISIBLE
        binding.ivMsgDeSelect.visibility = View.VISIBLE

        binding.crdHomeSelect.visibility = View.GONE
        binding.crdLiveSelect.visibility = View.GONE
        binding.crdMsgSelect.visibility = View.GONE
        binding.crdFindSelect.visibility = View.GONE

        Utils().jumpView(binding.ivProfileSelect)
        binding.crdProfileSelect.startAnimation(animationSet)

    }

    private fun selectingIvLiveIconFun(animationSet: AnimationSet) {
        binding.ivLiveDeSelect.visibility = View.GONE
        binding.crdLiveSelect.visibility = View.VISIBLE

        binding.ivHomeDeSelect.visibility = View.VISIBLE
        binding.ivFingDeSelect.visibility = View.VISIBLE
        binding.ivProfileDeSelect.visibility = View.VISIBLE
        binding.ivMsgDeSelect.visibility = View.VISIBLE

        binding.crdHomeSelect.visibility = View.GONE
        binding.crdFindSelect.visibility = View.GONE
        binding.crdMsgSelect.visibility = View.GONE
        binding.crdProfileSelect.visibility = View.GONE

        Utils().jumpView(binding.ivLiveSelect)
        binding.crdLiveSelect.startAnimation(animationSet)

    }

    private fun selectingIvHomeIconFun(animationSet: AnimationSet) {
        binding.ivHomeDeSelect.visibility = View.GONE
        binding.crdHomeSelect.visibility = View.VISIBLE

        binding.ivFingDeSelect.visibility = View.VISIBLE
        binding.ivLiveDeSelect.visibility = View.VISIBLE
        binding.ivProfileDeSelect.visibility = View.VISIBLE
        binding.ivMsgDeSelect.visibility = View.VISIBLE

        binding.crdFindSelect.visibility = View.GONE
        binding.crdLiveSelect.visibility = View.GONE
        binding.crdMsgSelect.visibility = View.GONE
        binding.crdProfileSelect.visibility = View.GONE

        Utils().jumpView(binding.ivHomeSelect)
        binding.crdHomeSelect.startAnimation(animationSet)

    }

    private fun selectingIvFindingIconFun(animationSet: AnimationSet) {
        binding.ivFingDeSelect.visibility = View.GONE
        binding.crdFindSelect.visibility = View.VISIBLE

        binding.ivHomeDeSelect.visibility = View.VISIBLE
        binding.ivLiveDeSelect.visibility = View.VISIBLE
        binding.ivProfileDeSelect.visibility = View.VISIBLE
        binding.ivMsgDeSelect.visibility = View.VISIBLE

        binding.crdHomeSelect.visibility = View.GONE
        binding.crdLiveSelect.visibility = View.GONE
        binding.crdMsgSelect.visibility = View.GONE
        binding.crdProfileSelect.visibility = View.GONE

        Utils().jumpView(binding.ivFingSelect)
        binding.crdFindSelect.startAnimation(animationSet)

    }



}