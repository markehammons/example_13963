import scala.quoted.*

case class PrimitiveInfo(name: String, typ: Type[?])

case class StructStub(name: String, typ: Type[?])

val members: List[PrimitiveInfo | StructStub] = ???

given Quotes = ???


@main def hello: Unit = 
  members.map{
    case PrimitiveInfo(name, '[a]) => ???
    case StructStub(name, '[a]) => ???
  }

def msg = "I was compiled by Scala 3. :)"
