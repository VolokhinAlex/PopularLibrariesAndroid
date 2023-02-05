package com.volokhinaleksey.popularlibrariesandroid.ui.screens.user

import com.volokhinaleksey.popularlibrariesandroid.model.GithubUserDTO
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

@AddToEndSingle
interface UserView : MvpView {
    fun init()
    fun updateList()
    fun setUserData(githubUser: GithubUserDTO)
}