
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


package org.apache.commons.compress.harmony.unpack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.unpack200.IcTuple;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IcTuple_ESTest extends IcTuple_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("!zzJabdcqtKq;a]", 1, "!zzJabdcqtKq;a]", "^FFZq(:kr>%[?>R", 1, 1, 2179, 1);
      icTuple0.C2 = "# *1\"h1^UW@z`oGG5a";
      String string0 = icTuple0.thisClassString();
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals("# *1\"h1^UW@z`oGG5a$^FFZq(:kr>%[?>R", string0);
      assertEquals(2179, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertFalse(icTuple0.isAnonymous());
      assertFalse(icTuple0.nestedExplicitFlagSet());
      assertEquals(1, icTuple0.outerClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", (String) null, 0, 0, 0, 0);
      assertEquals(0, icTuple0.getF());
      
      icTuple0.F = 1;
      int int0 = icTuple0.thisClassIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("!zzJabdcqtKq;a]", 1, "!zzJabdcqtKq;a]", "^FFZq(:kr>%[?>R", 1, 1, 2179, 1);
      icTuple0.C2 = "# *1\"h1^UW@z`oGG5a";
      String string0 = icTuple0.toString();
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals("IcTuple (^FFZq(:kr>%[?>R in !zzJabdcqtKq;a])", string0);
      assertEquals(1, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isAnonymous());
      assertFalse(icTuple0.isMember());
      assertEquals(2179, icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", 3092, (-1953), 0, 2520);
      int int0 = icTuple0.outerClassIndex();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), int0);
      assertEquals(0, icTuple0.getF());
      assertFalse(icTuple0.predicted());
      assertEquals(2520, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2251), "", "BA'-N", (-2251), (-2251), (-2251), 3872);
      icTuple0.hashCode();
      assertTrue(icTuple0.isMember());
      assertEquals("BA'-N", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-2251), icTuple0.getF());
      assertEquals(3872, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", "", 2383, 2383, 0, 1);
      icTuple0.C2 = "";
      boolean boolean0 = icTuple0.equals(icTuple0);
      assertEquals(1, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.getF());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", "", 2383, 2383, 0, 1);
      icTuple0.N = "o~8f`}+e!Rtg=k";
      boolean boolean0 = icTuple0.equals(icTuple0);
      assertTrue(boolean0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.predicted());
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("_-crRcRJwy<~&u", 2481, "", (String) null, 901, 2481, 0, 0);
      icTuple0.C = null;
      String string0 = icTuple0.thisClassString();
      assertNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(901, icTuple0.thisClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(2481, icTuple0.getF());
      assertEquals("", icTuple0.outerClassString());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", (String) null, 0, 0, 0, 0);
      String string0 = icTuple0.thisClassString();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("", string0);
      assertNotNull(string0);
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("$(]VW)QGHZ7;R\"xBc", 1, "$(]VW)QGHZ7;R\"xBc", "4", 1, 0, 0, 0);
      int int0 = icTuple0.simpleClassNameIndex();
      assertTrue(icTuple0.isAnonymous());
      assertEquals(0, int0);
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(1, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 1, " in ", " in ", 1, 1, 1, 1);
      int int0 = icTuple0.simpleClassNameIndex();
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(1, icTuple0.outerClassIndex());
      assertEquals(1, int0);
      assertFalse(icTuple0.isAnonymous());
      assertEquals(1, icTuple0.getF());
      assertFalse(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 309, (String) null, (String) null, (-3687), 0, 1932, 0);
      String string0 = icTuple0.simpleClassName();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-3687), icTuple0.thisClassIndex());
      assertEquals(309, icTuple0.getF());
      assertNull(string0);
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 210, "Should have an outer before checking if it's anonymous", "", 1556, 89, 89, 312);
      String string0 = icTuple0.simpleClassName();
      assertEquals(312, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals("Should have an outer before checking if it's anonymous", icTuple0.outerClassString());
      assertNotNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("", string0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(210, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("!zzJabdcqtKq;a]", 1, "!zzJabdcqtKq;a]", "^FFZq(:kr>%[?>R", 1, 1, 2179, 1);
      boolean boolean0 = icTuple0.outerIsAnonymous();
      assertTrue(boolean0);
      assertEquals(2179, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(1, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(1, icTuple0.getF());
      assertEquals(1, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 309, (String) null, (String) null, (-3687), 0, 1932, 0);
      String string0 = icTuple0.outerClassString();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-3687), icTuple0.thisClassIndex());
      assertEquals(309, icTuple0.getF());
      assertNull(string0);
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2251), "", "BA'-N", (-2251), (-2251), (-2251), 3872);
      String string0 = icTuple0.outerClassString();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertNotNull(string0);
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(3872, icTuple0.getTupleIndex());
      assertEquals((-2251), icTuple0.getF());
      assertEquals("BA'-N", icTuple0.simpleClassName());
      assertEquals("", string0);
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("7!((ajRWg\"bN*qDWb", 0, "7!((ajRWg\"bN*qDWb", "7!((ajRWg\"bN*qDWb", 0, 0, 0, (-1690));
      int int0 = icTuple0.outerClassIndex();
      assertEquals((-1690), icTuple0.getTupleIndex());
      assertEquals(0, int0);
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isAnonymous());
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertTrue(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 1, " in ", " in ", 1, 1, 1, 1);
      boolean boolean0 = icTuple0.isMember();
      assertFalse(icTuple0.isAnonymous());
      assertEquals(1, icTuple0.getF());
      assertEquals(1, icTuple0.outerClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
      assertFalse(boolean0);
      assertEquals(1, icTuple0.simpleClassNameIndex());
      assertEquals(1, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", "", 2383, 2383, 0, 1);
      icTuple0.innerBreakAtDollar("");
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.getF());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", 0, 0, 0, 0);
      int int0 = icTuple0.getTupleIndex();
      assertEquals(0, int0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 407, (String) null, "", (-1), (-3785), 1571, (-1));
      int int0 = icTuple0.getTupleIndex();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(icTuple0.predicted());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), int0);
      assertEquals(407, icTuple0.getF());
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "M#'yG%SbB:C", 2117, 2058, 0, 248);
      icTuple0.N = null;
      String string0 = icTuple0.getN();
      assertTrue(icTuple0.isMember());
      assertNull(string0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("M#'yG%SbB:C", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(icTuple0.predicted());
      assertEquals(0, icTuple0.getF());
      assertEquals("", icTuple0.outerClassString());
      assertEquals(248, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("!zzJabdcqtKq;a]", 1, "!zzJabdcqtKq;a]", "^FFZq(:kr>%[?>R", 1, 1, 2179, 1);
      String string0 = icTuple0.getN();
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals(1, icTuple0.getF());
      assertEquals(1, icTuple0.outerClassIndex());
      assertEquals(2179, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertEquals("^FFZq(:kr>%[?>R", string0);
      assertFalse(icTuple0.isAnonymous());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", 0, 0, 0, 40);
      int int0 = icTuple0.getF();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals(40, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, int0);
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", "", 2383, 2383, 0, 1);
      int int0 = icTuple0.getF();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 309, (String) null, (String) null, (-3687), 0, 1932, 0);
      String string0 = icTuple0.getC2();
      assertNull(string0);
      assertEquals(309, icTuple0.getF());
      assertEquals((-3687), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2251), "", "BA'-N", (-2251), (-2251), (-2251), 3872);
      String string0 = icTuple0.getC2();
      assertEquals("", string0);
      assertTrue(icTuple0.isMember());
      assertEquals("BA'-N", icTuple0.simpleClassName());
      assertEquals((-2251), icTuple0.getF());
      assertEquals(3872, icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
      assertEquals("", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("_-crRcRJwy<~&u", 2481, "", (String) null, 901, 2481, 0, 0);
      icTuple0.C = null;
      String string0 = icTuple0.getC();
      assertEquals("", icTuple0.outerClassString());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(2481, icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(901, icTuple0.thisClassIndex());
      assertNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("!zzJabdcqtKq;a]", 1, "!zzJabdcqtKq;a]", "^FFZq(:kr>%[?>R", 1, 1, 2179, 1);
      icTuple0.C = "";
      icTuple0.getC();
      assertEquals("", icTuple0.getC());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 4280, "", (String) null, 4280, 4280, 4280, 4280);
      // Undeclared exception!
      try { 
        icTuple0.innerBreakAtDollar((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple((String) null, 0, "", "", 0, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 407, (String) null, "", (-1), (-3785), 1571, (-1));
      boolean boolean0 = icTuple0.predicted();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(boolean0);
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals(407, icTuple0.getF());
      assertEquals((-1), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("!zzJabdcqtKq;a]", 1, "!zzJabdcqtKq;a]", "^FFZq(:kr>%[?>R", 1, 1, 2179, 1);
      boolean boolean0 = icTuple0.predicted();
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(1, icTuple0.outerClassIndex());
      assertFalse(boolean0);
      assertEquals(1, icTuple0.getF());
      assertEquals(1, icTuple0.getTupleIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(2179, icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", (String) null, 0, 0, 0, 0);
      boolean boolean0 = icTuple0.predicted();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.thisClassIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("jZ)?!n:%;aa$a&eZI", (-3299), "sb", "y#t!]", 4452, 4452, (-747), (-3299));
      icTuple0.nullSafeEquals("", "IcTuple ");
      assertEquals((-3299), icTuple0.getF());
      assertEquals((-3299), icTuple0.getTupleIndex());
      assertEquals((-747), icTuple0.simpleClassNameIndex());
      assertEquals(4452, icTuple0.outerClassIndex());
      assertEquals("sb", icTuple0.outerClassString());
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 1, " in ", " in ", 1, 1, 1, 1);
      boolean boolean0 = icTuple0.nestedExplicitFlagSet();
      assertEquals(1, icTuple0.simpleClassNameIndex());
      assertEquals(1, icTuple0.getF());
      assertFalse(icTuple0.isAnonymous());
      assertFalse(icTuple0.isMember());
      assertTrue(icTuple0.outerIsAnonymous());
      assertFalse(boolean0);
      assertEquals(1, icTuple0.outerClassIndex());
      assertEquals(1, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("jZ)?!n:%;aa$a&eZI", (-3299), "sb", "y#t!]", 4452, 4452, (-747), (-3299));
      boolean boolean0 = icTuple0.nestedExplicitFlagSet();
      assertTrue(boolean0);
      assertEquals((-3299), icTuple0.getTupleIndex());
      assertEquals((-747), icTuple0.simpleClassNameIndex());
      assertEquals(4452, icTuple0.outerClassIndex());
      assertFalse(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("$(]VW)QGHZ7;R\"xBc", 1, "$(]VW)QGHZ7;R\"xBc", "4", 1, 0, 0, 0);
      boolean boolean0 = icTuple0.isAnonymous();
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertTrue(boolean0);
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(1, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 309, (String) null, (String) null, (-3687), 0, 1932, 0);
      String[] stringArray0 = icTuple0.innerBreakAtDollar("IcTuple (null in null)");
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(4, stringArray0.length);
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(309, icTuple0.getF());
      assertEquals((-3687), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("|4vFNG!IWa7(", 40, (String) null, (String) null, 40, 40, 40, 40);
      String string0 = icTuple0.simpleClassName();
      assertEquals("IWa7(", string0);
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("|4vFNG", icTuple0.outerClassString());
      assertNotNull(string0);
      assertEquals(40, icTuple0.thisClassIndex());
      assertEquals(40, icTuple0.getTupleIndex());
      assertEquals(40, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 1, " in ", " in ", 1, 1, 1, 1);
      icTuple0.outerClassString();
      assertTrue(icTuple0.outerIsAnonymous());
      assertFalse(icTuple0.isMember());
      assertEquals(1, icTuple0.getF());
      assertEquals(1, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(1, icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("S", 2, "S", "S", (-915), 2, 2, 2);
      int int0 = icTuple0.thisClassIndex();
      assertEquals(2, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), int0);
      assertEquals(2, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 97, "", (String) null, 97, 97, 97, 97);
      int int0 = icTuple0.thisClassIndex();
      assertEquals(97, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(97, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 2290, "", "", 2290, 2290, 2290, 2290);
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, "{.,hxW1.#u:ASTlCn2H");
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(boolean0);
      assertEquals(2290, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals(2290, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("F_nm8+b>&!:X*1nMM{", (-3217), "F_nm8+b>&!:X*1nMM{", "F_nm8+b>&!:X*1nMM{", (-3217), (-3217), (-3217), (-3217));
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, (String) null);
      assertEquals((-3217), icTuple0.getF());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-3217), icTuple0.getTupleIndex());
      assertTrue(boolean0);
      assertEquals((-3217), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("S", 2, "S", "S", (-915), 2, 2, 2);
      icTuple0.hashCode();
      icTuple0.hashCode();
      assertEquals(2, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(2, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("S", 2, "S", "S", (-915), 2, 2, 2);
      icTuple0.C = "S";
      icTuple0.C = null;
      icTuple0.hashCode();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(2, icTuple0.getTupleIndex());
      assertEquals(2, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 2293, "", "", 2293, 2293, 2293, 2293);
      IcTuple icTuple1 = new IcTuple("", 2293, "", "pGw_Z", 2293, 65536, 2293, 65536);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertEquals("", icTuple1.outerClassString());
      assertFalse(boolean0);
      assertEquals(2293, icTuple1.getF());
      assertEquals((-1), icTuple1.outerClassIndex());
      assertFalse(icTuple1.equals((Object)icTuple0));
      assertTrue(icTuple1.isMember());
      assertEquals(65536, icTuple1.getTupleIndex());
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertEquals("pGw_Z", icTuple1.simpleClassName());
      assertEquals(2293, icTuple0.getTupleIndex());
      assertFalse(icTuple1.predicted());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 13, "", "", 13, 13, 13, 13);
      IcTuple icTuple1 = new IcTuple("", 13, (String) null, "", 13, 65536, 65536, (-32));
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertEquals((-32), icTuple1.getTupleIndex());
      assertEquals(13, icTuple1.thisClassIndex());
      assertFalse(icTuple1.equals((Object)icTuple0));
      assertEquals((-1), icTuple1.outerClassIndex());
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertEquals(13, icTuple1.getF());
      assertFalse(boolean0);
      assertTrue(icTuple1.isMember());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 1, " in ", " in ", 1, 1, 1, 1);
      IcTuple icTuple1 = new IcTuple(" in $ in ", (-15), "-R?C^I6}xkr(>0", " in $ in ", 0, 0, 1, 65536);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertFalse(boolean0);
      assertEquals(0, icTuple1.outerClassIndex());
      assertEquals(65536, icTuple1.getTupleIndex());
      assertFalse(icTuple1.isMember());
      assertEquals((-15), icTuple1.getF());
      assertEquals(1, icTuple1.simpleClassNameIndex());
      assertFalse(icTuple1.outerIsAnonymous());
      assertTrue(icTuple0.outerIsAnonymous());
      assertFalse(icTuple0.isMember());
      assertEquals(1, icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 1, " in ", " in ", 1, 1, 1, 1);
      icTuple0.equals(" in $ in ");
      assertEquals(1, icTuple0.simpleClassNameIndex());
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals(1, icTuple0.outerClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(1, icTuple0.getF());
      assertFalse(icTuple0.isAnonymous());
      assertFalse(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("S", 2, "S", "S", (-915), 2, 2, 2);
      boolean boolean0 = icTuple0.equals((Object) null);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(2, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(2, icTuple0.getTupleIndex());
      assertFalse(boolean0);
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple("YzAH B+J~w", 0, "", "", 0, 0, (-1), 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Should have an outer before checking if it's anonymous
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.IcTuple", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("|4vFNG!IWa7(", 40, (String) null, (String) null, 40, 40, 40, 40);
      icTuple0.hashCode();
      assertEquals(40, icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals("|4vFNG", icTuple0.outerClassString());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals("IWa7(", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(40, icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("S", 2, "S", "S", (-915), 2, 2, 2);
      icTuple0.isMember();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(2, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(2, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 1, " in ", " in ", 1, 1, 1, 1);
      int int0 = icTuple0.outerClassIndex();
      assertEquals(1, icTuple0.getTupleIndex());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(1, int0);
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(1, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(1, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("S", 2, "S", "S", (-915), 2, 2, 2);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals(2, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(2, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(":ug<RPI.8IVvud 90*", (-1), ":ug<RPI.8IVvud 90*", "", (-1), (-1), (-1), (-1));
      icTuple0.getC2();
      assertEquals(":ug<RPI.8IVvud 90*", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(icTuple0.isAnonymous());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 2290, "", "", 2290, 2290, 2290, 2290);
      int int0 = icTuple0.getF();
      assertEquals(2290, icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(2290, int0);
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 2290, "", "", 2290, 2290, 2290, 2290);
      icTuple0.outerIsAnonymous();
      assertEquals((-1), icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(2290, icTuple0.getTupleIndex());
      assertEquals(2290, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 2290, "", "", 2290, 2290, 2290, 2290);
      String string0 = icTuple0.getN();
      assertTrue(icTuple0.isMember());
      assertEquals(2290, icTuple0.getTupleIndex());
      assertEquals(2290, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertNotNull(string0);
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("S", 2, "S", "S", (-915), 2, 2, 2);
      icTuple0.isAnonymous();
      assertEquals(2, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(2, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 1, " in ", " in ", 1, 1, 1, 1);
      icTuple0.getTupleIndex();
      assertEquals(1, icTuple0.simpleClassNameIndex());
      assertEquals(1, icTuple0.getF());
      assertFalse(icTuple0.isAnonymous());
      assertFalse(icTuple0.isMember());
      assertEquals(1, icTuple0.outerClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(":ug<RPI.8IVvud 90*", (-1), ":ug<RPI.8IVvud 90*", "", (-1), (-1), (-1), (-1));
      icTuple0.getC();
      assertTrue(icTuple0.isAnonymous());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.getF());
      assertTrue(icTuple0.isMember());
  }
}
