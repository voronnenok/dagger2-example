package net.pawelhajduk.daggerdemo.api;

import net.pawelhajduk.daggerdemo.api.model.Repository;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;
import rx.Observable;

public interface GitHubService {
    @GET("/users/{user}/repos")
    @Headers("User-Agent: DaggerDemo")
    Observable<List<Repository>> listRepos(@Path("user") String user);
}
