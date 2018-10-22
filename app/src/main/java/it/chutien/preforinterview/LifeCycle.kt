package it.chutien.preforinterview

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class LifeCycle : RealmObject() {
    @PrimaryKey
    var id: String = ""
    var status: String = ""
}