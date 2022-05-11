package com.example.moviedbapi.main.popularMovie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J&\u0010\'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010/\u001a\u00020$H\u0002J\b\u00100\u001a\u00020$H\u0014J\u0018\u00101\u001a\u0012\u0012\u0004\u0012\u00020302j\b\u0012\u0004\u0012\u000203`4H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b \u0010!\u00a8\u00065"}, d2 = {"Lcom/example/moviedbapi/main/popularMovie/MoviePopularFragment;", "Lcom/example/moviedbapi/base/ParentFragment;", "()V", "currentPage", "", "isLastPage", "", "isLoading", "itemCount", "moviesAdapter", "Lcom/example/moviedbapi/main/popularMovie/MovieAdapter;", "getMoviesAdapter", "()Lcom/example/moviedbapi/main/popularMovie/MovieAdapter;", "moviesAdapter$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "onClickListener", "Lcom/example/moviedbapi/main/popularMovie/MovieAdapter$ItemClickListener;", "rvMovies", "Landroidx/recyclerview/widget/RecyclerView;", "srlMovies", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "storiesAdapter", "Lcom/example/moviedbapi/main/stories/StoriesAdapter;", "storiesRecyclerView", "getStoriesRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setStoriesRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "viewModel", "Lcom/example/moviedbapi/main/popularMovie/MoviePopularViewModel;", "getViewModel", "()Lcom/example/moviedbapi/main/popularMovie/MoviePopularViewModel;", "viewModel$delegate", "bindViews", "", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setAdapter", "setData", "storyGenerator", "Ljava/util/ArrayList;", "Lcom/example/moviedbapi/data/models/Story;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class MoviePopularFragment extends com.example.moviedbapi.base.ParentFragment {
    private androidx.navigation.NavController navController;
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.recyclerview.widget.RecyclerView rvMovies;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout srlMovies;
    private com.example.moviedbapi.main.stories.StoriesAdapter storiesAdapter;
    private int currentPage;
    private boolean isLastPage;
    private boolean isLoading;
    private int itemCount;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView storiesRecyclerView;
    private final com.example.moviedbapi.main.popularMovie.MovieAdapter.ItemClickListener onClickListener = null;
    private final kotlin.Lazy moviesAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.moviedbapi.main.popularMovie.MoviePopularViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getStoriesRecyclerView() {
        return null;
    }
    
    public final void setStoriesRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    private final com.example.moviedbapi.main.popularMovie.MovieAdapter getMoviesAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void bindViews(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void setData() {
    }
    
    private final void setAdapter() {
    }
    
    private final java.util.ArrayList<com.example.moviedbapi.data.models.Story> storyGenerator() {
        return null;
    }
    
    public MoviePopularFragment() {
        super();
    }
}