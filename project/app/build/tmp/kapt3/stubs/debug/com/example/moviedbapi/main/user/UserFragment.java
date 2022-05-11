package com.example.moviedbapi.main.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dJ\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\"\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J&\u0010,\u001a\u0004\u0018\u00010\u001b2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J-\u00103\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(2\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d052\u0006\u00106\u001a\u000207H\u0016\u00a2\u0006\u0002\u00108J\u001a\u00109\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010:\u001a\u00020\u0019H\u0002J\b\u0010;\u001a\u00020\u0019H\u0002J\u000e\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020>J\u0016\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020BJ\b\u0010C\u001a\u00020\u0019H\u0014J\b\u0010D\u001a\u00020\u0019H\u0002J\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u001d0Fj\b\u0012\u0004\u0012\u00020\u001d`GR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006H"}, d2 = {"Lcom/example/moviedbapi/main/user/UserFragment;", "Lcom/example/moviedbapi/base/ParentFragment;", "()V", "buttonCamera", "Landroid/widget/Button;", "buttonGallery", "ivAvatar", "Landroid/widget/ImageView;", "logout", "map", "progressBar", "Landroid/widget/ProgressBar;", "selectedPhotoFile", "Ljava/io/File;", "showText", "Landroid/widget/TextView;", "tvName", "tvUsername", "viewModel", "Lcom/example/moviedbapi/main/user/UserViewModel;", "getViewModel", "()Lcom/example/moviedbapi/main/user/UserViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindViews", "", "view", "Landroid/view/View;", "generateAvaName", "", "getAvaFromStorage", "Landroid/net/Uri;", "nameOfAva", "getPermissionForGallery", "getPermissions", "getPermissionsForCamera", "imageChooserDialog", "oldAvatarChooser", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "openCamera", "openGallery", "saveImageToStorage", "btmp", "Landroid/graphics/Bitmap;", "saveOrGetAvaName", "newAvaName", "op", "", "setData", "showDirection", "showSavedAvatars", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class UserFragment extends com.example.moviedbapi.base.ParentFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private android.widget.ProgressBar progressBar;
    private android.widget.TextView tvName;
    private android.widget.TextView tvUsername;
    private android.widget.Button logout;
    private android.widget.ImageView ivAvatar;
    private android.widget.Button buttonCamera;
    private android.widget.Button buttonGallery;
    private android.widget.Button map;
    private java.io.File selectedPhotoFile;
    private android.widget.TextView showText;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.moviedbapi.main.user.UserViewModel getViewModel() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getAvaFromStorage(@org.jetbrains.annotations.NotNull()
    java.lang.String nameOfAva) {
        return null;
    }
    
    @java.lang.Override()
    protected void bindViews(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void setData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> showSavedAvatars() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final void saveImageToStorage(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap btmp) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String saveOrGetAvaName(@org.jetbrains.annotations.NotNull()
    java.lang.String newAvaName, @org.jetbrains.annotations.NotNull()
    java.lang.Number op) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generateAvaName() {
        return null;
    }
    
    private final void openCamera() {
    }
    
    private final void openGallery() {
    }
    
    private final void getPermissions() {
    }
    
    private final void getPermissionsForCamera() {
    }
    
    private final void showDirection() {
    }
    
    private final void getPermissionForGallery() {
    }
    
    private final void imageChooserDialog() {
    }
    
    private final void oldAvatarChooser() {
    }
    
    public UserFragment() {
        super();
    }
}