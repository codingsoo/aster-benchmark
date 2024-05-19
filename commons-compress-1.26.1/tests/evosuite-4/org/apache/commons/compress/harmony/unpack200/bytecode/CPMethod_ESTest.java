
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


package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPMethod_ESTest extends CPMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m%q2Wa_ezVri[");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPUTF8 cPUTF8_1 = new CPUTF8("m%q2Wa_ezVri[");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)1, linkedList0);
      String string0 = cPMethod0.toString();
      assertEquals("Method: UTF-8:m%q2Wa_ezVri[(UTF-8:m%q2Wa_ezVri[)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m%q2Wa_ezVri[");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPUTF8 cPUTF8_1 = new CPUTF8("m%q2Wa_ezVri[");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)1, linkedList0);
      cPMethod0.hashCode();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("bSG}eWO-Mb}kp'", (-1556));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = null;
      try {
        cPMethod0 = new CPMethod(cPUTF8_0, (CPUTF8) null, (-284L), linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // descriptor
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m%q2Wa_ezVri[");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)1, linkedList0);
      cPMethod0.hashCode();
      cPMethod0.hashCode();
  }
}
