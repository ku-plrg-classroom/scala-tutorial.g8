package kuplrg

import Implementation.*

class Spec extends SpecBase {
  // tests for `volumeOfCuboid`
  test(volumeOfCuboid(1, 3, 5), 15)
  test(volumeOfCuboid(2, 3, 4), 24)

  // tests for `concat`
  test(concat("x", "y"), "xy")
  test(concat("abc", "def"), "abcdef")

  // tests for `mulN`
  test(mulN(3)(5), 15)
  test(mulN(4)(5), 20)

  // tests for `twice`
  test(twice(mulN(3))(5), 45)
  test(twice(mulN(4))(5), 80)

  // tests for `compose`
  test(compose(mulN(3), mulN(4))(5), 60)
  test(compose(mulN(4), mulN(5))(5), 100)

  // tests for `double`
  test(double(List(1, 2, 3)), List(2, 4, 6))
  test(double(double(List(1, 2, 3, 4, 5))), List(4, 8, 12, 16, 20))

  // tests for `product`
  test(product(List(1, 2, 3)), 6)
  test(product(List(4, 2, 3, 7, 5)), 840)

  // tests for `getOrNotFound`
  val m: Map[String, Int] = Map("Park" -> 1, "Kim" -> 2)
  test(getOrNotFound(m, "Park"), 1)
  test(getOrNotFound(m, "Kim"), 2)
  testExc(getOrNotFound(m, "Ryu"), "Not Found")
  testExc(getOrNotFound(m, "Hong"), "Not Found")

  // tests for `depth`
  val t1: Tree = Branch(List(Leaf(1), Leaf(2), Leaf(3)))
  val t2: Tree = Branch(List(Leaf(1), Leaf(2), Branch(List(Leaf(3), Leaf(4), Leaf(5)))))
  val t3: Tree = Branch(List(Branch(List(Branch(List(Leaf(1), Leaf(2), Leaf(3)))))))

  test(depth(t1), 1)
  test(depth(t2), 2)
  test(depth(t3), 3)

  // tests for `sum`
  test(sum(t1), 6)
  test(sum(t2), 15)
  test(sum(t3), 6)

  // tests for `countLeaves`
  test(countLeaves(t1), 3)
  test(countLeaves(t2), 5)
  test(countLeaves(t3), 3)

  // tests for `flatten`
  test(flatten(t1), List(1, 2, 3))
  test(flatten(t2), List(1, 2, 3, 4, 5))
  test(flatten(t3), List(1, 2, 3))

  /* Write your own tests */
}
