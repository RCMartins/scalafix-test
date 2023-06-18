package fix

import scalafix.v1._
import scala.meta._

class Scalafixtest extends SemanticRule("Scalafixtest") {

  override def fix(implicit doc: SemanticDocument): Patch =
    Patch.fromIterable(
      doc.tree.collect {
        case tree @ (term @ Term.ApplyInfix(Term.If(_, _, _), _, _, _)) =>
          println(s"structure: ${tree.structure}")
          println(s"syntax: ${tree.syntax}")
          Patch.replaceTree(term, "65")
      }
    )

}
