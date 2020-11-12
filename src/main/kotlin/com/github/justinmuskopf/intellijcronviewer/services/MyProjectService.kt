package com.github.justinmuskopf.intellijcronviewer.services

import com.intellij.openapi.project.Project
import com.github.justinmuskopf.intellijcronviewer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
