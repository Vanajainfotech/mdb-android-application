package com.newm.di.module;

import com.newm.di.component.PerActivity;
import com.newm.loaders.MoviesLoader;
import com.newm.presenter.moviesgrid.MoviesGridPresenter;
import com.newm.presenter.moviesgrid.MoviesGridPresenterImpl;
import dagger.Module;
import dagger.Provides;

/**
 * @author james on 7/24/17.
 */
@Module
public class MoviesGridModule {

    @Provides
    @PerActivity
    public MoviesGridPresenter provideMoviesGridPresenter(MoviesLoader moviesLoader) {
        return new MoviesGridPresenterImpl(moviesLoader);
    }

}
