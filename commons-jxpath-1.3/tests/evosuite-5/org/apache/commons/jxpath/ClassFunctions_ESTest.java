
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


package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Set;
import org.apache.commons.jxpath.ClassFunctions;
import org.apache.commons.jxpath.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassFunctions_ESTest extends ClassFunctions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "";
      // Undeclared exception!
      try { 
        classFunctions0.getFunction("", "", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      // Undeclared exception!
      try { 
        classFunctions0.getFunction("", "U", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "vx6b_0Ez%");
      Object[] objectArray0 = new Object[3];
      Function function0 = classFunctions0.getFunction("vx6b_0Ez%", "new", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "7OkG");
      Function function0 = classFunctions0.getFunction("7OkG", "new", (Object[]) null);
      assertNotNull(function0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      Object[] objectArray0 = new Object[8];
      Function function0 = classFunctions0.getFunction("VRO_Q^I2U/XHH&2Xw'", "", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      ClassFunctions classFunctions0 = new ClassFunctions(class0, ";i,TkQQs%k'");
      Function function0 = classFunctions0.getFunction((String) null, ";i,TkQQs%k'", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, (String) null);
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        classFunctions0.getFunction((String) null, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      Object[] objectArray0 = new Object[6];
      Function function0 = classFunctions0.getFunction("", "U", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      Set set0 = classFunctions0.getUsedNamespaces();
      assertEquals(1, set0.size());
  }
}
