
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
import org.apache.commons.jxpath.FunctionLibrary;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.PackageFunctions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FunctionLibrary_ESTest extends FunctionLibrary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Object> class0 = Object.class;
      FunctionLibrary functionLibrary1 = new FunctionLibrary();
      functionLibrary1.removeFunctions(functionLibrary0);
      functionLibrary0.removeFunctions(functionLibrary1);
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      classFunctions0.getUsedNamespaces();
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.getUsedNamespaces();
      functionLibrary0.getUsedNamespaces();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) functionLibrary0;
      functionLibrary0.getFunction("", "", objectArray0);
      FunctionLibrary functionLibrary2 = new FunctionLibrary();
      functionLibrary2.addFunctions(classFunctions0);
      functionLibrary2.addFunctions(functionLibrary0);
      functionLibrary0.addFunctions(functionLibrary2);
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) "";
      objectArray1[1] = (Object) functionLibrary0;
      // Undeclared exception!
      functionLibrary0.getFunction("", "org.apache.commons.jxpath.ClassFunctions", objectArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      String string0 = "XFs878RZ";
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "XFs878RZ";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) functionLibrary0;
      objectArray0[3] = (Object) "XFs878RZ";
      Object object0 = new Object();
      functionLibrary0.getUsedNamespaces();
      objectArray0[4] = object0;
      Class<ClassFunctions> class0 = ClassFunctions.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      functionLibrary0.addFunctions(classFunctions0);
      objectArray0[5] = (Object) functionLibrary0;
      objectArray0[6] = (Object) "XFs878RZ";
      objectArray0[7] = (Object) "";
      objectArray0[8] = (Object) functionLibrary0;
      functionLibrary0.getFunction("XFs878RZ", "", objectArray0);
      Object[] objectArray1 = new Object[7];
      Object object1 = new Object();
      functionLibrary0.getFunction("", "", objectArray1);
      objectArray1[0] = object1;
      objectArray1[1] = (Object) functionLibrary0;
      Object object2 = new Object();
      objectArray1[2] = object2;
      objectArray1[3] = (Object) functionLibrary0;
      objectArray1[4] = (Object) functionLibrary0;
      objectArray1[5] = (Object) "";
      objectArray1[6] = (Object) "";
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("", "", objectArray1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      classFunctions0.getUsedNamespaces();
      functionLibrary0.addFunctions(classFunctions0);
      Object[] objectArray0 = new Object[0];
      classFunctions0.getFunction("", "", objectArray0);
      functionLibrary0.removeFunctions((Functions) null);
      functionLibrary0.addFunctions((Functions) null);
      functionLibrary0.removeFunctions((Functions) null);
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.getUsedNamespaces();
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.removeFunctions((Functions) null);
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.getUsedNamespaces();
      Function function0 = functionLibrary0.getFunction("", "new", objectArray0);
      assertNotNull(function0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      functionLibrary0.removeFunctions((Functions) null);
      functionLibrary0.addFunctions((Functions) null);
      // Undeclared exception!
      try { 
        functionLibrary0.getUsedNamespaces();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.FunctionLibrary", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      FunctionLibrary functionLibrary1 = new FunctionLibrary();
      functionLibrary0.removeFunctions(functionLibrary1);
      String string0 = "";
      PackageFunctions packageFunctions0 = new PackageFunctions("", "");
      packageFunctions0.getUsedNamespaces();
      functionLibrary0.addFunctions(packageFunctions0);
      packageFunctions0.getUsedNamespaces();
      String string1 = "";
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("", "org.apache.commons.jxpath.FunctionLibrary", (Object[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function :org.apache.commons.jxpath.FunctionLibrary; Class 'org/apache/commons/jxpath.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[0];
      functionLibrary0.getFunction("", "", objectArray0);
      Object[] objectArray1 = new Object[6];
      objectArray1[0] = (Object) "";
      objectArray1[1] = (Object) functionLibrary0;
      objectArray1[2] = (Object) "";
      PackageFunctions packageFunctions0 = new PackageFunctions("org.apache.commons.jxpath.FunctionLibrary", "");
      functionLibrary0.addFunctions(packageFunctions0);
      packageFunctions0.getUsedNamespaces();
      objectArray1[3] = (Object) functionLibrary0;
      objectArray1[4] = (Object) "";
      objectArray1[5] = (Object) "";
      functionLibrary0.getUsedNamespaces();
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("", "", objectArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function :; Class 'org/apache/commons/jxpath.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Set set0 = functionLibrary0.getUsedNamespaces();
      FunctionLibrary functionLibrary1 = new FunctionLibrary();
      functionLibrary1.addFunctions(functionLibrary0);
      functionLibrary0.removeFunctions(functionLibrary1);
      functionLibrary0.addFunctions((Functions) null);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) set0;
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) set0;
      objectArray0[3] = (Object) "@n4RE'`$RhK7:pd";
      objectArray0[4] = (Object) functionLibrary1;
      objectArray0[5] = (Object) "@n4RE'`$RhK7:pd";
      objectArray0[6] = (Object) "";
      objectArray0[7] = (Object) "@n4RE'`$RhK7:pd";
      objectArray0[8] = (Object) "@n4RE'`$RhK7:pd";
      // Undeclared exception!
      try { 
        functionLibrary1.getFunction("@n4RE'`$RhK7:pd", "", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.FunctionLibrary", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "JY]cf$xeLd9_Bh(aQ@");
      Set set0 = classFunctions0.getUsedNamespaces();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "JY]cf$xeLd9_Bh(aQ@";
      objectArray0[1] = (Object) "JY]cf$xeLd9_Bh(aQ@";
      objectArray0[2] = (Object) set0;
      objectArray0[3] = (Object) functionLibrary0;
      functionLibrary0.getFunction("JY]cf$xeLd9_Bh(aQ@", "JY]cf$xeLd9_Bh(aQ@", objectArray0);
      functionLibrary0.removeFunctions(classFunctions0);
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.addFunctions(classFunctions0);
      Object[] objectArray1 = new Object[5];
      objectArray1[0] = (Object) functionLibrary0;
      objectArray1[1] = (Object) functionLibrary0;
      objectArray1[2] = (Object) functionLibrary0;
      classFunctions0.getFunction("hG", "?Jjgtu", objectArray1);
      functionLibrary0.getUsedNamespaces();
      classFunctions0.getFunction((String) null, "#!2&Hk05,#P}y<R[d", objectArray1);
      objectArray1[3] = (Object) "JY]cf$xeLd9_Bh(aQ@";
      functionLibrary0.addFunctions(classFunctions0);
      classFunctions0.getFunction("JY]cf$xeLd9_Bh(aQ@", "", objectArray1);
      Object object0 = new Object();
      objectArray1[4] = object0;
      classFunctions0.getUsedNamespaces();
      classFunctions0.getFunction("JY]cf$xeLd9_Bh(aQ@", "JY]cf$xeLd9_Bh(aQ@", objectArray1);
      functionLibrary0.getFunction("\u0003-xx", (String) null, objectArray1);
      classFunctions0.getFunction("JY]cf$xeLd9_Bh(aQ@", "JY]cf$xeLd9_Bh(aQ@", objectArray1);
      functionLibrary0.getUsedNamespaces();
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.getUsedNamespaces();
      functionLibrary0.removeFunctions(classFunctions0);
      Set set1 = functionLibrary0.getUsedNamespaces();
      assertFalse(set1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Object> class0 = Object.class;
      Set set0 = functionLibrary0.getUsedNamespaces();
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "pqb");
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) functionLibrary0;
      objectArray0[2] = (Object) set0;
      objectArray0[3] = (Object) class0;
      objectArray0[4] = (Object) "*-ttntma";
      objectArray0[5] = (Object) set0;
      classFunctions0.getFunction("", "*-ttntma", objectArray0);
      classFunctions0.getUsedNamespaces();
      Object[] objectArray1 = new Object[5];
      Object object0 = new Object();
      objectArray1[0] = object0;
      objectArray1[1] = (Object) class0;
      objectArray1[2] = (Object) classFunctions0;
      objectArray1[3] = (Object) "*-ttntma";
      objectArray1[4] = (Object) functionLibrary0;
      functionLibrary0.getFunction("*-ttntma", "*-ttntma", objectArray1);
      functionLibrary0.addFunctions(classFunctions0);
      classFunctions0.getUsedNamespaces();
      functionLibrary0.getUsedNamespaces();
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.getFunction("pqb", "", objectArray0);
      functionLibrary0.removeFunctions(classFunctions0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[21];
      Class<ClassFunctions> class0 = ClassFunctions.class;
      functionLibrary0.getFunction("iND'{|LZ3", "iND'{|LZ3", objectArray0);
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "iND'{|LZ3");
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.getFunction("iND'{|LZ3", "iND'{|LZ3", objectArray0);
      Set set0 = functionLibrary0.getUsedNamespaces();
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "!dw`SZ}sN)*Z");
      Object[] objectArray0 = new Object[0];
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.removeFunctions(functionLibrary0);
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.getUsedNamespaces();
      functionLibrary0.getFunction("!dw`SZ}sN)*Z", "new", objectArray0);
      Function function0 = functionLibrary0.getFunction("!dw`SZ}sN)*Z", "!dw`SZ}sN)*Z", objectArray0);
      assertNull(function0);
  }
}
