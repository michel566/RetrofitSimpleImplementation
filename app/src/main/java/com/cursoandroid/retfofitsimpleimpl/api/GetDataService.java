package com.cursoandroid.retfofitsimpleimpl.api;

import com.cursoandroid.retfofitsimpleimpl.domain.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();

}
