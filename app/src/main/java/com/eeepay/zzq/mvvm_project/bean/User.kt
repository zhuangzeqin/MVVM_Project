package com.eeepay.zzq.mvvm_project.bean

import java.io.Serializable

/**
 * 描述：：kotlin data class 登录用户的信息数据类
 * 作者：zhuangzeqin
 * 时间: 2020/12/11-15:46
 * 邮箱：zzq@eeepay.cn
 * 备注:
 */
data class User(
    val admin: Boolean,
    val chapterTops: List<Any>,
    val coinCount: Int,
    val collectIds: List<Any>,
    val email: String,
    val icon: String,
    val id: Int,
    val nickname: String,
    val password: String,
    val publicName: String,
    val token: String,
    val type: Int,
    val username: String
):Serializable