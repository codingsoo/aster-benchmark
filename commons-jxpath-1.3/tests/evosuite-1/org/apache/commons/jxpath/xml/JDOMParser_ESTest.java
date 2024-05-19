
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


package org.apache.commons.jxpath.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.jxpath.xml.JDOMParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JDOMParser_ESTest extends JDOMParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      jDOMParser0.setNamespaceAware(false);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        jDOMParser0.parseXML(pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JDOM parser configuration error. JDOM does not support the namespaceAware=false setting.
         //
         verifyException("org.apache.commons.jxpath.xml.JDOMParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      // Undeclared exception!
      try { 
        jDOMParser0.parseXML((InputStream) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jdom/input/SAXBuilder
         //
         verifyException("org.apache.commons.jxpath.xml.JDOMParser", e);
      }
  }
}
