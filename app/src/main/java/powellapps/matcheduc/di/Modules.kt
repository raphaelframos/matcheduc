package powellapps.matcheduc.di

import android.content.Context
import android.content.Context.*
import android.content.SharedPreferences
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import powellapps.matcheduc.StartActivity
import powellapps.matcheduc.repository.StudentRepository
import powellapps.matcheduc.service.StudentServiceImpl
import powellapps.matcheduc.ui.students.StudentsViewModel

val applicationModule = module(override = true) {

    viewModel { StudentsViewModel(get()) }

    single { StudentServiceImpl(get()) }
    single { StudentRepository() }

}