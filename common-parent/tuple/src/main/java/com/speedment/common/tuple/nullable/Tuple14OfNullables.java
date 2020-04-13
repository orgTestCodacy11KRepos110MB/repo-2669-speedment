/*
 *
 * Copyright (c) 2006-2020, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.tuple.nullable;

import com.speedment.common.tuple.MutableTuple;
import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.TupleOfNullables;
import com.speedment.common.tuple.getter.TupleGetter0;
import com.speedment.common.tuple.getter.TupleGetter10;
import com.speedment.common.tuple.getter.TupleGetter11;
import com.speedment.common.tuple.getter.TupleGetter12;
import com.speedment.common.tuple.getter.TupleGetter13;
import com.speedment.common.tuple.getter.TupleGetter1;
import com.speedment.common.tuple.getter.TupleGetter2;
import com.speedment.common.tuple.getter.TupleGetter3;
import com.speedment.common.tuple.getter.TupleGetter4;
import com.speedment.common.tuple.getter.TupleGetter5;
import com.speedment.common.tuple.getter.TupleGetter6;
import com.speedment.common.tuple.getter.TupleGetter7;
import com.speedment.common.tuple.getter.TupleGetter8;
import com.speedment.common.tuple.getter.TupleGetter9;
import com.speedment.common.tuple.getter.TupleGetter;

import java.util.Optional;

/**
 * This interface defines a generic {@link TupleOfNullables} of degree14 that
 * can hold null values. A TupleOfNullable is type safe, immutable and thread
 * safe. For pure non-null value elements see {@link Tuple}. For mutable tuples
 * see {@link MutableTuple}
 * This {@link TupleOfNullables} has a degree of 14
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TuplePattern
 * 
 * @param <T0>  type of element 0
 * @param <T1>  type of element 1
 * @param <T2>  type of element 2
 * @param <T3>  type of element 3
 * @param <T4>  type of element 4
 * @param <T5>  type of element 5
 * @param <T6>  type of element 6
 * @param <T7>  type of element 7
 * @param <T8>  type of element 8
 * @param <T9>  type of element 9
 * @param <T10> type of element 10
 * @param <T11> type of element 11
 * @param <T12> type of element 12
 * @param <T13> type of element 13
 * 
 * @author Per Minborg
 * 
 * @see Tuple
 * @see TupleOfNullables
 * @see MutableTuple
 */
public interface Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> extends TupleOfNullables {
    
    /**
     * Returns the 0th element from this tuple.
     * 
     * @return the 0th element from this tuple.
     */
    Optional<T0> get0();
    
    /**
     * Returns the 1st element from this tuple.
     * 
     * @return the 1st element from this tuple.
     */
    Optional<T1> get1();
    
    /**
     * Returns the 2nd element from this tuple.
     * 
     * @return the 2nd element from this tuple.
     */
    Optional<T2> get2();
    
    /**
     * Returns the 3rd element from this tuple.
     * 
     * @return the 3rd element from this tuple.
     */
    Optional<T3> get3();
    
    /**
     * Returns the 4th element from this tuple.
     * 
     * @return the 4th element from this tuple.
     */
    Optional<T4> get4();
    
    /**
     * Returns the 5th element from this tuple.
     * 
     * @return the 5th element from this tuple.
     */
    Optional<T5> get5();
    
    /**
     * Returns the 6th element from this tuple.
     * 
     * @return the 6th element from this tuple.
     */
    Optional<T6> get6();
    
    /**
     * Returns the 7th element from this tuple.
     * 
     * @return the 7th element from this tuple.
     */
    Optional<T7> get7();
    
    /**
     * Returns the 8th element from this tuple.
     * 
     * @return the 8th element from this tuple.
     */
    Optional<T8> get8();
    
    /**
     * Returns the 9th element from this tuple.
     * 
     * @return the 9th element from this tuple.
     */
    Optional<T9> get9();
    
    /**
     * Returns the 10th element from this tuple.
     * 
     * @return the 10th element from this tuple.
     */
    Optional<T10> get10();
    
    /**
     * Returns the 11st element from this tuple.
     * 
     * @return the 11st element from this tuple.
     */
    Optional<T11> get11();
    
    /**
     * Returns the 12nd element from this tuple.
     * 
     * @return the 12nd element from this tuple.
     */
    Optional<T12> get12();
    
    /**
     * Returns the 13rd element from this tuple.
     * 
     * @return the 13rd element from this tuple.
     */
    Optional<T13> get13();
    
    @Override
    default int degree() {
        return 14;
    }
    
    @SuppressWarnings("unchecked")
    default Optional<Object> get(int index) {
        switch (index) {
            case 0 : return (Optional<Object>)get0();
            case 1 : return (Optional<Object>)get1();
            case 2 : return (Optional<Object>)get2();
            case 3 : return (Optional<Object>)get3();
            case 4 : return (Optional<Object>)get4();
            case 5 : return (Optional<Object>)get5();
            case 6 : return (Optional<Object>)get6();
            case 7 : return (Optional<Object>)get7();
            case 8 : return (Optional<Object>)get8();
            case 9 : return (Optional<Object>)get9();
            case 10 : return (Optional<Object>)get10();
            case 11 : return (Optional<Object>)get11();
            case 12 : return (Optional<Object>)get12();
            case 13 : return (Optional<Object>)get13();
            default : throw new IndexOutOfBoundsException(String.format("Index %d is outside bounds of tuple of degree %s", index, degree()));
        }
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 0th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 0th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter0<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T0>> getter0() {
        return Tuple14OfNullables::get0;
    }
    
    /**
     * Returns the 0th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 0th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T0 getOrNull0() {
        return get0().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 0th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 0th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter0<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T0> getterOrNull0() {
        return Tuple14OfNullables::getOrNull0;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 1st element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 1st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter1<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T1>> getter1() {
        return Tuple14OfNullables::get1;
    }
    
    /**
     * Returns the 1st element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 1st element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T1 getOrNull1() {
        return get1().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 1st element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 1st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter1<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T1> getterOrNull1() {
        return Tuple14OfNullables::getOrNull1;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 2nd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 2nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter2<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T2>> getter2() {
        return Tuple14OfNullables::get2;
    }
    
    /**
     * Returns the 2nd element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 2nd element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T2 getOrNull2() {
        return get2().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 2nd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 2nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter2<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T2> getterOrNull2() {
        return Tuple14OfNullables::getOrNull2;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 3rd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 3rd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter3<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T3>> getter3() {
        return Tuple14OfNullables::get3;
    }
    
    /**
     * Returns the 3rd element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 3rd element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T3 getOrNull3() {
        return get3().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 3rd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 3rd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter3<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T3> getterOrNull3() {
        return Tuple14OfNullables::getOrNull3;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 4th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 4th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter4<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T4>> getter4() {
        return Tuple14OfNullables::get4;
    }
    
    /**
     * Returns the 4th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 4th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T4 getOrNull4() {
        return get4().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 4th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 4th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter4<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T4> getterOrNull4() {
        return Tuple14OfNullables::getOrNull4;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 5th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 5th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter5<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T5>> getter5() {
        return Tuple14OfNullables::get5;
    }
    
    /**
     * Returns the 5th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 5th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T5 getOrNull5() {
        return get5().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 5th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 5th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter5<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T5> getterOrNull5() {
        return Tuple14OfNullables::getOrNull5;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 6th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 6th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter6<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T6>> getter6() {
        return Tuple14OfNullables::get6;
    }
    
    /**
     * Returns the 6th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 6th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T6 getOrNull6() {
        return get6().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 6th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 6th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter6<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T6> getterOrNull6() {
        return Tuple14OfNullables::getOrNull6;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 7th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 7th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter7<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T7>> getter7() {
        return Tuple14OfNullables::get7;
    }
    
    /**
     * Returns the 7th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 7th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T7 getOrNull7() {
        return get7().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 7th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 7th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter7<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T7> getterOrNull7() {
        return Tuple14OfNullables::getOrNull7;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 8th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 8th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter8<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T8>> getter8() {
        return Tuple14OfNullables::get8;
    }
    
    /**
     * Returns the 8th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 8th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T8 getOrNull8() {
        return get8().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 8th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 8th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter8<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T8> getterOrNull8() {
        return Tuple14OfNullables::getOrNull8;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 9th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 9th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter9<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T9>> getter9() {
        return Tuple14OfNullables::get9;
    }
    
    /**
     * Returns the 9th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 9th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T9 getOrNull9() {
        return get9().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 9th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 9th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter9<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T9> getterOrNull9() {
        return Tuple14OfNullables::getOrNull9;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 10th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 10th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter10<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T10>> getter10() {
        return Tuple14OfNullables::get10;
    }
    
    /**
     * Returns the 10th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 10th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T10 getOrNull10() {
        return get10().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 10th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 10th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter10<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T10> getterOrNull10() {
        return Tuple14OfNullables::getOrNull10;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 11st element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 11st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter11<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T11>> getter11() {
        return Tuple14OfNullables::get11;
    }
    
    /**
     * Returns the 11st element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 11st element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T11 getOrNull11() {
        return get11().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 11st element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 11st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter11<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T11> getterOrNull11() {
        return Tuple14OfNullables::getOrNull11;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 12nd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 12nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter12<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T12>> getter12() {
        return Tuple14OfNullables::get12;
    }
    
    /**
     * Returns the 12nd element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 12nd element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T12 getOrNull12() {
        return get12().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 12nd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 12nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter12<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T12> getterOrNull12() {
        return Tuple14OfNullables::getOrNull12;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 13rd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 13rd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter13<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, Optional<T13>> getter13() {
        return Tuple14OfNullables::get13;
    }
    
    /**
     * Returns the 13rd element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 13rd element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T13 getOrNull13() {
        return get13().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 13rd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 13rd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     * @param <T13> the 13rd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter13<Tuple14OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T13> getterOrNull13() {
        return Tuple14OfNullables::getOrNull13;
    }
}