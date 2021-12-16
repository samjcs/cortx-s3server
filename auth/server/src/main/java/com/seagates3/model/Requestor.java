/*
 * Copyright (c) 2020 Seagate Technology LLC and/or its Affiliates
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For any questions about this software or licensing,
 * please email opensource@seagate.com or cortx-questions@seagate.com.
 *
 */

package com.seagates3.model;

import java.util.List;

public class Requestor {

    private String id, name;
    private Account account;
    private AccessKey accessKey;
    private
     User user;
    private
     List<String> policyDocuments;

    public
     List<String> getPolicyDocuments() { return policyDocuments; }

    public
     void setPolicyDocuments(List<String> policyDocuments) {
       this.policyDocuments = policyDocuments;
     }

    /*
     * Return the requestor id.
     */
    public String getId() {
        return id;
    }

    /*
     * Name of the requestor.
     */
    public String getName() {
        return name;
    }

    public AccessKey getAccesskey() {
        return accessKey;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccessKey(AccessKey accessKey) {
        this.accessKey = accessKey;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * Return if the requestor exists.
     */
    public Boolean exists() {
        return id != null;
    }

    /*
     * Return true if the user is a federated user.
     */
    public Boolean isFederatedUser() {
        return accessKey.getToken() != null;
    }

    public
     User getUser() { return user; }

    public
     void setUser(User user) { this.user = user; }
}
