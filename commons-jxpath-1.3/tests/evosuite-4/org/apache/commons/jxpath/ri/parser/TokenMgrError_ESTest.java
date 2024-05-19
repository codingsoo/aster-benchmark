
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.parser.TokenMgrError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TokenMgrError_ESTest extends TokenMgrError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("<EOF ");
      assertEquals("<EOF ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(true, (-1409), 0, 1416, "", 'a', (-1409));
      int int0 = tokenMgrError0.getPosition();
      assertEquals('a', tokenMgrError0.getCharacter());
      assertEquals(1415, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 0, 0, (-991), ">-KwHn", '1', 1);
      int int0 = tokenMgrError0.getPosition();
      assertEquals((-992), int0);
      assertEquals('1', tokenMgrError0.getCharacter());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(">BY+0m8QQ&j*\u0006", 1919);
      String string0 = tokenMgrError0.getMessage();
      assertEquals(">BY+0m8QQ&j*\u0006", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(true, 10, 9, (-949), "", '1', (-949));
      char char0 = tokenMgrError0.getCharacter();
      assertEquals((-950), tokenMgrError0.getPosition());
      assertEquals('1', char0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 1185, 1185, 0, "'$_DwPK<TYjW#0K7pt", 't', 2282);
      char char0 = tokenMgrError0.getCharacter();
      assertEquals((-1), tokenMgrError0.getPosition());
      assertEquals('t', char0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        TokenMgrError.addEscapes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TokenMgrError tokenMgrError0 = null;
      try {
        tokenMgrError0 = new TokenMgrError(true, 2885, 2885, (-392), (String) null, '!', (-392));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("/XqU7CvdoRjsR!P>8z");
      assertEquals("/XqU7CvdoRj\\u007fsR!P>8z", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("Fs=\u0006P2>/8L'");
      assertEquals("Fs=\\u0006P2>/8L\\'", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("Q<))p~E\".A(V'");
      assertEquals("Q<))p~E\\\".A(V\\'", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 0, 0, 0, "\r", 'S');
      assertEquals("Lexical error at line 0, column 0.  Encountered: \"S\" (83), after : \"\\r\"", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 0, 403, 0, "\f", 'x');
      assertEquals("Lexical error at line 403, column 0.  Encountered: \"x\" (120), after : \"\\f\"", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        TokenMgrError.LexicalError(false, (-1), '\u0000', '\u0000', (String) null, '\u0000');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("", 3);
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("", 3);
      String string0 = tokenMgrError0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      String string0 = tokenMgrError0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("", 3);
      int int0 = tokenMgrError0.getPosition();
      assertEquals(0, int0);
  }
}
