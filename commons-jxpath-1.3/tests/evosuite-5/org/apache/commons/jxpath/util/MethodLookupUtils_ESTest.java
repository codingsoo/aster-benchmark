
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


package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.util.MethodLookupUtils;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MethodLookupUtils_ESTest extends MethodLookupUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "Tbl[B", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "Empty expression context";
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      doReturn((Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "@HLM1Z2", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      TypeUtils.setTypeConverter((TypeConverter) null);
      Class<NodeSetContext> class1 = NodeSetContext.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class1, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Class<NodeSetContext> class0 = NodeSetContext.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class0, objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "Ambigous constructor ";
      Object object0 = new Object();
      objectArray0[1] = object0;
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "split", objectArray0);
      assertEquals("public java.lang.String[] java.lang.String.split(java.lang.String,int)", method0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) methodLookupUtils0;
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "-Y?w)\"^H9Hd9jx";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "compareTo", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: compareTo
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "wait", objectArray0);
      assertEquals("public final void java.lang.Object.wait() throws java.lang.InterruptedException", method0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "O.%w1D)nbHqhFc|", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[0];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[4];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, (String) null, (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "notifyAll", (Object[]) null);
      assertEquals(273, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertFalse(constructor0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertFalse(constructor0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) methodLookupUtils0;
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "Ambigous method call: ", objectArray0);
      assertNull(method0);
  }
}
