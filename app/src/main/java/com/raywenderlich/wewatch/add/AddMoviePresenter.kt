package com.raywenderlich.wewatch.add

import com.raywenderlich.wewatch.model.LocalDataSource
import com.raywenderlich.wewatch.model.Movie

class AddMoviePresenter(

    private var viewInterface: AddMovieContract.ViewInterface,
    private var dataSource: LocalDataSource

): AddMovieContract.PresenterInterface {

    override fun addMovie(title: String, releaseDate: String, posterPath: String) {
        if (title.isEmpty()) {
            viewInterface.displayError("Movie title cannot be empty")
        } else {
            val movie = Movie(title = title, releaseDate = releaseDate, posterPath = posterPath)
            dataSource.insert(movie)
            viewInterface.returnToMain()
        }
    }
}