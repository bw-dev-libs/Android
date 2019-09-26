package retrofit

import model.User
import retrofit2.Call
import retrofit2.http.GET

interface BackendAPI {
    @GET("/users")
    fun getUsers(): Call<List<User>>
}