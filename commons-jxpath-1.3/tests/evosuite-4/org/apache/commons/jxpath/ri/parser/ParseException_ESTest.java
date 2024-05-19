
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
import org.apache.commons.jxpath.ri.parser.ParseException;
import org.apache.commons.jxpath.ri.parser.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParseException_ESTest extends ParseException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseException parseException0 = new ParseException("( ^ q(~O@qu=SW");
      String string0 = parseException0.add_escapes("( ^ q(~O@qu=SW");
      assertEquals("( ^ q(~O@qu=SW", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Token token0 = new Token();
      int[][] intArray0 = new int[2][1];
      int[] intArray1 = new int[4];
      intArray0[0] = intArray1;
      int[] intArray2 = new int[6];
      intArray0[1] = intArray2;
      String[] stringArray0 = new String[9];
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      // Undeclared exception!
      try { 
        parseException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParseException parseException0 = new ParseException("");
      String string0 = parseException0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParseException parseException0 = new ParseException("K/C)");
      String string0 = parseException0.add_escapes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Token token0 = Token.newToken(0);
      int[][] intArray0 = new int[6][7];
      int[] intArray1 = new int[2];
      intArray1[0] = (-2017);
      intArray0[3] = intArray1;
      String[] stringArray0 = new String[1];
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      // Undeclared exception!
      try { 
        parseException0.getMessage();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2017
         //
         verifyException("org.apache.commons.jxpath.ri.parser.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Token token0 = new Token();
      int[][] intArray0 = new int[3][1];
      String[] stringArray0 = new String[9];
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      // Undeclared exception!
      try { 
        parseException0.add_escapes(stringArray0[8]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParseException parseException0 = new ParseException("g2!LKhjm");
      String string0 = parseException0.add_escapes("g2!LKhjm");
      assertEquals("g2!LKhj\\u007fm", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParseException parseException0 = new ParseException("'6pC\"/}^1TZ0X}<>");
      String string0 = parseException0.add_escapes("'6pC\"/}^1TZ0X}<>");
      assertEquals("\\'6pC\\\"/}^1TZ0X}<>", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParseException parseException0 = new ParseException("\t");
      String string0 = parseException0.add_escapes("\t");
      assertEquals("\\t", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Token token0 = new Token();
      int[][] intArray0 = new int[3][1];
      String[] stringArray0 = new String[9];
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      String string0 = parseException0.add_escapes("Encountered \"null\" at line 0, column 0.\nWas expecting one of:\n    null \n    null \n    null \n    ");
      assertEquals("Encountered \\\"null\\\" at line 0, column 0.\\nWas expecting one of:\\n    null \\n    null \\n    null \\n    ", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Token token0 = new Token();
      int[][] intArray0 = new int[3][1];
      String[] stringArray0 = new String[9];
      token0.next = token0;
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      String string0 = parseException0.getMessage();
      assertEquals("Encountered \"null\" at line 0, column 0.\nWas expecting one of:\n    null \n    null \n    null \n    ", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Token token0 = new Token();
      int[][] intArray0 = new int[1][1];
      int[] intArray1 = new int[4];
      token0.image = "";
      intArray0[0] = intArray1;
      String[] stringArray0 = new String[17];
      token0.kind = 5;
      token0.next = token0;
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      String string0 = parseException0.getMessage();
      assertEquals("Encountered \"   \" at line 0, column 0.\nWas expecting:\n    null null null null \n    ", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Token token0 = new Token();
      int[][] intArray0 = new int[1][1];
      int[] intArray1 = new int[4];
      intArray1[3] = 5;
      intArray0[0] = intArray1;
      String[] stringArray0 = new String[17];
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      // Undeclared exception!
      try { 
        parseException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParseException parseException0 = new ParseException();
      String string0 = parseException0.getMessage();
      assertNull(string0);
  }
}
