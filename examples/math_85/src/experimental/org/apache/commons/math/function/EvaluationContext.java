/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.math.function;

/**

 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public interface EvaluationContext {
    
    public abstract double doubleValue(Evaluation argument) throws EvaluationException ;
    
    public abstract float floatValue(Evaluation argument) throws EvaluationException ;
    
    public abstract int intValue(Evaluation argument) throws EvaluationException ;
    
    public abstract long longValue(Evaluation argument) throws EvaluationException ;
    
    public abstract short shortValue(Evaluation argument) throws EvaluationException ;
    
    public abstract byte byteValue(Evaluation argument) throws EvaluationException ;
    
    public abstract Evaluation evaluate(double d);
    
    public abstract Evaluation evaluate(float f);
    
    public abstract Evaluation evaluate(int i);
    
    public abstract Evaluation evaluate(long l);
    
    public abstract Evaluation evaluate(short s);
    
    public abstract Evaluation evaluate(byte b);

}
