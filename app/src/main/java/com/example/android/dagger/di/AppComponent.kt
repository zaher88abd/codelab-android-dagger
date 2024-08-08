package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubComponents::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun userManager(): UserManager

    fun registrationComponent(): RegistrationComponent.Factory
    fun userComponent(): UserComponent.Factory
}