/*
rule = Scalafixtest
*/
package fix

import scala.language.postfixOps

object Scalafixtest {
  def hexChar(ch: Int): Char =
    (if (ch < 10) '0' else 'A' - 10) + ch toChar
}
