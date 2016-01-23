/*
 * Copyright (C) 2015-2016 Benjamin Bader
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bendb.thrifty.schema.parser;

import com.bendb.thrifty.schema.Location;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MapTypeElement extends TypeElement {
    public abstract TypeElement keyType();
    public abstract TypeElement valueType();

    MapTypeElement() {
    }

    public static MapTypeElement create(
            Location location,
            TypeElement key,
            TypeElement value,
            AnnotationElement annotations) {
        String name = "map<" + key.name() + ", " + value.name() + ">";
        return new AutoValue_MapTypeElement(location, name, annotations, key, value);
    }
}
