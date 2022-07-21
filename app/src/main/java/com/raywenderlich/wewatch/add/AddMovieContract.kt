package com.raywenderlich.wewatch.add

class AddMovieContract {

    interface ViewInterface {
        fun returnToMain()
        fun displayMessage(message: String)
        fun displayError(message: String)
    }

    interface PresenterInterface {
        fun addMovie(title: String, releaseDate: String, posterPath: String)
    }
}