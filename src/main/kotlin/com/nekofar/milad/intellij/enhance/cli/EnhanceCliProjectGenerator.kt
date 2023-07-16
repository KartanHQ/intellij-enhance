package com.nekofar.milad.intellij.enhance.cli

import com.intellij.execution.filters.Filter
import com.intellij.lang.javascript.boilerplate.NpmPackageProjectGenerator
import com.intellij.lang.javascript.boilerplate.NpxPackageDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ContentEntry
import com.intellij.openapi.vfs.VirtualFile
import com.nekofar.milad.intellij.enhance.EnhanceBundle.message
import com.nekofar.milad.intellij.enhance.EnhanceIcons

class EnhanceCliProjectGenerator : NpmPackageProjectGenerator() {
    private val packageName = "@enhance/create"
    private val npxCommand = "enhance-create"

    override fun getName() = message("enhance.project.generator.name")

    override fun getDescription() = message("enhance.project.generator.description")

    override fun filters(project: Project, baseDir: VirtualFile) = emptyArray<Filter>()

    override fun customizeModule(virtualFile: VirtualFile, contentEntry: ContentEntry?) {}

    override fun packageName() = packageName

    override fun presentablePackageName() = message("enhance.project.generator.presentable.package.name")

    override fun getNpxCommands() = listOf(NpxPackageDescriptor.NpxCommand(packageName, npxCommand))

    override fun generateInTemp() = true

    override fun generatorArgs(project: Project, baseDir: VirtualFile) = arrayOf(project.name)

    override fun getIcon() = EnhanceIcons.ProjectGenerator
}
