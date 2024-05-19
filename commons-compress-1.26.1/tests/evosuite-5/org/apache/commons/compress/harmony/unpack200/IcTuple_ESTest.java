
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
      IcTuple icTuple0 = new IcTuple("", 191, "", "", 191, 191, (-1643), (-1643));
      icTuple0.C2 = "PC3+cc}n^zX7T";
      String string0 = icTuple0.thisClassString();
      assertEquals("PC3+cc}n^zX7T$", string0);
      assertEquals(191, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1643), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" i#n ", 1235, " i#n ", (String) null, 1235, 1235, 1235, 1235);
      String string0 = icTuple0.toString();
      assertEquals(1235, icTuple0.thisClassIndex());
      assertEquals("IcTuple ( in  i#n )", string0);
      assertTrue(icTuple0.isAnonymous());
      assertEquals(1235, icTuple0.getTupleIndex());
      assertEquals(1235, icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.nestedExplicitFlagSet());
      assertEquals(1235, icTuple0.getF());
      assertTrue(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("#fzf6h8*'S8", 2095, "Z", "t!n&~kcc[%CF]", 2095, 65536, 2095, 65536);
      icTuple0.C2 = "";
      String string0 = icTuple0.toString();
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals(65536, icTuple0.outerClassIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertFalse(icTuple0.isMember());
      assertEquals("IcTuple (t!n&~kcc[%CF] in Z)", string0);
      assertEquals(2095, icTuple0.getF());
      assertEquals(2095, icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 191, "", "", 191, 191, (-1643), (-1643));
      icTuple0.C = null;
      icTuple0.hashCode();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(191, icTuple0.getF());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1643), icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 1235, "", (String) null, (-1), 938, 0, (-1));
      icTuple0.C = null;
      String string0 = icTuple0.thisClassString();
      assertEquals(1235, icTuple0.getF());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertNull(string0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", (String) null, (-1), 2744, (-1), 2744);
      String string0 = icTuple0.thisClassString();
      assertNotNull(string0);
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("", string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(2744, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("p(]HT\"", 0, (String) null, ">T_", 1009, 1009, 0, (-1));
      int int0 = icTuple0.thisClassIndex();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals("p(]HT", icTuple0.outerClassString());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(1009, int0);
      assertEquals(">T_", icTuple0.getN());
      assertEquals(0, icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("6#Qe&Q[b!q", 0, "6#Qe&Q[b!q", "Should have an outer before checking if it's anonymous", 0, 0, 0, 0);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(0, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isMember());
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("np6L&z!s", 65536, "np6L&z!s", "V5-/oIdAaTtc", 65536, 65536, 65536, 0);
      int int0 = icTuple0.simpleClassNameIndex();
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(65536, int0);
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(65536, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", (String) null, (-1), 2744, (-1), 2744);
      String string0 = icTuple0.simpleClassName();
      assertEquals((-1), icTuple0.getF());
      assertEquals(2744, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertNull(string0);
      assertTrue(icTuple0.predicted());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1218), "", "", (-1218), 17, 0, 65536);
      String string0 = icTuple0.simpleClassName();
      assertTrue(icTuple0.isMember());
      assertNotNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals((-1218), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("&<J/=~D?R@K\"", 0, "&<J/=~D?R@K\"", (String) null, 36, (-1790), 36, 0);
      boolean boolean0 = icTuple0.outerIsAnonymous();
      assertTrue(boolean0);
      assertEquals((-1790), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.getF());
      assertFalse(icTuple0.isMember());
      assertEquals(36, icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2365), (String) null, "G@Hzi_z d2", (-2365), (-2365), (-2365), 69);
      String string0 = icTuple0.outerClassString();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-2365), icTuple0.getF());
      assertNull(string0);
      assertEquals(69, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals("G@Hzi_z d2", icTuple0.simpleClassName());
      assertEquals((-2365), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("C4", 2466, "", "Wbkqn3e$NEhrI", 833, 0, 2466, 833);
      String string0 = icTuple0.outerClassString();
      assertTrue(icTuple0.isMember());
      assertNotNull(string0);
      assertFalse(icTuple0.predicted());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(833, icTuple0.getTupleIndex());
      assertEquals(2466, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("", string0);
      assertEquals("Wbkqn3e$NEhrI", icTuple0.simpleClassName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("1xVh1Rtj]i6h#2*GCXQ", 2648, "org.apache.commons.compress.harmony.unpack200.IcTuple", "3:6k'[f", 2648, 4056, 2648, 2648);
      int int0 = icTuple0.outerClassIndex();
      assertEquals(4056, int0);
      assertEquals(2648, icTuple0.getF());
      assertEquals(2648, icTuple0.getTupleIndex());
      assertEquals(2648, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals("3:6k'[f", icTuple0.getN());
      assertEquals("org.apache.commons.compress.harmony.unpack200.IcTuple", icTuple0.outerClassString());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("Should have an outer before checking if it's anonymous", 2319, "Should have an outer before checking if it's anonymous", "", 0, 2319, 0, (-3048));
      boolean boolean0 = icTuple0.isMember();
      assertEquals((-3048), icTuple0.getTupleIndex());
      assertFalse(boolean0);
      assertEquals(2319, icTuple0.getF());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2319, icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("&<J/=~D?R@K\"", 0, "&<J/=~D?R@K\"", (String) null, 36, (-1790), 36, 0);
      boolean boolean0 = icTuple0.isAnonymous();
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getF());
      assertFalse(icTuple0.isMember());
      assertEquals(36, icTuple0.thisClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", (String) null, (-1), 2744, (-1), 2744);
      icTuple0.innerBreakAtDollar("");
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.getF());
      assertTrue(icTuple0.predicted());
      assertEquals(2744, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("&<J/=~D?R@K\"", 0, "&<J/=~D?R@K\"", (String) null, 36, (-1790), 36, 0);
      int int0 = icTuple0.getTupleIndex();
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals((-1790), icTuple0.outerClassIndex());
      assertEquals(36, icTuple0.thisClassIndex());
      assertEquals(0, int0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-644), "", "", (-644), (-644), (-644), (-644));
      int int0 = icTuple0.getTupleIndex();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-644), int0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-644), icTuple0.getF());
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1218), "", "", (-1218), 17, 0, 65536);
      icTuple0.N = "Should have an outer before checking if it's anonymous";
      assertEquals("Should have an outer before checking if it's anonymous", icTuple0.getN());
      
      icTuple0.N = null;
      icTuple0.getN();
      assertEquals((-1218), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("#fzf6h8*'S8", 2095, "Z", "t!n&~kcc[%CF]", 2095, 65536, 2095, 65536);
      String string0 = icTuple0.getN();
      assertEquals(2095, icTuple0.getF());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals("t!n&~kcc[%CF]", string0);
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2095, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(65536, icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("&<J/=~D?R@K\"", 0, "&<J/=~D?R@K\"", (String) null, 36, (-1790), 36, 0);
      int int0 = icTuple0.getF();
      assertEquals(36, icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1790), icTuple0.outerClassIndex());
      assertEquals(0, int0);
      assertTrue(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("96Q]&", (-2437), "", "IcTuple ", (-2437), 0, (-257), (-2102));
      int int0 = icTuple0.getF();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("", icTuple0.outerClassString());
      assertEquals((-2437), int0);
      assertEquals("IcTuple ", icTuple0.getN());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-2102), icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("p(]HT\"", 0, (String) null, ">T_", 1009, 1009, 0, (-1));
      String string0 = icTuple0.getC2();
      assertEquals(1009, icTuple0.thisClassIndex());
      assertEquals("p(]HT", icTuple0.outerClassString());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-1), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(">T_", icTuple0.simpleClassName());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", 0, 2687, 0, (-2692));
      icTuple0.getC2();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-2692), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals(0, icTuple0.getF());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1218), "", "", (-1218), 17, 0, 65536);
      icTuple0.C = null;
      String string0 = icTuple0.getC();
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertNull(string0);
      assertEquals((-1218), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("&<J/=~D?R@K\"", 0, "&<J/=~D?R@K\"", (String) null, 36, (-1790), 36, 0);
      icTuple0.getC();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(36, icTuple0.thisClassIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1790), icTuple0.outerClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, (String) null, "", 0, 0, 0, (-2148));
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
  public void test29()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple((String) null, (-2705), "Z2g7fSsJ", "Z", (-2705), 65536, 6210, 65536);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2365), (String) null, "G@Hzi_z d2", (-2365), (-2365), (-2365), 69);
      boolean boolean0 = icTuple0.predicted();
      assertEquals(69, icTuple0.getTupleIndex());
      assertEquals((-2365), icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("G@Hzi_z d2", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-2365), icTuple0.getF());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 191, "", "", 191, 191, (-1643), (-1643));
      boolean boolean0 = icTuple0.predicted();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(191, icTuple0.getF());
      assertFalse(boolean0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1643), icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1218), "", "", (-1218), 17, 0, 65536);
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, (String) null);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(boolean0);
      assertEquals((-1218), icTuple0.getF());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1218), "", "", (-1218), 17, 0, 65536);
      boolean boolean0 = icTuple0.nullSafeEquals("T3N<R", "Should have an outer before checking if it's anonymous");
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1218), icTuple0.getF());
      assertFalse(boolean0);
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("1xVh1Rtj]i6h#2*GCXQ", 2648, "org.apache.commons.compress.harmony.unpack200.IcTuple", "3:6k'[f", 2648, 4056, 2648, 2648);
      boolean boolean0 = icTuple0.nestedExplicitFlagSet();
      assertEquals(4056, icTuple0.outerClassIndex());
      assertEquals(2648, icTuple0.getTupleIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2648, icTuple0.getF());
      assertEquals(2648, icTuple0.simpleClassNameIndex());
      assertEquals("3:6k'[f", icTuple0.simpleClassName());
      assertEquals("org.apache.commons.compress.harmony.unpack200.IcTuple", icTuple0.outerClassString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("np6L&z!s", 65536, "np6L&z!s", "V5-/oIdAaTtc", 65536, 65536, 65536, 0);
      boolean boolean0 = icTuple0.nestedExplicitFlagSet();
      assertEquals(65536, icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals("V5-/oIdAaTtc", icTuple0.simpleClassName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("&<J/=~D?R@K\"", 0, "&<J/=~D?R@K\"", (String) null, 36, (-1790), 36, 0);
      icTuple0.innerBreakAtDollar("K bK(g#s+XK2oXQvUE");
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertEquals(36, icTuple0.thisClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1790), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("np6L&z!s", 65536, "np6L&z!s", "V5-/oIdAaTtc", 65536, 65536, 65536, 0);
      icTuple0.simpleClassName();
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertTrue(icTuple0.isMember());
      assertEquals(65536, icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("RNc.\"D,W?u.K6FH=EN", 276, "RNc.\"D,W?u.K6FH=EN", "", 276, 276, 2140, (-4805));
      icTuple0.outerClassString();
      assertEquals(276, icTuple0.outerClassIndex());
      assertEquals((-4805), icTuple0.getTupleIndex());
      assertEquals(2140, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(276, icTuple0.getF());
      assertFalse(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("p(]HT\"", 0, (String) null, "p(]HT\"", 0, 0, 0, 0);
      int int0 = icTuple0.thisClassIndex();
      assertEquals(0, int0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals("p(]HT", icTuple0.outerClassString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-309), "", "", (-309), (-95), 1166, (-309));
      int int0 = icTuple0.thisClassIndex();
      assertEquals((-309), icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals((-309), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("&<J/=~D?R@K\"", 0, "&<J/=~D?R@K\"", (String) null, 36, (-1790), 36, 0);
      boolean boolean0 = icTuple0.predicted();
      assertEquals(36, icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertEquals((-1790), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getF());
      assertTrue(icTuple0.outerIsAnonymous());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("QQT_S", 541, "QQT_S", "q3fhWsmE)(U-h<", 541, 541, 541, 541);
      String string0 = icTuple0.thisClassString();
      assertEquals("QQT_S$q3fhWsmE)(U-h<", string0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(541, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(541, icTuple0.getF());
      assertEquals("q3fhWsmE)(U-h<", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("$<HoE]xx_=bzRt", (-1), "$<HoE]xx_=bzRt", "", (-1), (-1), (-1), (-1));
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, "");
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.getF());
      assertEquals((-1), icTuple0.getTupleIndex());
      assertTrue(icTuple0.outerIsAnonymous());
      assertFalse(boolean0);
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("6#Qe&Q[b!q", 0, "6#Qe&Q[b!q", "Should have an outer before checking if it's anonymous", 0, 0, 0, 0);
      int int0 = icTuple0.outerClassIndex();
      assertEquals("Should have an outer before checking if it's anonymous", icTuple0.simpleClassName());
      assertTrue(icTuple0.outerIsAnonymous());
      assertFalse(icTuple0.isMember());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(0, int0);
      assertEquals(0, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("p(]HT\"", (-29), (String) null, (String) null, 984, 984, 984, 984);
      icTuple0.hashCode();
      icTuple0.hashCode();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(984, icTuple0.thisClassIndex());
      assertTrue(icTuple0.isAnonymous());
      assertFalse(icTuple0.outerIsAnonymous());
      assertTrue(icTuple0.isMember());
      assertEquals("p(]HT", icTuple0.outerClassString());
      assertEquals(984, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("pHT\"", 0, (String) null, "pHT\"", 0, 0, 0, 0);
      icTuple0.C2 = null;
      icTuple0.C2 = "pHT\"";
      icTuple0.hashCode();
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals("pHT", icTuple0.outerClassString());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.nestedExplicitFlagSet());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("p(]HT\"", 0, (String) null, "p(]HT\"", 0, 0, 0, 0);
      IcTuple icTuple1 = new IcTuple("p(]HT\"", 0, (String) null, "L9$q=7GgjqY^", 65536, (-2239), 65536, 3954);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertEquals(65536, icTuple1.simpleClassNameIndex());
      assertFalse(icTuple1.outerIsAnonymous());
      assertEquals("p(]HT", icTuple1.outerClassString());
      assertFalse(boolean0);
      assertEquals(65536, icTuple1.thisClassIndex());
      assertEquals((-1), icTuple1.outerClassIndex());
      assertEquals(3954, icTuple1.getTupleIndex());
      assertEquals(0, icTuple1.getF());
      assertTrue(icTuple1.isMember());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("pHT\"", 0, (String) null, "pHT\"", 0, 0, 0, 0);
      icTuple0.C2 = null;
      icTuple0.C2 = "pHT\"";
      IcTuple icTuple1 = new IcTuple("pHT\"", 0, (String) null, (String) null, 65536, 65536, 65536, 0);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertFalse(icTuple1.isMember());
      assertTrue(icTuple0.isMember());
      assertFalse(boolean0);
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertEquals((-1), icTuple1.outerClassIndex());
      assertEquals(0, icTuple1.getTupleIndex());
      assertEquals(65536, icTuple1.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("QQT_S", 541, "QQT_S", "q3fhWsmE)(U-h<", 541, 541, 541, 541);
      IcTuple icTuple1 = new IcTuple("q3fhWsmE)(U-h<", 65536, "QQT_S", "QQT_S", 541, 541, 65536, 65536);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertEquals("QQT_S", icTuple1.outerClassString());
      assertEquals((-1), icTuple1.outerClassIndex());
      assertFalse(icTuple0.nestedExplicitFlagSet());
      assertFalse(icTuple1.predicted());
      assertEquals("q3fhWsmE)(U-h<", icTuple0.simpleClassName());
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertEquals(65536, icTuple1.getF());
      assertFalse(boolean0);
      assertTrue(icTuple1.isMember());
      assertEquals(541, icTuple0.getTupleIndex());
      assertEquals(65536, icTuple1.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("pHT\"", 0, (String) null, "pHT\"", 0, 0, 0, 0);
      boolean boolean0 = icTuple0.equals("pHT\"");
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertFalse(boolean0);
      assertEquals("pHT", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(icTuple0.nestedExplicitFlagSet());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("p(]HT\"", 0, (String) null, "p(]HT\"", 0, 0, 0, 0);
      boolean boolean0 = icTuple0.equals((Object) null);
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertFalse(boolean0);
      assertTrue(icTuple0.isMember());
      assertEquals("p(]HT", icTuple0.outerClassString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple("AHs8P.yi$", 6, "", "17/#.9:7GZk", 6, 6, 6, (-1128));
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
      IcTuple icTuple0 = new IcTuple("p(]HT\"", (-29), (String) null, (String) null, 984, 984, 984, 984);
      boolean boolean0 = icTuple0.equals(icTuple0);
      assertEquals("p(]HT", icTuple0.outerClassString());
      assertTrue(boolean0);
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(984, icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-29), icTuple0.getF());
      assertTrue(icTuple0.isAnonymous());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("mKHqWg", 0, "mKHqWg", "mKHqWg", 0, 0, 0, 0);
      boolean boolean0 = icTuple0.isMember();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1218), "", "", (-1218), 17, 0, 65536);
      int int0 = icTuple0.outerClassIndex();
      assertEquals((-1218), icTuple0.getF());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("mKHqWg", 0, "mKHqWg", "mKHqWg", 0, 0, 0, 0);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), int0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(icTuple0.nestedExplicitFlagSet());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("$<HoE]xx_=bzRt", (-1), "$<HoE]xx_=bzRt", "", (-1), (-1), (-1), (-1));
      icTuple0.getC2();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.getTupleIndex());
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("QQT_S", 541, "QQT_S", "q3fhWsmE)(U-h<", 541, 541, 541, 541);
      int int0 = icTuple0.getF();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(541, icTuple0.getTupleIndex());
      assertEquals("QQT_S", icTuple0.outerClassString());
      assertEquals(541, int0);
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("q3fhWsmE)(U-h<", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("QQT_S", 541, "QQT_S", "q3fhWsmE)(U-h<", 541, 541, 541, 541);
      icTuple0.outerIsAnonymous();
      assertEquals("q3fhWsmE)(U-h<", icTuple0.simpleClassName());
      assertFalse(icTuple0.predicted());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(541, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(541, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1218), "", "", (-1218), 17, 0, 65536);
      String string0 = icTuple0.getN();
      assertEquals((-1218), icTuple0.getF());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertNotNull(string0);
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("mKHqWg", 0, "mKHqWg", "mKHqWg", 0, 0, 0, 0);
      icTuple0.isAnonymous();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1218), "", "", (-1218), 17, 0, 65536);
      int int0 = icTuple0.getTupleIndex();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1218), icTuple0.getF());
      assertEquals(65536, int0);
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1218), "", "", (-1218), 17, 0, 65536);
      icTuple0.getC();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals((-1218), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.predicted());
  }
}
