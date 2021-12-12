package ru.vood.scala.sql.dsl.api

sealed trait DataType[T] {
  val t: DataType[T] = this

  def NOT_NULL(): DataType[T] = ???
}

case class STRING(val length: Int) extends DataType[STRING] {

}

case class NUMBER() extends DataType[NUMBER]

case class DATE() extends DataType[NUMBER]

case class BOOLEAN() extends DataType[NUMBER]
