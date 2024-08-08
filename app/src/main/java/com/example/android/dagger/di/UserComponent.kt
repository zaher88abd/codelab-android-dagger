package com.example.android.dagger.di

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.Subcomponent
import javax.inject.Inject

@LoggingUserScope
@Subcomponent
interface UserComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    fun userManager(): UserManager

    fun Inject(activity: SettingsActivity)
    fun Inject(activity: MainActivity)
}