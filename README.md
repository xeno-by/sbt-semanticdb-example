Minimal template to play with semanticdb
========================================

To use this project
```
$ git clone https://github.com/xeno-by/sbt-semanticdb-example
$ cd sbt-semanticdb-example
$ sbt app/run
```

That should print out something like this
```
library/src/main/scala/Test.scala
---------------------------------
Dialect:
Scala212

Names:
[7..11): Test => _empty_.Test.
[20..29): printList => _empty_.Test.printList()V.
[33..37): Unit => _root_.scala.Unit#
[46..53): println => _root_.scala.Predef.println(Ljava/lang/Object;)V.
[54..58): List => _root_.scala.collection.immutable.List.

Denotations:
_empty_.Test. => final object Test
_empty_.Test.printList()V. => def printList: ()Unit
_root_.scala.Predef.println(Ljava/lang/Object;)V. => def println: (x: Any)Unit
_root_.scala.Unit# => abstract final class Unit
_root_.scala.Unit#`<init>`()V. => primaryctor <init>: ()Unit
_root_.scala.collection.immutable.List. => final object List

Sugars:
[58..58): *.apply[Int]
  [0..1): * => _star_.
  [2..7): apply => _root_.scala.collection.immutable.List.apply(Lscala/collection/Seq;)Lscala/collection/immutable/List;.
```
