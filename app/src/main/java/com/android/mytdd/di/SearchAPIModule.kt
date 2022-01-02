package com.android.mytdd.di

import com.jakewharton.espresso.OkHttp3IdlingResource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val client = OkHttpClient()
val idlingResource = OkHttp3IdlingResource.create("okHttp", client)

@InstallIn(FragmentComponent::class)
@Module
class SearchAPIModule {

    @Provides
    fun searchAPI(retrofit: Retrofit): SearchAPI {
        return retrofit.create(SearchAPI::class.java)
    }

    @Provides
    fun retrofit() = Retrofit.Builder()
        .baseUrl("https://openapi.naver.com/v1/search/blog.json")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}