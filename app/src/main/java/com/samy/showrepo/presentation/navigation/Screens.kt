package com.samy.showrepo.presentation.navigation

const val REPO_DETAILS_SCREEN = "repo_details_screen"
const val ISSUE_SCREEN = "issue_screen"
const val OWNER_ARGUMENT_KEY = "owner_key"
const val NAME_ARGUMENT_KEY = "name_key"
sealed class Screens(val route: String) {
    data object RepoListScreen: Screens("repo_list_screen")
    data object RepoDetailsScreen: Screens("$REPO_DETAILS_SCREEN/{$OWNER_ARGUMENT_KEY}/{$NAME_ARGUMENT_KEY}"){
        fun passOwnerAndName(owner:String, name:String):String{
            return "$REPO_DETAILS_SCREEN/$owner/$name"
        }
    }
    data object IssueScreen: Screens(ISSUE_SCREEN)
}