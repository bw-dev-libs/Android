package retrofit

import model.User
import retrofit2.Call

interface BackendAPI {
    fun getUsers(): Call<List<User>>
}