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
package com.speedment.runtime.field.comparator;

import com.speedment.runtime.field.ComparableField;

/**
 * A {@link FieldComparator} that compares values of a {@link ComparableField}.
 *
 * @param <ENTITY>  the entity type
 * @param <D>       the database type
 * @param <V>       the value type
 * 
 * @author  Per Minborg
 * @since   3.1.4
 */
public interface ReferenceFieldComparator<ENTITY, D, V extends Comparable<? super V>> 
extends FieldComparator<ENTITY> {

    /**
     * Gets the field that is being compared.
     *
     * @return  the compared field
     */
    @Override
    ComparableField<ENTITY, D, V> getField();

}
