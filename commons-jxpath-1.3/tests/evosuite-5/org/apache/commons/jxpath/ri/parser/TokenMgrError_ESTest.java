
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
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 2604, (-1), (-1), "iQCH^U*_gY>j4'H)-C}", '~', 2604);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      int int0 = tokenMgrError0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 0, 0, 115, "", 'P', 187);
      int int0 = tokenMgrError0.getPosition();
      assertEquals('P', tokenMgrError0.getCharacter());
      assertEquals(114, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 10, 10, (-809), "", 'N', 0);
      String string0 = tokenMgrError0.getMessage();
      assertEquals("Lexical error at line 10, column -809.  Encountered: \"N\" (78), after : \"\"", string0);
      assertEquals('N', tokenMgrError0.getCharacter());
      assertEquals((-810), tokenMgrError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("", 1);
      String string0 = tokenMgrError0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, (-515), (-515), (-1), ", column ", '4', 83);
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('4', char0);
      assertEquals((-2), tokenMgrError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 10, 10, (-809), "", 'N', 0);
      char char0 = tokenMgrError0.getCharacter();
      assertEquals((-810), tokenMgrError0.getPosition());
      assertEquals('N', char0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        TokenMgrError.LexicalError(true, 0, 0, (-570), (String) null, '~');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TokenMgrError tokenMgrError0 = null;
      try {
        tokenMgrError0 = new TokenMgrError(true, 173, 173, 173, (String) null, '=', 173);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("j$:p%#+}VY9O");
      assertEquals("j$:p%#+}VY9O\\u007f", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("Lexical error at line 0, column 1626.  Encountered: <EOF> after : \"\"");
      assertEquals("Lexical error at line 0, column 1626.  Encountered: <EOF> after : \\\"\\\"", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(true, (-1632), 'T', 'T', "=q 8(:Y]J _@6bR}", 'T');
      assertEquals("Lexical error at line 84, column 84.  Encountered: <EOF> after : \"=q 8(:Y]J _@\\u007f6bR}\"", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 16, 16, 16, "{X[>|?iW,", '\u0011');
      assertEquals("Lexical error at line 16, column 16.  Encountered: \"\\u0011\" (17), after : \"{X[>|?iW,\"", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("b>d03'R*1)sAuCk");
      assertEquals("b>d03\\'R*1)sAuCk", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, '\r', '\r', '\r', "l", '\r');
      assertEquals("Lexical error at line 13, column 13.  Encountered: \"\\r\" (13), after : \"l\"", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 20, 20, 20, "{X[>|?iW,", '\f');
      assertEquals("Lexical error at line 20, column 20.  Encountered: \"\\f\" (12), after : \"{X[>|?iW,\"", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, '\n', '\n', '\n', "7", '\n');
      assertEquals("Lexical error at line 10, column 10.  Encountered: \"\\n\" (10), after : \"7\"", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, '\t', '\t', '\t', "", '\t');
      assertEquals("Lexical error at line 9, column 9.  Encountered: \"\\t\" (9), after : \"\"", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 10, 10, 10, "nA\"B7NA={2?", '\b');
      assertEquals("Lexical error at line 10, column 10.  Encountered: \"\\b\" (8), after : \"nA\\\"B7NA={2?\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, '\u0000', '\u0000', '\u0000', "aSGe^Tv>4L:]6E[EZ3", '\u0000');
      assertEquals("Lexical error at line 0, column 0.  Encountered: \"\" (0), after : \"aSGe^Tv>4L:]6E[EZ3\"", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      String string0 = tokenMgrError0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 10, 10, (-809), "", 'N', 0);
      int int0 = tokenMgrError0.getPosition();
      assertEquals((-810), int0);
      assertEquals('N', tokenMgrError0.getCharacter());
  }
}
