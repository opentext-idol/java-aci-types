/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.role;

/**
 * Term action names.
 */
public enum RoleActions {
    RoleAdd,
    RoleAddPrivilege,
    RoleAddRoleToRole,
    RoleAddUserToRole,
    RoleDelete,
    RoleDeletePrivilege,
    RoleDoesUserHavePrivilege,
    RoleGetChildRoleList,
    RoleGetParentRoleList,
    RoleGetPrivilegeList,
    RoleGetRoleList,
    RoleGetRolePrivilegeValueList,
    RoleGetUserList,
    RoleGetUserPrivilegeValueList,
    RoleIsRoleInRole,
    RolePrivilegeGetRoleList,
    RoleRemovePrivilegeFromRole,
    RoleRemoveRoleFromRole,
    RoleRemoveUserFromRole,
    RoleSetPrivilegeForRole,
    RoleUserGetRoleList
}
