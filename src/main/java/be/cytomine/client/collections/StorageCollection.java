package be.cytomine.client.collections;

/*
 * Copyright (c) 2009-2015. Authors: see NOTICE file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import be.cytomine.client.models.Storage;
import org.json.simple.JSONObject;

/**
 * Created by hoyoux on 02.04.15.
 */
public class StorageCollection extends Collection {

    public StorageCollection(int offset, int max) {
        super(max, offset);
    }

    public String toURL() {
        return getJSONResourceURL();
    }

    public String getDomainName() {
        return "storage";
    }

    public Storage get(int i) {
        Storage storage = new Storage();
        Object item = list.get(i);
        storage.setAttr((JSONObject) item);
        return storage;
    }
}
