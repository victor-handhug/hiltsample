package kr.handhug.hiltsample.env

interface Env {
    val DEBUG: Boolean
    val APPLICATION_ID: String
    val BUILD_TYPE: String
    val VERSION_CODE: Int
    val VERSION_NAME: String
    val packageNameViaPackageManager: String
}