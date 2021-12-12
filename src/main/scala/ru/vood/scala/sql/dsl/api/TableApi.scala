package ru.vood.scala.sql.dsl.api

class TableApi {

/*  sealed trait ColumnApi[T]{
    val typ: T
    def NOT_NULL(): ColumnApi[T] = ???
  }*/

//  def varchar2(length: Int):ColumnApi[ru.vood.scala.sql.dsl.api.STRING]= ColumnApi(length, STRING)

  def varchar2(length: Int) = STRING(length)

}


class T extends TableApi{

  val  s1 = varchar2(25) NOT_NULL()
}