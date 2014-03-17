/*
 * Copyright 2014 jja@sinequanon.net
 * see LICENSE.txt
 *
 * jja@sinequanon.net in proxy for jja@ucar.edu
 * http://github.com/jja/groovy-jja-extensions
 */

package net.sinequanon.groovy.extensions

class StringChopTests extends GroovyTestCase {

    void testChopSimple() {
        String given = "abc"
        String expected = "ab"
        assertEquals expected, given.chop()
    }

    void testChopEmpty() {
        String empty = ""
        assertEquals empty, empty.chop()
    }

    void testChopShortString() {
        String given = "a"
        String empty = ""
        assertEquals empty, given.chop()
    }

}
