/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003, LAMP/EPFL                  **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
** $Id$
\*                                                                      */

package scala.collection.mutable;


/** Classes that implement the <code>Scriptable</code> trait allow
 *  messages to be sent to objects of that class.
 *
 *  @author  Matthias Zenger
 *  @version 1.0, 09/05/2004
 */
trait Scriptable[A] {

    /** Send a message to this scriptable object.
     */
    def <<(cmd: A): Unit;
}
