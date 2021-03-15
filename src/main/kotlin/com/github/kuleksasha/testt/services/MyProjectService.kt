package com.github.kuleksasha.testt.services

import com.github.kuleksasha.testt.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
