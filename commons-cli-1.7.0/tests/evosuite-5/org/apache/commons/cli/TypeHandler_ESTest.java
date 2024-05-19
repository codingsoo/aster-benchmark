
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


package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.Date;
import java.util.Map;
import org.apache.commons.cli.Converter;
import org.apache.commons.cli.TypeHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TypeHandler_ESTest extends TypeHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Number number0 = TypeHandler.createNumber("3");
      assertEquals(3L, number0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = TypeHandler.createValue((String) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = TypeHandler.createValue("", (Object) null);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = TypeHandler.createObject("org.apache.commons.cli.TypeHandler");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = TypeHandler.createFile("/");
      assertFalse(file0.isHidden());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = TypeHandler.createFile(".");
      assertEquals(1715821011000L, file0.lastModified());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Map<Class<?>, Converter<?, ? extends Throwable>> map0 = TypeHandler.createDefaultMap();
      TypeHandler typeHandler0 = new TypeHandler(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<?> class0 = TypeHandler.createClass("org.apache.commons.cli.Converter");
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createValue("/", (Object) "/");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Date> class0 = Date.class;
      try { 
        TypeHandler.createValue("82#qDY7tGPs,Xn4.{9", class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.text.ParseException: Unparseable date: \"82#qDY7tGPs,Xn4.{9\"
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createFile((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: java.lang.NullPointerException
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        TypeHandler.createClass("$Ff3lp}T->#![EL2q");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: $Ff3lp}T->#![EL2q
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TypeHandler typeHandler0 = TypeHandler.getDefault();
      assertNotNull(typeHandler0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<MockThrowable> class0 = MockThrowable.class;
      MockThrowable mockThrowable0 = TypeHandler.createValue((String) null, class0);
      assertNull(mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createDate("$^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: java.text.ParseException: Unparseable date: \"$^\"
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        TypeHandler.createURL("*E^U)w|@mN");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.net.MalformedURLException: no protocol: *E^U)w|@mN
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        TypeHandler.createNumber("+");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NumberFormatException: For input string: \"+\"
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createFiles("'BZheN4!");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not yet implemented
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        TypeHandler.openFile("org.apache.commons.cli.TypeHandler");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.io.FileNotFoundException: org.apache.commons.cli.TypeHandler (No such file or directory)
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        TypeHandler.createObject("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: 
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = TypeHandler.createFile("");
      assertEquals(0L, file0.getUsableSpace());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TypeHandler typeHandler0 = new TypeHandler();
      Class<Date> class0 = Date.class;
      Converter<Date, ?> converter0 = typeHandler0.getConverter(class0);
      assertNotNull(converter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<?> class0 = TypeHandler.createClass("org.apache.commons.cli.TypeHandler");
      assertEquals("class org.apache.commons.cli.TypeHandler", class0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Date> class0 = Date.class;
      try { 
        TypeHandler.createValue("", (Object) class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.text.ParseException: Unparseable date: \"\"
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }
}
