/*
 * jja@sinequanon.net in proxy for jja@ucar.edu
 * http://github.com/jja/groovy-jja-extensions
 */

package net.sinequanon.groovy.extensions

class StringExtensionMethods {

  static String excerpt(String self, Integer length=255) {
    if (null == length) length=255
    if (length < 0) return null
    if (self.length() <= length) return self
    if (length <= 3) return self.substring(0,length)
    def i
    for (i=length-3; i>0 && Character.isLetter(self.codePointAt(i)); i--) ;
    if (i==0) i=length-3;
    return self.substring(0,i) + '...'
  }

  static String chop(String self) {
    try { return self.substring(0,self.length()-1) }
    catch (IndexOutOfBoundsException) { return '' }
  }

  static String append(String self, String s, Integer n=1) {
    if (n<=0) return self
    if (!s?.length()) return self
    return self + s * n
  }

  static boolean isBlank(String self) {
    return self.trim().length() == 0
  }

  static boolean isNotBlank(String self) {
    return self.trim().length() > 0
  }

}
