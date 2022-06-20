package com.github.huangxumin.newtemplate.services

import com.intellij.openapi.project.Project
import com.github.huangxumin.newtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
