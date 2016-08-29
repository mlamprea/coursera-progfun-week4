import patmat.Huffman.{Leaf, _}

val sampleTree = makeCodeTree(
  makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
  Leaf('t', 2)
)

times(string2Chars("Learn Functional Progamming is fun :)"))
val list = times(string2Chars("amadeus"))


def sort(ls: List[(Char,Int)]): List[(Char,Int)] = {
  ls match {
    case Nil => Nil
    case pivot :: tail => {
      val (less, greater) = tail.partition(_._2 < pivot._2)
      sort(less) ::: pivot :: sort(greater)
    }
  }
}
val ls = 1::(3::(90::(2::(125::(Nil)))))
sort(list)

val singletonList  = 1::Nil
val noSingletonList = 1::(2::Nil)
def singleton(l:List[Int]):Boolean = {
  l.tail.isEmpty
}
singleton(singletonList)
singleton(noSingletonList)


decodedSecret
