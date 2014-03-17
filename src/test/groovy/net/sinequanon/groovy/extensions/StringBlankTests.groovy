/*
 * Copyright 2014 jja@sinequanon.net
 * see LICENSE.txt
 *
 * jja@sinequanon.net in proxy for jja@ucar.edu
 * http://github.com/jja/groovy-jja-extensions
 */

package net.sinequanon.groovy.extensions

class StringBlankTests extends GroovyTestCase {

    void testBlankSimple() {
        String given = "abc"
        assertFalse given.isBlank()
        assertTrue  given.isNotBlank()
    }

    void testBlankEmpty() {
        String empty = ""
        assertTrue  empty.isBlank()
        assertFalse empty.isNotBlank()
    }

    void testBlankAllWhiteSpace() {
        String given = " \t \n \f "
        assertTrue  given.isBlank()
        assertFalse given.isNotBlank()
    }

    void testBlankMixedWhiteSpace() {
        String given = " \t\n\f abc \t\n\f "
        assertFalse given.isBlank()
        assertTrue  given.isNotBlank()
    }

}
