package kuplrg

import Implementation.*

class Spec extends SpecBase {
  test(volumeOfCuboid(1, 3, 5), 15)
  test(volumeOfCuboid(2, 3, 4), 24)

  test(concat("x", "y"), "xy")
  test(concat("abc", "def"), "abcdef")

  test(addN(5)(3), 8)
  test(addN(5)(42), 47)

  test(twice(addN(3))(2), 8)
  test(twice(addN(3))(7), 13)

  test(compose(addN(3), addN(4))(5), 12)
  test(compose(addN(3), addN(4))(11), 18)

  test(double(List(1, 2, 3)), List(2, 4, 6))
  test(double(double(List(1, 2, 3, 4, 5))), List(4, 8, 12, 16, 20))

  test(sum(List(1, 2, 3)), 6)
  test(sum(List(4, 2, 3, 7, 5)), 21)

  val m: Map[String, Int] = Map("Park" -> 42, "COSE215" -> 37)

  test(getKey(m, "Park"), 42)
  test(getKey(m, "COSE215"), 37)
  testExc(getKey(m, "Kim"), "Kim")
  testExc(getKey(m, "COSE999"), "COSE999")

  val t1: Tree = Branch(Leaf(1), 2, Leaf(3))
  val t2: Tree = Branch(Leaf(1), 2, Branch(Leaf(3), 4, Leaf(5)))

  test(countLeaves(t1), 2)
  test(countLeaves(t2), 3)

  test(flatten(t1), List(1, 2, 3))
  test(flatten(t2), List(1, 2, 3, 4, 5))

  /* Write your own tests */
}
