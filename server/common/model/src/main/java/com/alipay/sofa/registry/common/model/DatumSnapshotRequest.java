/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.registry.common.model;

import com.alipay.sofa.registry.common.model.store.Publisher;

import java.util.List;

/**
 *
 * @author shangyu.wh
 * @version $Id: DatumSnapshotRequest.java, v 0.1 2019-05-30 11:09 shangyu.wh Exp $
 */
public class DatumSnapshotRequest {

    private final String          connectId;

    private final String          dataServerAddress;

    private final List<Publisher> publishers;

    public DatumSnapshotRequest(String connectId, String dataServerAddress,
                                List<Publisher> publishers) {
        this.connectId = connectId;
        this.dataServerAddress = dataServerAddress;
        this.publishers = publishers;
    }

    /**
     * Getter method for property <tt>connectId</tt>.
     *
     * @return property value of connectId
     */
    public String getConnectId() {
        return connectId;
    }

    /**
     * Getter method for property <tt>dataServerAddress</tt>.
     *
     * @return property value of dataServerAddress
     */
    public String getDataServerAddress() {
        return dataServerAddress;
    }

    /**
     * Getter method for property <tt>publishers</tt>.
     *
     * @return property value of publishers
     */
    public List<Publisher> getPublishers() {
        return publishers;
    }
}