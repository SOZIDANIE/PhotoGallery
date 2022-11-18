package com.example.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET(
        "services/rest/? method=flickr.interestingness.getList" +
                "&api_key=45bf9a2fbcffb229e72960ddca21aba1" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<String>
}
