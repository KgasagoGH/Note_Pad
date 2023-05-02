package main.java.todonotes.Interface

import io.realm.Realm
import main.java.todonotes.Model.Todo

interface TodoInterface {

    fun addTodo(realm: Realm, todo: Todo):Boolean
    fun deleteTodo(realm: Realm,id: Int):Boolean
    fun updateTodo(realm: Realm, todo: Todo):Boolean


}