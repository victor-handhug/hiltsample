package kr.handhug.hiltsample.di

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kr.handhug.hiltsample.BuildConfig
import kr.handhug.hiltsample.env.Env
import javax.inject.Inject
import javax.inject.Singleton

// provides
//@Module
//@InstallIn(SingletonComponent::class)
//object EnvModule {
//
//    @Provides
//    @Singleton
//    fun provideEnv(@ApplicationContext context: Context): Env = object : Env {
//        override val DEBUG: Boolean = BuildConfig.DEBUG
//        override val APPLICATION_ID: String = BuildConfig.APPLICATION_ID
//        override val BUILD_TYPE: String = BuildConfig.BUILD_TYPE
//        override val VERSION_CODE: Int = BuildConfig.VERSION_CODE
//        override val VERSION_NAME: String = BuildConfig.VERSION_NAME
//        override val packageNameViaPackageManager: String = context.packageName
//    }
//}

// binds
class EnvImpl @Inject constructor(@ApplicationContext private val context: Context) : Env {
    override val DEBUG: Boolean = BuildConfig.DEBUG
    override val APPLICATION_ID: String = BuildConfig.APPLICATION_ID
    override val BUILD_TYPE: String = BuildConfig.BUILD_TYPE
    override val VERSION_CODE: Int = BuildConfig.VERSION_CODE
    override val VERSION_NAME: String = BuildConfig.VERSION_NAME
    override val packageNameViaPackageManager: String = context.packageName
}

@Module
@InstallIn(SingletonComponent::class)
abstract class EnvModule {

    @Binds
    @Singleton
    abstract fun bindEnv(bindImpl: EnvImpl): Env
}