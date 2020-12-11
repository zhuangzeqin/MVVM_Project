package com.eeepay.zzq.mvvm_project.api

import java.io.Serializable

/**
 * 描述：kotlin泛型 基础的泛型类
 * 作者：zhuangzeqin
 * 时间: 2020/12/11-15:39
 * 邮箱：zzq@eeepay.cn
 * 备注:
 * {
"data": {
"admin": false,
"chapterTops": [],
"coinCount": 0,
"collectIds": [],
"email": "",
"icon": "",
"id": 71064,
"nickname": "chaozhouzhang",
"password": "",
"publicName": "chaozhouzhang",
"token": "",
"type": 0,
"username": "chaozhouzhang"
},
"errorCode": 0,
"errorMsg": ""
}
 */
data class BaseResponse<T>(
    val data: T? = null,
    val errorCode: Int = 0,
    val errorMsg: String? = null
) : Serializable

